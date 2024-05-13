package ejercicio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListarPelicula extends JPanel {

	public PanelListarPelicula() {
		setLayout(null);
		
		JLabel lblPelculas = new JLabel("Pel\u00EDculas");
		lblPelculas.setBounds(25, 109, 67, 14);
		add(lblPelculas);
		
		JList list = new JList();
		list.setBounds(129, 38, 249, 170);
		add(list);

	}
}
