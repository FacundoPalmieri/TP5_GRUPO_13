package ejercicio;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import ejercicio.Peliculas;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListarPelicula extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel lblPeliculas;
	private JScrollPane scrollPane;
	private GroupLayout groupLayout;
	private JList<Peliculas> jListPeliculas;
	private DefaultListModel<Peliculas> listModelPeliculas;

	public PanelListarPelicula() {
		
		lblPeliculas = new JLabel("Peliculas");
		
		scrollPane = new JScrollPane();
		groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(46)
					.addComponent(lblPeliculas)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(146, Short.MAX_VALUE)
					.addComponent(lblPeliculas)
					.addGap(140))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
		);
		
		jListPeliculas = new JList<Peliculas>();
		scrollPane.setViewportView(jListPeliculas);
		setLayout(groupLayout);

	}
	public void setDefaultLisModel(DefaultListModel<Peliculas> listModel) {
		this.listModelPeliculas = listModel;
		jListPeliculas.setModel(this.listModelPeliculas);
	}
	
	
	
	

}
