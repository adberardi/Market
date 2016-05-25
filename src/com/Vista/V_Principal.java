package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class V_Principal extends JFrame {

	public JPanel contentPane;
	public JTextField txtUsuario;
	public JTextField txtContrasea;
	public JButton btnRegistrar;
	public JLabel lblMarketVenezuela;
	public JButton btnIngresar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMarketVenezuela = new JLabel("Market Venezuela");
		lblMarketVenezuela.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMarketVenezuela.setForeground(Color.WHITE);
		lblMarketVenezuela.setBackground(Color.WHITE);
		lblMarketVenezuela.setBounds(150, 12, 153, 15);
		contentPane.add(lblMarketVenezuela);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(142, 60, 161, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contraseña");
		txtContrasea.setBounds(142, 117, 161, 19);
		contentPane.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(42, 192, 117, 25);
		contentPane.add(btnIngresar);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(279, 192, 117, 25);
		contentPane.add(btnRegistrar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.blue);
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
	}
}
