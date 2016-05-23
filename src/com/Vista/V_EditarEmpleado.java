package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class V_EditarEmpleado extends JFrame {

	public JPanel contentPane;
	public JButton btnCancelar;
	public JButton btnEditar;
	public JTextField txtBeneficios;
	public JLabel lblBeneficios;
	public JTextField txtSalario;
	public JLabel lblSalario;
	public JTextField txtRegistro;
	public JLabel lblNewLabel_2;
	public JTextField txtRif;
	public JLabel lblNewLabel_1;
	public JTextField txtTelefono;
	public JLabel lblNewLabel;
	public JTextField txtApellido;
	public JLabel lblApellido;
	public JTextField txtNombre;
	public JLabel lblNombre;
	public JLabel lblDatosActuales;
	public JLabel label;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_EditarEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); 
		setContentPane(contentPane);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(162, 11, 122, 14);
		contentPane.add(label);
		
		lblDatosActuales = new JLabel("Datos Actuales:");
		lblDatosActuales.setForeground(Color.WHITE);
		lblDatosActuales.setBounds(34, 38, 106, 14);
		contentPane.add(lblDatosActuales);
		
		lblNombre = new JLabel("Nombre Actual");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setBounds(34, 74, 88, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(237, 71, 168, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido Actual");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setBounds(34, 115, 88, 14);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(237, 112, 168, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblNewLabel = new JLabel("Telefono Actual");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(34, 155, 88, 14);
		contentPane.add(lblNewLabel);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("Telefono");
		txtTelefono.setBounds(237, 152, 168, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Rif Actual");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(34, 195, 88, 14);
		contentPane.add(lblNewLabel_1);
		
		txtRif = new JTextField();
		txtRif.setText("Rif");
		txtRif.setBounds(237, 192, 168, 20);
		contentPane.add(txtRif);
		txtRif.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Registro Actual");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(34, 240, 88, 14);
		contentPane.add(lblNewLabel_2);
		
		txtRegistro = new JTextField();
		txtRegistro.setText("Registro");
		txtRegistro.setBounds(237, 237, 168, 20);
		contentPane.add(txtRegistro);
		txtRegistro.setColumns(10);
		
		lblSalario = new JLabel("Salario Actual");
		lblSalario.setForeground(Color.WHITE);
		lblSalario.setBounds(34, 279, 88, 14);
		contentPane.add(lblSalario);
		
		txtSalario = new JTextField();
		txtSalario.setText("Salario");
		txtSalario.setBounds(237, 276, 168, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		lblBeneficios = new JLabel("Beneficios Actuales");
		lblBeneficios.setForeground(Color.WHITE);
		lblBeneficios.setBounds(34, 314, 122, 14);
		contentPane.add(lblBeneficios);
		
		txtBeneficios = new JTextField();
		txtBeneficios.setText("Beneficios");
		txtBeneficios.setBounds(237, 311, 168, 20);
		contentPane.add(txtBeneficios);
		txtBeneficios.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(34, 357, 89, 23);
		contentPane.add(btnEditar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(316, 357, 89, 23);
		contentPane.add(btnCancelar);
		setBounds(100, 100, 450, 419);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Editar Empleado");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(null);
	}

}
