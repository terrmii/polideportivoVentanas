package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

import vista.Principal;
import vista.VistaUsuarios;

public class ControladorPrincipal implements ActionListener {

	Principal principal;
	
	public ControladorPrincipal(Principal principal2) {
		principal = principal2;
		principal.btnNewButtonUsuarios.addActionListener(this);
	}
	
	public void inicializar() {
		principal.setTitle("GestorPolideportivo");
		principal.setLocationRelativeTo(null);
		principal.setVisible(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == principal.btnNewButtonUsuarios) {
			try {
				VistaUsuarios dialog = new VistaUsuarios();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
