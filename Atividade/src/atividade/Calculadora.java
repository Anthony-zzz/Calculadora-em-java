package atividade;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textField;
	private JButton Button_raiz;
	private JButton Button_percen;
	private JButton btnX_1;
	private JButton Button_7;
	private JButton Button_4;
	private JButton Button_1;
	private JButton Button_0;
	private JButton Button_8;
	private JButton Button_5;
	private JButton Button_2;
	private JButton Button_histor;
	private JButton Button_9;
	private JButton Button_6;
	private JButton Button_3;
	private JButton Button_igual;
	private JButton Button_div;
	private JButton btnX;
	private JButton Button_menos;
	private JButton Button_mais;
	private String op;
	private String n1;
	private String n2;
	private String me= "";
	private JLabel label_memoria;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 310, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Button_8 = new JButton("8");
		Button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		
		JLabel telinha = new JLabel("");
		telinha.setBounds(10, 11, 60, 19);
		frame.getContentPane().add(telinha);
		Button_8.setBounds(80, 183, 60, 50);
		frame.getContentPane().add(Button_8);
		
		Button_2 = new JButton("2");
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		Button_2.setBounds(80, 302, 60, 50);
		frame.getContentPane().add(Button_2);
		
		JButton Button_c = new JButton("C");
		Button_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				telinha.setText("");
			}
		});
		Button_c.setBounds(10, 122, 60, 50);
		frame.getContentPane().add(Button_c);
		
		Button_0 = new JButton("0");
		Button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		Button_0.setBounds(10, 363, 60, 50);
		frame.getContentPane().add(Button_0);
		
		Button_mais = new JButton("+");
		Button_mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "+";
				n1 = textField.getText();
				telinha.setText(textField.getText() + Button_mais.getText());
				textField.setText("");
			}
		});
		Button_mais.setBounds(220, 363, 60, 50);
		frame.getContentPane().add(Button_mais);
		
		Button_9 = new JButton("9");
		Button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		Button_9.setBounds(150, 183, 60, 50);
		frame.getContentPane().add(Button_9);
		
		Button_percen = new JButton("%");
		Button_percen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "%";
				n1 = textField.getText();
				telinha.setText(textField.getText() + Button_percen.getText());
				textField.setText("");
			}
		});
		Button_percen.setBounds(150, 122, 60, 50);
		frame.getContentPane().add(Button_percen);
		
		Button_6 = new JButton("6");
		Button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		Button_6.setBounds(150, 241, 60, 50);
		frame.getContentPane().add(Button_6);
		
		Button_raiz = new JButton("√");
		Button_raiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "r";
				n1 = textField.getText();
				textField.setText(Calculos.verificarOp(n1, op));
			}
		});
		Button_raiz.setBounds(80, 122, 60, 50);
		frame.getContentPane().add(Button_raiz);
		
		Button_4 = new JButton("4");
		Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		Button_4.setBounds(10, 241, 60, 50);
		frame.getContentPane().add(Button_4);
		
		Button_histor = new JButton("ME");
		Button_histor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label_memoria.setVisible(true);
				textField.setBounds(10, 28, 270, 40);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label_memoria.setVisible(false);
				textField.setBounds(10, 29, 270, 82);
			}
		});
		Button_histor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(me.equals("")) {
					me = textField.getText();
					label_memoria.setText(me);
				}else {
					textField.setText(me);
					me = "";
					label_memoria.setText("");
				}
			}
		});
		Button_histor.setBounds(80, 363, 60, 50);
		frame.getContentPane().add(Button_histor);
		
		Button_5 = new JButton("5");
		Button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		Button_5.setBounds(80, 241, 60, 50);
		frame.getContentPane().add(Button_5);
		
		Button_7 = new JButton("7");
		Button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		Button_7.setBounds(10, 180, 60, 50);
		frame.getContentPane().add(Button_7);
		
		Button_div = new JButton("/");
		Button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "/";
				n1 = textField.getText();
				telinha.setText(textField.getText() + Button_div.getText());
				textField.setText("");
				
			}
		});
		Button_div.setBounds(220, 183, 60, 50);
		frame.getContentPane().add(Button_div);
		
		Button_1 = new JButton("1");
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		Button_1.setBounds(10, 302, 60, 50);
		frame.getContentPane().add(Button_1);
		
		btnX_1 = new JButton("x²");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "p";
				n1 = textField.getText();
				textField.setText(Calculos.verificarOp(n1, op));
			}
		});
		btnX_1.setBounds(220, 122, 60, 50);
		frame.getContentPane().add(btnX_1);
		
		Button_menos = new JButton("-");
		Button_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "-";
				n1 = textField.getText();
				telinha.setText(textField.getText() + Button_menos.getText());
				textField.setText("");
				
			}
		});
		Button_menos.setBounds(220, 302, 60, 50);
		frame.getContentPane().add(Button_menos);
		
		btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op = "x";
				n1 = textField.getText();
				telinha.setText(textField.getText() + btnX.getText());
				textField.setText("");
			}
		});
		btnX.setBounds(220, 241, 60, 50);
		frame.getContentPane().add(btnX);
		
		Button_igual = new JButton("=");
		Button_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2 = textField.getText();
				telinha.setText(telinha.getText() + n2 + Button_igual.getText());
				textField.setText(Calculos.verificarOp(n1, n2, op)); 
			}
		});
		Button_igual.setBounds(150, 363, 60, 50);
		frame.getContentPane().add(Button_igual);
		
		Button_3 = new JButton("3");
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		Button_3.setBounds(150, 302, 60, 50);
		frame.getContentPane().add(Button_3);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		textField.setBounds(10, 29, 270, 82);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		label_memoria = new JLabel("");
		label_memoria.setHorizontalAlignment(SwingConstants.CENTER);
		label_memoria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_memoria.setVisible(false);
		label_memoria.setBounds(69, 62, 160, 50);
		frame.getContentPane().add(label_memoria);
		
	}
}
