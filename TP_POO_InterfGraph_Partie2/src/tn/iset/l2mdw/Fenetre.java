package tn.iset.l2mdw;

import java.awt.* ;
import javax.swing.* ;
public class Fenetre extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b1 ;
	public Fenetre(){ //constructeur
		setTitle("Ma première fenêtre");
		setSize(600,450);
		Container c = getContentPane();
		setJMenuBar( new M1() );
		setVisible(true);
	}
}