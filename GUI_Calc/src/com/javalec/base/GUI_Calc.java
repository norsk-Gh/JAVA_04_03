package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI_Calc {

	private JFrame frmMyCalc;
	private JTextField tf_Result;
	private JButton btn_Plus;
	private JButton btn_Minus;
	private JButton btn_Multi;
	private JButton btn_Divide;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_5;
	private JButton btn_0;
	private JButton btn_Result;
	private JButton btn_Clear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Calc window = new GUI_Calc();
					window.frmMyCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMyCalc = new JFrame();
		frmMyCalc.setTitle("My Calc");
		frmMyCalc.setBounds(100, 100, 450, 300);
		frmMyCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMyCalc.getContentPane().setLayout(null);
		frmMyCalc.getContentPane().add(getTf_Result());
		frmMyCalc.getContentPane().add(getBtn_Plus());
		frmMyCalc.getContentPane().add(getBtn_Minus());
		frmMyCalc.getContentPane().add(getBtn_Multi());
		frmMyCalc.getContentPane().add(getBtn_Divide());
		frmMyCalc.getContentPane().add(getBtn_6());
		frmMyCalc.getContentPane().add(getBtn_7());
		frmMyCalc.getContentPane().add(getBtn_1());
		frmMyCalc.getContentPane().add(getBtn_2());
		frmMyCalc.getContentPane().add(getBtn_3());
		frmMyCalc.getContentPane().add(getBtn_4());
		frmMyCalc.getContentPane().add(getBtn_8());
		frmMyCalc.getContentPane().add(getBtn_9());
		frmMyCalc.getContentPane().add(getBtn_5());
		frmMyCalc.getContentPane().add(getBtn_0());
		frmMyCalc.getContentPane().add(getBtn_Result());
		frmMyCalc.getContentPane().add(getBtn_Clear());
	}

	private JTextField getTf_Result() {
		if (tf_Result == null) {
			tf_Result = new JTextField();
			tf_Result.setEditable(false);
			tf_Result.setHorizontalAlignment(SwingConstants.TRAILING);
			tf_Result.setBounds(20, 19, 401, 45);
			tf_Result.setColumns(10);
		}
		return tf_Result;
	}
	private JButton getBtn_Plus() {
		if (btn_Plus == null) {
			btn_Plus = new JButton("+");
			btn_Plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {                // Plus Action
					
					
				}
			});
			btn_Plus.setBounds(20, 76, 53, 37);
		}
		return btn_Plus;
	}
	private JButton getBtn_Minus() {
		if (btn_Minus == null) {
			btn_Minus = new JButton("-");
			btn_Minus.setBounds(85, 76, 53, 37);
		}
		return btn_Minus;
	}
	private JButton getBtn_Multi() {
		if (btn_Multi == null) {
			btn_Multi = new JButton("X");
			btn_Multi.setBounds(150, 76, 53, 37);
		}
		return btn_Multi;
	}
	private JButton getBtn_Divide() {
		if (btn_Divide == null) {
			btn_Divide = new JButton("%");
			btn_Divide.setBounds(216, 76, 53, 37);
		}
		return btn_Divide;
	}
	private JButton getBtn_6() {
		if (btn_6 == null) {
			btn_6 = new JButton("6");
			btn_6.setBounds(20, 171, 53, 37);
		}
		return btn_6;
	}
	private JButton getBtn_7() {
		if (btn_7 == null) {
			btn_7 = new JButton("7");
			btn_7.setBounds(85, 171, 53, 37);
		}
		return btn_7;
	}
	private JButton getBtn_1() {
		if (btn_1 == null) {
			btn_1 = new JButton("1");
			btn_1.setBounds(20, 125, 53, 37);
		}
		return btn_1;
	}
	private JButton getBtn_2() {
		if (btn_2 == null) {
			btn_2 = new JButton("2");
			btn_2.setBounds(85, 125, 53, 37);
		}
		return btn_2;
	}
	private JButton getBtn_3() {
		if (btn_3 == null) {
			btn_3 = new JButton("3");
			btn_3.setBounds(150, 125, 53, 37);
		}
		return btn_3;
	}
	private JButton getBtn_4() {
		if (btn_4 == null) {
			btn_4 = new JButton("4");
			btn_4.setBounds(216, 125, 53, 37);
		}
		return btn_4;
	}
	private JButton getBtn_8() {
		if (btn_8 == null) {
			btn_8 = new JButton("8");
			btn_8.setBounds(150, 175, 53, 37);
		}
		return btn_8;
	}
	private JButton getBtn_9() {
		if (btn_9 == null) {
			btn_9 = new JButton("9");
			btn_9.setBounds(216, 175, 53, 37);
		}
		return btn_9;
	}
	private JButton getBtn_5() {
		if (btn_5 == null) {
			btn_5 = new JButton("5");
			btn_5.setBounds(281, 129, 53, 37);
		}
		return btn_5;
	}
	private JButton getBtn_0() {
		if (btn_0 == null) {
			btn_0 = new JButton("0");
			btn_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					calc();
				}
			});
			btn_0.setBounds(281, 175, 53, 37);
		}
		return btn_0;
	}
	private JButton getBtn_Result() {
		if (btn_Result == null) {
			btn_Result = new JButton("=");
			btn_Result.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {                // Result Action
					
					
					
					
					
					
				}
			});
			btn_Result.setBounds(281, 76, 53, 37);
		}
		return btn_Result;
	}
	private JButton getBtn_Clear() {
		if (btn_Clear == null) {
			btn_Clear = new JButton("C");
			btn_Clear.setBounds(327, 80, 117, 29);
		}
		return btn_Clear;
	}
	
	private void calc() {
		if (btn_0.getActionListeners()!=null) {
			int num0 = 0;
			tf_Result.setText(Integer.toString(num0));
		};
		
		
	}
	
		
			
		
		
		
		
		
		
		
	
		
	
	
	
	
//	private void numSet () {
//		Boolean num0 = btn_0.isSelected();
//		
//	}
	
	
	
	
	
	
	
}
