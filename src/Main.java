import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Main extends JFrame {
	
	private Control shazam;
	private JPanel contentPane;
	private JPanel login;
	private JPanel resultados;
	private JPanel buscar;
	private JPanel nuevaLey;
	
	
	//los objetos de PanelIngresarNUs
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	private JButton btnLogin;
	private	JComboBox cmbTipoCaso;
	private JButton btnBuscar;
	private JButton btnAgregarUnaLey;
		
	//los objetos de Panel Nueva Ley
	private JTextField txtTitulo;
	private JTextField txtLeyesApl;
	private JTextField txtAntecedentes;
	private JComboBox cmbTipodeCaso;
	private JButton btnCrearNuevo;
	private JButton cancel;
	private JRadioButton but;
		
	//los objetos de PanelResultados
	private JComboBox cmbResultados;
	
	
	private JPanel signup;
	private JLabel label_3;
	private JTextField txtNuevoUsuario;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JTextField txtNuevaContrasena;
	private JLabel label_8;
	private JRadioButton rdbNuevoAdmin;
	private JButton btnSignUp;
	private JButton btnNuevoIngreso;
	private JButton btnRegresar;
	private JLabel label_2;
	private JLabel label_9;
	private JTextPane txtInfo;
	private JButton btnCancelSU;
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("Jurisprudencia xd 2.0");
		shazam = new Control();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		login = new JPanel();
		contentPane.add(login, "name_1395404052204472");
		//
		//
		//
		//
		//
		login.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ingresar Nuevo Usuario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		login.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Verdana", Font.BOLD, 13));
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		login.add(lblUsuario);
		
		JLabel label = new JLabel("");
		login.add(label);
		
		txtUsuario = new JTextField();
		login.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		login.add(label_1);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Verdana", Font.BOLD, 13));
		lblContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		login.add(lblContrasea);
		
		JLabel lblNewLabel = new JLabel("");
		login.add(lblNewLabel);
		
		txtContrasena = new JTextField();
		login.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		label_2 = new JLabel("");
		login.add(label_2);
		
		
		
		but = new JRadioButton();
		but.setFont(new Font("Verdana", Font.BOLD, 13));
		but.setHorizontalAlignment(SwingConstants.CENTER);
		login.add(but);
		but.setSelected(false);
		but.setText("Administrador?");
		
		btnLogin = new JButton("Log In");
		btnLogin.setFont(new Font("Verdana", Font.BOLD, 13));
		btnLogin.setForeground(new Color(0, 128, 0));
		login.add(btnLogin);
		//
		//
		//
		//
		//
		//
		//
		
		buscar = new JPanel();
		contentPane.add(buscar, "name_1395406986975940");
		//
		//
		//
		//
		//
		buscar.setBorder(new TitledBorder(null, "Buscar Caso", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		buscar.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblTipoDeCaso = new JLabel("Tipo de Caso");
		lblTipoDeCaso.setFont(new Font("Verdana", Font.BOLD, 13));
		lblTipoDeCaso.setHorizontalAlignment(SwingConstants.CENTER);
		buscar.add(lblTipoDeCaso);
		
		String[] names = {"Asalto", "Violacion","Bancario","Corrupcion"};
		cmbTipoCaso = new JComboBox(names);
		buscar.add(cmbTipoCaso);
		
		JLabel lblPalabraClave = new JLabel("");
		buscar.add(lblPalabraClave);
		
		label_9 = new JLabel("");
		buscar.add(label_9);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Verdana", Font.BOLD, 13));
		buscar.add(btnBuscar);
		
		btnAgregarUnaLey = new JButton("Agregar una ley");
		btnAgregarUnaLey.setFont(new Font("Verdana", Font.BOLD, 13));
		buscar.add(btnAgregarUnaLey);
		
		btnNuevoIngreso = new JButton("Nuevo Usuario (Sign up)");
		btnNuevoIngreso.setFont(new Font("Verdana", Font.BOLD, 13));
		buscar.add(btnNuevoIngreso);
		//
		//
		//
		//
		//
		
		nuevaLey = new JPanel();
		contentPane.add(nuevaLey, "name_1395409556297638");
		//
		//
		//
		//
		//
		nuevaLey.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nuevo Caso", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		nuevaLey.setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNuevo = new JLabel("Tipo de Caso");
		lblNuevo.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		nuevaLey.add(lblNuevo);
		
		cmbTipodeCaso = new JComboBox(names);
		nuevaLey.add(cmbTipodeCaso);
		
		JLabel lblNuevo_1 = new JLabel("Titulo");
		lblNuevo_1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNuevo_1.setHorizontalAlignment(SwingConstants.CENTER);
		nuevaLey.add(lblNuevo_1);
		
		txtTitulo = new JTextField();
		txtTitulo.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		nuevaLey.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblNuevo_2 = new JLabel("Leyes Apicables");
		lblNuevo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevo_2.setFont(new Font("Verdana", Font.BOLD, 13));
		nuevaLey.add(lblNuevo_2);
		
		txtLeyesApl = new JTextField();
		txtLeyesApl.setBackground(UIManager.getColor("InternalFrame.inactiveBorderColor"));
		nuevaLey.add(txtLeyesApl);
		txtLeyesApl.setColumns(10);
		
		JLabel lblNuevo_3 = new JLabel("Antecendetes ");
		lblNuevo_3.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNuevo_3.setHorizontalAlignment(SwingConstants.CENTER);
		nuevaLey.add(lblNuevo_3);
		
		txtAntecedentes = new JTextField();
		txtAntecedentes.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		nuevaLey.add(txtAntecedentes);
		txtAntecedentes.setColumns(10);
		
		cancel = new JButton("Cancelar");
		cancel.setBackground(Color.RED);
		cancel.setFont(new Font("Verdana", Font.BOLD, 13));
		nuevaLey.add(cancel);
		
		btnCrearNuevo = new JButton("Crear Nuevo");
		btnCrearNuevo.setFont(new Font("Verdana", Font.BOLD, 13));
		nuevaLey.add(btnCrearNuevo);
		//
		//
		//
		//
		//
		
		resultados = new JPanel();
		contentPane.add(resultados, "name_1395411944543873");
		//
		//
		//
		//
		//
		resultados.setBorder(new TitledBorder(null, "Resultado de Busqueda ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		resultados.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Resulatado de Casos");
		lblNewLabel1.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setBounds(6, 17, 442, 88);
		resultados.add(lblNewLabel1);
		
		cmbResultados = new JComboBox();
		cmbResultados.setFont(new Font("Verdana", Font.PLAIN, 11));
		cmbResultados.setBounds(6, 105, 593, 88);
		resultados.add(cmbResultados);
		
		JLabel lblInformacionDelCaso = new JLabel("Informacion del Caso");
		lblInformacionDelCaso.setFont(new Font("Verdana", Font.BOLD, 13));
		lblInformacionDelCaso.setBounds(6, 193, 593, 88);
		resultados.add(lblInformacionDelCaso);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setFont(new Font("Verdana", Font.BOLD, 13));
		btnRegresar.setBounds(448, 17, 151, 88);
		resultados.add(btnRegresar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 249, 589, 118);
		resultados.add(scrollPane);
		
		txtInfo = new JTextPane();
		scrollPane.setViewportView(txtInfo);
		
		signup = new JPanel();
		signup.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ingresar Nuevo Usuario", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		contentPane.add(signup, "name_1402377818065842");
		signup.setLayout(new GridLayout(5, 2, 0, 0));
		
		label_3 = new JLabel("Usuario");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Verdana", Font.BOLD, 13));
		signup.add(label_3);
		
		btnCancelSU = new JButton("Cancelar");
		btnCancelSU.setBackground(new Color(255, 0, 0));
		btnCancelSU.setFont(new Font("Verdana", Font.BOLD, 13));
		signup.add(btnCancelSU);
		
		txtNuevoUsuario = new JTextField();
		txtNuevoUsuario.setColumns(10);
		signup.add(txtNuevoUsuario);
		
		label_5 = new JLabel("");
		signup.add(label_5);
		
		label_6 = new JLabel("Contrase\u00F1a");
		label_6.setFont(new Font("Verdana", Font.BOLD, 13));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		signup.add(label_6);
		
		label_7 = new JLabel("");
		signup.add(label_7);
		
		txtNuevaContrasena = new JTextField();
		txtNuevaContrasena.setColumns(10);
		signup.add(txtNuevaContrasena);
		
		label_8 = new JLabel("");
		signup.add(label_8);
		
		rdbNuevoAdmin = new JRadioButton();
		rdbNuevoAdmin.setFont(new Font("Verdana", Font.BOLD, 13));
		rdbNuevoAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		rdbNuevoAdmin.setText("Administrador?");
		rdbNuevoAdmin.setSelected(false);
		signup.add(rdbNuevoAdmin);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Verdana", Font.BOLD, 13));
		signup.add(btnSignUp);
		//
		//
		//
		//
		//
		
		
		//Poniendole acciones a cada objeto importante
				Accion accion= new Accion();
				btnLogin.addActionListener(accion);
				btnBuscar.addActionListener(accion);
				btnAgregarUnaLey.addActionListener(accion);
				cmbResultados.addActionListener(accion);
				cancel.addActionListener(accion);
				btnCrearNuevo.addActionListener(accion);
				btnSignUp.addActionListener(accion);
				btnNuevoIngreso.addActionListener(accion);
				btnRegresar.addActionListener(accion);
				btnCancelSU.addActionListener(accion);
	}
	
	
private class Accion implements ActionListener{
		

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if(event.getSource()==btnLogin) {
				String username= txtUsuario.getText();
				String password= txtContrasena.getText();
				boolean admi = but.isSelected();
				//
				//
				boolean registrado= shazam.verificarAdmin(username, password, admi);//esto se cambia por un metodo (no se si regresa boolean)
				
				
				if(registrado==true) {
					login.setVisible(false);
					if(admi==false) {
						btnAgregarUnaLey.setEnabled(false);
						btnNuevoIngreso.setEnabled(false);
					}
					buscar.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "La contrase\u00F1a no es correcta");
				}
			}
			
			if(event.getSource()==btnBuscar) {
				String tipoCaso= cmbTipoCaso.getSelectedItem().toString();
				
				cmbResultados.removeAllItems();
				
				if(shazam.buscaCaso(tipoCaso).length>0) {
					String[] listasa = shazam.buscaCaso(tipoCaso);
					for(String s: listasa) {
						cmbResultados.addItem(s);
						buscar.setVisible(false);
						resultados.setVisible(true);
					}
				}else {
					JOptionPane.showMessageDialog(null, "No hay casos de este tipo. Agregue uno.");
				}
				
			}
			
			if(event.getSource()==btnAgregarUnaLey) {
				buscar.setVisible(false);
				nuevaLey.setVisible(true);
			}
			if(event.getSource()==cancel) {
				buscar.setVisible(true);
				nuevaLey.setVisible(false);
			}
			
			if(event.getSource()==btnCrearNuevo) {
				String nuevoTipodeCaso= cmbTipodeCaso.getSelectedItem().toString();
				String titulo= txtTitulo.getText();
				String leyesAplicables= txtLeyesApl.getText();
				String antecedentes= txtAntecedentes.getText();
				shazam.nuevoCaso(titulo, nuevoTipodeCaso, leyesAplicables, antecedentes );
				//metodo para agregar esta info
				nuevaLey.setVisible(false);
				buscar.setVisible(true);
				
			}
			
			if(event.getSource()==cmbResultados) {
//				
				txtInfo.setText(shazam.showMeYourCaso((String)cmbResultados.getSelectedItem()));
			}
			
			
			if(event.getSource()==btnSignUp) {
				String nuevoUsuario= txtNuevoUsuario.getText();
				String nuevaContrasena= txtNuevaContrasena.getText();
				boolean admin = rdbNuevoAdmin.isSelected();
				shazam.newAdmin(nuevoUsuario, nuevaContrasena, admin);
				signup.setVisible(false);
				login.setVisible(true);
			}
			
			
			if(event.getSource()==btnNuevoIngreso) {
				buscar.setVisible(false);
				signup.setVisible(true);
			}
			
			
			if(event.getSource()==btnRegresar) {
				resultados.setVisible(false);
				buscar.setVisible(true);
			}
			if(event.getSource()==btnCancelSU) {
				signup.setVisible(false);
				buscar.setVisible(true);
			}
		}
	}
	public JTextPane getTxtInfo() {
		return txtInfo;
	}
	public JButton getBtnCancelSU() {
		return btnCancelSU;
	}
}
