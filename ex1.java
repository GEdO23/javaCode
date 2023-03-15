import javax.swing.*;

class Exercicio1 {

	public static void main (String args[]) {
		String userName = JOptionPane.showInputDialog(null, "Informe seu nome");
		String userAge = JOptionPane.showInputDialog(null, "Informe sua idade");
		String userEmail = JOptionPane.showInputDialog(null, "Informe seu email");
		
		JOptionPane.showMessageDialog(null, 
				"Seu nome é " + userName +
				", você tem " + userAge + 
				" anos e seu email é " + userEmail
				);
			
	}

}
