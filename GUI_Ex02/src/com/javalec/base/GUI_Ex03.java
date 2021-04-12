package com.javalec.base;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JCheckBox;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Ex03 {

	private JFrame frame;
	private JLabel lbl_Result;
	private JTextField tf_Num1;
	private JTextField tf_Num2;
	private JCheckBox check_Add;
	private JCheckBox check_Sub;
	private JCheckBox check_Mul;
	private JCheckBox check_Div;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Ex03 window = new GUI_Ex03();
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
	public GUI_Ex03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLbl_Result());
		frame.getContentPane().add(getTf_Num1());
		frame.getContentPane().add(getTf_Num2());
		frame.getContentPane().add(getCheck_Add());
		frame.getContentPane().add(getCheck_Sub());
		frame.getContentPane().add(getCheck_Mul());
		frame.getContentPane().add(getCheck_Div());
	}

	private JLabel getLbl_Result() {
		if (lbl_Result == null) {
			lbl_Result = new JLabel("");
			lbl_Result.setBounds(77, 164, 173, 102);
		}
		return lbl_Result;
	}
	private JTextField getTf_Num1() {
		if (tf_Num1 == null) {
			tf_Num1 = new JTextField();
			tf_Num1.setBounds(42, 48, 130, 26);
			tf_Num1.setColumns(10);
		}
		return tf_Num1;
	}
	private JTextField getTf_Num2() {
		if (tf_Num2 == null) {
			tf_Num2 = new JTextField();
			tf_Num2.setColumns(10);
			tf_Num2.setBounds(42, 100, 130, 26);
		}
		return tf_Num2;
	}
	private JCheckBox getCheck_Add() {
		if (check_Add == null) {
			check_Add = new JCheckBox("Add");
			check_Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				uncheck();	
				calc();
				}
				
			});
			check_Add.setBounds(232, 27, 128, 23);
		}
		return check_Add;
	}
	private JCheckBox getCheck_Sub() {
		if (check_Sub == null) {
			check_Sub = new JCheckBox("Subtract");
			check_Sub.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					uncheck();
					calc();
				}
			});
			check_Sub.setBounds(232, 49, 128, 23);
		}
		return check_Sub;
	}
	private JCheckBox getCheck_Mul() {
		if (check_Mul == null) {
			check_Mul = new JCheckBox("Multiple");
			check_Mul.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					uncheck();
					calc();
				}
			});
			check_Mul.setBounds(232, 74, 128, 23);
		}
		return check_Mul;
	}
	private JCheckBox getCheck_Div() {
		if (check_Div == null) {
			check_Div = new JCheckBox("Divide");
			check_Div.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					uncheck();
					calc();
				}
			});
			check_Div.setBounds(232, 101, 128, 23);
		}
		return check_Div;
	}

private void calc () {
	
	ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
		arrayList.add(check_Add.isSelected());
		arrayList.add(check_Sub.isSelected());
		arrayList.add(check_Mul.isSelected());
		arrayList.add(check_Div.isSelected());

		
		for(int i= 0; i<arrayList.size(); i++) {
			if(arrayList.get(i)) {
				lbl_Result.setText("OK\n");
				
			}
		}//for
			
}	//calc	
			
private void uncheck() {
	if(check_Add.isSelected() != true) {
		lbl_Result.setText("");
	}
}
		
	
}	
	
	
	
	
	
	
	