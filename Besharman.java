import java.awt.Graphics;
import javax.swing.JFrame;

public class Besharman extends JFrame {

    // Method to plot the pixel on the screen
    public void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int dx1 = 2 * dy;
        int dy1 = 2 * dx;
        int twody1 = 2 * dx1;
        int twodx1 = 2 * dy1;

        int twody = (dy > 0) ? dy1 - dx : -dy1 - dx;
        int twodx = (dy > 0) ? dx1 - dy : -dx1 - dy;

        int x = x1;
        int y = y1;

        if (Math.abs(dy) < Math.abs(dx)) {
            if (dx > 0) {
                while (x <= x2) {
                    g.fillRect(x, y, 1, 1);
                    if (twodx > 0) {
                        y++;
                        twodx += twody;
                    } else {
                        twodx += twodx1;
                    }
                    x++;
                }
            } else {
                while (x >= x2) {
                    g.fillRect(x, y, 1, 1);
                    if (twodx > 0) {
                        y--;
                        twodx += twody;
                    } else {
                        twodx += twodx1;
                    }
                    x--;
                }
            }
        } else {
            if (dy > 0) {
                while (y <= y2) {
                    g.fillRect(x, y, 1, 1);
                    if (twody > 0) {
                        x++;
                        twody += twodx;
                    } else {
                        twody += twody1;
                    }
                    y++;
                }
            } else {
                while (y >= y2) {
                    g.fillRect(x, y, 1, 1);
                    if (twody > 0) {
                        x--;
                        twody += twodx;
                    } else {
                        twody += twody1;
                    }
                    y--;
                }
            }
        }
    }

    // Constructor to set up the JFrame
    public Besharman() {
        setTitle("Bresenham's Line Algorithm");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to paint the line
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Example points (start and end of the line)
        drawLine(g, 50, 50, 350, 350); // Change these values to draw other lines
    }

    public static void main(String[] args) {
        Besharman frame = new Besharman();
        frame.setVisible(true);
    }
}