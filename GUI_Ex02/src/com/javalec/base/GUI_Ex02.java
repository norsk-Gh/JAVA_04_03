package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI_Ex02 {

	private JFrame frmGuiExercise;
	private JTextField tf_Num1;
	private JTextField tf_Num2;
	private JLabel lbl_Result;
	private JLabel UnderBar;
	private JRadioButton rdbtn_Add;
	private JRadioButton rdbtn_Subtraction;
	private JRadioButton rdbtn_Multi;
	private JRadioButton rdbtn_Div;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ex02 window = new GUI_Ex02();
					window.frmGuiExercise.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_Ex02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGuiExercise = new JFrame();
		frmGuiExercise.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
		frmGuiExercise.setTitle("GUI Exercise 02");
		frmGuiExercise.setBounds(100, 100, 450, 300);
		frmGuiExercise.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGuiExercise.getContentPane().setLayout(null);
		frmGuiExercise.getContentPane().add(getTf_Num1());
		frmGuiExercise.getContentPane().add(getTf_Num2());
		frmGuiExercise.getContentPane().add(getLbl_Result());
		frmGuiExercise.getContentPane().add(getUnderBar());
		frmGuiExercise.getContentPane().add(getRdbtn_Add());
		frmGuiExercise.getContentPane().add(getRdbtn_Subtraction());
		frmGuiExercise.getContentPane().add(getRdbtn_Multi());
		frmGuiExercise.getContentPane().add(getRdbtn_Div());
	}
	private JTextField getTf_Num1() {
		if (tf_Num1 == null) {
			tf_Num1 = new JTextField();
			tf_Num1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
//					rdbtn_Add.isSelected();
					
				}
			});
			tf_Num1.setBounds(45, 38, 130, 26);
			tf_Num1.setColumns(10);
		}
		return tf_Num1;
	}
	private JTextField getTf_Num2() {
		if (tf_Num2 == null) {
			tf_Num2 = new JTextField();
			tf_Num2.setColumns(10);
			tf_Num2.setBounds(45, 94, 130, 26);
		}
		return tf_Num2;
	}
	private JLabel getLbl_Result() {
		if (lbl_Result == null) {
			lbl_Result = new JLabel("");
			lbl_Result.setHorizontalAlignment(SwingConstants.CENTER);
			lbl_Result.setBounds(45, 193, 287, 16);
		}
		return lbl_Result;
	}
	private JLabel getUnderBar() {
		if (UnderBar == null) {
			UnderBar = new JLabel("_____________________________");
			UnderBar.setBounds(45, 204, 287, 16);
		}
		return UnderBar;
	}
	private JRadioButton getRdbtn_Add() {
		if (rdbtn_Add == null) {
			rdbtn_Add = new JRadioButton("Add");
			rdbtn_Add.setSelected(true);
			rdbtn_Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					CalcAction();
					
					
				}
			});
			buttonGroup.add(rdbtn_Add);
			rdbtn_Add.setBounds(230, 39, 141, 23);
		}
		return rdbtn_Add;
	}
	private JRadioButton getRdbtn_Subtraction() {
		if (rdbtn_Subtraction == null) {
			rdbtn_Subtraction = new JRadioButton("Subtract");
			rdbtn_Subtraction.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				CalcAction();
				}
			});
			buttonGroup.add(rdbtn_Subtraction);
			rdbtn_Subtraction.setBounds(230, 61, 141, 23);
		}
		return rdbtn_Subtraction;
	}
	private JRadioButton getRdbtn_Multi() {
		if (rdbtn_Multi == null) {
			rdbtn_Multi = new JRadioButton("Multiple");
			rdbtn_Multi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				CalcAction();
				}
				
			});
			buttonGroup.add(rdbtn_Multi);
			rdbtn_Multi.setBounds(230, 84, 141, 23);
		}
		return rdbtn_Multi;
	}
	private JRadioButton getRdbtn_Div() {
		if (rdbtn_Div == null) {
			rdbtn_Div = new JRadioButton("Divide");
			rdbtn_Div.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CalcAction();
				}
			});
			buttonGroup.add(rdbtn_Div);
			rdbtn_Div.setBounds(230, 106, 141, 23);
		}
		return rdbtn_Div;
	}


	
	public void addChecked() {
		
		
	}
	
	
	public void CalcAction() {
		rdbtn_Add.isSelected();
//		String [] array = {"rdbtn_Add", "rdbtn_Subtraction");
		ArrayList arrayList = new ArrayList();
		arrayList.add(rdbtn_Add.isSelected());
		arrayList.add(rdbtn_Subtraction.isSelected());
		arrayList.add(rdbtn_Multi.isSelected());
		arrayList.add(rdbtn_Div.isSelected());
		
//			
		
		// TextField
		int num1 =  Integer.parseInt(tf_Num1.getText().toString());
		int num2 =  Integer.parseInt(tf_Num2.getText().toString());
		int sumNum = num1 + num2;
		int subNum = num1 - num2;
		int mulNum = num1*num2;
		int divNum = num1/num2;
		
		Integer.toString(num1);
		Integer.toString(num2);
		Integer.toString(sumNum);
		
		for ( int i = 0; i<arrayList.size(); i++) {
			if (arrayList.get(i) != null) {
				lbl_Result.setText(num1 + " + " + num2 + " = " + sumNum);
			}
		
		}
		
		// Radio Action
//		arrayList.get(0) ? lbl_Result.setText(num1 + " + " + num2 + " = " + sumNum) : " ";
		
//		else if(rdbtn_Subtraction.isSelected()) {
//			lbl_Result.setText(num1 + " - " + num2 + " = " + subNum);
//		}
//		else if(rdbtn_Multi.isSelected()) {
//			lbl_Result.setText(num1 + " x " + num2 + " = " + mulNum);
//		}
//		else if(rdbtn_Div.isSelected()) {
//			lbl_Result.setText(num1 + " / " + num2 + " = " + divNum);
//		}
		
		
		
		// Display the Result
		
		
		
		
		
		
	}
}
