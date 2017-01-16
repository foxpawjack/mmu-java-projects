package com.jack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jack.TestB;

public class CodeHost {

	JFrame frmCodeHost;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodeHost window = new CodeHost();
					window.frmCodeHost.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CodeHost() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCodeHost = new JFrame();
		frmCodeHost.setTitle("Source Code | CNT2 | Jack Noble");
		frmCodeHost.setResizable(false);
		frmCodeHost.setBounds(100, 100, 800, 600);
		frmCodeHost.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCodeHost.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("Close");
		btnClose.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				frmCodeHost.dispose();
			}
		});
		btnClose.setBounds(10, 538, 89, 23);
		frmCodeHost.getContentPane().add(btnClose);
		
		JTextPane codeWindow = new JTextPane();
		codeWindow.setEditable(false);
		codeWindow.setBounds(10, 11, 774, 516);
		frmCodeHost.getContentPane().add(codeWindow);
	}
}
