import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI04_Ex {

	private JFrame frame;
	private JTextField tf_UserID;
	private JButton btn_Signin;
	private JPasswordField pf_Password;
	private JLabel lbl_UserID;
	private JLabel lbl_Password;
	private JTextField tf_Result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI04_Ex window = new GUI04_Ex();
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
	public GUI04_Ex() {
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
		frame.getContentPane().add(getTf_UserID());
		frame.getContentPane().add(getBtn_Signin());
		frame.getContentPane().add(getPf_Password());
		frame.getContentPane().add(getLbl_UserID());
		frame.getContentPane().add(getLbl_Password());
		frame.getContentPane().add(getTf_Result());
	}

	private JTextField getTf_UserID() {
		if (tf_UserID == null) {
			tf_UserID = new JTextField();
			tf_UserID.setBounds(154, 79, 130, 26);
			tf_UserID.setColumns(10);
		}
		return tf_UserID;
	}
	private JButton getBtn_Signin() {
		if (btn_Signin == null) {
			btn_Signin = new JButton("Sign In");
			btn_Signin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					checkIDandPassword();
					
				}
			});
			btn_Signin.setBounds(303, 142, 117, 29);
		}
		return btn_Signin;
	}
	private JPasswordField getPf_Password() {
		if (pf_Password == null) {
			pf_Password = new JPasswordField();
			pf_Password.setBounds(154, 142, 130, 26);
		}
		return pf_Password;
	}
	private JLabel getLbl_UserID() {
		if (lbl_UserID == null) {
			lbl_UserID = new JLabel("USER ID");
			lbl_UserID.setBounds(76, 84, 61, 16);
		}
		return lbl_UserID;
	}
	private JLabel getLbl_Password() {
		if (lbl_Password == null) {
			lbl_Password = new JLabel("PASSWORD");
			lbl_Password.setBounds(76, 147, 78, 16);
		}
		return lbl_Password;
	}
	private JTextField getTf_Result() {
		if (tf_Result == null) {
			tf_Result = new JTextField();
			tf_Result.setEditable(false);
			tf_Result.setBounds(57, 209, 346, 26);
			tf_Result.setColumns(10);
		}
		return tf_Result;
	}
	
	
		private void checkPassword() {
			
			char [] password = pf_Password.getPassword();
			String pass = new String(password);
			
		}
	
		private void checkID() {
			
			String userID = tf_UserID.getText().toString();
			
		}
	
		private void checkIDandPassword(){
			checkID();
			checkPassword();
			
		
			
			
			
			
			
			
		
	}//check
		
	
	
	
	
	
	
	
	
}
