package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class V_BandejaPrincipalCliente extends JFrame {

	public JPanel contentPane;
	public JComboBox comboBoxBuscar;
	public JTextField txtBuscar;
	public JLabel label;
	public JButton btnNewButton;
	public JButton btnComprar;
	public JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_BandejaPrincipalCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.blue);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Fecha", "Asunto", "Destinatario"
			}
		));
		table.setBounds(24, 63, 398, 163);
		contentPane.add(table);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(34, 238, 130, 23);
		contentPane.add(btnComprar);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(300, 238, 122, 23);
		contentPane.add(btnNewButton);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(149, 12, 156, 14);
		contentPane.add(label);
		
		txtBuscar = new JTextField();
		txtBuscar.setText("Buscar Correo");
		txtBuscar.setBounds(51, 32, 86, 20);
		contentPane.add(txtBuscar);
		txtBuscar.setColumns(10);
		
		comboBoxBuscar = new JComboBox();
		comboBoxBuscar.setBounds(301, 32, 99, 20);
		contentPane.add(comboBoxBuscar);
	}

}
