import java.awt.*;
import java.awt.event.*;

public class MouseEventAndWindowEvent extends Frame implements MouseListener, WindowListener 
{

    public MouseEventAndWindowEvent() 
	{
        setTitle("Mouse and Window Event Demo");
        setSize(400, 300);
        // Add event listeners to the frame
        addMouseListener(this);
        addWindowListener(this);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) 
	{
        System.out.println("Mouse Clicked ");
    }

    public void mousePressed(MouseEvent e) 
	{
        System.out.println("Mouse Pressed ");
    }

    public void mouseReleased(MouseEvent e) 
	{
        System.out.println("Mouse Released ");
    }

    public void mouseEntered(MouseEvent e) 
	{
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) 
	{
        System.out.println("Mouse Exited");
    }

    // WindowListener methods
    public void windowOpened(WindowEvent e) 
	{
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) 
	{
        System.out.println("Window Closing");
        System.exit(0); // Terminate the program when the window is closed
    }

    public void windowClosed(WindowEvent e) 
	{
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) 
	{
        System.out.println("Window Iconified (Minimized)");
    }

    
    public void windowDeiconified(WindowEvent e) 
	{
        System.out.println("Window Deiconified (Restored)");
    }

    public void windowActivated(WindowEvent e) 
	{
        System.out.println("Window Activated");
    }

   
    public void windowDeactivated(WindowEvent e) 
	{
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) 
	{
        MouseEventAndWindowEvent demo = new MouseEventAndWindowEvent();
        demo.setVisible(true);
    }
}
