package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class V_EditarPersonaJuridica extends JFrame {

	public JPanel contentPane;
	public JTextField txtNombre;
	public JTextField txtApellido;
	public JTextField txtTelefono;
	public JTextField txtTelefono_1;
	public JTextField txtDenominacinComercial;
	public JTextField txtRazonComercial;
	public JTextField txtPaginaWeb;
	public JTextField txtCapital;
	public JTextField txtContacto;
	public JButton btnCancelar;
	public JButton btnEditar;
	public JLabel lblContactoActual;
	public JLabel lblCapitalActual;
	public JLabel lblPaginaWeb;
	public JLabel lblRazonComercial;
	public JLabel lblDenominacionComercial;
	public JLabel lblRifActual;
	public JLabel lblNewLabel;
	public JLabel lblApellidoActual;
	public JLabel lblNombreActual;
	public JLabel lblDatosActuales;
	public JLabel label;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_EditarPersonaJuridica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); mostrarVentana();
		setContentPane(contentPane);
		
		
		
		label = new JLabel("Market Venezuela");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(173, 11, 122, 14);
		contentPane.add(label);
		
		lblDatosActuales = new JLabel("Datos Actuales:");
		lblDatosActuales.setForeground(Color.WHITE);
		lblDatosActuales.setBounds(31, 39, 101, 14);
		contentPane.add(lblDatosActuales);
		
		lblNombreActual = new JLabel("Nombre Actual");
		lblNombreActual.setForeground(Color.WHITE);
		lblNombreActual.setBounds(31, 70, 101, 14);
		contentPane.add(lblNombreActual);
		
		txtNombre = new JTextField();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(290, 67, 122, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblApellidoActual = new JLabel("Apellido Actual");
		lblApellidoActual.setForeground(Color.WHITE);
		lblApellidoActual.setBounds(31, 112, 101, 14);
		contentPane.add(lblApellidoActual);
		
		txtApellido = new JTextField();
		txtApellido.setText("Apellido");
		txtApellido.setBounds(290, 109, 122, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblNewLabel = new JLabel("Telefono Actual");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(31, 151, 101, 14);
		contentPane.add(lblNewLabel);
		
		txtTelefono = new JTextField();
		txtTelefono.setText("Telefono");
		txtTelefono.setBounds(290, 148, 122, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		lblRifActual = new JLabel("Rif Actual");
		lblRifActual.setForeground(Color.WHITE);
		lblRifActual.setBounds(31, 189, 101, 14);
		contentPane.add(lblRifActual);
		
		txtTelefono_1 = new JTextField();
		txtTelefono_1.setText("Rif");
		txtTelefono_1.setBounds(290, 186, 122, 20);
		contentPane.add(txtTelefono_1);
		txtTelefono_1.setColumns(10);
		
		lblDenominacionComercial = new JLabel("Denominacion Comercial");
		lblDenominacionComercial.setForeground(Color.WHITE);
		lblDenominacionComercial.setBounds(31, 228, 137, 14);
		contentPane.add(lblDenominacionComercial);
		
		txtDenominacinComercial = new JTextField();
		txtDenominacinComercial.setText("Denominaci\u00F3n Comercial");
		txtDenominacinComercial.setBounds(290, 225, 122, 20);
		contentPane.add(txtDenominacinComercial);
		txtDenominacinComercial.setColumns(10);
		
		lblRazonComercial = new JLabel("Razon Comercial");
		lblRazonComercial.setForeground(Color.WHITE);
		lblRazonComercial.setBounds(31, 265, 114, 14);
		contentPane.add(lblRazonComercial);
		
		txtRazonComercial = new JTextField();
		txtRazonComercial.setText("Razon Comercial");
		txtRazonComercial.setBounds(290, 262, 122, 20);
		contentPane.add(txtRazonComercial);
		txtRazonComercial.setColumns(10);
		
		lblPaginaWeb = new JLabel("Pagina Web Actual");
		lblPaginaWeb.setForeground(Color.WHITE);
		lblPaginaWeb.setBounds(31, 307, 101, 14);
		contentPane.add(lblPaginaWeb);
		
		txtPaginaWeb = new JTextField();
		txtPaginaWeb.setText("Pagina Web");
		txtPaginaWeb.setBounds(288, 304, 124, 20);
		contentPane.add(txtPaginaWeb);
		txtPaginaWeb.setColumns(10);
		
		lblCapitalActual = new JLabel("Capital Actual");
		lblCapitalActual.setForeground(Color.WHITE);
		lblCapitalActual.setBounds(31, 347, 101, 14);
		contentPane.add(lblCapitalActual);
		
		txtCapital = new JTextField();
		txtCapital.setText("Capital");
		txtCapital.setBounds(290, 344, 122, 20);
		contentPane.add(txtCapital);
		txtCapital.setColumns(10);
		
		lblContactoActual = new JLabel("Contacto Actual");
		lblContactoActual.setForeground(Color.WHITE);
		lblContactoActual.setBounds(31, 386, 101, 14);
		contentPane.add(lblContactoActual);
		
		txtContacto = new JTextField();
		txtContacto.setText("Contacto");
		txtContacto.setBounds(290, 383, 122, 20);
		contentPane.add(txtContacto);
		txtContacto.setColumns(10);
		
		btnEditar = new JButton("Editar");
		btnEditar.setBounds(31, 421, 89, 23);
		contentPane.add(btnEditar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(323, 421, 89, 23);
		contentPane.add(btnCancelar);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setTitle("Editar Persona Juridica");
		setResizable(false);
		getContentPane().setBackground(Color.BLUE);
		setBounds(100, 100, 450, 496);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
	}

}
