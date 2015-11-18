import java.awt.*;   
import javax.swing.*;
import java.util.ArrayList;
class DrawTest
{
    public ArrayList<Node> draw_test_list;
    public void createFrame(ArrayList<Node> list)
    {
        System.out.println(list);
        draw_test_list = list;
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MyPanel p = new MyPanel();
        p.setList(draw_test_list);
        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);
    }
}
class MyPanel extends JPanel
{
    ArrayList<Node> jpanel_list;
    MyPanel()
    {
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(500,500));
    }
    public void setList(ArrayList<Node> set_list)
    {
        jpanel_list = set_list;
    }
    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        for (int i = 0; i < jpanel_list.size(); i++) {
            System.out.println(jpanel_list.get(i));
            Node temp = jpanel_list.get(i);
            if(temp.parent!=null)
                drawingOval(page,temp.x,temp.y,20,temp.parent.x, temp.parent.y, temp.used, temp.size);
            else
                drawingOval(page,temp.x,temp.y,20, 0, 0, temp.used, temp.size);
        }
        
    }

    private void drawingOval(Graphics g, int x, int y, int radius, int parent_x, int parent_y, boolean used, int size)
    {
        g.drawOval(x, y, radius*2, radius*2);
        if(used == true)
            g.setColor(Color.GREEN);
        else
            g.setColor(Color.RED);
        g.fillOval(x, y, radius*2, radius*2);
        g.setColor(Color.WHITE);
        g.drawString(Integer.toString(size),x+radius/2,y+radius);
        if(parent_x !=0 && parent_y !=0)
        {
            g.setColor(Color.BLACK);
            g.drawLine(parent_x+radius-3,parent_y+radius,x+radius-3,y+radius);
        }
    }
}