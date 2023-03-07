package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	public JButton btnNewButtonUsuarios;
	public JButton btnNewButtonInscripciones;
	public JButton btnNewButtonActividades;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("POLIDEPORTIVO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 11, 414, 25);
		contentPane.add(lblNewLabel);
		
		btnNewButtonInscripciones = new JButton("INSCRIPCIONES");
		btnNewButtonInscripciones.setFont(new Font("Eras Demi ITC", Font.PLAIN, 11));
		btnNewButtonInscripciones.setBounds(144, 108, 145, 23);
		contentPane.add(btnNewButtonInscripciones);
		
		btnNewButtonUsuarios = new JButton("USUARIOS");
		btnNewButtonUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButtonUsuarios.setFont(new Font("Eras Demi ITC", Font.PLAIN, 11));
		btnNewButtonUsuarios.setBounds(144, 60, 145, 23);
		contentPane.add(btnNewButtonUsuarios);
		
		btnNewButtonActividades = new JButton("ACTIVIDADES");
		btnNewButtonActividades.setFont(new Font("Eras Demi ITC", Font.PLAIN, 11));
		btnNewButtonActividades.setBounds(144, 162, 145, 23);
		contentPane.add(btnNewButtonActividades);
	}
}
