package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VistaUsuarios;

public class ControladorUsuarios implements ActionListener{
	
	VistaUsuarios usuarios;

	public void inicializar() {
		usuarios.setTitle("Gestionar usuarios");
		usuarios.setLocationRelativeTo(null);
		usuarios.setVisible(false);
	}
	
	public ControladorUsuarios(VistaUsuarios usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
