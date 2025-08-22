package atividade;

import javax.swing.JOptionPane;
import java.lang.*;

public abstract class Calculos {
	
	public static String verificarOp(String n1, String n2,String op) {
		if(op.equals("+")) {
			return Somar(n1,n2);
		}
		else if(op.equals("-")) {
			return subtrair(n1,n2);
		}
		else if(op.equals("x")) {
			return multiplicacao(n1, n2);
		}
		else if(op.equals("/")) {
			return divisao(n1, n2);
		}
		else{
			return percentagem(n1, n2);
		}
	}
	
	public static String verificarOp(String n1, String op) {
		if(op.equals("r")) {
			return Raiz(n1);
		}
		else return potencia(n1);
	}

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
	
	public static String percentagem(String n1, String n2) {
		
		double num1 = Double.parseDouble(n1);
		double num2 = Double.parseDouble(n2);
		double resultado = num1*(num2/100);
		
		return resultado + "";
	}
	
	public static String Raiz(String n1) {
		double num1 = Double.parseDouble(n1);
		double resultado = Math.sqrt(num1);
		
		return resultado + "";
	}
	public static String potencia(String n1) {
		double num1 = Double.parseDouble(n1);
		double resultado = Math.pow(num1, 2);
		return resultado + "";
	}

}