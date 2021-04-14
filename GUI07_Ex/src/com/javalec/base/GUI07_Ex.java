package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI07_Ex {

	private JFrame frame;
	private JTextField tf_ID;
	private JPasswordField pf_Password;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btn_OK;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI07_Ex window = new GUI07_Ex();
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
	public GUI07_Ex() {
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
		frame.getContentPane().add(getTf_ID());
		frame.getContentPane().add(getPf_Password());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getBtn_OK());
	}

	private JTextField getTf_ID() {
		if (tf_ID == null) {
			tf_ID = new JTextField();
			tf_ID.setBounds(122, 72, 130, 26);
			tf_ID.setColumns(10);
		}
		return tf_ID;
	}
	private JPasswordField getPf_Password() {
		if (pf_Password == null) {
			pf_Password = new JPasswordField();
			pf_Password.setBounds(123, 127, 129, 26);
		}
		return pf_Password;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("password");
			lblNewLabel.setBounds(37, 132, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("ID");
			lblNewLabel_1.setBounds(37, 77, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JButton getBtn_OK() {
		if (btn_OK == null) {
			btn_OK = new JButton("OK");
			btn_OK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					user_And_Password();
					
					
					
				}
			});
			btn_OK.setBounds(264, 127, 117, 29);
		}
		return btn_OK;
	}
	
	
	
	private void user_And_Password () {  //   user : 1     password : 1
		
		String user = tf_ID.getText().toString();
		
		char[] pass = pf_Password.getPassword();
		String password = new String(pass);
		
		if((user.equals("1") && password.equals(password) )== true) {   // 아이디 패스워드를 잘 입력하였을 경우
			
			Access ac = new Access();
			ac.setVisible(true);
			
		}else if((user == "1" && password == "1") !=true){// 잘못 입력하였을 경우
			
		JOptionPane.showMessageDialog(null, "Please check your ID and Password");
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
