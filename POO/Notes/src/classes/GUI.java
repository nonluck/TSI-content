package classes;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class GUI{
	int flag = 0;
	Manager cache = new Manager();
	void setItensOnMemory(DefaultListModel<String> model) {
		for (File file : cache.getDocumentsList()) {
		    if (file.isFile()) {
		        model.addElement(file.getName());
		    }
		}
		
		
	}
	public GUI() {
		JFrame frame = new JFrame("Notes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        JPanel panel = new JPanel();   
        JLabel label = new JLabel("Input :");
        JTextField tf = new JTextField(20);
        JButton send = new JButton("Send");
        JButton check = new JButton("Check");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        
        send.setFocusable(false);
        setItensOnMemory(model);
        panel.add(label); 
        panel.add(tf);
        panel.add(send);
        panel.add(check);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, new JScrollPane(list));
        frame.setVisible(true);
        
        send.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 
				model.addElement(tf.getText()); 
				tf.setText("");
			}
        });
        check.addActionListener((ActionListener) new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int index = list.getSelectedIndex();
	            System.out.println("Index Selected: " + index);
	            String s = (String) list.getSelectedValue();
	            System.out.println("Value Selected: " + s);
			}
        });
        
	}
	
	public static void main(String[] args) {
		GUI Gui = new GUI();
	}
}