package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class GUI02 {

	private JFrame frmComboBox;
	private JTextField tf_Fruits;
	private JTextField tf_Add;
	private JComboBox cb_Add;
	private JButton bt_Add;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI02 window = new GUI02();
					window.frmComboBox.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmComboBox = new JFrame();
		frmComboBox.setTitle("Combo Box");
		frmComboBox.setBounds(100, 100, 450, 300);
		frmComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmComboBox.getContentPane().setLayout(null);
		
		JComboBox cb_Fruits = new JComboBox();
		cb_Fruits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// the Items on ComboBox isn't type String. So we need to change the type.
				String stFruits = cb_Fruits.getSelectedItem().toString();
				tf_Fruits.setText(stFruits);
				
				
			}
		});
		cb_Fruits.setModel(new DefaultComboBoxModel(new String[] {"Apple", "Banana", "Grape", "Mango", "Melon"}));
		cb_Fruits.setBounds(20, 19, 138, 27);
		frmComboBox.getContentPane().add(cb_Fruits);
		
		tf_Fruits = new JTextField();
		tf_Fruits.setBounds(183, 18, 130, 26);
		frmComboBox.getContentPane().add(tf_Fruits);
		tf_Fruits.setColumns(10);
		
		tf_Add = new JTextField();
		tf_Add.setBounds(43, 145, 130, 26);
		frmComboBox.getContentPane().add(tf_Add);
		tf_Add.setColumns(10);
		frmComboBox.getContentPane().add(getCb_Add());
		frmComboBox.getContentPane().add(getBt_Add());{
		}
		
		
		
			
		
		
		
	}
	private JComboBox getCb_Add() {
		if (cb_Add == null) {
			cb_Add = new JComboBox();
			cb_Add.setBounds(251, 146, 82, 27);
		}
		return cb_Add;
	}
	private JButton getBt_Add() {
		if (bt_Add == null) {
			bt_Add = new JButton("Add");
			bt_Add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					add();
				}
			});
			bt_Add.setBounds(53, 191, 117, 29);
		}
		return bt_Add;
	}
	
	
	private void add () {
		
	String stTemp = tf_Add.getText();
	cb_Add.addItem(stTemp);
	}
	
	
	
	
	
}
