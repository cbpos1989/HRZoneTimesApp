package com.github.cbpos1989.HeartRateZoneTimes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;

public class HRMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HRMenu frame = new HRMenu("Overall");
					frame.setTitle("Heart Rate Menu");
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
	public HRMenu(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Menu Title
		JLabel lblOverallTime = new JLabel(title + " Time");
		lblOverallTime.setFont(new Font("Candara", Font.PLAIN, 18));
		lblOverallTime.setBounds(10, 11, 128, 32);
		contentPane.add(lblOverallTime);
		
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Candara", Font.PLAIN, 18));
		lblHours.setBounds(10, 54, 64, 32);
		contentPane.add(lblHours);
		
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Candara", Font.PLAIN, 18));
		lblMinutes.setBounds(10, 97, 64, 32);
		contentPane.add(lblMinutes);
		
		JLabel lblSeconds = new JLabel("Seconds");
		lblSeconds.setFont(new Font("Candara", Font.PLAIN, 18));
		lblSeconds.setBounds(10, 147, 64, 32);
		contentPane.add(lblSeconds);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(96, 54, 45, 32);
		contentPane.add(spinner);
		
		
		
		
	}
}
