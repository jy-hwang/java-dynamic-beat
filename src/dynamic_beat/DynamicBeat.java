package dynamic_beat;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

  private Image screenImage;
  private Graphics screenGraphic;

  private Image introBackground;

  public DynamicBeat() {
    setTitle("Dynamic Beat");
    setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    ImageIcon backgroundImage = new ImageIcon(Main.class.getResource("/images/introBackground.jpg"));
    
    introBackground = backgroundImage.getImage();

    Music introMusic = new Music("introMusic.mp3", true);
    introMusic.start();
  }

  public void paint(Graphics g) {
    screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
    screenGraphic = screenImage.getGraphics();
    screenDraw(screenGraphic);
    g.drawImage(screenImage, 0, 0, null);
  }

  public void screenDraw(Graphics g) {
    g.drawImage(introBackground, 0, 0, null);
    this.repaint();
  }

}
