package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaActividades;

public class ControladorActividades implements ActionListener{

	VistaActividades actividades;
	
	public void inicializar() {
		actividades.setTitle("Gestionar Actividades");
		actividades.setLocationRelativeTo(null);
		actividades.setVisible(false);
	}
	
	public ControladorActividades(VistaActividades actividades) {
		this.actividades = actividades;
		this.actividades.btnNewButtonVisualizarActividades.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
