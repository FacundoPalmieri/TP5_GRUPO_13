package ejercicio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	//private JList list;
	private DefaultListModel<Peliculas> dlModel;
	
	

	public PanelAgregarPelicula(DefaultListModel<Peliculas> dlModel) {
		setLayout(null);
		this.dlModel=dlModel;
		JLabel label_id = new JLabel("ID");
		label_id.setBounds(72, 32, 11, 14);
		label_id.setHorizontalAlignment(SwingConstants.LEFT);
		add(label_id);
		
		JLabel lblNumeroid = new JLabel("NumeroID");
		lblNumeroid.setBounds(168, 32, 11, 14);
		add(lblNumeroid);
		lblNumeroid.setText(String.valueOf(Peliculas.getId()));
		
		JLabel label_nombre = new JLabel("Nombre");
		label_nombre.setBounds(72, 57, 54, 14);
		add(label_nombre);
		
		textFieldAgregarPelicula = new JTextField();
		textFieldAgregarPelicula.setBounds(168, 57, 152, 20);
		add(textFieldAgregarPelicula);
		textFieldAgregarPelicula.setColumns(10);
		
		JLabel label_genero = new JLabel("Genero");
		label_genero.setBounds(72, 92, 67, 14);
		add(label_genero);
		
	
			
			cbCategorias = new JComboBox<Categorias>();
			cbCategorias.setBounds(168, 88, 152, 20);
			add(cbCategorias);

			cbCategorias.addItem(new Categorias(0, "Seleccione un Género"));
			cbCategorias.addItem(new Categorias(1, "Terror"));
			cbCategorias.addItem(new Categorias(2, "Accion"));
			cbCategorias.addItem(new Categorias(3, "Suspenso"));
			cbCategorias.addItem(new Categorias(4, "Romantica"));

		//Evento boton Aceptar
		JButton btnAceptarAgregarPelicula = new JButton("Aceptar");
		btnAceptarAgregarPelicula.setBounds(72, 144, 91, 23);
		btnAceptarAgregarPelicula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        if (!textFieldAgregarPelicula.getText().isEmpty() && cbCategorias.getSelectedIndex() != 0) {
			            Peliculas p = new Peliculas();
			            p.setNombre(textFieldAgregarPelicula.getText());
			            Peliculas.setId(Peliculas.getId());
			            dlModel.addElement(p);
			            JOptionPane.showMessageDialog(null, "Pelicula agregada correctamente");
			            
			            textFieldAgregarPelicula.setText("");
		                cbCategorias.setSelectedIndex(0);
		                 
		            	lblNumeroid.setText(String.valueOf(Peliculas.getId()));

		                
			            
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
