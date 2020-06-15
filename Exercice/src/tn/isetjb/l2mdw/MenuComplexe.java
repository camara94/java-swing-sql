package tn.isetjb.l2mdw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class MenuComplexe  extends JFrame implements ActionListener {
	
	public MenuComplexe(String title)
	{
		super(title);

		// création de la bar de menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// menu fichier
		JMenu fichier = new JMenu("Fichier");
		menuBar.add(fichier);
		fichier.add(getSousMenuFichier());
		fichier.add("Properties...");
		
	}

	private JMenu getSousMenuFichier()
	{
		JMenu sousMenuFichier = new JMenu("Edition");
		List<String> menus = new ArrayList<String>();
		menus.add( "Copier" );
		menus.add( "Coller" );
		addFichier(sousMenuFichier, menus);

		return sousMenuFichier;
	}

	private void addFichier(JComponent menu, List<String> chaines)
	{
		ButtonGroup group = new ButtonGroup();
		
		chaines.forEach(ch -> { 
			JMenuItem item = new JMenuItem(ch);
			group.add(item);	
			menu.add(item);
		} );
		menu.add(getPropertiesSubMenu());
		
		
	}
	
	private JMenu getPropertiesSubMenu()
	{
		ButtonGroup group = new ButtonGroup();
		JMenu propertiesSubMenu = new JMenu("Properties..");

		JRadioButtonMenuItem solid = 
				new JRadioButtonMenuItem("Solid", true);
		group.add(solid);
		propertiesSubMenu.add(solid);
		JRadioButtonMenuItem outline = 
				new JRadioButtonMenuItem("Outline");
		group.add(outline);
		propertiesSubMenu.add(outline);

		return propertiesSubMenu;
	}



	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}