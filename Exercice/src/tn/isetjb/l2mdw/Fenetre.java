package tn.isetjb.l2mdw;

import java.awt.* ;
import javax.swing.* ;
public class Fenetre extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton b1 ;
	public Fenetre(){ //constructeur
		setTitle("Ma premi�re fen�tre");
		setSize(600,450);
		Container c = getContentPane();
		setJMenuBar( new M1() );
		setVisible(true);
	}
}
