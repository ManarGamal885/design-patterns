/*
* This class is used as a helper class to draw the icon on the screen using JFrame.
*/
package Chapter11.VirtualProxy.Client;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (getWidth() - w) / 2;
        int y = (getHeight() - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}

