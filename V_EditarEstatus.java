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
import javax.swing.border.EmptyBorder;

public class V_EditarEstatus extends JFrame {

	public JPanel contentPane;
	public JLabel label;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JComboBox comboBoxEstatus;
	public JButton btnEditar;
	public JLabel labelProductoActual;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_EditarEstatus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(161, 11, 122, 14);
		contentPane.add(label);
		
		lblNewLabel = new JLabel("Datos Actuales");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(108, 61, 72, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Estatus:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(108, 120, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		comboBoxEstatus = new JComboBox();
		comboBoxEstatus.setBounds(249, 117, 72, 20);
		contentPane.add(comboBoxEstatus);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(183, 172, 89, 23);
		contentPane.add(btnEditar);
		
		labelProductoActual = new JLabel("New label");
		labelProductoActual.setForeground(Color.WHITE);
		labelProductoActual.setBounds(249, 61, 46, 14);
		contentPane.add(labelProductoActual);
		setBounds(100, 100, 450, 251);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setTitle("Editar Estatus");
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(null);
	}

}
