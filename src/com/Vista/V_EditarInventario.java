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
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class V_EditarInventario extends JFrame {

	public JPanel contentPane;
	public JTextField txtEspacioDisponibleEn;
	public JButton btnNewButton;
	public JLabel lblCantidad;
	public JLabel lblNewLabel;
	public JLabel lblNombreTienda;
	public JLabel lblDatosActuales;
	public JLabel label;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public V_EditarInventario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(163, 23, 122, 14);
		contentPane.add(label);
		
		lblDatosActuales = new JLabel("Datos Actuales");
		lblDatosActuales.setForeground(Color.WHITE);
		lblDatosActuales.setBounds(71, 74, 89, 14);
		contentPane.add(lblDatosActuales);
		
		lblNombreTienda = new JLabel("Nombre Tienda");
		lblNombreTienda.setForeground(Color.WHITE);
		lblNombreTienda.setBounds(305, 74, 89, 14);
		contentPane.add(lblNombreTienda);
		
		lblNewLabel = new JLabel("Espacio Disponible en Inventario:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(71, 128, 196, 14);
		contentPane.add(lblNewLabel);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setBounds(305, 128, 67, 14);
		contentPane.add(lblCantidad);
		
		btnNewButton = new JButton("Editar");
		btnNewButton.setBounds(71, 222, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(283, 222, 89, 23);
		contentPane.add(btnCancelar);
		
		txtEspacioDisponibleEn = new JTextField();
		txtEspacioDisponibleEn.setText("Espacio Disponible en el Inventario");
		txtEspacioDisponibleEn.setBounds(71, 174, 301, 20);
		contentPane.add(txtEspacioDisponibleEn);
		txtEspacioDisponibleEn.setColumns(10);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		contentPane.setForeground(Color.WHITE);
		setTitle("Editar Inventario");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(null);
	}

}
