package com.davegreen;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyGui
{
    private JFrame frame;
    private JButton buttonSouth;
    private JButton buttonEast;
    private JLabel labelWest;
    
    public MyGui()
    {
        this.frame = new JFrame();
        this.buttonSouth = new JButton("Click here to generate new random colours!");
        this.buttonEast = new JButton("Click here to change the text opposite!");
        this.labelWest = new JLabel("I've not been changed yet!");
    }
    
    public void drawStuff()
    {
        buttonSouth.addActionListener(new ButtonSouth());                   // Here we have added our listener and passed it the new ButtonSouth class for where to go when called.
        buttonEast.addActionListener(new ButtonEast());                     // Here we have added our listener and passed it the new ButtonEast class for where to go when called.
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, buttonSouth);
        frame.getContentPane().add(BorderLayout.EAST, buttonEast);
        frame.getContentPane().add(BorderLayout.WEST, labelWest);
        frame.setSize(600, 600);
        frame.setVisible(true);
        
        DrawPanel1 drawPanel1 = new DrawPanel1();
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel1);
    }
    
//    @Override
//    public void actionPerformed(ActionEvent e)
//    {
//        if(e.getSource() == buttonSouth)
//        {
//            frame.repaint();
//        }                                                               // While this method works, it is not the ideal solution as if we needed to change just one of the buttons/labels
//        else                                                            // we would have to come here to this method and start messing with the code that affects everything else.
//        {                                                               // THE ANSWER IS INNER CLASSES.
//            labelWest.setText("This should read something different!");
//        }
//    }
    
    class ButtonEast implements ActionListener                              // These are the inner classes that allow us to deal with multiple listeners in the most effective way, because
    {                                                                       // each of these inner classes imn their own right implement the ActionListener there is now now need for the main
        @Override                                                           // Gui class (Outer class) to implement ActionListener.
        public void actionPerformed(ActionEvent e)
        {
            labelWest.setText("This should read something different!");
        }
    }
    
    class ButtonSouth implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            frame.repaint();
        }
    }
    
}
