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

public class VistaInscripciones extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VistaInscripciones dialog = new VistaInscripciones();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VistaInscripciones() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel contentPanel_1 = new JPanel();
			contentPanel_1.setLayout(null);
			contentPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPanel_1.setBounds(0, 0, 434, 228);
			contentPanel.add(contentPanel_1);
			{
				JLabel lblUsuarios = new JLabel("INSCRIPCIONES");
				lblUsuarios.setHorizontalAlignment(SwingConstants.CENTER);
				lblUsuarios.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
				lblUsuarios.setBounds(126, 10, 181, 24);
				contentPanel_1.add(lblUsuarios);
			}
			{
				JLabel lblNewLabel = new JLabel("IN PROGRESS...");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setFont(new Font("Power Clear", Font.PLAIN, 23));
				lblNewLabel.setBounds(126, 81, 181, 73);
				contentPanel_1.add(lblNewLabel);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
