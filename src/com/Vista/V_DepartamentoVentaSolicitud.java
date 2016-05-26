package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class V_DepartamentoVentaSolicitud extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JTextField txtFechaEntrega;
	public JTextField txtDestinatario;
	public JLabel lblDestinatario;
	public JTable table;
	public JComboBox comboBoxCantidad;
	public JTextField txtMonto;
	public JButton btnModificarSolicitud;
	public JButton btnCancelar;
	public JLabel lblFechaDeEntrega;
	public JComboBox comboBoxProducto;
	public JButton btnAceptar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_DepartamentoVentaSolicitud() {
		setTitle("Departamento de Ventas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 425);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(201, 12, 156, 14);
		contentPane.add(label);
		
		lblFechaDeEntrega = new JLabel("Fecha de Entrega");
		lblFechaDeEntrega.setForeground(Color.WHITE);
		lblFechaDeEntrega.setBounds(40, 44, 124, 15);
		contentPane.add(lblFechaDeEntrega);
		
		txtFechaEntrega = new JTextField();
		txtFechaEntrega.setBounds(189, 42, 315, 19);
		contentPane.add(txtFechaEntrega);
		txtFechaEntrega.setColumns(10);
		
		txtDestinatario = new JTextField();
		txtDestinatario.setBounds(189, 73, 315, 19);
		contentPane.add(txtDestinatario);
		txtDestinatario.setColumns(10);
		
		lblDestinatario = new JLabel("Destinatario");
		lblDestinatario.setForeground(Color.WHITE);
		lblDestinatario.setBounds(40, 75, 109, 15);
		contentPane.add(lblDestinatario);
		
		table = new JTable();
		table.setBounds(40, 104, 464, 149);
		contentPane.add(table);
		
		comboBoxProducto = new JComboBox();
		comboBoxProducto.setBounds(68, 265, 156, 24);
		contentPane.add(comboBoxProducto);
		
		comboBoxCantidad = new JComboBox();
		comboBoxCantidad.setBounds(315, 265, 189, 24);
		contentPane.add(comboBoxCantidad);
		
		txtMonto = new JTextField();
		txtMonto.setBounds(189, 313, 167, 19);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		btnAceptar = new JButton("Enviar");
		btnAceptar.setBounds(40, 354, 89, 25);
		contentPane.add(btnAceptar);
		
		btnModificarSolicitud = new JButton("Aceptar Pedido");
		btnModificarSolicitud.setBounds(190, 354, 167, 25);
		contentPane.add(btnModificarSolicitud);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(387, 354, 117, 25);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Departamento de Ventas");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 425);
	}
}
