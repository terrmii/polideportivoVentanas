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
		
		JButton btnNewButton_1 = new JButton("INSCRIPCIONES");
		btnNewButton_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 11));
		btnNewButton_1.setBounds(144, 108, 145, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("USUARIOS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1_1.setFont(new Font("Eras Demi ITC", Font.PLAIN, 11));
		btnNewButton_1_1.setBounds(144, 60, 145, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("ACTIVIDADES");
		btnNewButton_1_2.setFont(new Font("Eras Demi ITC", Font.PLAIN, 11));
		btnNewButton_1_2.setBounds(144, 162, 145, 23);
		contentPane.add(btnNewButton_1_2);
	}
}
