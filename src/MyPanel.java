import java.awt.*;   
import javax.swing.*;

class MyPanel extends JPanel
{

    MyPanel()
    {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500,500));
    }

    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        drawingOval(page,250,10,20);
    }

    private void drawingOval(Graphics g, int x, int y, int radius)
    {
        g.drawOval(x, y, radius*2, radius*2);
        g.setColor(Color.RED);
        g.fillOval(x, y, radius*2, radius*2);
        g.setColor(Color.BLUE);
        g.drawString("abc",x+radius/20,y+radius);
    }
}