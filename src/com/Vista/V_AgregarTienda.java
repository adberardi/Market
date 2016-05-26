package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class V_AgregarTienda extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JTextField txtNombre;
	public JTextField txtCorreoElectrnico;
	public JTextField txtTipo;
	public JButton btnCancelar;
	public JButton btnAgregar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_AgregarTienda() {
		setTitle("Agregar Tienda");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 272);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(167, 12, 156, 14);
		contentPane.add(label);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(141, 49, 200, 19);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCorreoElectrnico = new JTextField();
		txtCorreoElectrnico.setText("Correo Electrónico");
		txtCorreoElectrnico.setBounds(141, 92, 200, 24);
		contentPane.add(txtCorreoElectrnico);
		txtCorreoElectrnico.setColumns(10);
		
		txtTipo = new JTextField();
		txtTipo.setText("Tipo");
		txtTipo.setBounds(141, 143, 200, 24);
		contentPane.add(txtTipo);
		txtTipo.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(43, 203, 91, 25);
		contentPane.add(btnAgregar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(339, 203, 96, 25);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Agregar Tienda");
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 272);
	}
}
