package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaInscripciones;

public class ControladorInscripciones implements ActionListener{

	VistaInscripciones inscripciones;
	
	public ControladorInscripciones(VistaInscripciones inscripciones) {
		this.inscripciones = inscripciones;
		this.inscripciones.btnNewButtonInscribir.addActionListener(this);
	}
	
	public void inicializar() {
		inscripciones.setTitle("Gestionar inscripciones");
		inscripciones.setLocationRelativeTo(null);
		inscripciones.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
