import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPRO {

	private JFrame frame;
	private JTextField tfUser;
	private JTextField tfPassword;
	private JRadioButton rdbtnAdmin;
	private JRadioButton rdbtnVisit;
	private JButton btnIngresar;
	private Control espectoPatronum;
	private String user;
	private String pass;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPRO window = new GUIPRO();
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
	public GUIPRO() {
		initialize();
		espectoPatronum = new Control();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 2, 2, 2));
		
		JLabel lblIngresarDatos = new JLabel("Ingrese sus datos:");
		panel.add(lblIngresarDatos);
		
		rdbtnAdmin = new JRadioButton("Administrador");
		rdbtnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtnVisit.setSelected(false);
			}
		});
		panel.add(rdbtnAdmin);
		
		rdbtnVisit = new JRadioButton("Visitante");
		rdbtnVisit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnAdmin.setSelected(true);
			}
		});
		panel.add(rdbtnVisit);
		
		JLabel lblUser = new JLabel("Usuario:");
		panel.add(lblUser);
		
		tfUser = new JTextField();
		panel.add(tfUser);
		tfUser.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel.add(horizontalStrut);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		panel.add(lblContrasea);
		
		tfPassword = new JTextField();
		panel.add(tfPassword);
		tfPassword.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = tfUser.getText();
				pass = tfPassword.getText();
				boolean holo=false;
				if(rdbtnAdmin.isSelected()==true) {
					holo = true;
				}
				
				if(espectoPatronum.verificarAdmin(user, pass,holo)==true) {
					
				}
			}
		});
		panel.add(btnIngresar);
	}


	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnAdmin;
	}
	public JRadioButton getRdbtnNewRadioButton_1() {
		return rdbtnVisit;
	}
	public JTextField getTextField() {
		return tfUser;
	}
	public JTextField getTextField_1() {
		return tfPassword;
	}
	public JButton getBtnIngresar() {
		return btnIngresar;
	}
}
