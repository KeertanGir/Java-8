package Lacture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

// Lambda In Desktop applications
public class MyWindow {
    public static void main(String[] args) {

//        JFrame
         JFrame jFrame = new JFrame("My Window");
         jFrame.setSize(400, 400);

//         JButton

          JButton jButton = new JButton( "Click Me" );
          jFrame.add(jButton);
          jFrame.setLayout(new FlowLayout());

//          Anonymous class
//          jButton.addActionListener(new ActionListener() {
//              @Override
//              public void actionPerformed(ActionEvent e) {
//                  System.out.println("Button Clicked!!");
//                  JOptionPane.showMessageDialog(null, "Button Is Clicked!");
//              }
//          });


//        Lambda Function
        jButton.addActionListener( (e) -> {
            System.out.println("Button Clicked!!");
            JOptionPane.showMessageDialog(null, "Button Is Clicked!");
        } );
//      Lambda Will Used Only with the Functional Interface
//        This is the Limitation of Lambda
//      For More than One Methods in A Interface We Use Anonumous Class

//        Anonymous Class
        jButton.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });



         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jFrame.setVisible(true);

    }

}
