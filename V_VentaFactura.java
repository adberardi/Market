package com.Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class V_VentaFactura extends JFrame {

	public JPanel contentPane;
	public JLabel labelPagarConPuntos;
	public JLabel labelTotalPuntos;
	public JButton btnCancelar;
	public JButton btnAgregar;
	public JLabel lblTotalAPagar_1;
	public JLabel lblTotalPu;
	public JTextField textField;
	public JLabel lblTotalAPagar;
	public JCheckBox chckbxNo;
	public JComponent chckbxSi;
	public JLabel lblNewLabel;
	public JLabel lblFormaDePago;
	public JTable table;
	public JLabel lblMarketVenezuela;
	public JLabel lblUsuario;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public V_VentaFactura() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.WHITE);
		lblUsuario.setBounds(29, 36, 46, 14);
		contentPane.add(lblUsuario);
		
		lblMarketVenezuela = new JLabel("Market Venezuela");
		lblMarketVenezuela.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMarketVenezuela.setForeground(Color.WHITE);
		lblMarketVenezuela.setBounds(178, 11, 122, 14);
		contentPane.add(lblMarketVenezuela);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Producto", "Cantidad", "Precio"
			}
		));
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setBounds(49, 61, 243, 195);
		contentPane.add(table);
		
		lblFormaDePago = new JLabel("Forma de Pago:");
		lblFormaDePago.setForeground(Color.WHITE);
		lblFormaDePago.setBounds(323, 61, 85, 14);
		contentPane.add(lblFormaDePago);
		
		lblNewLabel = new JLabel("Desea Canjear  los puntos?");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(323, 164, 131, 14);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxEfectivo = new JCheckBox("Efectivo");
		chckbxEfectivo.setBackground(Color.BLUE);
		chckbxEfectivo.setForeground(Color.WHITE);
		chckbxEfectivo.setBounds(323, 82, 97, 23);
		contentPane.add(chckbxEfectivo);
		
		JCheckBox chckbxCrdito = new JCheckBox("Cr\u00E9dito");
		chckbxCrdito.setBackground(Color.BLUE);
		chckbxCrdito.setForeground(Color.WHITE);
		chckbxCrdito.setBounds(323, 108, 97, 23);
		contentPane.add(chckbxCrdito);
		
		JCheckBox chckbxDbito = new JCheckBox("D\u00E9bito");
		chckbxDbito.setBackground(Color.BLUE);
		chckbxDbito.setForeground(Color.WHITE);
		chckbxDbito.setBounds(323, 134, 97, 23);
		contentPane.add(chckbxDbito);
		
		chckbxSi.setBackground(Color.BLUE);
		chckbxSi.setForeground(Color.WHITE);
		chckbxSi.setBounds(323, 185, 33, 31);
		contentPane.add(chckbxSi);
		
		chckbxNo = new JCheckBox("No");
		chckbxNo.setBackground(Color.BLUE);
		chckbxNo.setForeground(Color.WHITE);
		chckbxNo.setBounds(323, 219, 39, 23);
		contentPane.add(chckbxNo);
		
		lblTotalAPagar = new JLabel("Total a Pagar:");
		lblTotalAPagar.setForeground(Color.WHITE);
		lblTotalAPagar.setBounds(49, 290, 79, 14);
		contentPane.add(lblTotalAPagar);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(127, 287, 165, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblTotalPu = new JLabel("Total Puntos:");
		lblTotalPu.setForeground(Color.WHITE);
		lblTotalPu.setBounds(323, 249, 85, 14);
		contentPane.add(lblTotalPu);
		
		lblTotalAPagar_1 = new JLabel("Total a pagar con puntos:");
		lblTotalAPagar_1.setForeground(Color.WHITE);
		lblTotalAPagar_1.setBounds(323, 275, 142, 14);
		contentPane.add(lblTotalAPagar_1);
		
		btnAgregar = new JButton("Comprar");
		btnAgregar.setBounds(49, 328, 89, 23);
		contentPane.add(btnAgregar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(331, 328, 89, 23);
		contentPane.add(btnCancelar);
		
		labelTotalPuntos = new JLabel("null");
		labelTotalPuntos.setForeground(Color.WHITE);
		labelTotalPuntos.setBounds(399, 249, 46, 14);
		contentPane.add(labelTotalPuntos);
		
		labelPagarConPuntos = new JLabel("null");
		labelPagarConPuntos.setForeground(Color.WHITE);
		labelPagarConPuntos.setBounds(362, 290, 46, 14);
		contentPane.add(labelPagarConPuntos);
	}
	
	public void mostrarVentana(){
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("Factura");
		contentPane.setBackground(Color.BLUE);
		setBounds(100, 100, 491, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
