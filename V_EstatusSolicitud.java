package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class V_EstatusSolicitud extends JFrame {

	public JPanel contentPane;
	public JTable table;
	public JButton btnNewButton;
	public JLabel label;
	public JButton btnRegresar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_EstatusSolicitud() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Marca", "Producto", "Proveedor", "Cantidad", "Estatus"
			}
		));
		table.setBounds(47, 36, 421, 175);
		contentPane.add(table);
		
		btnNewButton = new JButton("Modificar Estatus");
		btnNewButton.setBounds(57, 222, 115, 23);
		contentPane.add(btnNewButton);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(369, 222, 89, 23);
		contentPane.add(btnRegresar);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(205, 11, 122, 14);
		contentPane.add(label);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Estatus Solicitud");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 524, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
	}

}
