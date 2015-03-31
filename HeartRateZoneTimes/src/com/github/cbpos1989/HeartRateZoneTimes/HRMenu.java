package com.github.cbpos1989.HeartRateZoneTimes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HRMenu extends JFrame  {

	private JPanel contentPane;
	private int total;
	private static boolean menuEnabled = false;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */
	public HRMenu(String title) {
		menuEnabled = true;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		//Menu Title
		JLabel menuLabel = new JLabel(title + " Time");
		menuLabel.setFont(new Font("Candara", Font.PLAIN, 18));
		menuLabel.setBounds(10, 11, 128, 32);
		contentPane.add(menuLabel);
		
		//Hours
		JLabel lblHours = new JLabel("Hours");
		lblHours.setFont(new Font("Candara", Font.PLAIN, 18));
		lblHours.setBounds(10, 54, 64, 32);
		contentPane.add(lblHours);
		
		JSpinner hourSpinner = new JSpinner( new SpinnerNumberModel( 0,0,24,1 ));
		hourSpinner.setBounds(96, 54, 45, 32);
		contentPane.add(hourSpinner);
		
		//Minutes
		JLabel lblMinutes = new JLabel("Minutes");
		lblMinutes.setFont(new Font("Candara", Font.PLAIN, 18));
		lblMinutes.setBounds(10, 97, 64, 32);
		contentPane.add(lblMinutes);
		
		JSpinner minuteSpinner = new JSpinner(new SpinnerNumberModel(0,0,60,1));
		minuteSpinner.setBounds(96, 97, 45, 32);
		contentPane.add(minuteSpinner);
		
		//Seconds
		JLabel lblSeconds = new JLabel("Seconds");
		lblSeconds.setFont(new Font("Candara", Font.PLAIN, 18));
		lblSeconds.setBounds(10, 147, 64, 32);
		contentPane.add(lblSeconds);
		
		JSpinner secondSpinner = new JSpinner(new SpinnerNumberModel(0,0,60,1));
		secondSpinner.setBounds(96, 147, 45, 32);
		contentPane.add(secondSpinner);
		
		JButton btnCommit = new JButton("Commit");
		btnCommit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int hours = (Integer)hourSpinner.getValue();
				int mins = (Integer)minuteSpinner.getValue();
				int secs = (Integer)secondSpinner.getValue();
				
				total = new HRCalculator().calculateUserInput(hours, mins, secs);
				//setVisible(false);
				
				menuEnabled = false;
			}
		});
		btnCommit.setBounds(20, 190, 118, 32);
		contentPane.add(btnCommit);
		
	}
	
	public int getTotal(){
		return total;
	}
	
	public boolean isMenuEnabled(){
		return menuEnabled;
	}
	
}
