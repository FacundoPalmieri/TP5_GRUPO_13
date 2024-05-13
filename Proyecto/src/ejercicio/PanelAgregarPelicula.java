package ejercicio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPelicula extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldAgregarPelicula;
	private JComboBox<Categorias> cbCategorias;

	public PanelAgregarPelicula() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{72, 42, 54, 147, 136, 0};
		gridBagLayout.rowHeights = new int[]{0, 31, 26, 55, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel label = new JLabel("ID");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 2;
		add(label, gbc_label);
		
		JLabel lblNumeroid = new JLabel("NumeroID");
		GridBagConstraints gbc_lblNumeroid = new GridBagConstraints();
		gbc_lblNumeroid.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroid.gridx = 3;
		gbc_lblNumeroid.gridy = 2;
		add(lblNumeroid, gbc_lblNumeroid);
		lblNumeroid.setText(String.valueOf(Peliculas.getId()));
		
		JLabel label_1 = new JLabel("Nombre");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 3;
		add(label_1, gbc_label_1);
		
		textFieldAgregarPelicula = new JTextField();
		GridBagConstraints gbc_textFieldAgregarPelicula = new GridBagConstraints();
		gbc_textFieldAgregarPelicula.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldAgregarPelicula.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldAgregarPelicula.gridx = 3;
		gbc_textFieldAgregarPelicula.gridy = 3;
		add(textFieldAgregarPelicula, gbc_textFieldAgregarPelicula);
		textFieldAgregarPelicula.setColumns(10);
		
		JLabel label_2 = new JLabel("Genero");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 4;
		add(label_2, gbc_label_2);
		
	
			
			cbCategorias = new JComboBox<Categorias>();
			GridBagConstraints gbc_cbCategorias = new GridBagConstraints();
			gbc_cbCategorias.insets = new Insets(0, 0, 5, 5);
			gbc_cbCategorias.fill = GridBagConstraints.HORIZONTAL;
			gbc_cbCategorias.gridx = 3;
			gbc_cbCategorias.gridy = 4;
			add(cbCategorias, gbc_cbCategorias);

			cbCategorias.addItem(new Categorias(1, "Terror"));
			cbCategorias.addItem(new Categorias(2, "Accion"));
			cbCategorias.addItem(new Categorias(3, "Suspenso"));
			cbCategorias.addItem(new Categorias(4, "Romantica"));
			
		
		
		//Evento boton Aceptar
		JButton btnAceptarAgregarPelicula = new JButton("Aceptar");
		btnAceptarAgregarPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		GridBagConstraints gbc_btnAceptarAgregarPelicula = new GridBagConstraints();
		gbc_btnAceptarAgregarPelicula.fill = GridBagConstraints.BOTH;
		gbc_btnAceptarAgregarPelicula.gridwidth = 2;
		gbc_btnAceptarAgregarPelicula.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptarAgregarPelicula.gridx = 1;
		gbc_btnAceptarAgregarPelicula.gridy = 6;
		add(btnAceptarAgregarPelicula, gbc_btnAceptarAgregarPelicula);
		
		
	}

}
