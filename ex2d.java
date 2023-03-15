import javax.swing.JOptionPane;

//Nesse exercício vamos utilizar operadores para resolver problemas da vida real. 
//Escreva a solução dos exercícios e mostre para o professor até o final da aula.

public class Exercicio2 {
	public static void main(String[] args) {
        // d)
	    // Crie um programa que mostre se um número é par ou ímpar
		
		String stringNum = JOptionPane.showInputDialog("Número");
		int num = Integer.valueOf(stringNum);
		
		if (num % 2 == 0) {
			// Par
			JOptionPane.showMessageDialog(null, "O numero " + num + " é par!");
		}
		
		else {
			// Impar
			JOptionPane.showMessageDialog(null, "O numero " + num + " é impar!");
		}
    }
}