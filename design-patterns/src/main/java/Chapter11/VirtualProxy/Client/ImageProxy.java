package Chapter11.VirtualProxy.Client;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageProxy implements Icon {

    private volatile ImageIcon imageIcon;
    private final URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;
    private boolean loadFailed = false;

    public ImageProxy(URL url) {
        this.imageURL = url;
    }

    private synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public int getIconWidth() {
        return (imageIcon != null) ? imageIcon.getIconWidth() : 800;
    }

    @Override
    public int getIconHeight() {
        return (imageIcon != null) ? imageIcon.getIconHeight() : 600;
    }

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading album cover, please wait...", x + 300, y + 190);

            if (loadFailed) {
                g.setColor(Color.RED);
                g.drawString("Failed to load image!", x + 300, y + 210);
                return;
            }

            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    try {
                        System.out.println("🔄 Downloading image from: " + imageURL);

                        // Create an HTTP connection with a browser-like User-Agent
                        HttpURLConnection connection = (HttpURLConnection) imageURL.openConnection();
                        connection.setRequestProperty(
                                "User-Agent",
                                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                                        "(KHTML, like Gecko) Chrome/120.0 Safari/537.36"
                        );
                        connection.connect();

                        try (InputStream inputStream = connection.getInputStream()) {
                            BufferedImage bufferedImage = ImageIO.read(inputStream);
                            if (bufferedImage != null) {
                                ImageIcon icon = new ImageIcon(bufferedImage);
                                setImageIcon(icon);
                                System.out.println("✅ Image loaded: " + icon.getIconWidth() + "x" + icon.getIconHeight());
                                SwingUtilities.invokeLater(c::repaint);
                            } else {
                                throw new Exception("ImageIO returned null (unreadable image)");
                            }
                        }
                    } catch (Exception e) {
                        loadFailed = true;
                        System.err.println("❌ Failed to load image: " + imageURL);
                        e.printStackTrace();
                        SwingUtilities.invokeLater(c::repaint);
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
