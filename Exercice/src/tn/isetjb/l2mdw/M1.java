package tn.isetjb.l2mdw;


import java.awt.CheckboxMenuItem;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.* ;

public class M1 extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JMenu mf, mio ;
	JMenuItem mi1, mi2, mi3, mi4;
	JMenu me ;
	JMenuItem mi5, mi6, mi7, mi8 ;
	JMenu ma ;
	JMenuItem mi9, mi10;
	JMenu mo ;
	JCheckBox cb1, cb2;
	JRadioButtonMenuItem rb1, rb2, rb3;
	public M1() {
		/****************** Fichier ******************/
		mf = new JMenu("Fichier");
		mi1 = new JMenuItem("Nouveau");
		mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Event.CTRL_MASK, true));
		mi2 = new JMenuItem("Ouvrir");
		mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK, true));
		mi3 = new JMenuItem("Enregistrer");
		mi3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK, true));
		mi4 = new JMenuItem("Enregistrer sous");
		mi4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK, true));
		mi5 = new JMenuItem("Quitter");
		mi5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK, true));
		mf.add(mi1); // ajout de Nouveau à Fichier
		mf.add(mi2);
		mf.addSeparator(); //séparateur entre mi2 et mi3
		mf.add(mi3);
		mf.add(mi4);
		mf.addSeparator(); //séparateur entre mi5
		
		//3 question
		mio = new JMenu("Options");
		mio.add( getSousMenuOption() );				
		mf.add(mio);
		mf.addSeparator();
		
		mf.add(mi5);
		this.add(mf); // ajout de Fichier à la barre de menu
		/****************** Edition ******************/
		me = new JMenu("Edition");
		mi6 = new JMenuItem("Couper");
		mi6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, Event.CTRL_MASK, true));
		mi7 = new JMenuItem("Copier");
		mi7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK, true));
		mi8 = new JMenuItem("Coller");
		mi8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK, true));
		me.add(mi6);
		me.add(mi7);
		me.add(mi8);
		this.add(me);
		
		/****************** Aide ******************/
		ma = new JMenu("Aide");
		mi9 = new JMenuItem("Ribriques d'aide");
		mi9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Event.CTRL_MASK, true));
		mi10 = new JMenuItem("A Propos");
		mi10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, Event.CTRL_MASK, true));
		
		
		//2 question
		mio = new JMenu("Options");
		mio.add( getSousMenuOption() );				
		this.add(mio);
		mf.addSeparator();
		


	}
	
	private void addOption(JMenu menu, List<String> chaines)
	{
		ButtonGroup group = new ButtonGroup();
		JCheckBoxMenuItem item;
		JRadioButtonMenuItem item2;
		
		for (int i = 0; i < chaines.size(); i++) {
			
			if( i == 0) {
				item = new JCheckBoxMenuItem(chaines.get(i), false);
				menu.add(item);
			} else if (i == 1) {
				item = new JCheckBoxMenuItem(chaines.get(i), true);
				menu.add(item);
				menu.addSeparator();
			} else if(i == 2) {
				item2 = new JRadioButtonMenuItem(chaines.get(i), true );
				group.add(item2);
				menu.add(item2);
			} else {
				item2 = new JRadioButtonMenuItem(chaines.get(i), true );
				group.add(item2);
				menu.add(item2);
			}
		}
	}
	
	private JCheckBoxMenuItem JCheckBoxMenuItem(String string, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	private JMenu getSousMenuOption()
	{
		List<String> menus = new ArrayList<String>();
		menus.add( "swing" );
		menus.add( "awt" );
		menus.add( "Débutant" );
		menus.add( "Moyen" );
		menus.add( "Expert" );
		addOption(mio, menus);

		return mio;
	}

	

	
}