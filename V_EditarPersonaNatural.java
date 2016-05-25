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

public class V_EditarPersonaNatural extends JFrame {

	public JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtTelefono;
	public JTextField txtRif;
	public JTextField txtRegistro;
	public JLabel lblRegistroActual;
	public JLabel lblRifActual;
	public JLabel lblTelefonoActual;
	public JLabel lblApellidoActual;
	public JLabel lblNombreActual;
	public JLabel lblDatosActuales;
	public JLabel label;
	public JButton btnCancelar;
	public JButton btnEditar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_EditarPersonaNatural() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); mostrarVentana();
		setContentPane(contentPane);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(162, 11, 122, 14);
		contentPane.add(label);
		
		lblDatosActuales = new JLabel("Datos Actuales: ");
		lblDatosActuales.setForeground(Color.WHITE);
		lblDatosActuales.setBounds(36, 45, 102, 14);
		contentPane.add(lblDatosActuales);
		
		lblNombreActual = new JLabel("Nombre Actual");
		lblNombreActual.setForeground(Color.WHITE);
		lblNombreActual.setBounds(36, 70, 102, 14);
		contentPane.add(lblNombreActual);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(284, 67, 122, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidoActual = new JLabel("Apellido Actual");
		lblApellidoActual.setForeground(Color.WHITE);
		lblApellidoActual.setBounds(36, 113, 102, 14);
		contentPane.add(lblApellidoActual);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(284, 110, 122, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblTelefonoActual = new JLabel("Telefono Actual");
		lblTelefonoActual.setForeground(Color.WHITE);
		lblTelefonoActual.setBounds(36, 157, 102, 14);
		contentPane.add(lblTelefonoActual);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("Telefono");
		txtTelefono.setBounds(284, 154, 122, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblRifActual = new JLabel("Rif Actual");
		lblRifActual.setForeground(Color.WHITE);
		lblRifActual.setBounds(36, 200, 102, 14);
		contentPane.add(lblRifActual);
		
		txtRif = new JTextField();
		txtRif.setText("Rif");
		txtRif.setBounds(284, 197, 122, 20);
		contentPane.add(txtRif);
		txtRif.setColumns(10);
		
		lblRegistroActual = new JLabel("Registro Actual");
		lblRegistroActual.setForeground(Color.WHITE);
		lblRegistroActual.setBounds(36, 244, 102, 14);
		contentPane.add(lblRegistroActual);
		
		txtRegistro = new JTextField();
		txtRegistro.setText("Registro");
		txtRegistro.setBounds(284, 241, 122, 20);
		contentPane.add(txtRegistro);
		txtRegistro.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(36, 292, 89, 23);
		contentPane.add(btnEditar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(317, 292, 89, 23);
		contentPane.add(btnCancelar);
		
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Editar Persona Natural");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 450, 367);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
	}

}
