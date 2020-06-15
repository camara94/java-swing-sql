package tn.iset.l2mdw;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

public class ExerciceTP6P3 extends JFrame implements ActionListener, MouseListener, ItemListener {
	
	private JLabel label1;
	private GridLayout gl;
	private JTextArea txta;
	private JCheckBox ch1, ch2;
	private JRadioButton rb1, rb2;
	private JButton btn1;
	
	public ExerciceTP6P3() {
		this.setTitle("Box Layout");
	    this.setSize(650, 400);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    //On crée un conteneur avec gestion horizontale
	    Box b1 = Box.createHorizontalBox();
	    label1 = new JLabel("liste des évènements :");
	    b1.add(label1);
	    //Idem
	    Box b2 = Box.createHorizontalBox();
	    txta = new JTextArea(10, 35);
	    b2.add(txta);
	    //Idem
	    Box b3 = Box.createHorizontalBox();
	    ch1 = new JCheckBox("case 1");
	    ch2 = new JCheckBox("case 2");
	    b3.add(ch1);
	    b3.add(ch2);
	    
	    Box b4 = Box.createHorizontalBox();
	    rb1 = new JRadioButton("radio 1");
	    rb2 = new JRadioButton("radio 2");
	    b4.add(rb1);
	    b4.add(rb2);
	    
	    Box b5 = Box.createHorizontalBox();
	    btn1 = new JButton("Valider");
	    b5.add(btn1);
	    //On crée un conteneur avec gestion verticale
	    Box b6 = Box.createVerticalBox();
	    b6.add(b1);
	    b6.add(b2);
	    b6.add(b3);
	    b6.add(b4);
	    b6.add(b5);
	    btn1.addActionListener(this);
	    ch1.addActionListener(this);
	    ch2.addActionListener(this);
	    rb1.addActionListener(this);
	    rb2.addActionListener(this);
	    this.addMouseListener(this);
	    this.getContentPane().add(b6);
	    this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {	
		System.out.println(arg0.getSource()) ;
		if(arg0.getSource() == ch1) {
			System.out.println(ch1.isSelected() );
		}
	}

	@Override
	public void mouseClicked( MouseEvent ev ) {
		System.out.println("clic dans la fenêtre au point de coordonnées :" 
					+ ev.getX() + "," + ev.getY() ) ;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
	}
}
