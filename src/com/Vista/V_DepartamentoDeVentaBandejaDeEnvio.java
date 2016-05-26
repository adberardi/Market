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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class V_DepartamentoDeVentaBandejaDeEnvio extends JFrame {

	public JPanel contentPane;
	public JButton btnNewButton;
	public JButton btnResponder;
	public JTable table;
	public JTextField textField_1;
	public JLabel label;
	public JTextField textField;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_DepartamentoDeVentaBandejaDeEnvio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setBounds(63, 43, 323, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(161, 11, 122, 14);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 74, 323, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		table = new JTable();
		table.setBounds(63, 115, 323, 116);
		contentPane.add(table);
		
		btnResponder = new JButton("Responder");
		btnResponder.setBounds(63, 242, 89, 23);
		contentPane.add(btnResponder);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(5, 5, 440, 290);
		contentPane.add(btnNewButton);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setTitle("Departamento de Ventas");
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(null);
	}

}
