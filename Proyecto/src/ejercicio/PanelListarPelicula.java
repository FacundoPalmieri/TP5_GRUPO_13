package ejercicio;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListarPelicula extends JPanel {

	private DefaultListModel<Peliculas> dlModel;
	
	public PanelListarPelicula(DefaultListModel<Peliculas> dlModel) {
		setLayout(null);
		this.dlModel=dlModel;
		JLabel lblPelculas = new JLabel("Pel\u00EDculas");
		lblPelculas.setBounds(25, 109, 67, 14);
		add(lblPelculas);
		JList list = new JList();
		list.setBounds(129, 38, 249, 170);
		add(list);

	}
}
