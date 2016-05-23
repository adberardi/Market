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
import com.Controlador.C_BandejaDeEntradaPedidos;

public class V_BandejaDeEntradaPedidos extends JFrame {

	public JPanel contentPane;
	public JTextField txtBuscar;
	public JTable table;
	public JComboBox comboBoxBuscar;
	public JLabel label;
	public Component btnNewButton;
	public Component btnComprar;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_BandejaDeEntradaPedidos() {
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
				"Fecha", "Asunto", "Destinatario"
			}
		));
		table.setBounds(51, 63, 349, 163);
		contentPane.add(table);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(61, 238, 89, 23);
		contentPane.add(btnComprar);
		
		btnNewButton = new JButton("Cancelar");
		btnNewButton.setBounds(301, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(160, 11, 122, 14);
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
	
	public void mostrarVentana(){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Bandeja de Entrada de Pedidos");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setControlador(C_BandejaDeEntradaPedidos c){
		//btnComprar.addActionListener(c);// Se debe crear la clase a usar
	}

}
