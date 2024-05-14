package ejercicio;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static DefaultListModel<Peliculas> dlistModel;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Programa");
		
		dlistModel = new DefaultListModel<Peliculas>();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPeli = new JMenu("Peliculas");
		menuBar.add(menuPeli);
		
		JMenuItem miAgregar = new JMenuItem("Agregar");
		menuPeli.add(miAgregar);
		
		miAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				PanelAgregarPelicula panelAgregar = new PanelAgregarPelicula(dlistModel);
				contentPane.add(panelAgregar);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		
		
		JMenuItem miListar = new JMenuItem("Listar");
		miListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.removeAll();
				PanelListarPelicula panelListar = new PanelListarPelicula();
				panelListar.setDefaultLisModel(dlistModel);
				contentPane.add(panelListar);
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		menuPeli.add(miListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
	}

	public void cambiarVisibilidad(boolean estado) {
		setVisible(true);
		
	}

}
