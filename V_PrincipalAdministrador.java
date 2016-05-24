package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class V_PrincipalAdministrador extends JFrame {

	public JPanel contentPane;
	public JButton btnRegresar;
	public JButton btnNewButton_2;
	public JButton btnClienteNatural;
	public JButton btnNewButton_1;
	public JButton btnSolicitudes;
	public JButton btnNewButton;
	public JButton btnInventario;
	public JButton btnVentas;
	public JButton btnTienda;
	public JLabel label;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_PrincipalAdministrador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(165, 11, 122, 14);
		contentPane.add(label);
		
		btnTienda = new JButton("Tienda");
		btnTienda.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/TiendaIcon.png")));
		btnTienda.setBounds(38, 53, 167, 57);
		contentPane.add(btnTienda);
		
		btnVentas = new JButton("Ventas");
		btnVentas.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/VentaIcono.png")));
		btnVentas.setBounds(250, 53, 161, 57);
		contentPane.add(btnVentas);
		
		btnInventario = new JButton("Inventario");
		btnInventario.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/InventarioIcono.png")));
		btnInventario.setBounds(38, 256, 167, 57);
		contentPane.add(btnInventario);
		
		btnNewButton = new JButton("Empleados");
		btnNewButton.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/EmpleadoIcono.png")));
		btnNewButton.setBounds(38, 152, 167, 57);
		contentPane.add(btnNewButton);
		
		btnSolicitudes = new JButton("Solicitudes");
		btnSolicitudes.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/LibroIcono.png")));
		btnSolicitudes.setBounds(250, 152, 161, 57);
		contentPane.add(btnSolicitudes);
		
		btnNewButton_1 = new JButton("Revista Dominical");
		btnNewButton_1.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/IconoPapel.png")));
		btnNewButton_1.setBounds(250, 256, 161, 57);
		contentPane.add(btnNewButton_1);
		
		btnClienteNatural = new JButton("Cliente Natural");
		btnClienteNatural.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/NaturalIcono.png")));
		btnClienteNatural.setBounds(38, 355, 167, 57);
		contentPane.add(btnClienteNatural);
		
		btnNewButton_2 = new JButton("Cliente Jur\u00EDdico");
		btnNewButton_2.setIcon(new ImageIcon(V_PrincipalAdministrador.class.getResource("/Imagenes/JuridicoIcono.png")));
		btnNewButton_2.setBounds(250, 355, 161, 57);
		contentPane.add(btnNewButton_2);
		
		btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(182, 453, 89, 23);
		contentPane.add(btnRegresar);
		setBounds(100, 100, 450, 535);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mostrarVentana (){
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Principal Administrador");
		setResizable(false);
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(null);
	}

}
