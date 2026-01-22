package controle;

import visao.JanelaTarefas;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		new JanelaTarefas();
		
		try {
		    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            javax.swing.UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
	}
	}
}