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
import javax.swing.JTextPane;

public class V_Tiendas extends JFrame {

	public JPanel contentPane;
	public JComboBox comboBoxBuscar;
	public JLabel label;
	public JButton btnEliminar;
	public JButton btnAgregar;
	public JTable table;
	public JButton btnAtras;
	public JButton btnEditarTienda;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_Tiendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 431);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Lugar"
			}
		));
		table.setBounds(24, 80, 715, 207);
		contentPane.add(table);
		
		btnAgregar = new JButton("Agregar Tienda");
		btnAgregar.setBounds(41, 345, 156, 23);
		contentPane.add(btnAgregar);
		
		btnEliminar = new JButton("Eliminar Tienda");
		btnEliminar.setBounds(235, 345, 156, 23);
		contentPane.add(btnEliminar);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(378, 12, 156, 14);
		contentPane.add(label);
		
		comboBoxBuscar = new JComboBox();
		comboBoxBuscar.setBounds(24, 34, 154, 20);
		contentPane.add(comboBoxBuscar);
		
		btnEditarTienda = new JButton("Editar Tienda");
		btnEditarTienda.setBounds(427, 344, 140, 25);
		contentPane.add(btnEditarTienda);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(602, 344, 117, 25);
		contentPane.add(btnAtras);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setTitle("Tienda");
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 431);
	}
}
