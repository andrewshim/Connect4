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
import java.awt.event.*;
public class Board1 extends JPanel implements MouseListener
{
    //private Circle[][] circles = new Circle[6][7];
    private Timer t = new Timer();

    public Board1()
    {
        super();
        t = new Timer(speed, this);
        t.start();
        addMouseListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    void mouseClicked(MouseEvent e)
    {

    }

    void mousePressed(MouseEvent e)
    {

    }

    void mouseReleased(MouseEvent e)
    {

    }

    void mouseEntered(MouseEvent e)
    {

    }

    void mouseExited(MouseEvent e)
    {

    }
}
