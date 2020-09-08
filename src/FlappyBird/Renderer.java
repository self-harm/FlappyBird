package FlappyBird;

import javax.swing.*;
import java.awt.Graphics;

public class Renderer extends JPanel {

    private int screenWidth, screenHeight;
    private boolean isSplash = true;

    public void PlayGameScreen(int screenWidth, int screenHeight, boolean isSplash) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.isSplash = isSplash;
    }



    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);

    }
}
