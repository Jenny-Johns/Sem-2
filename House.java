import java.applet.*; 
import java.awt.*; 
import java.awt.event.*; 
public class House extends Applet implements MouseListener
{ 
 Color doorColor; 
 public void init()
 { 
 doorColor = Color.BLUE; 
 addMouseListener(this); 
 } 
 
 public void paint(Graphics g)
 { 
 
 g.setColor(Color.BLACK); 
 g.drawRect(50, 50, 200, 200); 
 g.drawLine(50, 50, 150, 20); 
 g.drawLine(150, 20, 250, 50); 
 g.setColor(doorColor); 
 g.fillRect(120, 160, 60, 90); 
 } 
 
 public void mouseClicked(MouseEvent e)
 { 
 if (doorColor == Color.BLUE) 
 doorColor = Color.RED; 
 else 
 doorColor = Color.BLUE; 
 
 repaint(); 
 }  
} 
/* 
<html> 
<head> 
 <title>House Door Applet Program</title> 
</head> 
<body> 
 <applet code="House.class" width="400" height="400"> 
</applet> 
</body> 
</html>*/