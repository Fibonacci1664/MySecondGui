package com.davegreen;

import java.awt.*;
import javax.swing.*;

public class DrawPanel1 extends JPanel
{
    public DrawPanel1()
    {
    
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    
        Graphics2D g2d = (Graphics2D) g;
    
        int red = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        Color randomColor1 = new Color(red, blue, green);
        
        red = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        Color randomColor2 = new Color(red, blue, green);
    
        red = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        Color randomColor3 = new Color(red, blue, green);
    
        red = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        Color randomColor4 = new Color(red, blue, green);
    
        GradientPaint gradientPaint1 = new GradientPaint(100, 100, randomColor1, 450, 450, randomColor2);
        g2d.setPaint(gradientPaint1);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        GradientPaint gradientPaint2 = new GradientPaint(70, 70, randomColor3, 150, 150, randomColor4);
        g2d.setPaint(gradientPaint2);
        g2d.fillOval(100, 100, 100, 100);
    }
}
