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
import javax.swing.JButton;

public class V_Inicio extends JFrame {

	public JPanel contentPane;
	public JTextField txtUsuario;
	public JTextField txtContrasea;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarketVenezuela = new JLabel("Market Venezuela");
		lblMarketVenezuela.setFont(new Font("Dialog", Font.BOLD, 14));
		lblMarketVenezuela.setForeground(Color.WHITE);
		lblMarketVenezuela.setBounds(164, 27, 167, 15);
		contentPane.add(lblMarketVenezuela);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(144, 69, 185, 19);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtContrasea = new JTextField();
		txtContrasea.setText("Contraseña");
		txtContrasea.setBounds(144, 120, 187, 19);
		contentPane.add(txtContrasea);
		txtContrasea.setColumns(10);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(48, 200, 117, 25);
		contentPane.add(btnIngresar);
	}
}
