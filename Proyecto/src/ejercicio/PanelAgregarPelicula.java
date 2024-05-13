package ejercicio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelAgregarPelicula extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldAgregarPelicula;
	private JComboBox<Categorias> cbCategorias;
	private JList list;
	private DefaultListModel<Peliculas> dlModel;
	
	

	public PanelAgregarPelicula() {
		setLayout(null);
		
		JLabel label = new JLabel("ID");
		label.setBounds(72, 32, 11, 14);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		add(label);
		
		JLabel lblNumeroid = new JLabel("NumeroID");
		lblNumeroid.setBounds(237, 32, 11, 14);
		add(lblNumeroid);
		lblNumeroid.setText(String.valueOf(Peliculas.getId()));
		
		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(72, 57, 54, 14);
		add(label_1);
		
		textFieldAgregarPelicula = new JTextField();
		textFieldAgregarPelicula.setBounds(168, 57, 152, 20);
		add(textFieldAgregarPelicula);
		textFieldAgregarPelicula.setColumns(10);
		
		JLabel label_2 = new JLabel("Genero");
		label_2.setBounds(72, 92, 67, 14);
		add(label_2);
		
	
			
			cbCategorias = new JComboBox<Categorias>();
			cbCategorias.setBounds(168, 88, 152, 20);
			add(cbCategorias);

			cbCategorias.addItem(new Categorias(0, "Seleccione un Género"));
			cbCategorias.addItem(new Categorias(1, "Terror"));
			cbCategorias.addItem(new Categorias(2, "Accion"));
			cbCategorias.addItem(new Categorias(3, "Suspenso"));
			cbCategorias.addItem(new Categorias(4, "Romantica"));
			
		
			list = new JList();
			dlModel = new DefaultListModel<Peliculas>();
			list.setModel(dlModel);
		
		//Evento boton Aceptar
		JButton btnAceptarAgregarPelicula = new JButton("Aceptar");
		btnAceptarAgregarPelicula.setBounds(72, 144, 91, 23);
		btnAceptarAgregarPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        if (!textFieldAgregarPelicula.getText().isEmpty() && cbCategorias.getSelectedIndex() != 0) {
			            Peliculas p = new Peliculas();
			            p.setNombre(textFieldAgregarPelicula.getText());
			            dlModel.addElement(p);
			            
			        } else if(textFieldAgregarPelicula.getText().isEmpty() && cbCategorias.getSelectedIndex() == 0) {
			            throw new Exception("Debe completar la película y seleccionar un género");
			            
			          } else if (textFieldAgregarPelicula.getText().isEmpty()) {
			        		throw new Exception("Debe completar la película");
			        		
			        	} else {
			        	   throw new Exception("Debe seleccionar un género");
			        	}
			        
			      } catch (Exception ex) {
			          JOptionPane.showMessageDialog(null, ex.getMessage());
			        }				
			}
		});
		add(btnAceptarAgregarPelicula);
		
		
	}

}
