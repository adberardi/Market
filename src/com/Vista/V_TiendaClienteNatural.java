package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class V_TiendaClienteNatural extends JFrame {

	private JPanel contentPane;
	private JButton btnAtras;
	private JButton btnEditarCliente;
	private JButton btnEliminarCliente;
	private JLabel label;
	private JTable table;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public V_TiendaClienteNatural() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Tienda", "Lugar", "C.I", "Correo Electronico", "Nombre", "Apellido", "Rif", "Registro"
			}
		));
		table.setBounds(41, 36, 533, 225);
		contentPane.add(table);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(246, 11, 122, 14);
		contentPane.add(label);
		
		btnEliminarCliente = new JButton("Eliminar Cliente");
		btnEliminarCliente.setBounds(41, 285, 122, 23);
		contentPane.add(btnEliminarCliente);
		
		btnEditarCliente = new JButton("Editar Cliente");
		btnEditarCliente.setBounds(260, 285, 122, 23);
		contentPane.add(btnEditarCliente);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(485, 285, 89, 23);
		contentPane.add(btnAtras);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Tienda Clientes Naturales");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 624, 347);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
	}

}
