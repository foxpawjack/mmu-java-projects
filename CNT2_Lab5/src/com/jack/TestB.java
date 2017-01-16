package com.jack;

import java.awt.EventQueue;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Window;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class TestB {

	private JFrame frmJackNoble;
	private JTextField userInputBox;
	
	int tries = 0;
	int random;
	
	public int codeView = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestB window = new TestB();
					window.frmJackNoble.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TestB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJackNoble = new JFrame();
		frmJackNoble.setResizable(false);
		frmJackNoble.setTitle("Jack Noble | Computer and Network Tech 2 | Lab 5");
		frmJackNoble.setBounds(100, 100, 800, 600);
		frmJackNoble.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJackNoble.getContentPane().setLayout(null);
		
		random = randomGenerator();
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 794, 21);
		frmJackNoble.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				frmJackNoble.dispose();
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnMenu = new JMenu("Menu 2");
		mnMenu.setMnemonic('M');
		menuBar.add(mnMenu);
		
		JMenuItem mntmThisMenuWill = new JMenuItem("This menu will");
		mnMenu.add(mntmThisMenuWill);
		
		JMenu mnProbably = new JMenu("probably");
		mnMenu.add(mnProbably);
		
		JMenuItem mntmNeverBeUsed = new JMenuItem("never be used.");
		mnProbably.add(mntmNeverBeUsed);
		
		JMenu mnAnotherMenu = new JMenu("Another Menu");
		mnAnotherMenu.setMnemonic('A');
		menuBar.add(mnAnotherMenu);
		
		JMenuItem mntmThisOneDefinitely = new JMenuItem("This one definitely wont!");
		mnAnotherMenu.add(mntmThisOneDefinitely);
		
		JLabel lblJackNoble = new JLabel("Jack Noble - CNT2 - Lab 5");
		lblJackNoble.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblJackNoble.setBounds(10, 32, 235, 25);
		frmJackNoble.getContentPane().add(lblJackNoble);
		
		JLabel lblACollectionOf = new JLabel("A collection of programs I have written in the fifth Computer and Network Technology 2 lab.");
		lblACollectionOf.setBounds(246, 41, 523, 14);
		frmJackNoble.getContentPane().add(lblACollectionOf);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 68, 774, 493);
		frmJackNoble.getContentPane().add(tabbedPane);
		
		JPanel gtngTab = new JPanel();
		tabbedPane.addTab("Guess The Number Game", null, gtngTab, null);
		gtngTab.setLayout(null);
		
		JLabel lblGuessTheNumber = new JLabel("Guess The Number Game!");
		lblGuessTheNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGuessTheNumber.setBounds(10, 11, 189, 19);
		gtngTab.add(lblGuessTheNumber);
		
		JLabel lblthissuperAdvanced = new JLabel("<html>This <i>super</i> advanced AI that could possibly rival the likes Watson or Skynet (maybe...) has decided to guess a random number between 0 and 200. Can you guess it?");
		lblthissuperAdvanced.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblthissuperAdvanced.setVerticalAlignment(SwingConstants.TOP);
		lblthissuperAdvanced.setBounds(20, 41, 540, 38);
		gtngTab.add(lblthissuperAdvanced);
		
		JLabel lblEnterYourGuess = new JLabel("Enter Your Guess:");
		lblEnterYourGuess.setBounds(30, 87, 116, 16);
		gtngTab.add(lblEnterYourGuess);
		
		userInputBox = new JTextField();
		userInputBox.setBounds(136, 85, 114, 20);
		gtngTab.add(userInputBox);
		userInputBox.setColumns(10);
		
		JLabel lblGuessLabel = new JLabel("Your Guess Is...");
		lblGuessLabel.setForeground(Color.RED);
		lblGuessLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		lblGuessLabel.setBounds(30, 130, 361, 26);
		gtngTab.add(lblGuessLabel);
		
		JLabel lblNumberOfGuesses = new JLabel("");
		lblNumberOfGuesses.setForeground(Color.BLUE);
		lblNumberOfGuesses.setBounds(30, 154, 727, 16);
		gtngTab.add(lblNumberOfGuesses);
		
		JButton btnConfirmGuess = new JButton("Confirm Guess!");
		btnConfirmGuess.setForeground(Color.DARK_GRAY);
		btnConfirmGuess.setBounds(263, 82, 128, 26);
		gtngTab.add(btnConfirmGuess);
		
		JButton btnReplay = new JButton("Replay");
		btnReplay.setForeground(Color.RED);
		btnReplay.setBounds(403, 82, 98, 26);
		btnReplay.setEnabled(false);
		gtngTab.add(btnReplay);
		
		JLabel lblYayWastedSpace = new JLabel("yay! wasted space!");
		lblYayWastedSpace.setHorizontalAlignment(SwingConstants.RIGHT);
		lblYayWastedSpace.setBounds(641, 437, 116, 16);
		gtngTab.add(lblYayWastedSpace);
		
		JTextArea taGuessHistory = new JTextArea();
		taGuessHistory.setBounds(300, 200, 100, 20)
		gtngTab.add(taGuessHistory);
		
		JButton btnViewGTNGSource = new JButton("View Source");
		btnViewGTNGSource.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				CodeHost windowCode = new CodeHost();
				windowCode.frmCodeHost.setVisible(true);
				codeView = 1;
			}
		});
		btnViewGTNGSource.setBounds(10, 427, 116, 26);
		gtngTab.add(btnViewGTNGSource);
		
		btnConfirmGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int userInput;
				userInput = Integer.parseInt(userInputBox.getText());
				
				if(userInput > random) {
					lblGuessLabel.setText("Your Guess Is TOO HIGH!");
					++tries;
					lblNumberOfGuesses.setText("Attempts at beating me: " + tries);
					userInputBox.setText("");
					taGuessHistory.append(userInput);
				}
				else if(userInput < random) {
					lblGuessLabel.setText("Your Guess Is TOO LOW!");
					++tries;
					lblNumberOfGuesses.setText("Attempts at beating me: " + tries);
					userInputBox.setText("");
				}
				else {
					lblGuessLabel.setText("NO! HOW DID YOU BEAT ME?!");
					++tries;
					lblNumberOfGuesses.setText("It only took you " + tries + " attempts to beat me. Amazing! Bet you can't better that!");
					btnReplay.setEnabled(true);
					btnConfirmGuess.setEnabled(false);
					userInputBox.setText("");
				}
			}
		});
		
		btnReplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tries = 0;
				random = randomGenerator();
				btnReplay.setEnabled(false);
				btnConfirmGuess.setEnabled(true);
				lblGuessLabel.setText("Your Guess Is...");
				lblNumberOfGuesses.setText("");
			}
		});
		
		JPanel prog2tab = new JPanel();
		tabbedPane.addTab("Program 2", null, prog2tab, null);
	}
	
	public int randomGenerator() {
		int random;
		
		Random randomGenerator = new Random();
		random = randomGenerator.nextInt(201);
		System.out.println(random+"");
		return random;
	}
}
