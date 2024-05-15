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
import java.util.Collections;
import java.util.Comparator; 
import java.util.List;
import java.util.ArrayList;


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
	
	public void setDefaultListModel(DefaultListModel<Peliculas> listModel) {
	    this.listModelPeliculas = listModel;

	
	    List<Peliculas> peliculasList = new ArrayList<>();
	    for (int i = 0; i < listModelPeliculas.size(); i++) {
	        peliculasList.add(listModelPeliculas.getElementAt(i));
	    }

	
	    Collections.sort(peliculasList, new Comparator<Peliculas>() {
	        public int compare(Peliculas pelicula1, Peliculas pelicula2) {
	            return pelicula1.getNombre().compareTo(pelicula2.getNombre());
	        }
	    });


	    listModelPeliculas.clear();

	 
	    for (Peliculas pelicula : peliculasList) {
	        listModelPeliculas.addElement(pelicula);
	    }


	    jListPeliculas.setModel(listModelPeliculas);
	}

}
