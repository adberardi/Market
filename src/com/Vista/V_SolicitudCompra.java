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
import javax.swing.JButton;
import javax.swing.JComboBox;

public class V_SolicitudCompra extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JLabel lblDestinatario;
	public JLabel lblFechaDeEntrega;
	public JTextField textFielDestinatario;
	public JTextField textFieldFechaEntrega;
	public JTable table;
	public JButton btnCancelar;
	public JComboBox comboBoxCantidad;
	public JTextField txtMontoPresupuesto;
	public JButton btnEnviar;
	public JComboBox comboBoxProducto;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_SolicitudCompra() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 448);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(162, 12, 156, 14);
		contentPane.add(label);
		
		lblFechaDeEntrega = new JLabel("Fecha de Entrega");
		lblFechaDeEntrega.setForeground(Color.WHITE);
		lblFechaDeEntrega.setBounds(64, 43, 141, 15);
		contentPane.add(lblFechaDeEntrega);
		
		lblDestinatario = new JLabel("Destinatario");
		lblDestinatario.setForeground(Color.WHITE);
		lblDestinatario.setBounds(64, 76, 141, 15);
		contentPane.add(lblDestinatario);
		
		textFielDestinatario = new JTextField();
		textFielDestinatario.setBounds(218, 76, 200, 19);
		contentPane.add(textFielDestinatario);
		textFielDestinatario.setColumns(10);
		
		textFieldFechaEntrega = new JTextField();
		textFieldFechaEntrega.setBounds(218, 38, 200, 19);
		contentPane.add(textFieldFechaEntrega);
		textFieldFechaEntrega.setColumns(10);
		
		table = new JTable();
		table.setBounds(64, 123, 354, 139);
		contentPane.add(table);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(74, 359, 117, 25);
		contentPane.add(btnEnviar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(303, 359, 117, 25);
		contentPane.add(btnCancelar);
		
		comboBoxProducto = new JComboBox();
		comboBoxProducto.setBounds(98, 286, 107, 24);
		contentPane.add(comboBoxProducto);
		
		comboBoxCantidad = new JComboBox();
		comboBoxCantidad.setBounds(303, 286, 115, 24);
		contentPane.add(comboBoxCantidad);
		
		txtMontoPresupuesto = new JTextField();
		txtMontoPresupuesto.setText("Monto Presupuesto");
		txtMontoPresupuesto.setBounds(176, 328, 142, 19);
		contentPane.add(txtMontoPresupuesto);
		txtMontoPresupuesto.setColumns(10);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Solicitud de Compra");
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 448);
	}
}
