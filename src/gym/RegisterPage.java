package gym;

import javax.swing.*;
import java.awt.*;

public class RegisterPage extends JFrame {
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JRadioButton customer, trainer, male, female, others;
    private JButton registerButton;

    public RegisterPage() {
        super("register");
        setSize(1000,800);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel lblNewUserRegister = new JLabel("New User Register");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblNewUserRegister, gbc);
        gbc.gridy = 1;
        gbc.gridx = 0;
        add(lblName, gbc);
//        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 2;
        gbc.gridx = 0;
        add(lblNewLabel, gbc);
//        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 3;
        gbc.gridx = 0;
        add(lblEmailAddress, gbc);
//        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
//        contentPane.add(firstname);
        firstname.setColumns(10);
        gbc.gridy = 1;
        gbc.gridx = 1;
        add(firstname, gbc);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
//        contentPane.add(lastname);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(lastname, gbc);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
//        contentPane.add(email);
        gbc.gridy = 3;
        gbc.gridx = 1;
        add(email, gbc);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setColumns(10);
        gbc.gridy = 4;
        gbc.gridx = 1;
        add(username, gbc);
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 4;
        gbc.gridx = 0;
        add(lblUsername, gbc);
//        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 5;
        gbc.gridx = 0;
        add(lblPassword, gbc);
//        contentPane.add(lblPassword);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        gbc.gridy = 5;
        gbc.gridx = 1;
        passwordField.setColumns(10);
        add(passwordField, gbc);
        JLabel lblMobileNumber = new JLabel("Mobile number");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 6;
        gbc.gridx = 0;
        add(lblMobileNumber, gbc);
//        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        gbc.gridy = 6;
        gbc.gridx = 1;
        add(mob, gbc);
//        contentPane.add(mob);
        mob.setColumns(10);
        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 7;
        gbc.gridx = 0;
        add(gender, gbc);
        male = new JRadioButton("Male");
        gbc.gridy = 7;
        gbc.gridx = 1;
        add(male, gbc);
        female = new JRadioButton("Female");
        gbc.gridy = 7;
        gbc.gridx = 2;
        add(female, gbc);
        JLabel customerLabel = new JLabel("User Type");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gbc.gridy = 8;
        gbc.gridx = 0;
        add(customerLabel, gbc);
        customer = new JRadioButton("customer");
        gbc.gridy = 8;
        gbc.gridx = 1;
        add(customer, gbc);
        trainer = new JRadioButton("Trainer");
        gbc.gridy = 8;
        gbc.gridx = 2;
        add(trainer, gbc);
        registerButton = new JButton("Register");
        gbc.gridy = 9;
        gbc.gridx = 1;
        add(registerButton, gbc);
//        contentPane.add(passwordField);


    }

    public static void main(String[] args) {
        RegisterPage obj = new RegisterPage();
    }


}
