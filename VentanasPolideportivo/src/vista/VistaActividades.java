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
import java.awt.Color;

public class VistaActividades extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldIdActividades;
	private JTextField textFieldNombre;
	private JTextField textFieldFechaInicio;
	private JTextField textFieldDiasSemana;
	private JTextField textFieldHoras;
	private JTextField textFieldMaxParticipantes;
	private JTextField textFieldPrecio;
	public JButton btnNewButtonVisualizarActividades;
	public JButton newButtonModificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VistaActividades dialog = new VistaActividades();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VistaActividades() {
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel contentPanel_1 = new JPanel();
		contentPanel_1.setLayout(null);
		contentPanel_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel_1.setBounds(0, 0, 434, 228);
		contentPanel.add(contentPanel_1);
		
		JPanel contentPanel_2 = new JPanel();
		contentPanel_2.setLayout(null);
		contentPanel_2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel_2.setBounds(0, 0, 434, 228);
		contentPanel_1.add(contentPanel_2);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblId.setBounds(10, 65, 116, 14);
		contentPanel_2.add(lblId);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblNombre.setBounds(10, 93, 116, 14);
		contentPanel_2.add(lblNombre);
		
		JLabel lblFechaInicio = new JLabel("FECHA INICIO:");
		lblFechaInicio.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblFechaInicio.setBounds(10, 118, 116, 14);
		contentPanel_2.add(lblFechaInicio);
		
		textFieldIdActividades = new JTextField();
		textFieldIdActividades.setColumns(10);
		textFieldIdActividades.setBounds(103, 62, 181, 20);
		contentPanel_2.add(textFieldIdActividades);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEnabled(false);
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(103, 90, 181, 20);
		contentPanel_2.add(textFieldNombre);
		
		textFieldFechaInicio = new JTextField();
		textFieldFechaInicio.setEnabled(false);
		textFieldFechaInicio.setColumns(10);
		textFieldFechaInicio.setBounds(103, 118, 181, 20);
		contentPanel_2.add(textFieldFechaInicio);
		
		JLabel lblActividades = new JLabel("ACTIVIDADES");
		lblActividades.setBounds(134, 11, 181, 24);
		contentPanel_2.add(lblActividades);
		lblActividades.setHorizontalAlignment(SwingConstants.CENTER);
		lblActividades.setFont(new Font("Eras Bold ITC", Font.BOLD, 20));
		
		JLabel lblDiasSemena = new JLabel("DIAS SEMANA");
		lblDiasSemena.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblDiasSemena.setBounds(10, 143, 116, 14);
		contentPanel_2.add(lblDiasSemena);
		
		textFieldDiasSemana = new JTextField();
		textFieldDiasSemana.setEnabled(false);
		textFieldDiasSemana.setColumns(10);
		textFieldDiasSemana.setBounds(103, 143, 181, 20);
		contentPanel_2.add(textFieldDiasSemana);
		
		JLabel lblHoras = new JLabel("HORAS:");
		lblHoras.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblHoras.setBounds(10, 168, 116, 14);
		contentPanel_2.add(lblHoras);
		
		textFieldHoras = new JTextField();
		textFieldHoras.setEnabled(false);
		textFieldHoras.setColumns(10);
		textFieldHoras.setBounds(103, 168, 181, 20);
		contentPanel_2.add(textFieldHoras);
		
		JLabel lblMaxParticip = new JLabel("MAX PARTICIP:");
		lblMaxParticip.setFont(new Font("Eras Medium ITC", Font.PLAIN, 12));
		lblMaxParticip.setBounds(10, 193, 116, 14);
		contentPanel_2.add(lblMaxParticip);
		
		textFieldMaxParticipantes = new JTextField();
		textFieldMaxParticipantes.setEnabled(false);
		textFieldMaxParticipantes.setColumns(10);
		textFieldMaxParticipantes.setBounds(103, 193, 181, 20);
		contentPanel_2.add(textFieldMaxParticipantes);
		
		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setFont(new Font("Eras Medium ITC", Font.PLAIN, 14));
		lblPrecio.setBounds(304, 64, 59, 14);
		contentPanel_2.add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setEnabled(false);
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(304, 90, 120, 20);
		contentPanel_2.add(textFieldPrecio);
		
		btnNewButtonVisualizarActividades = new JButton("VISUALIZAR");
		btnNewButtonVisualizarActividades.setForeground(Color.BLUE);
		btnNewButtonVisualizarActividades.setBounds(304, 139, 120, 23);
		contentPanel_2.add(btnNewButtonVisualizarActividades);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				newButtonModificar = new JButton("MODIFICAR");
				newButtonModificar.setActionCommand("OK");
				buttonPane.add(newButtonModificar);
				getRootPane().setDefaultButton(newButtonModificar);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
