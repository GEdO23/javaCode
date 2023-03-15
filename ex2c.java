import javax.swing.JOptionPane;

//Nesse exercício vamos utilizar operadores para resolver problemas da vida real. 
//Escreva a solução dos exercícios e mostre para o professor até o final da aula.

public class Exercicio2 {
	public static void main(String[] args) {
        // c)
	    // Crie um programa que calcule o IMC de uma pessoa
	    
		
	    String stringPeso = JOptionPane.showInputDialog("Peso");
	    String stringAltura2 = JOptionPane.showInputDialog("Altura");
	    
	    float peso = Float.valueOf(stringPeso);
	    float altura2 = Float.valueOf(stringAltura2);
	    float imc = peso / (altura2 * 2);
	    
	    JOptionPane.showMessageDialog(null,
	    	 "Seu imc e " + imc +
	    	 " pois, seu peso e " + peso +
	    	 "kg e sua altura e " + altura2 +
	    	 "m!"
	    	 );
    
    }
}
