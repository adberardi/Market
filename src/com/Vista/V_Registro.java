package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class V_Registro extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JTextField txtNombre;
	public JTextField txtApellidos;
	public JTextField txtCedula;
	public JRadioButton rdbtnJurdica;
	public JRadioButton rdbtnEmpleado;
	public JTextField txtRif;
	public JTextField txtRegistro;
	public JTextField txtTelfono;
	public JTextField txtCorreoElectrnico;
	public JRadioButton rdbtnAdministrador;
	public JButton btnCancelar;
	public JLabel lblEligeElTipo;
	public JRadioButton rdbtnNatural;
	public JButton btnContinuar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_Registro() {
		setTitle("Principal");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 490);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBackground(Color.WHITE);
		label.setBounds(145, 12, 153, 15);
		contentPane.add(label);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombres");
		txtNombre.setBounds(271, 39, 128, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblEligeElTipo = new JLabel("Elige el tipo de Persona");
		lblEligeElTipo.setForeground(Color.WHITE);
		lblEligeElTipo.setBounds(48, 75, 183, 15);
		contentPane.add(lblEligeElTipo);
		
		txtApellidos = new JTextField();
		txtApellidos.setText("Apellidos");
		txtApellidos.setBounds(271, 86, 128, 19);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setText("Cedula");
		txtCedula.setBounds(271, 139, 128, 19);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		rdbtnNatural = new JRadioButton("Natural");
		rdbtnNatural.setForeground(Color.WHITE);
		rdbtnNatural.setBackground(Color.BLUE);
		rdbtnNatural.setBounds(58, 114, 149, 23);
		contentPane.add(rdbtnNatural);
		
		rdbtnJurdica = new JRadioButton("Jurídica");
		rdbtnJurdica.setBackground(Color.BLUE);
		rdbtnJurdica.setForeground(Color.WHITE);
		rdbtnJurdica.setBounds(58, 186, 149, 23);
		contentPane.add(rdbtnJurdica);
		
		rdbtnEmpleado = new JRadioButton("Empleado");
		rdbtnEmpleado.setBackground(Color.BLUE);
		rdbtnEmpleado.setForeground(Color.WHITE);
		rdbtnEmpleado.setBounds(58, 262, 149, 23);
		contentPane.add(rdbtnEmpleado);
		
		txtRif = new JTextField();
		txtRif.setText("Rif");
		txtRif.setBounds(271, 186, 128, 19);
		contentPane.add(txtRif);
		txtRif.setColumns(10);
		
		txtRegistro = new JTextField();
		txtRegistro.setText("Número Registro");
		txtRegistro.setBounds(271, 234, 128, 19);
		contentPane.add(txtRegistro);
		txtRegistro.setColumns(10);
		
		txtTelfono = new JTextField();
		txtTelfono.setText("Teléfono");
		txtTelfono.setBounds(271, 286, 128, 19);
		contentPane.add(txtTelfono);
		txtTelfono.setColumns(10);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setText("Correo Electrónico");
		txtCorreoElectrnico.setBounds(271, 336, 128, 19);
		contentPane.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		rdbtnAdministrador = new JRadioButton("Administrador");
		rdbtnAdministrador.setForeground(Color.WHITE);
		rdbtnAdministrador.setBackground(Color.BLUE);
		rdbtnAdministrador.setBounds(58, 336, 183, 19);
		contentPane.add(rdbtnAdministrador);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(50, 401, 117, 25);
		contentPane.add(btnContinuar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(282, 401, 117, 25);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Principal");
		contentPane.setBackground(Color.blue);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 490);
	}
}
