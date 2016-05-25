package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class V_RegistrarPersonaJuridica extends JFrame {

	public JPanel contentPane;
	public JButton btnCancelar;
	public JButton btnContinuar;
	public JTextField txtBeneficios;
	public JTextField txtSalario;
	public JTextField txtCorreoElectrnico;
	public JTextField txtTelfono;
	public JTextField txtRegistro;
	public JTextField txtRif;
	public JTextField txtCedula;
	public JTextField txtApellidos;
	public JTextField txtNombre;
	public JLabel lblEmpleado;
	public JLabel label;
	public JLabel lblTipoDeEmpleado;
	public JTextField txtCapitalDisponible;
	public JTextField txtContacto;
	public JTextField txtPginaWeb;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_RegistrarPersonaJuridica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBackground(Color.WHITE);
		label.setBounds(145, 12, 153, 15);
		contentPane.add(label);
		
		lblTipoDeEmpleado = new JLabel("Tipo de Persona");
		lblTipoDeEmpleado.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTipoDeEmpleado.setForeground(Color.WHITE);
		lblTipoDeEmpleado.setBounds(59, 55, 173, 15);
		contentPane.add(lblTipoDeEmpleado);
		
		lblEmpleado = new JLabel("Jurídica");
		lblEmpleado.setForeground(Color.WHITE);
		lblEmpleado.setFont(new Font("Dialog", Font.BOLD, 14));
		lblEmpleado.setBounds(95, 76, 95, 15);
		contentPane.add(lblEmpleado);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombres");
		txtNombre.setBounds(271, 39, 128, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setText("Apellidos");
		txtApellidos.setBounds(271, 74, 128, 19);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setText("Cedula");
		txtCedula.setBounds(271, 136, 128, 19);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtRif = new JTextField();
		txtRif.setText("Rif");
		txtRif.setBounds(271, 105, 128, 19);
		contentPane.add(txtRif);
		txtRif.setColumns(10);
		
		txtRegistro = new JTextField();
		txtRegistro.setText("Número Registro");
		txtRegistro.setBounds(271, 167, 128, 19);
		contentPane.add(txtRegistro);
		txtRegistro.setColumns(10);
		
		txtTelfono = new JTextField();
		txtTelfono.setText("Teléfono");
		txtTelfono.setBounds(271, 229, 128, 19);
		contentPane.add(txtTelfono);
		txtTelfono.setColumns(10);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setText("Correo Electrónico");
		txtCorreoElectrnico.setBounds(271, 260, 128, 19);
		contentPane.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setText("Razón Social");
		txtSalario.setBounds(59, 105, 144, 19);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtBeneficios = new JTextField();
		txtBeneficios.setText("Denominación ");
		txtBeneficios.setBounds(59, 136, 144, 19);
		contentPane.add(txtBeneficios);
		txtBeneficios.setColumns(10);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(59, 301, 117, 25);
		contentPane.add(btnContinuar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(281, 301, 117, 25);
		contentPane.add(btnCancelar);
		
		txtCapitalDisponible = new JTextField();
		txtCapitalDisponible.setText("Capital Disponible");
		txtCapitalDisponible.setBounds(271, 198, 128, 19);
		contentPane.add(txtCapitalDisponible);
		txtCapitalDisponible.setColumns(10);
		
		txtContacto = new JTextField();
		txtContacto.setText("Contacto");
		txtContacto.setBounds(59, 167, 144, 19);
		contentPane.add(txtContacto);
		txtContacto.setColumns(10);
		
		txtPginaWeb = new JTextField();
		txtPginaWeb.setText("Página Web");
		txtPginaWeb.setBounds(59, 198, 144, 19);
		contentPane.add(txtPginaWeb);
		txtPginaWeb.setColumns(10);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Principal");
		setResizable(false);
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
	}
}
