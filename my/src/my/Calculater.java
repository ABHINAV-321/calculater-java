package my;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
/*import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
*/

public class Calculater implements ActionListener {
	
	final Random rndm=new Random();
	
	
	boolean isOperaterClicked=false;
	
	
	 //JFrame jf;
	
	String oldValue, newValue, operater;
	float result;
	String resultString;

	JFrame jf=new JFrame("Calulater");
	JButton sevenButton ,oneButton,zeroButton,equalButton, sixButton, eightButton,fiveButton,dotButton,clearButton,plusButton,nineButton,fourButton,threeButton,twoButton,divButton,multiButton,minuseButton;
	JLabel DisplayLabel , DisplayLabel2;
	Calculater(){
		jf.setLayout(null);
		jf.setSize(700, 750);
		jf.setLocation(100,50);
		jf.setVisible(true);
		Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
		jf.getContentPane().setBackground(colorrndm);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
//label diplaying function
		
		

		DisplayLabel2=new JLabel("");
		DisplayLabel2.setBounds(50, 25, 500, 50);
		DisplayLabel2.setBackground(Color.gray);
		DisplayLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel2.setForeground(Color.white);
		DisplayLabel2.setOpaque(true);
		jf.add(DisplayLabel2);
		
		
		
	    DisplayLabel=new JLabel("");
		DisplayLabel.setBounds(50, 55, 500, 50);
		DisplayLabel.setBackground(Color.gray);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		DisplayLabel.setForeground(Color.white);
		DisplayLabel.setOpaque(true);
		jf.add(DisplayLabel);
		
		
		
		
		
		
		// buttons starts here 
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 100, 100);
		//sevenButton.getRootPane().setBackground(Color.orange);
		sevenButton.setBackground(Color.ORANGE);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(150, 130, 100, 100);
		eightButton.setBackground(Color.ORANGE);
		eightButton.addActionListener(this);
		jf.add(eightButton);

		
		nineButton=new JButton("9");
		nineButton.setBounds(280, 130, 100, 100);
		nineButton.setBackground(Color.ORANGE);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		

		divButton=new JButton("/");
		divButton.setBounds(410, 130, 100, 100);
		divButton.setBackground(Color.ORANGE);
		divButton.addActionListener(this);
		jf.add(divButton);

		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 260, 100, 100);
		fourButton.setBackground(Color.ORANGE);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(150, 260, 100, 100);
		fiveButton.setBackground(Color.ORANGE);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);

		
		sixButton=new JButton("6");
		sixButton.setBounds(280, 260, 100, 100);
		sixButton.setBackground(Color.ORANGE);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		multiButton=new JButton("x");
		multiButton.setBounds(410, 260, 100, 100);
		multiButton.setBackground(Color.ORANGE);
		multiButton.addActionListener(this);
		jf.add(multiButton);

        
		minuseButton=new JButton("-");
		minuseButton.setBounds(410, 390, 100, 100);
		minuseButton.setBackground(Color.ORANGE);
		minuseButton.addActionListener(this);
		jf.add(minuseButton);

		
		threeButton=new JButton("3");
		threeButton.setBounds(280, 390, 100, 100);
		threeButton.setBackground(Color.ORANGE);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		twoButton=new JButton("2");
		twoButton.setBounds(150, 390, 100, 100);
		twoButton.setBackground(Color.ORANGE);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 390, 100, 100);
		oneButton.setBackground(Color.ORANGE);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		
		zeroButton=new JButton("0");
	    zeroButton.setBounds(150, 520, 100, 100);
	    zeroButton.setBackground(Color.ORANGE);
	    zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 520, 100, 100);
		dotButton.setBackground(Color.ORANGE);
		dotButton.addActionListener(this);
		jf.add(dotButton);

		
		equalButton=new JButton("=");
		equalButton.setBounds(280, 520, 100, 100);
		equalButton.setBackground(Color.ORANGE);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		plusButton=new JButton("+");
		plusButton.setBounds(410, 520, 100, 100);
		plusButton.setBackground(Color.ORANGE);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("clear");
		clearButton.setBounds(540, 520, 100, 100);
		clearButton.setBackground(Color.ORANGE);
		clearButton.addActionListener(this);
		jf.add(clearButton);

    
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	//	DisplayLabel.setText("7");
		if (e.getSource()== sevenButton) {
			
			//if(isOperaterClicked) {
				//DisplayLabel.setText(DisplayLabel.getText()+"  "+"7");
				//isOperaterClicked=false;
		//	}else {
				Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorrndm);
			DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
		else if (e.getSource()==eightButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorrndm);
			DisplayLabel.setText(DisplayLabel.getText()+"8");
		}
		else if(e.getSource()==nineButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"9");
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==sixButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"6");
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==fiveButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"5");
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==fourButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"4");
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==threeButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"3");
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==twoButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"2");
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==oneButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+"1");
			jf.getContentPane().setBackground(colorrndm);
		}
		
		else if (e.getSource()==dotButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			DisplayLabel.setText(DisplayLabel.getText()+".");
			isOperaterClicked=false;
			jf.getContentPane().setBackground(colorrndm);
		}
		else if (e.getSource()==divButton) {
		
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorrndm);
			oldValue=DisplayLabel.getText();
			isOperaterClicked=true;
            operater=("/");
        	DisplayLabel2.setText(DisplayLabel.getText()+"/");
			DisplayLabel.setText("");
		}
		
		else if (e.getSource()==multiButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorrndm);
			oldValue=DisplayLabel.getText();
			isOperaterClicked=true;
			operater=("x");
			DisplayLabel2.setText(DisplayLabel.getText()+" x ");
			
			DisplayLabel.setText("");
		} 
		
		
		
		else if (e.getSource()==plusButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorrndm);
			oldValue=DisplayLabel.getText();
			DisplayLabel2.setText(DisplayLabel.getText()+"+");
			DisplayLabel.setText("");
			isOperaterClicked=true;
		    operater=("+");
			
		}
		else if (e.getSource()==minuseButton) {
			Color colorrndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorrndm);
		    oldValue= DisplayLabel.getText();
			isOperaterClicked=true;
			operater=("-");
			DisplayLabel2.setText(DisplayLabel.getText()+" - ");
			DisplayLabel.setText("");
		}
		
		
		
		
		else if (e.getSource()==equalButton) {
	    
			newValue= DisplayLabel.getText();
			DisplayLabel2.setText(DisplayLabel2.getText()+newValue);
			System.out.println(newValue);
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);

			if ( operater=="+") {
				result=oldValueF+newValueF;
				resultString=String.valueOf(result);
				DisplayLabel.setText(resultString);
				
				
			}else if (operater=="-") {
				Color colorRndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
				jf.getContentPane().setBackground(colorRndm);
			
				result=oldValueF-newValueF;
				resultString=String.valueOf(result);
				DisplayLabel.setText(resultString);
				
			}else if (operater=="x") {
				Color colorRndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
				jf.getContentPane().setBackground(colorRndm);
				result=oldValueF*newValueF;
				resultString=String.valueOf(result);
				DisplayLabel.setText(resultString);
				
				
			}else if (operater=="/") {
				Color colorRndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
				jf.getContentPane().setBackground(colorRndm);
				result=oldValueF/newValueF;
				resultString=String.valueOf(result);
				DisplayLabel.setText(resultString);
				
			}
			/*if(isOperaterClicked) {
				DisplayLabel.setText(DisplayLabel.getText()+"  "+"=");
				isOperaterClicked=false;
			}else {}*/
			
		/*	DisplayLabel.setText(DisplayLabel.getText()+"=");
			
			
			isOperaterClicked=true;
			DisplayLabel.setText(DisplayLabel.getText()+" = ");
		*/}
		
		else if (e.getSource()==clearButton) {
			Color colorRndm=new Color(rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256),rndm.nextInt(256));
			jf.getContentPane().setBackground(colorRndm);
			DisplayLabel.setText("");
			DisplayLabel2.setText("");
			isOperaterClicked=false;
		}
		
	}
}


