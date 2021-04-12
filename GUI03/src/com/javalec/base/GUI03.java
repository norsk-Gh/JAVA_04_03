package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI03 {

	private JFrame frmCheckboxRadiobutton;
	private JCheckBox chk_Apple;
	private JCheckBox chk_Banana;
	private JButton bt_OK;
	private JTextField tf_Result;
	private JRadioButton rdb_KBS;
	private JRadioButton rdb_MBC;
	private JButton btn_OK_Radio;
	private JTextField tf_RadioResult;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI03 window = new GUI03();
					window.frmCheckboxRadiobutton.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCheckboxRadiobutton = new JFrame();
		frmCheckboxRadiobutton.setTitle("CheckBox / RadioButton");
		frmCheckboxRadiobutton.setBounds(100, 100, 450, 300);
		frmCheckboxRadiobutton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCheckboxRadiobutton.getContentPane().setLayout(null);
		frmCheckboxRadiobutton.getContentPane().add(getChk_Apple());
		frmCheckboxRadiobutton.getContentPane().add(getChk_Banana());
		frmCheckboxRadiobutton.getContentPane().add(getBt_OK());
		frmCheckboxRadiobutton.getContentPane().add(getTf_Result());
		frmCheckboxRadiobutton.getContentPane().add(getRdb_KBS());
		frmCheckboxRadiobutton.getContentPane().add(getRdb_MBC());
		frmCheckboxRadiobutton.getContentPane().add(getBtn_OK_Radio());
		frmCheckboxRadiobutton.getContentPane().add(getTf_RadioResult());
	}
	private JCheckBox getChk_Apple() {
		if (chk_Apple == null) {
			chk_Apple = new JCheckBox("Apple");
			chk_Apple.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					unchecked();
				}
			});
			chk_Apple.setBounds(28, 58, 128, 23);
		}
		return chk_Apple;
	}
	private JCheckBox getChk_Banana() {
		if (chk_Banana == null) {
			chk_Banana = new JCheckBox("Banana");
			chk_Banana.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					unchecked();
				}
			});
			chk_Banana.setBounds(28, 99, 128, 23);
		}
		return chk_Banana;
	}
	private JButton getBt_OK() {
		if (bt_OK == null) {
			bt_OK = new JButton("OK");
			bt_OK.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					fruitCheck();
					
					
				}
			});
			bt_OK.setBounds(25, 146, 117, 29);
		}
		return bt_OK;
	}
	private JTextField getTf_Result() {
		if (tf_Result == null) {
			tf_Result = new JTextField();
			tf_Result.setBounds(28, 187, 184, 26);
			tf_Result.setColumns(10);
		}
		return tf_Result;
	}
	
	private void fruitCheck() {
		
		tf_Result.setText("");    // default ... way to set back the Text Field.
		
		if(chk_Apple.isSelected() && chk_Banana.isSelected() == true) {
			tf_Result.setText("You select Apple and Banana");
		}
		
		else if(chk_Apple.isSelected() == true ) {
			tf_Result.setText("You select an Apple");
		}//if 
		else if(chk_Banana.isSelected() == true ) {
			tf_Result.setText("You select a Banana");
		}//if 
		
		
	}// void
	
	private void unchecked() {
		if(chk_Apple.isSelected() != true ) {
			tf_Result.setText(""); 
	}
	}
	private JRadioButton getRdb_KBS() {
		if (rdb_KBS == null) {
			rdb_KBS = new JRadioButton("KBS");
			rdb_KBS.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Radio_Checked();
					
				}
			});
			buttonGroup.add(rdb_KBS);
			rdb_KBS.setBounds(258, 58, 141, 23);
		}
		return rdb_KBS;
	}
	private JRadioButton getRdb_MBC() {
		if (rdb_MBC == null) {
			rdb_MBC = new JRadioButton("MBC");
			rdb_MBC.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Radio_Checked();
					
				}
			});
			buttonGroup.add(rdb_MBC);
			rdb_MBC.setBounds(258, 99, 141, 23);
		}
		return rdb_MBC;
	}
	private JButton getBtn_OK_Radio() {
		if (btn_OK_Radio == null) {
			btn_OK_Radio = new JButton("OK");
			btn_OK_Radio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Radio_Checked();
					
					
				}
			});
			btn_OK_Radio.setBounds(258, 146, 117, 29);
		}
		return btn_OK_Radio;
	}
	private JTextField getTf_RadioResult() {
		if (tf_RadioResult == null) {
			tf_RadioResult = new JTextField();
			tf_RadioResult.setBounds(269, 187, 130, 26);
			tf_RadioResult.setColumns(10);
		}
		return tf_RadioResult;
	}
	
	
	private void Radio_Checked () {
		if(rdb_KBS.isSelected() == true) {
			tf_RadioResult.setText("KBS is selected");
		}
		else if(rdb_MBC.isSelected() == true) {
				tf_RadioResult.setText("MBC is selected");
		}
	}
	
	
	
	// We need to grouping that the radios is only checked one.
	// How to Group the radios : Set Button Group > New Standard
	
	
	
	
	
}
