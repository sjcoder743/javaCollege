import javax.swing.*;
import java.awt.*;

public class DDA extends JPanel {
    private int x1, y1, x2, y2;

    public DDA(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        DdaLine(x1, y1, x2, y2, g);
    }

    private void DdaLine(int x1, int y1, int x2, int y2, Graphics g) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int steps;

        // Calculate the number of steps required for the line
        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        } else {
            steps = Math.abs(dy);
        }

        // Calculate the increment for each step
        float xIncre = dx / (float) steps;
        float yIncre = dy / (float) steps;

        // Start drawing for the first point
        float x = x1;
        float y = y1;
        for (int i = 0; i <= steps; i++) { // Changed < to <= to include the last point
            g.fillRect(Math.round(x), Math.round(y), 1, 1);
            x += xIncre;
            y += yIncre;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DDA dda = new DDA(50, 50, 300, 200);
        frame.setTitle("DDA : ");
        frame.add(dda);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true); // Set the frame visible after adding components
    }
}