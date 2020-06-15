package tn.iset.l2mdw;

import javax.swing.* ;

public class M1 extends JMenuBar
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu mf ;
	JMenuItem mi1, mi2, mi3, mi4 ;
	JMenu me ;
	JMenuItem mi5, mi6, mi7 ;
	public M1() {
		/****************** Fichier ******************/
		mf = new JMenu("Fichier");
		mi1 = new JMenuItem("Nouveau");
		mi2 = new JMenuItem("Ouvrir");
		mi3 = new JMenuItem("Enregistrer");
		mi4 = new JMenuItem("Quitter");
		mf.add(mi1); // ajout de Nouveau à Fichier
		mf.add(mi2);
		mf.addSeparator(); //séparateur entre mi2 et mi3
		mf.add(mi3);
		mf.add(mi4);
		this.add(mf); // ajout de Fichier à la barre de menu
		/****************** Edition ******************/
		me = new JMenu("Edition");
		mi5 = new JMenuItem("Couper");
		mi6 = new JMenuItem("Copier");
		mi7 = new JMenuItem("Coller");
		me.add(mi5);
		me.add(mi6);
		me.add(mi7);
		this.add(me);
		
		JMenu m1 = new JMenu("Couleur") ;
		JMenuItem m11 = new JMenuItem("Rouge") ;
		//mf.setEnabled(false); // désactive la menu m1
		me.setEnabled(true); // active la menu m1
		me.setToolTipText("fond rouge") ;
		
		
	}
}