import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;   
import java.awt.Graphics; 
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List;
public class Board extends JPanel implements MouseListener
{
    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
    private JPanel panelBlue = new JPanel();
    private JPanel panelGreen = new JPanel();
    public static void main(String[] args)
    {
        new Board();
    }

    public Board()
    {
        //board simple specs
        this.setSize(1200, 1200); 
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        //toolkit
        Toolkit bob = Toolkit.getDefaultToolkit();
        //positioning
        Dimension dim = bob.getScreenSize(); //height and width
        int xPos = (dim.width/2) - (this.getWidth()/2);
        int yPos = (dim.height/2) - (this.getHeight()/2);

        this.setLocation(xPos, yPos);
        // cant resize:
        this.setResizable(false);

        //close on click:
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Connect Four BoardTrial");
        /*
        for(int i = 1; i < 7; i++)
        {
        for(int j = 1; j < 8; j++)
        {
        Jpanel i,j = new Panel();
        }
        }
         */
        // make botton for every column 
        // also, track by array where the click is, 
        // so for 
        // math.random for column chosen if no move to block 
        // button = random name to fill
        /*
        //set button invisible:
        button.setBorderPainted(false); 
        button.setContentAreaFilled(false);
        PanelName.add(button);
        // set dimenions of buttons to size of each column
         */
        this.add(one);

        JButton col1 = new JButton("Column1");
        col1.setBorderPainted(false);
        col1.setContentAreaFilled(false);
        one.add(col1);
        col1.setLocation(0, 0);
        col1.setSize(0, 0);
        this.add(new JLabel(new ImageIcon("Path/To/Your/Image.png")));

        JButton col2 = new JButton("Column2");
        col2.setBorderPainted(false);
        col2.setContentAreaFilled(false);
        one.add(col2);
        col1.setLocation(0, 0);
        col1.setSize(0, 0);

        int[] timesclicked = new int[7];

        if(//clicked with rangeof col1)
        )
        {
            int[0]+=1;
        }
        if(//clicked with rangeof col2 )
        )
        {
            int[1]+=1;
        }
        if(//clicked with rangeof col3)
        )
        {
            int[2]+=1;
        }
        if(//clicked with rangeof col4)
        )
        {
            int[3]+=1;
        }
        if(//clicked with rangeof col5)
        )
        {
            int[4]+=1;
        }
        if(//clicked with rangeof col6)
        )
        {
            int[5]+=1;
        }
        if(//clicked with rangeof col7)
        )
        {
            int[6]+=1;
        }
    }

    // how to layer panels
    public void mousePressed(MouseEvent e) {
        saySomething("Mouse pressed; # of clicks: "
            + e.getClickCount(), e);
    }

    public void mouseReleased(MouseEvent e) {
        saySomething("Mouse released; # of clicks: "
            + e.getClickCount(), e);
    }

    public void mouseEntered(MouseEvent e) {
        saySomething("Mouse entered", e);
    }

    public void mouseExited(MouseEvent e) {
        saySomething("Mouse exited", e);
    }

    public void mouseClicked(MouseEvent e) {
        saySomething("Mouse clicked (# of clicks: "
            + e.getClickCount() + ")", e);
    }

    void saySomething(String eventDescription, MouseEvent e) {
        textArea.append(eventDescription + " detected on "
            + e.getComponent().getClass().getName()
            + "." + newline);
    }

    public void Main()
    {
        frame.setPreferredSize(new Dimension(600, 400));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 600, 400);
        panelBlue.setBackground(Color.BLUE);
        panelBlue.setBounds(0, 0, 600, 400);
        panelBlue.setOpaque(true);
        panelGreen.setBackground(Color.GREEN);
        panelGreen.setBounds(200, 100, 100, 100);
        panelGreen.setOpaque(true);
        lpane.add(panelBlue, new Integer(0), 0);
        lpane.add(panelGreen, new Integer(1), 0);
        frame.pack();
        frame.setVisible(true);
    }
}