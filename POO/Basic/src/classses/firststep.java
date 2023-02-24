package classses;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class firststep {
	
	public static void main(String[] args) {
		Manager central = new Manager();
		
		Color Green = new Color(0, 100, 0);
		Color Black = new Color(0, 0, 0);
		Color White = new Color(255, 255, 255);
		Color Pink = new Color(255, 105, 180);
		Color HardPink = new Color(255, 20, 147);
		Color HardGreen = new Color(0, 200, 0);
		
		Border border = new LineBorder(new Color(0, 100, 0), 1, true);
		Border border1 = new LineBorder(new Color(0, 0, 0), 1, true);
		
		Border border2 = new LineBorder(new Color(255, 105, 180), 1, true);
		Border border3 = new LineBorder(new Color(255, 255, 255), 1, true);
		
		
		JFrame frame = new JFrame("Input Software");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JMenuBar mb = new JMenuBar();
        mb.setBorder(border);
        mb.setBackground(new Color(0, 0, 0));
        
        
        JMenu m1 = new JMenu("Themes");
        m1.setForeground(new Color(0, 100, 0));
        
        mb.add(m1);
  
        
        JMenuItem m11 = new JMenuItem("Hacker");
        JMenuItem m22 = new JMenuItem("Marshmallow");
        m1.add(m11);
        m1.add(m22);

      
        JPanel panel = new JPanel(); 
        panel.setBackground(new Color(0, 0, 0));
        panel.setForeground(new Color(0, 100, 0));
        panel.setBorder(border);
        
        JLabel label = new JLabel("Input :");
        label.setForeground(new Color(0, 100, 0));
        JTextField tf = new JTextField(20);
        
        tf.setBackground(new Color(0, 100, 0));
        tf.setForeground(new Color(0, 0, 0));
        tf.setBorder(border);
        
        
        JButton send = new JButton("Send");
        send.setBackground(new Color(0, 100, 0));
        send.setForeground(new Color(0, 0, 0));
        send.setBorder(border);
        JButton reset = new JButton("Reset");
        reset.setBackground(Green);
        reset.setForeground(new Color(0, 0, 0));
        reset.setBorder(border);
        
        
        
        panel.add(label); 
        panel.add(tf);
        panel.add(send);
        panel.add(reset);
        
        JTextArea ta = new JTextArea();
        ta.setEditable(false);
        ta.setBackground(new Color(0, 0, 0));
        ta.setForeground(new Color(0, 200, 0));
        ta.setBorder(border);
        JScrollPane scroll = new JScrollPane(ta);
        scroll.setBackground(new Color(0, 0, 0));
        scroll.setForeground(new Color(0, 100, 0));
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBorder(border1);
		
        frame.getContentPane().add(BorderLayout.SOUTH, mb);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scroll);
        frame.setVisible(true);
        
        scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new Color(0, 100, 0);
                this.trackColor = Color.BLACK;
            }
            @Override
            protected JButton createDecreaseButton(int orientation) {
                JButton button = super.createDecreaseButton(orientation);
                button.setBackground(Green);
                button.setBorder(border);
                return button;
                
            }

            @Override
            protected JButton createIncreaseButton(int orientation) {
                JButton button = super.createIncreaseButton(orientation);
                button.setBackground(Green);
                button.setBorder(border);
                return button;
            }
        });
        
        send.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText(ta.getText()+central.writeTerminal(tf.getText())+"\n");
				tf.setText("");
				/*
				try {
					List<List<String>> records = wr.getdata();
					for(int i = 0; i< records.size();i++) {
						ta.setText(ta.getText()+records.get(i)+"\n");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				*/
				
			}
        });
        
        m11.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Hacker");
				mb.setBorder(border);
		        mb.setBackground(Black);
		        m1.setForeground(Green);
		        panel.setBackground(Black);
		        panel.setForeground(Green);
		        panel.setBorder(border);
		        ta.setBackground(Black);
		        ta.setForeground(HardGreen);
		        ta.setBorder(border);
		        scroll.setBackground(Black);
		        scroll.setForeground(Green);
		        scroll.setBorder(border1);
		        tf.setBackground(Green);
		        tf.setForeground(Black);
		        tf.setBorder(border);
		        send.setBackground(Green);
		        send.setForeground(Black);
		        send.setBorder(border);
		        reset.setBackground(Green);
		        reset.setForeground(Black);
		        reset.setBorder(border);
		        label.setForeground(Green);
		        scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		            @Override
		            protected void configureScrollBarColors() {
		                this.thumbColor = Green;
		                this.trackColor = Color.BLACK;
		            }
		            @Override
		            protected JButton createDecreaseButton(int orientation) {
		                JButton button = super.createDecreaseButton(orientation);
		                button.setBackground(Green);
		                button.setBorder(border);
		                return button;
		                
		            }

		            @Override
		            protected JButton createIncreaseButton(int orientation) {
		                JButton button = super.createIncreaseButton(orientation);
		                button.setBackground(Green);
		                button.setBorder(border);
		                return button;
		            }
		        });
			}
        });
        m22.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Marshmallow");
				mb.setBorder(border2);
		        mb.setBackground(White);
		        m1.setForeground(Pink);
		        panel.setBackground(White);
		        panel.setForeground(Pink);
		        panel.setBorder(border2);
		        ta.setBackground(White);
		        ta.setForeground(HardPink);
		        ta.setBorder(border2);
		        label.setForeground(Pink);
		        scroll.setBackground(White);
		        scroll.setForeground(Pink);
		        scroll.setBorder(border3);
		        tf.setBackground(Pink);
		        tf.setForeground(White);
		        tf.setBorder(border2);
		        send.setBackground(Pink);
		        send.setForeground(White);
		        send.setBorder(border2);
		        reset.setBackground(Pink);
		        reset.setForeground(White);
		        reset.setBorder(border2);
		        scroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
		            @Override
		            protected void configureScrollBarColors() {
		                this.thumbColor = Pink;
		                this.trackColor = Color.WHITE;
		            }
		            @Override
		            protected JButton createDecreaseButton(int orientation) {
		                JButton button = super.createDecreaseButton(orientation);
		                button.setBackground(Pink);
		                button.setBorder(border2);
		                return button;
		                
		            }

		            @Override
		            protected JButton createIncreaseButton(int orientation) {
		                JButton button = super.createIncreaseButton(orientation);
		                button.setBackground(Pink);
		                button.setBorder(border2);
		                return button;
		            }
		        });
			}
        });
        reset.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ta.setText("");
			}
        });
        KeyListener listener = new KeyListener() {
            @Override
            public void keyPressed(KeyEvent event) {
                if(event.getKeyCode()==10) {
                	ta.setText(ta.getText()+central.writeTerminal(tf.getText())+"\n");
    				tf.setText("");
                }
            }
            @Override
            public void keyReleased(KeyEvent event) {
                //printEventInfo("Key Released", event);
            }
            @Override
            public void keyTyped(KeyEvent event) {
                //printEventInfo("Key Typed", event);
            }
            /*
            private void printEventInfo(String str, KeyEvent e) {
                System.out.println(str);
                int code = e.getKeyCode();
                System.out.println("   Code: " + KeyEvent.getKeyText(code)+code);
                System.out.println("   Char: " + e.getKeyChar());
                int mods = e.getModifiersEx();
                System.out.println("    Mods: "
                        + KeyEvent.getModifiersExText(mods));
                System.out.println("    Location: "
                        + keyboardLocation(e.getKeyLocation()));
                System.out.println("    Action? " + e.isActionKey());
            }*/
            /*
            private String keyboardLocation(int keybrd) {
                switch (keybrd) {
                    case KeyEvent.KEY_LOCATION_RIGHT:
                        return "Right";
                    case KeyEvent.KEY_LOCATION_LEFT:
                        return "Left";
                    case KeyEvent.KEY_LOCATION_NUMPAD:
                        return "NumPad";
                    case KeyEvent.KEY_LOCATION_STANDARD:
                        return "Standard";
                    case KeyEvent.KEY_LOCATION_UNKNOWN:
                    default:
                        return "Unknown";
                }
            }*/
        };
        
        tf.addKeyListener(listener);
        
        
	}
}
