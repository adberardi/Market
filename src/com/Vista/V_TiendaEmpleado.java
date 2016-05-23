package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class V_TiendaEmpleado extends JFrame {

	public JPanel contentPane;
	public JButton btnAtras;
	public JButton btnEliminarEmpleado;
	public JButton btnEditarEmpleado;
	public JComboBox comboBox;
	public JLabel label;
	public JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_TiendaEmpleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"C.I", "Nombre", "Apellido", "Rif", "Telefono", "Registro", "Salario", "Beneficio"
			}
		));
		table.setBounds(35, 69, 501, 167);
		contentPane.add(table);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(212, 11, 122, 14);
		contentPane.add(label);
		
		comboBox = new JComboBox();
		comboBox.setBounds(35, 38, 122, 20);
		contentPane.add(comboBox);
		
		btnEditarEmpleado = new JButton("Editar Empleado");
		btnEditarEmpleado.setBounds(35, 273, 109, 23);
		contentPane.add(btnEditarEmpleado);
		
		btnEliminarEmpleado = new JButton("Eliminar Empleado");
		btnEliminarEmpleado.setBounds(233, 273, 117, 23);
		contentPane.add(btnEliminarEmpleado);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(447, 273, 89, 23);
		contentPane.add(btnAtras);
		
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.BLUE);
		setTitle("Tienda Empleado");
		setResizable(false);
		setBounds(100, 100, 576, 335);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
