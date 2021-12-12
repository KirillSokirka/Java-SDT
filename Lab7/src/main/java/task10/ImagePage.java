package task10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePage extends JPanel implements ActionListener {
    JFrame frame = new JFrame("Image");
    JButton increaseButton = new JButton("Increase");
    JButton decreaseButton = new JButton("Decrease");
    JLabel imageLabel = new JLabel();
    BufferedImage image;
    int initialHeight = 0;
    int initialWidth = 0;
    private File file;

    ImagePage(File file) {
        this.file = file;
        increaseButton.setBounds(55, 30, 100, 25);
        increaseButton.addActionListener(this);
        decreaseButton.setBounds(160, 30, 100, 25);
        decreaseButton.addActionListener(this);

        try {
            image = ImageIO.read(file);
            initialHeight = image.getHeight();
            initialWidth = image.getWidth();
            imageLabel.setBounds(30, 0, image.getWidth(), image.getHeight());
            imageLabel.setIcon(new ImageIcon(image));
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.add(increaseButton);
        frame.add(decreaseButton);
        frame.add(imageLabel);
        frame.setSize((int) (imageLabel.getWidth() + (imageLabel.getWidth() * 0.5)), (int) (imageLabel.getHeight()
                + (imageLabel.getHeight() *0.5) + 50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == increaseButton) {
            initialWidth += 10;
            initialHeight += 10;
            var tempImage = image.getScaledInstance(initialWidth, initialHeight, Image.SCALE_SMOOTH);
            imageLabel.setBounds(30, 60, initialWidth, initialHeight);
            imageLabel.setIcon(new ImageIcon(tempImage));
            if (frame.getWidth() < initialWidth || frame.getHeight() - 50 < initialHeight) {
                frame.setSize((int) (initialWidth + (initialWidth * 0.5)),
                        (int)(initialHeight + (initialHeight * 0.5) + 50));
            }
        }
        else if (e.getSource() == decreaseButton) {
            initialWidth -= 10;
            initialHeight -= 10;
            var tempImage = image.getScaledInstance(initialWidth, initialHeight, Image.SCALE_SMOOTH);
            imageLabel.setBounds(30, 60, initialWidth, initialHeight);
            imageLabel.setIcon(new ImageIcon(tempImage));
        }
    }
}
