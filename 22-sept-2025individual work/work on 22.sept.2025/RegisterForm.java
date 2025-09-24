package com.registerform;



	/**
	 * @param args
	 */
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class RegisterForm extends JFrame implements ActionListener {
	    // Labels
	    JLabel nameLabel = new JLabel("Names");
	    JLabel usernameLabel = new JLabel("UserName");
	    JLabel passwordLabel = new JLabel("Password");

	    // Text fields
	    JTextField nameField = new JTextField();
	    JTextField usernameField = new JTextField();
	    JPasswordField passwordField = new JPasswordField();

	    // Buttons
	    JButton registerButton = new JButton("Register");
	    JButton resetButton = new JButton("Reset");

	    public RegisterForm() {
	        setTitle("Registration Form");
	        setSize(400, 250);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLayout(new GridLayout(4, 2, 10, 10));

	        // Add components
	        add(nameLabel);
	        add(nameField);

	        add(usernameLabel);
	        add(usernameField);

	        add(passwordLabel);
	        add(passwordField);

	        add(registerButton);
	        add(resetButton);

	        // Add action listeners
	        registerButton.addActionListener(this);
	        resetButton.addActionListener(this);

	        setLocationRelativeTo(null); // center window
	        setVisible(true);
	    }

	    
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == registerButton) {
	            String name = nameField.getText();
	            String username = usernameField.getText();
	            String password = new String(passwordField.getPassword());

	            if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
	                JOptionPane.showMessageDialog(this, "All fields are required!");
	            } else {
	                JOptionPane.showMessageDialog(this, 
	                    "Registration Successful!\n" +
	                    "Name: " + name + "\n" +
	                    "Username: " + username);
	            }
	        } else if (e.getSource() == resetButton) {
	            nameField.setText("");
	            usernameField.setText("");
	            passwordField.setText("");
	        }
	    }


	}


