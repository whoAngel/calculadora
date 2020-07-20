package calculadora;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CalculadoraStandar extends JFrame implements ActionListener{
	
	JPanel base = (JPanel)this.getContentPane();
	
	JTextField pantalla = new JTextField();
	
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	JButton b4 = new JButton("4");
	JButton b5 = new JButton("5");
	JButton b6 = new JButton("6");
	JButton b7 = new JButton("7");
	JButton b8 = new JButton("8");
	JButton b9 = new JButton("9");
	JButton b0 = new JButton("0");
	JButton bSuma = new JButton("+");
	JButton bResta = new JButton("-");
	JButton bMult = new JButton("*");
	JButton bDiv = new JButton("/");
	JButton bPunto = new JButton(".");
	JButton bIgual = new JButton("=");
	JButton bLimpiar = new JButton("C");
	
	public CalculadoraStandar() {
		base.setLayout(null);
		setSize(350, 470);
		setTitle("Calculadora Estándar");
		setVisible(true);
		
		//properties 
		pantalla.setBounds(20, 10, 296, 80);
		pantalla.setFont(new Font("static", Font.BOLD, 35));
		base.add(pantalla);
		
		//buttons
		b7.setBounds(20, 95, 60, 60);
		b7.setFont(new Font("static", Font.BOLD, 25));
		base.add(b7);
		b7.addActionListener(this);
		
		b8.setBounds(85, 95, 60, 60);
		b8.setFont(new Font("static", Font.BOLD, 25));
		base.add(b8);
		b8.addActionListener(this);
		
		b9.setBounds(150, 95, 60, 60);
		b9.setFont(new Font("static", Font.BOLD, 25));
		base.add(b9);
		b9.addActionListener(this);
		
		bLimpiar.setBounds(215, 95, 100, 60);
		bLimpiar.setFont(new Font("static", Font.BOLD, 25));
		base.add(bLimpiar);
		bLimpiar.addActionListener(this);
//********************************************************************************
		b4.setBounds(20, 160, 60, 60);
		b4.setFont(new Font("static", Font.BOLD, 25));
		base.add(b4);
		b4.addActionListener(this);
		
		b5.setBounds(85, 160, 60, 60);
		b5.setFont(new Font("static", Font.BOLD, 25));
		base.add(b5);
		b5.addActionListener(this);
		
		b6.setBounds(150, 160, 60, 60);
		b6.setFont(new Font("static", Font.BOLD, 25));
		base.add(b6);
		b6.addActionListener(this);
		
		bSuma.setBounds(215, 160, 100, 60);
		bSuma.setFont(new Font("static", Font.BOLD, 30));
		base.add(bSuma);
		bSuma.addActionListener(this);
//********************************************************************************		
		b1.setBounds(20, 225, 60, 60);
		b1.setFont(new Font("static", Font.BOLD, 25));
		base.add(b1);
		b1.addActionListener(this);
		
		b2.setBounds(85, 225, 60, 60);
		b2.setFont(new Font("static", Font.BOLD, 25));
		base.add(b2);
		b2.addActionListener(this);
		
		b3.setBounds(150, 225, 60, 60);
		b3.setFont(new Font("static", Font.BOLD, 25));
		base.add(b3);
		b3.addActionListener(this);
		
		bResta.setBounds(215, 225, 100, 60);
		bResta.setFont(new Font("static", Font.BOLD, 30));
		base.add(bResta);
		bResta.addActionListener(this);
//*******************************************************************************
		b0.setBounds(20, 290, 125, 60);
		b0.setFont(new Font("static", Font.BOLD, 25));
		base.add(b0);
		b0.addActionListener(this);
		
		bPunto.setBounds(150, 290, 60, 60);
		bPunto.setFont(new Font("static", Font.BOLD, 25));
		base.add(bPunto);
		bPunto.addActionListener(this);
		
		bMult.setBounds(215, 290, 100, 60);
		bMult.setFont(new Font("static", Font.BOLD, 30));
		base.add(bMult);
		bMult.addActionListener(this);
//*******************************************************************************	
		bIgual.setBounds(20, 355, 190, 60);
		bIgual.setFont(new Font("static", Font.BOLD, 25));
		base.add(bIgual);
		bIgual.addActionListener(this);
		
		bDiv.setBounds(215, 355, 100, 60);
		bDiv.setFont(new Font("static", Font.BOLD, 30));
		base.add(bDiv);
		bDiv.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==b7) {
			if (pantalla.getText() == "") {
				pantalla.setText("7");
			} else {
				pantalla.setText(pantalla.getText() + "7");
			}
		}
		
		if (e.getSource()==b8) {
			if (pantalla.getText() == "") {
				pantalla.setText("8");
			} else {
				pantalla.setText(pantalla.getText() + "8");
			}
		}
		
		if (e.getSource()==b9) {
			if (pantalla.getText() == "") {
				pantalla.setText("9");
			} else {
				pantalla.setText(pantalla.getText() + "9");
			}
		}
		
		if (e.getSource()==b4) {
			if (pantalla.getText() == "") {
				pantalla.setText("4");
			} else {
				pantalla.setText(pantalla.getText() + "4");
			}
		}
		
		if (e.getSource()==b5) {
			if (pantalla.getText() == "") {
				pantalla.setText("5");
			} else {
				pantalla.setText(pantalla.getText() + "5");
			}
		}
		
		if (e.getSource()==b6) {
			if (pantalla.getText() == "") {
				pantalla.setText("6");
			} else {
				pantalla.setText(pantalla.getText() + "6");
			}
		}
		
		if (e.getSource()==b3) {
			if (pantalla.getText() == "") {
				pantalla.setText("3");
			} else {
				pantalla.setText(pantalla.getText() + "3");
			}
		}
		
		if (e.getSource()==b2) {
			if (pantalla.getText() == "") {
				pantalla.setText("2");
			} else {
				pantalla.setText(pantalla.getText() + "2");
			}
		}
		
		if (e.getSource()==b1) {
			if (pantalla.getText() == "") {
				pantalla.setText("1");
			} else {
				pantalla.setText(pantalla.getText() + "1");
			}
		}
		
		if (e.getSource()==b0) {
			if (pantalla.getText() == "") {
				pantalla.setText("0");
			} else {
				pantalla.setText(pantalla.getText() + "0");
			}
		}
		
		if(e.getSource()==bPunto) {
			if (pantalla.getText() == "") {
				pantalla.setText(".");
			} else {	
				pantalla.setText(pantalla.getText() +".");
			}
		}
		
		if (e.getSource() == bSuma) {
			if (pantalla.getText() == "") {
				pantalla.setText("+");
			} else {
				pantalla.setText(pantalla.getText() +"+");
			}
		}
		
		if (e.getSource() == bResta) {
			if (pantalla.getText() == "") {
				pantalla.setText("-");
			} else {
				pantalla.setText(pantalla.getText()+ "-");
			}
		}
		
		if (e.getSource() == bMult) {
			if (pantalla.getText() == "") {
				pantalla.setText("*");
			} else {
				pantalla.setText(pantalla.getText()+ "*");
			}
		}
		
		if (e.getSource() == bDiv) {
			if (pantalla.getText() == "") {
				pantalla.setText("/");
			} else {
				pantalla.setText(pantalla.getText()+ "/");
			}
		}
		
		if(e.getSource() == bLimpiar) {
			pantalla.setText("");
		}
		
		if (e.getSource() == bIgual) {
			String cad = pantalla.getText();
			for(int i=0 ; i<cad.length() ; i++) {
				char mander = cad.charAt(i);
				
				String parte1 = cad.substring(0, i);
				String parte2 = cad.substring(i+1, cad.length());
				
				if (mander == '+') {
					double resultado = Double.parseDouble(parte1) + Double.parseDouble(parte2);
					pantalla.setText(Double.toString(resultado));
				}
				if (mander == '-') {
					double resultado = Double.parseDouble(parte1) - Double.parseDouble(parte2);
					pantalla.setText(Double.toString(resultado));
				}
				if (mander == '*') {
					double resultado = Double.parseDouble(parte1) * Double.parseDouble(parte2);
					pantalla.setText(Double.toString(resultado));
				}
				if (mander == '/') {
					double cero = Double.parseDouble(parte2);
						if (cero == 0) {
							JOptionPane.showMessageDialog(pantalla, "No se puede dividir entre 0", "Error", JOptionPane.ERROR_MESSAGE);
						}
					double resultado = Double.parseDouble(parte1) / Double.parseDouble(parte2);
					pantalla.setText(Double.toString(resultado));
				}
			}
		}
	}//	end method
}//	end class
