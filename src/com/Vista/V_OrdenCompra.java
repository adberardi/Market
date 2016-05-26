package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_OrdenCompra extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JComboBox comboBox_1;
	public JTable table;
	public JButton btnCancelar;
	public JButton btnEnviar;
	public JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_OrdenCompra() {
		setTitle("Orden de Compra");
		setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 379);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(214, 12, 156, 14);
		contentPane.add(label);
		
		comboBox = new JComboBox();
		comboBox.setBounds(55, 55, 146, 24);
		contentPane.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(343, 55, 156, 24);
		contentPane.add(comboBox_1);
		
		table = new JTable();
		table.setBounds(55, 98, 444, 180);
		contentPane.add(table);
		
		btnEnviar = new JButton("Confirmar");
		btnEnviar.setBounds(104, 300, 117, 25);
		contentPane.add(btnEnviar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(343, 300, 117, 25);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Orden de Compra");
		setResizable(false);
		contentPane.setBackground(Color.blue);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 379);
	}
}
