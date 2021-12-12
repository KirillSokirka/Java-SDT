package task10;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageForm extends Frame implements ActionListener {
    Button increaseImage, decreaseImage;
    StartForm startForm;
    BufferedImage image;
    int imageHeight, imageWidth;
    Graphics2D graphics;

    ImageForm(StartForm form) {
        startForm = form;

        increaseImage = new Button("Increase");
        decreaseImage = new Button("Decrease");

        increaseImage.setBounds(30, 30, 70, 30);
        decreaseImage.setBounds(120, 30, 70, 30);


        add(increaseImage);
        add(decreaseImage);

        try {
            image = ImageIO.read(new File(startForm.imageTextField.getText()));
        } catch(IOException ex) {
            ex.printStackTrace();
            System.exit(0);
        }

        imageHeight = image.getHeight();
        imageWidth = image.getWidth();

        increaseImage.addActionListener(this);
        decreaseImage.addActionListener(this);
        addWindowListener (new WindowAdapter() {
            public void windowClosing (WindowEvent e) {
                startForm.setVisible(true);
                dispose();
            }
        });

        setSize(imageWidth + 100, imageHeight + 100);
        setTitle("Task 10");
        setLayout(null);
        setVisible(true);
    }

    public void paint(Graphics g) {
        graphics = (Graphics2D)g;
        TexturePaint paint = new TexturePaint(image,
                new Rectangle2D.Double(30,70, imageWidth, imageHeight));
        graphics.setPaint(paint);
        graphics.fill(new Rectangle2D.Double(30, 70, imageWidth, imageHeight));
        graphics.dispose();
    }

    public void resizeImage(int scaledWidth, int scaledHeight) {
        TexturePaint paint = new TexturePaint(image,
                new Rectangle2D.Double(30,70, scaledWidth, scaledHeight));
        graphics.setPaint(paint);
        graphics.fill(new Rectangle2D.Double(30, 70, scaledWidth, scaledHeight));
        setSize(scaledWidth+100, scaledHeight+100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == increaseImage) {
            this.imageWidth += 10;
            this.imageHeight += 10;
        } else {
            this.imageWidth -= 10;
            this.imageHeight -= 10;
        }
        resizeImage(this.imageWidth, this.imageHeight);
    }
}
