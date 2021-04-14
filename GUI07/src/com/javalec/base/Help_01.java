package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class Help_01 extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Help_01 dialog = new Help_01();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Help_01() {
		setBounds(100, 100, 450, 300);

	}

}
