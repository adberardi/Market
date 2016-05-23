package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class V_EditarTienda extends JFrame {

	public JPanel contentPane;
	public JTextField txtLugar;
	public JLabel lblCorreoElectronicoActual;
	public JLabel lblNewLabel;
	public JComponent lblDatosActuales;
	public JLabel label;
	public JTextField txtCorreoElectronico;
	public JLabel lblLugar;
	public JTextField txtLugar_1;
	public JTextField txtTelefono;
	public JButton btnEditar;
	public JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_EditarTienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));mostrarVentana();
		setContentPane(contentPane);
		
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(165, 11, 122, 14);
		contentPane.add(label);
		
		lblDatosActuales = new JLabel("Datos Actuales:");
		lblDatosActuales.setForeground(Color.WHITE);
		lblDatosActuales.setBounds(34, 39, 101, 14);
		contentPane.add(lblDatosActuales);
		
		lblNewLabel = new JLabel("Nombre Actual");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(34, 80, 85, 14);
		contentPane.add(lblNewLabel);
		
		txtLugar = new JTextField();
		txtLugar.setText("Nombre");
		txtLugar.setBounds(291, 77, 122, 20);
		contentPane.add(txtLugar);
		txtLugar.setColumns(10);
		
		lblCorreoElectronicoActual = new JLabel("Correo Electronico Actual");
		lblCorreoElectronicoActual.setForeground(Color.WHITE);
		lblCorreoElectronicoActual.setBounds(34, 123, 158, 14);
		contentPane.add(lblCorreoElectronicoActual);
		
		txtCorreoElectronico = new JTextField();
		txtCorreoElectronico.setText("Correo Electronico");
		txtCorreoElectronico.setBounds(291, 120, 122, 20);
		contentPane.add(txtCorreoElectronico);
		txtCorreoElectronico.setColumns(10);
		
		lblLugar = new JLabel("Lugar Actual");
		lblLugar.setForeground(Color.WHITE);
		lblLugar.setBounds(34, 164, 101, 14);
		contentPane.add(lblLugar);
		
		txtLugar_1 = new JTextField();
		txtLugar_1.setText("Lugar");
		txtLugar_1.setBounds(291, 161, 122, 20);
		contentPane.add(txtLugar_1);
		txtLugar_1.setColumns(10);
		
		JLabel lblTelefonoActual = new JLabel("Telefono Actual");
		lblTelefonoActual.setForeground(Color.WHITE);
		lblTelefonoActual.setBounds(34, 208, 101, 14);
		contentPane.add(lblTelefonoActual);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("Telefono");
		txtTelefono.setBounds(291, 205, 122, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(34, 252, 89, 23);
		contentPane.add(btnEditar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(324, 252, 89, 23);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Editar Tienda");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane.setLayout(null);
	}
}
