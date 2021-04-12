package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Ex {

	private JFrame frame;
	private JComboBox cb_Num1;
	private JComboBox cb_Calc;
	private JComboBox cb_Num2;
	private JTextField tf_Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ex window = new GUI_Ex();
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
	public GUI_Ex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getCb_Num1());
		frame.getContentPane().add(getCb_Calc());
		frame.getContentPane().add(getCb_Num2());
		frame.getContentPane().add(getTf_Result());
	}

	private JComboBox getCb_Num1() {
		if (cb_Num1 == null) {
			cb_Num1 = new JComboBox();
			cb_Num1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					selectCalc();
					
					
				}
			});
			cb_Num1.setModel(new DefaultComboBoxModel(new String[] {"2", "3", "4", "5", "6", "7", "8", "9"}));
			cb_Num1.setBounds(27, 50, 81, 27);
		}
		return cb_Num1;
	}
	private JComboBox getCb_Calc() {
		if (cb_Calc == null) {
			cb_Calc = new JComboBox();
			cb_Calc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {         //  Calc Section
					
					
					
					selectCalc();
					
					
					
					
				}
			});
			cb_Calc.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", "%"}));
			cb_Calc.setBounds(128, 50, 70, 27);
		}
		return cb_Calc;
	}
	private JComboBox getCb_Num2() {
		if (cb_Num2 == null) {
			cb_Num2 = new JComboBox();
			cb_Num2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					
					
				}
			});
			cb_Num2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9"}));
			cb_Num2.setBounds(212, 50, 81, 27);
		}
		return cb_Num2;
	}
	private JTextField getTf_Result() {
		if (tf_Result == null) {
			tf_Result = new JTextField();
			tf_Result.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					selectCalc();
					
				}
			});
			tf_Result.setBounds(316, 49, 94, 26);
			tf_Result.setColumns(10);
		}
		return tf_Result;
	}
	
	// Add -----------------------------------------------------------Method
	
//	private void addAction() {
//		int num1 = Integer.parseInt(cb_Num1.getSelectedItem().toString());
//		int num2 = Integer.parseInt(cb_Num2.getSelectedItem().toString());
//		int sum = num1 + num2;
//		
//		tf_Result.setText(Integer.toString(sum));
//	}
	// ----------------------------------------------------------------
	
	private void selectCalc() {
		int num1 = Integer.parseInt(cb_Num1.getSelectedItem().toString());
		int num2 = Integer.parseInt(cb_Num2.getSelectedItem().toString());
		
		
		int selCalc = cb_Calc.getSelectedIndex();
			switch (selCalc) {
					case 0 : 
						int resultAdd = num1 + num2;
						tf_Result.setText(Integer.toString(resultAdd));  break;
					case 1 :
						int resultSub = num1 - num2;
						tf_Result.setText(Integer.toString(resultSub));  break;
					case 2 :
						int resultMul = num1 * num2;
						tf_Result.setText(Integer.toString(resultMul));  break;
					case 3 : 
						try {
							double resultDiv = (double)num1 / num2;
//							tf_Result.setText(Integer.toString(resultDiv));  break;
							tf_Result.setText(String.format("%2.3f", resultDiv));  break;
							
						}catch (Exception e) {
							tf_Result.setText("Error");  break;
						}
			}// switch
		
		
	
//	String selectCalc = cb_Calc.getSelectedItem().toString();
//	
//	if(selectCalc == +) {
//		addAction();
//	}
	
	}	
	
}
