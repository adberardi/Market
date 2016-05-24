package com.Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class V_Principal extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMarketVenezuela = new JLabel("Market Venezuela");
		lblMarketVenezuela.setForeground(Color.WHITE);
		lblMarketVenezuela.setBackground(Color.WHITE);
		lblMarketVenezuela.setBounds(156, 12, 147, 15);
		contentPane.add(lblMarketVenezuela);
	}
}
