package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JPasswordField pf_Input;
	private JButton btn_OK;
	private JTextField tf_Message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04 window = new GUI04();
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
	public GUI04() {
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
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getPf_Input());
		frame.getContentPane().add(getBtn_OK());
		frame.getContentPane().add(getTf_Message());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(35, 90, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPf_Input() {
		if (pf_Input == null) {
			pf_Input = new JPasswordField();
			pf_Input.setBounds(108, 85, 133, 26);
		}
		return pf_Input;
	}
	private JButton getBtn_OK() {
		if (btn_OK == null) {
			btn_OK = new JButton("OK");
			btn_OK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					checkPassword();
					
					
				}
			});
			btn_OK.setBounds(253, 85, 117, 29);
		}
		return btn_OK;
	}
	private JTextField getTf_Message() {
		if (tf_Message == null) {
			tf_Message = new JTextField();
			tf_Message.setBounds(108, 151, 130, 26);
			tf_Message.setColumns(10);
		}
		return tf_Message;
	}
	
	
		private	void checkPassword() {
			
			char[] str = pf_Input.getPassword();
			String passString = new String(str);
			tf_Message.setText(passString);
		}
	
}
