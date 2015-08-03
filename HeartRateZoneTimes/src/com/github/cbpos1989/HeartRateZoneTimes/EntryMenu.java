package com.github.cbpos1989.HeartRateZoneTimes;


import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntryMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8996761144794331677L;
	private JPanel contentPane;
	private JTextField inZoneTextField;
	private JTextField aboveZoneTextField;
	private JTextField belowZoneTextField;
	private final String DEFAULT_ENTRY_TIME = "00:00:00";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryMenu frame = new EntryMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EntryMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 191);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblEntryMenu = new JLabel("Entry Menu");
		lblEntryMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntryMenu.setFont(new Font("Tunga", Font.BOLD, 18));
		lblEntryMenu.setBounds(121, 11, 196, 32);
		contentPane.add(lblEntryMenu);
		
		//In Zone Label and TextField
		JLabel lblInzoneTime = new JLabel("In-Zone Time");
		lblInzoneTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblInzoneTime.setFont(new Font("Tunga", Font.BOLD, 18));
		lblInzoneTime.setBounds(20, 46, 125, 25);
		contentPane.add(lblInzoneTime);
		
		inZoneTextField = new JTextField();
		inZoneTextField.setHorizontalAlignment(SwingConstants.CENTER);
		inZoneTextField.setBounds(20, 71, 125, 25);
		contentPane.add(inZoneTextField);
		inZoneTextField.setText(DEFAULT_ENTRY_TIME);
		inZoneTextField.setColumns(10);
		
		//Above Zone Label and TextField
		JLabel lblAbovezoneTime = new JLabel("Above-Zone Time");
		lblAbovezoneTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblAbovezoneTime.setFont(new Font("Tunga", Font.BOLD, 18));
		lblAbovezoneTime.setBounds(155, 46, 125, 25);
		contentPane.add(lblAbovezoneTime);
		
		aboveZoneTextField = new JTextField();
		aboveZoneTextField.setHorizontalAlignment(SwingConstants.CENTER);
		aboveZoneTextField.setColumns(10);
		aboveZoneTextField.setBounds(155, 71, 125, 25);
		aboveZoneTextField.setText(DEFAULT_ENTRY_TIME);
		contentPane.add(aboveZoneTextField);
		
		//Below Zone Label and TextField
		JLabel lblBelowzoneTime = new JLabel("Below-Zone Time");
		lblBelowzoneTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblBelowzoneTime.setFont(new Font("Tunga", Font.BOLD, 18));
		lblBelowzoneTime.setBounds(290, 46, 125, 25);
		contentPane.add(lblBelowzoneTime);
		
		belowZoneTextField = new JTextField();
		belowZoneTextField.setHorizontalAlignment(SwingConstants.CENTER);
		belowZoneTextField.setColumns(10);
		belowZoneTextField.setBounds(290, 71, 125, 25);
		belowZoneTextField.setText(DEFAULT_ENTRY_TIME);
		contentPane.add(belowZoneTextField);
		
		JButton btnCommit = new JButton("Commit");
		btnCommit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnCommit.setFont(new Font("Tunga", Font.BOLD, 18));
		btnCommit.setBounds(165, 107, 99, 39);
		contentPane.add(btnCommit);
	}
}
