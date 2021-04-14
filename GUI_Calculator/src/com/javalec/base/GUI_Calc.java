package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Calc {

	private JFrame frame;
	private JTextField tf_Result;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton btn_Plus;
	private JButton btnNewButton_1_1_1_1;
	private JButton button_6;
	private JButton button_5;
	private JButton button_4;
	private JButton btnNewButton_1_1_1_1_1;
	private JButton button_9;
	private JButton button_8;
	private JButton button_7;
	private JButton btnNewButton_1_1_1_1_1_1;
	private JButton button_Result;
	private JButton button_0;
	private JButton btnNewButton_2_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Calc window = new GUI_Calc();
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
	public GUI_Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 306, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getTf_Result());
		frame.getContentPane().add(getButton_1());
		frame.getContentPane().add(getButton_2());
		frame.getContentPane().add(getButton_3());
		frame.getContentPane().add(getBtn_Plus());
		frame.getContentPane().add(getBtnNewButton_1_1_1_1());
		frame.getContentPane().add(getButton_6());
		frame.getContentPane().add(getButton_5());
		frame.getContentPane().add(getButton_4());
		frame.getContentPane().add(getBtnNewButton_1_1_1_1_1());
		frame.getContentPane().add(getButton_9());
		frame.getContentPane().add(getButton_8());
		frame.getContentPane().add(getButton_7());
		frame.getContentPane().add(getBtnNewButton_1_1_1_1_1_1());
		frame.getContentPane().add(getButton_Result());
		frame.getContentPane().add(getButton_0());
		frame.getContentPane().add(getBtnNewButton_2_1_1());
	}
	private JTextField getTf_Result() {
		if (tf_Result == null) {
			tf_Result = new JTextField();
			tf_Result.setText("0");
			tf_Result.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
			tf_Result.setHorizontalAlignment(SwingConstants.TRAILING);
			tf_Result.setBounds(6, 6, 294, 39);
			tf_Result.setColumns(10);
		}
		return tf_Result;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("1");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("1");
				}
			});
			button_1.setBounds(26, 57, 55, 55);
		}
		return button_1;
	}
	private JButton getButton_2() {
		if (button_2 == null) {
			button_2 = new JButton("2");
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("2");
				}
			});
			button_2.setBounds(93, 57, 55, 55);
		}
		return button_2;
	}
	private JButton getButton_3() {
		if (button_3 == null) {
			button_3 = new JButton("3");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("3");
				}
			});
			button_3.setBounds(160, 57, 55, 55);
		}
		return button_3;
	}
	private JButton getBtn_Plus() {
		if (btn_Plus == null) {
			btn_Plus = new JButton("+");
			btn_Plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					makeFirstNum2();
					click(" + ");
					makeFirstNum();
					function.action = "0";
				}
			});
			btn_Plus.setBounds(227, 57, 55, 55);
		}
		return btn_Plus;
	}
	private JButton getBtnNewButton_1_1_1_1() {
		if (btnNewButton_1_1_1_1 == null) {
			btnNewButton_1_1_1_1 = new JButton("New button");
			btnNewButton_1_1_1_1.setBounds(227, 124, 55, 55);
		}
		return btnNewButton_1_1_1_1;
	}
	private JButton getButton_6() {
		if (button_6 == null) {
			button_6 = new JButton("6");
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("6");
				}
			});
			button_6.setBounds(160, 124, 55, 55);
		}
		return button_6;
	}
	private JButton getButton_5() {
		if (button_5 == null) {
			button_5 = new JButton("5");
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("5");
				}
			});
			button_5.setBounds(93, 124, 55, 55);
		}
		return button_5;
	}
	private JButton getButton_4() {
		if (button_4 == null) {
			button_4 = new JButton("4");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("4");
				}
			});
			button_4.setBounds(26, 124, 55, 55);
		}
		return button_4;
	}
	private JButton getBtnNewButton_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1 = new JButton("New button");
			btnNewButton_1_1_1_1_1.setBounds(227, 191, 55, 55);
		}
		return btnNewButton_1_1_1_1_1;
	}
	private JButton getButton_9() {
		if (button_9 == null) {
			button_9 = new JButton("9");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("9");
				}
			});
			button_9.setBounds(160, 191, 55, 55);
		}
		return button_9;
	}
	private JButton getButton_8() {
		if (button_8 == null) {
			button_8 = new JButton("8");
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("8");
				}
			});
			button_8.setBounds(93, 191, 55, 55);
		}
		return button_8;
	}
	private JButton getButton_7() {
		if (button_7 == null) {
			button_7 = new JButton("7");
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("7");
				}
			});
			button_7.setBounds(26, 191, 55, 55);
		}
		return button_7;
	}
	private JButton getBtnNewButton_1_1_1_1_1_1() {
		if (btnNewButton_1_1_1_1_1_1 == null) {
			btnNewButton_1_1_1_1_1_1 = new JButton("New button");
			btnNewButton_1_1_1_1_1_1.setBounds(227, 260, 55, 55);
		}
		return btnNewButton_1_1_1_1_1_1;
	}
	private JButton getButton_Result() {
		if (button_Result == null) {
			button_Result = new JButton("=");
			button_Result.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					actionActor();
				}
			});
			button_Result.setBounds(160, 260, 55, 55);
		}
		return button_Result;
	}
	private JButton getBtnNewButton_2_1_1() {
		if (btnNewButton_2_1_1 == null) {
			btnNewButton_2_1_1 = new JButton("C");
			btnNewButton_2_1_1.setBounds(26, 260, 55, 55);
		}
		return btnNewButton_2_1_1;
	}
	
	
	
	private JButton getButton_0() {
		if (button_0 == null) {
			button_0 = new JButton("0");
			button_0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					click("0"); //[7]
				}
			});
			button_0.setBounds(93, 260, 55, 55);
		}
		return button_0;
	}
	
	
	
	
	Function function = new Function();     
	
	public void click(String i) {      
		
		if(tf_Result.getText().equals("0") && i.equals("0")) {
			tf_Result.setText("0");
			
		}else if(function.firstNum.equals("")){
		function.numberInsert(i);
		tf_Result.setText(function.totalNum);
		}else{
			function.numberInsert(i);
			tf_Result.setText(function.firstNum + function.totalNum);
		}
	}
	public void makeFirstNum2 () {
		function.firstNumToCalc = function.totalNum;
	}

	public void makeFirstNum () {
		function.firstNum = function.totalNum;
		function.totalNum = "";
	}

	public void actionActor () {
		int act = Integer.parseInt(function.action);
		switch(act) {
		case 0 : 
			function.resultActor();
			tf_Result.setText(function.result);
		
		}
		

	}

}
