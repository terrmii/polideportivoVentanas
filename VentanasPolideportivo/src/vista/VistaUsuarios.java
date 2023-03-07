package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VistaUsuarios extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombreApellido;
	private JTextField textFieldDni;
	private JTextField textFieldCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VistaUsuarios dialog = new VistaUsuarios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VistaUsuarios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblUsuarios = new JLabel("USUARIOS");
			lblUsuarios.setBounds(126, 10, 181, 24);
			lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsuarios.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
			contentPanel.add(lblUsuarios);
		}
		
		JLabel lblNewLabel = new JLabel("NOMBRE APELLIDO:");
		lblNewLabel.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 65, 116, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblDni.setBounds(10, 121, 116, 14);
		contentPanel.add(lblDni);
		
		JLabel lblCodigo = new JLabel("CODIGO:");
		lblCodigo.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblCodigo.setBounds(10, 178, 116, 14);
		contentPanel.add(lblCodigo);
		
		textFieldNombreApellido = new JTextField();
		textFieldNombreApellido.setBounds(160, 62, 181, 20);
		contentPanel.add(textFieldNombreApellido);
		textFieldNombreApellido.setColumns(10);
		
		textFieldDni = new JTextField();
		textFieldDni.setColumns(10);
		textFieldDni.setBounds(160, 118, 181, 20);
		contentPanel.add(textFieldDni);
		
		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(160, 175, 181, 20);
		contentPanel.add(textFieldCodigo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("INSERTAR");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
