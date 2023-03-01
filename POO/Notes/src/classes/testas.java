package classes;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class testas {
	public testas() {
		String[] listValues = { "Click", "To", "Add", "New", "Values" };
	    DefaultListModel<String> model = new DefaultListModel<>();
	    for (String s : listValues) {
	      model.addElement(s);
	    }
	    JList<String> list = new JList<>(model);
	    MouseListener addListener = new MouseAdapter() {
	      @Override
	      public void mouseClicked(MouseEvent me) {
	        model.addElement("aa");     
	      }
	    };
	    list.addMouseListener(addListener);
	    JOptionPane.showMessageDialog(null, new JScrollPane(list));
	  }
    public static void main(String[] args) {
        testas a = new testas();
    }
}