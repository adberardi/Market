package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class V_TiendaVenta extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JComboBox comboBoxProducto;
	public JComboBox comboBoxTienda;
	public JButton btnContinuar;
	public JTable table;
	public JButton btnAtras;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_TiendaVenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));mostrarVentana();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Lugar", "Producto", "Cantidad", "Total"
			}
		));
		table.setBounds(45, 62, 347, 152);
		contentPane.add(table);
		
		btnContinuar = new JButton("Consultar");
		btnContinuar.setBounds(45, 225, 89, 23);
		contentPane.add(btnContinuar);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(303, 225, 89, 23);
		contentPane.add(btnAtras);
		
		comboBoxTienda = new JComboBox();
		comboBoxTienda.setBounds(45, 31, 89, 20);
		contentPane.add(comboBoxTienda);
		
		comboBoxProducto = new JComboBox();
		comboBoxProducto.setBounds(183, 31, 89, 20);
		contentPane.add(comboBoxProducto);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(183, 6, 122, 14);
		contentPane.add(label);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Tienda Venta");
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
