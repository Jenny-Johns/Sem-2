import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
public class Door extends Applet
{
private boolean isDoorBlue = true;
public void init() 
{
setSize(400, 400);
addMouseListener(new MouseAdapter() 
{
public void mouseClicked(MouseEvent e) 
{
isDoorBlue = !isDoorBlue;
repaint();
}
});
}
public void paint(Graphics g) 
{
g.setColor(Color.BLACK);
g.drawRect(100, 100, 200, 200);
g.drawLine(100, 100, 200, 20);
g.drawLine(300, 100, 200, 20);
g.drawRect(150, 200, 100, 100);
if (isDoorBlue) 
{
g.setColor(Color.BLUE);
} 
else 
{
g.setColor(Color.RED);
}
g.fillRect(150, 200, 100, 100);
}
}
/*
<html>
<head>
<title>Applet</title>
</head>
<body>
<applet code="Door.class" width="500" height="500"></applet>
</body>
</html>
*/