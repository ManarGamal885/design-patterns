package Chapter11.VirtualProxy.Client;

import javax.swing.*;
import java.net.URL;

public class ImageProxyTestDrive {
    JFrame frame = new JFrame("Virtual Proxy Demo");
    ImageComponent imageComponent;
    URL initialURL;

    public static void main(String[] args) throws Exception {
        new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception {
        initialURL = new URL("https://upload.wikimedia.org/wikipedia/commons/3/3f/JPEG_example_flower.jpg");
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);

        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 700);
        frame.setVisible(true);
    }
}
