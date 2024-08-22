package Beginner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	
	// Set the frame and foundations
	JFrame frame;
	JTextField txtfield; 
	JButton[] numberButtons = new JButton[11];
	JButton[] fucntionButtons = new JButton[10];
	JButton addButton,subButton,multiButton,diviButton,moduleButton;
	JButton equButton,clrButton,delButton,decButton,negButton;
	JPanel Panel;
	
	// font sizes 
	Font numFont = new Font("Ink Free",Font.BOLD,25);
	
	// set the input variables
	double A=0,B=0,C=0;
	char operator;
	
	
	Calculator(){
	
	//design the frame
	frame = new JFrame("Calc");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400, 550);
	frame.setLayout(null);
	
	//design the text box
	txtfield = new JTextField();
	txtfield.setBounds(50, 20, 300, 40);
	txtfield.setFont(numFont);
	txtfield.setEditable(false);
	
	//implements the button
	addButton = new JButton("+");
	subButton = new JButton("-");
	multiButton = new JButton("*");
	diviButton = new JButton("/");
	moduleButton = new JButton("%");
	decButton = new JButton(".");
	equButton = new JButton("=");
	delButton = new JButton("del");	
	clrButton = new JButton("clr");
	negButton = new JButton("(-)");
	
	fucntionButtons[0] = addButton;
	fucntionButtons[1] = subButton;
	fucntionButtons[2] = multiButton;
	fucntionButtons[3] = diviButton;
	fucntionButtons[4] = clrButton;
	fucntionButtons[5] = decButton;
	fucntionButtons[6] = equButton;
	fucntionButtons[7] = delButton;
	fucntionButtons[8] = moduleButton;
	fucntionButtons[9] = negButton;
	
	for (int i=0;i<10;i++) {
		fucntionButtons[i].addActionListener(this);
		fucntionButtons[i].setFont(numFont);
		fucntionButtons[i].setFocusable(false);
	}
	
	
	for (int i=0; i<11;i++) {
		numberButtons[i] = new JButton(String.valueOf(i));
		numberButtons[i].addActionListener(this);
		numberButtons[i].setFont(numFont);
		numberButtons[i].setFocusable(false);
	}
	
	
	delButton.setBounds(50,380,150,50);
	clrButton.setBounds(210,380,150,50);
	
	Panel = new JPanel();
	Panel.setBounds(50,80,310,280);
	Panel.setLayout(new GridLayout(5,5,10,10));
	//Panel.setBackground(Color.LIGHT_GRAY);
	
	Panel.add(numberButtons[0]);
	Panel.add(numberButtons[1]);
	Panel.add(numberButtons[2]);
	Panel.add(numberButtons[3]);
	Panel.add(numberButtons[4]);
	Panel.add(numberButtons[5]);
	Panel.add(numberButtons[6]);
	Panel.add(numberButtons[7]);
	Panel.add(numberButtons[8]);
	Panel.add(numberButtons[9]);
	Panel.add(addButton);
	Panel.add(subButton);
	Panel.add(multiButton);
	Panel.add(diviButton);
	Panel.add(moduleButton);
	Panel.add(decButton);
	Panel.add(equButton);
	Panel.add(negButton);
	
	
	
	frame.add(Panel);
	frame.add(delButton); 
	frame.add(clrButton);
	frame.add(txtfield);
	frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i <11; i++) {
			if (e.getSource() == numberButtons[i]) {
				txtfield.setText(txtfield.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == decButton) {
			txtfield.setText(txtfield.getText().concat(".")); 
			}
	
		if(e.getSource() == addButton) {
			A = Double.parseDouble(txtfield.getText());
			operator = '+';
			txtfield.setText("");
		}
		if(e.getSource() == subButton) {
			A = Double.parseDouble(txtfield.getText());
			operator = '-';
			txtfield.setText(""); }
		
		if(e.getSource() == multiButton) {
			A = Double.parseDouble(txtfield.getText());
			operator = '*';
			txtfield.setText(""); }
		
		if(e.getSource() == diviButton) {
			A = Double.parseDouble(txtfield.getText());
			operator = '/';
			txtfield.setText(""); }
	
		if(e.getSource() == moduleButton) {
			A = Double.parseDouble(txtfield.getText());
			operator = '%';
			txtfield.setText(""); }
		
		if(e.getSource() == negButton) {
			double temp = Double.parseDouble(txtfield.getText());
			temp*=-1;
			txtfield.setText(String.valueOf(temp)); }
		
		if(e.getSource() == equButton) {
			B = Double.parseDouble(txtfield.getText());
			
			switch (operator) {
			case'+':
				C = A + B;
				break;
			case'-':
				C = A - B;
				break;
			case'*':
				C = A * B;
				break;
			case'/':
				C = A / B;
				break;
			case'%':
				C = A % B;
				break;
			}
			txtfield.setText(String.valueOf(C));
			//A=C;
			
		}
		if(e.getSource() == clrButton) {
			txtfield.setText(null); 
			int A = 0;
		}
		if(e.getSource() == delButton) {
			String string = txtfield.getText();
			txtfield.setText("");
			for (int i =0;i<string.length()-1;i++) {
				txtfield.setText(txtfield.getText()+string.charAt(i));
			}
		}
	}
		
	}

	


