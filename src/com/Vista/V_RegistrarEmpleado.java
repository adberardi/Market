package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class V_RegistrarEmpleado extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JLabel lblEmpleado;
	public JTextField txtNombre;
	public JTextField txtCedula;
	public JTextField txtApellidos;
	public JTextField txtRegistro;
	public JTextField txtRif;
	public JTextField txtTelfono;
	public JTextField txtCorreoElectrnico;
	public JTextField txtSalario;
	public JTextField txtBeneficios;
	public JButton btnContinuar;
	public JButton btnCancelar;
	public JLabel lblTipoDeEmpleado;
	public JComboBox comboBox;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_RegistrarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 369);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.BOLD, 14));
		label.setBackground(Color.WHITE);
		label.setBounds(145, 12, 153, 15);
		contentPane.add(label);
		
		lblTipoDeEmpleado = new JLabel("Tipo de Empleado:");
		lblTipoDeEmpleado.setFont(new Font("Dialog", Font.BOLD, 15));
		lblTipoDeEmpleado.setForeground(Color.WHITE);
		lblTipoDeEmpleado.setBounds(59, 55, 173, 15);
		contentPane.add(lblTipoDeEmpleado);
		
		lblEmpleado = new JLabel("Empleado");
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
		txtRegistro.setBounds(271, 173, 128, 19);
		contentPane.add(txtRegistro);
		txtRegistro.setColumns(10);
		
		txtTelfono = new JTextField();
		txtTelfono.setText("Teléfono");
		txtTelfono.setBounds(271, 209, 128, 19);
		contentPane.add(txtTelfono);
		txtTelfono.setColumns(10);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setText("Correo Electrónico");
		txtCorreoElectrnico.setBounds(271, 240, 128, 19);
		contentPane.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		txtSalario = new JTextField();
		txtSalario.setText("Salario");
		txtSalario.setBounds(59, 105, 144, 19);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		txtBeneficios = new JTextField();
		txtBeneficios.setText("Beneficios");
		txtBeneficios.setBounds(59, 162, 144, 19);
		contentPane.add(txtBeneficios);
		txtBeneficios.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(59, 217, 144, 24);
		contentPane.add(comboBox);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(59, 286, 117, 25);
		contentPane.add(btnContinuar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(282, 286, 117, 25);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Principal");
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 369);
	}
}
