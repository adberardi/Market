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

public class V_Inventario extends JFrame {

	public JPanel contentPane;
	public JButton btnAtras;
	public JButton btnSolicitar;
	public JButton btnEditarInventario;
	public JButton btnEliminarInventario;
	public JTable table;
	public JLabel label;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_Inventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));mostrarVentana();
		setContentPane(contentPane);
		
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(230, 11, 122, 14);
		contentPane.add(label);
		
		table = new JTable();
		table.setBounds(27, 36, 542, 169);
		contentPane.add(table);
		
		btnEliminarInventario = new JButton("Eliminar Inventario");
		btnEliminarInventario.setBounds(27, 238, 150, 23);
		contentPane.add(btnEliminarInventario);
		
		btnEditarInventario = new JButton("Modificar Inventario");
		btnEditarInventario.setBounds(202, 238, 150, 23);
		contentPane.add(btnEditarInventario);
		
		btnSolicitar = new JButton("Solicitar");
		btnSolicitar.setBounds(364, 238, 89, 23);
		contentPane.add(btnSolicitar);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(480, 238, 89, 23);
		contentPane.add(btnAtras);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Inventario");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane.setLayout(null);
	}

}
