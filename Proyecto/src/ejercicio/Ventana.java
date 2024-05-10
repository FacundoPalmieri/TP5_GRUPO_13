package ejercicio;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPeli = new JMenu("Pel\u00EDculas");
		menuBar.add(menuPeli);
		
		JMenuItem miAgregar = new JMenuItem("Agregar");
		menuPeli.add(miAgregar);
		
		JMenuItem miListar = new JMenuItem("Listar");
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
