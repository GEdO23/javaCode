import javax.swing.JOptionPane;

//Nesse exercício vamos utilizar operadores para resolver problemas da vida real. 
//Escreva a solução dos exercícios e mostre para o professor até o final da aula.

public class Exercicio2 {
	public static void main(String[] args) {
	    // a)
	    // Crie um programa que calcule a média de dois números inteiros
		
		
		String stringNum1 = JOptionPane.showInputDialog("Primeiro numero");
		String stringNum2 = JOptionPane.showInputDialog("Segundo numero");
		 
		float num1 = Float.valueOf(stringNum1);
		float num2 = Float.valueOf(stringNum2);
		float media = (num1 + num2) / 2;
	     
	    JOptionPane.showMessageDialog(null, 
	    		 		"A media entre o numero " + num1 + 
	    		 		" e o numero " + num2 + 
	    		 		" = " + media
	    		 		);
	}
}
                        