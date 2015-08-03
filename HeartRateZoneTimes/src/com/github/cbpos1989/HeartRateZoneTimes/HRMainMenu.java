package com.github.cbpos1989.HeartRateZoneTimes;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class HRMainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3120959686516249571L;
	private JPanel contentPane;
	private final JScrollPane scrollPane;
	private JList<Entry> list = new JList<Entry>();

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HRMainMenu frame = new HRMainMenu();
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
	public HRMainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblHeartRateApp = new JLabel("Heart Rate App Main Menu");
		lblHeartRateApp.setFont(new Font("Tunga", Font.BOLD, 18));
		lblHeartRateApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblHeartRateApp.setBounds(114, 11, 196, 32);
		contentPane.add(lblHeartRateApp);
	
		final JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(10, 11, 402, 240);
		textPane.setEditable(false);
	
		scrollPane = new JScrollPane(textPane);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 50, 450, 425);
		contentPane.add(scrollPane);
		
	
		
		JButton btnAddNewEntry = new JButton("Add New Entry");
		btnAddNewEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO Create new GUI to allow users to enter heart rate times.
				HRMenu hrm = new HRMenu("In-Zone");
				hrm.setVisible(true);
			}
		});
		btnAddNewEntry.setMargin(new Insets(2, 4, 2, 4));
		btnAddNewEntry.setFont(new Font("Calibri", Font.BOLD, 14));
		btnAddNewEntry.setBounds(480, 61, 115, 35);
		contentPane.add(btnAddNewEntry);
		
		JButton btnEditSelected = new JButton("Edit Selected");
		btnEditSelected.setMargin(new Insets(2, 4, 2, 4));
		btnEditSelected.setFont(new Font("Calibri", Font.BOLD, 14));
		btnEditSelected.setBounds(480, 124, 115, 35);
		contentPane.add(btnEditSelected);
		
		JButton btnRemoveSelected = new JButton("Remove Selected");
		btnRemoveSelected.setMargin(new Insets(2, 4, 2, 4));
		btnRemoveSelected.setFont(new Font("Calibri", Font.BOLD, 14));
		btnRemoveSelected.setBounds(480, 170, 115, 35);
		contentPane.add(btnRemoveSelected);
		
		
	
	}
}
