package classses;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class gui {
	
   public static void main(String arg[]) throws IOException {
	  int x = 10;
	  int y = 10;
      JFrame frame = new JFrame("SetBounds Method Test");
      frame.setSize(375, 250);
      // Setting layout as null
      frame.setLayout(null);
      // Creating Button
      
   
      String filePath = new File("").getAbsolutePath().concat("/src/classses/frame1.png");
      System.out.println(filePath);
      BufferedImage myPicture = ImageIO.read(new File(filePath));
      JLabel picLabel = new JLabel(new ImageIcon(myPicture));
      picLabel.setBounds(x, y,32,32);
      frame.add(picLabel);
      // Setting position and size of a button
      
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      KeyListener listener = new KeyListener() {
          @Override
          
          public void keyPressed(KeyEvent event) {
        	  switch(event.getKeyCode()) {
        	  case 37:
        		  picLabel.setBounds(picLabel.getBounds().x-3,picLabel.getBounds().y ,32,32);
        		  
        		  break;
        	  case 38:
        		  picLabel.setBounds(picLabel.getBounds().x,picLabel.getBounds().y-3 ,32,32);
        		  break;
        	  case 39:
        		  picLabel.setBounds(picLabel.getBounds().x+3,picLabel.getBounds().y ,32,32);
        		  break;
        	  case 40:
        		  picLabel.setBounds(picLabel.getBounds().x,picLabel.getBounds().y+3,32,32);
        		  break;
        	  }
          };
          
          @Override
          public void keyReleased(KeyEvent event) {
              //printEventInfo("Key Released", event);
          }
          @Override
          public void keyTyped(KeyEvent event) {
              //printEventInfo("Key Typed", event);
          }
   };
   frame.addKeyListener(listener);
   }
   

}