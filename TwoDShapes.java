import javax.swing.*;
import java.awt.*;

public class TwoDShapes extends JFrame {
    private static final long serialVersionUId = 1l;
    private static final int sampleCanvasWidth = 500;
    private static final int sampleCanvasHeight = 500;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TwoDShapes();
            }
        });
    }
    // here DrawCanvas is a class name
    private DrawCanvas sampleCanvas;
    public TwoDShapes(){
        sampleCanvas = new DrawCanvas();
        sampleCanvas.setPreferredSize(new Dimension(sampleCanvasWidth, sampleCanvasHeight));
        // Container from awt;
        Container containerPane = getContentPane();
        containerPane.add(sampleCanvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Two Dimension Shapes");
        setVisible(true);
    }
    private static class DrawCanvas extends JPanel{
        private static final long serialVersionUId = 1l;
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            setBackground(Color.white);
            g.setColor(Color.magenta);
            g.drawLine(30,40,100,200);
            g.drawRect(200,210,50,50);
            g.setColor(Color.GREEN);
            g.fillRect(400,350,60,50);
            g.setColor(Color.black);
            g.setFont(new Font("monospace",Font.CENTER_BASELINE,18));
            g.drawString("JavaGraphic in two dimension",10,20);
        }

    }
}
