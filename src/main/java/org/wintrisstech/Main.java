package org.wintrisstech;
import javax.swing.*;
import java.awt.*;
public class Main extends JComponent implements Runnable
{
    private int width = (int) (Toolkit.getDefaultToolkit().getScreenSize().width);
    private int height = (int) (Toolkit.getDefaultToolkit().getScreenSize().height);
    private int gridDepth =5;
    private GridLayout gridLayout;
    private int getGridDepth = 3;
    private int gridHeight = 7;
    private String version = " version 0.0";
    public Main()
    {
        gridLayout = new GridLayout(gridDepth, gridHeight);
    }
    public static void main(String[] args)
    {
        Main main = new Main();
        SwingUtilities.invokeLater(main);
    }
    public void run()
    {
        JFrame jf = new JFrame("NN9" + version);
        jf.add(this);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setPreferredSize(new Dimension(width, height));
        jf.pack();
        jf.setVisible(true);
    }
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setBackground(Color.gray);
        g2.setColor(Color.black);
        g2.drawLine(0,0,500, 500);
    }
}
