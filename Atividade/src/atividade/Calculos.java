package atividade;

import javax.swing.JOptionPane;
import java.lang.*;

public abstract class Calculos {

	public static String Somar(String n1, String n2) {
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double resultado = num1 + num2;
		
		return resultado + "";
	}
	
	public static String subtrair(String n1, String n2) {
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double resultado = num1 - num2;
		
		return resultado + "";
	}
	
	public static String multiplicacao(String n1, String n2) {
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double resultado = num1 * num2;
		
		return resultado + "";
	}
	
	public static String divisao(String n1, String n2) {
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double resultado = num1 / num2;
		
		if(num2 == 0 ) {
			JOptionPane.showMessageDialog(null, "Erro!, divisão por 0 é invalida");
		}
		
		return resultado + "";
		
	}
	
	public static String percentagem(String n1) {
		
		double num1 = Double.parseDouble(n1);
		double resultado = num1/100;
		
		return resultado + "";
	}
	
	public static String Raiz(String n1) {
		double num1 = Double.parseDouble(n1);
		double resultado = Math.sqrt(num1);
		
		return resultado + "";
	}
}
