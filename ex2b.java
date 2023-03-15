import javax.swing.JOptionPane;

//Nesse exercício vamos utilizar operadores para resolver problemas da vida real. 
//Escreva a solução dos exercícios e mostre para o professor até o final da aula.

public class Exercicio2 {
	public static void main(String[] args) {
        // b)
	    // Crie um programa que calcule a área de um triângulo isósceles
	     
		
	    String stringBase = JOptionPane.showInputDialog("Base do triangulo");
		String stringAltura = JOptionPane.showInputDialog("Altura do triangulo");
		 
		int base = Integer.valueOf(stringBase);
		int altura = Integer.valueOf(stringAltura);
	    int area;
	
	    area = (base*altura)/2;
	     
	    JOptionPane.showMessageDialog(null, 
	    	 "A area do triangulo isosceles, cuja base e " + base + 
	    	 " e altura e " + altura + 
	    	 " e igual a " + area
	    	 );
    }
}
