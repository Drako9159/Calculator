
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ANTONIO
 */
public class ButtonsFrame extends JFrame{
    private Button number0;
    private Button number1;
    private Button number2;
    private Button number3;
    private Button number4;
    private Button number5;
    private Button number6;
    private Button number7;
    private Button number8;
    private Button number9;
    private Button reset;
    private Button addition;
    private Button subtraction;
    private Button multiplication;
    private Button operation;
    private Button division;
    
    private ListenButton listenButton;
    private JTextField txtKey;
    
    private double item0;
    private double item1;
    private String action;
    
    public ButtonsFrame(){
       
        setTitle("Calculator");
        setSize(380, 440);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        number1 = new Button("1");
        number1.setBounds(20, 60, 80, 80);     
        number2 = new Button("2");
        number2.setBounds(100, 60, 80, 80);      
        number3 = new Button("3");
        number3.setBounds(180, 60, 80, 80);       
        addition = new Button("+");
        addition.setBounds(260, 60, 80, 80);
        number4 = new Button("4");//
        number4.setBounds(20, 140, 80, 80);
        number5 = new Button("5");      
        number5.setBounds(100, 140, 80, 80);
        number6 = new Button("6");
        number6.setBounds(180, 140, 80, 80);
        subtraction = new Button("-");
        subtraction.setBounds(260, 140, 80, 80);
        
        number7 = new Button("7");
        number7.setBounds(20, 220, 80, 80);
        number8 = new Button("8");
        number8.setBounds(100, 220, 80, 80);
        number9 = new Button("9");
        number9.setBounds(180, 220, 80, 80);
        multiplication = new Button("*");
        multiplication.setBounds(260, 220, 80, 80);
        reset = new Button("c");
        reset.setBounds(20, 300, 80, 80);
        number0 = new Button("0");
        number0.setBounds(100, 300, 80, 80);
        operation = new Button("=");
        operation.setBounds(180, 300, 80, 80);
        division = new Button("/");
        division.setBounds(260, 300, 80, 80);
        
        txtKey = new JTextField();
        txtKey.setBounds(20, 5, 320, 40);
        
        getContentPane().add(number1);
        getContentPane().add(number2);
        getContentPane().add(number3);
        getContentPane().add(addition);
        getContentPane().add(number4);
        getContentPane().add(number5);
        getContentPane().add(number6);
        getContentPane().add(subtraction);
        getContentPane().add(number7);
        getContentPane().add(number8);
        getContentPane().add(number9);
        getContentPane().add(multiplication);
        getContentPane().add(reset);
        getContentPane().add(number0);
        getContentPane().add(operation);
        getContentPane().add(division);
        getContentPane().add(txtKey);
       
        listenButton = new ListenButton();
        
        number1.addActionListener(listenButton);
        number2.addActionListener(listenButton);
        number3.addActionListener(listenButton);
        addition.addActionListener(listenButton);
        number4.addActionListener(listenButton);
        number5.addActionListener(listenButton);
        number6.addActionListener(listenButton);
        subtraction.addActionListener(listenButton);
        number7.addActionListener(listenButton);
        number8.addActionListener(listenButton);
        number9.addActionListener(listenButton);
        multiplication.addActionListener(listenButton);
        reset.addActionListener(listenButton);
        number0.addActionListener(listenButton);
        operation.addActionListener(listenButton);
        division.addActionListener(listenButton);
        txtKey.addActionListener(listenButton);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public class ListenButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            
            if(e.getSource() == number1){
                txtKey.setText(txtKey.getText()+"1");
            } if (e.getSource() == number2){
                txtKey.setText(txtKey.getText()+"2");
            } if(e.getSource() == number3){
                txtKey.setText(txtKey.getText()+"3");
            } if (e.getSource() == number4){
                txtKey.setText(txtKey.getText()+"4");
            } if(e.getSource() == number5){
                txtKey.setText(txtKey.getText()+"5");
            } if (e.getSource() == number6){
                txtKey.setText(txtKey.getText()+"6");
            } if(e.getSource() == number7){
                txtKey.setText(txtKey.getText()+"7");
            } if (e.getSource() == number8){
                txtKey.setText(txtKey.getText()+"8");
            } if(e.getSource() == number9){
                txtKey.setText(txtKey.getText()+"9");
            } if (e.getSource() == number0){
                txtKey.setText(txtKey.getText()+"0");
            } 
            //Restablece la calculadora
            if (e.getSource() == reset){
                txtKey.setText("");
            } 
            
            
            if (e.getSource() == addition){
                item0 = Double.parseDouble(txtKey.getText());
                action = "+";
                txtKey.setText("");
            }
            if (e.getSource() == subtraction){
                item0 = Double.parseDouble(txtKey.getText());
                action = "-";
                txtKey.setText("");
            }
            if (e.getSource() == multiplication){
                item0 = Double.parseDouble(txtKey.getText());
                action = "*";
                txtKey.setText("");
            }
            if (e.getSource() == division){
                item0 = Double.parseDouble(txtKey.getText());
                action = "/";
                txtKey.setText("");
            }
            
            if (e.getSource() == operation){
                item1 = Float.parseFloat(txtKey.getText());
                switch(action){
                    case "+": txtKey.setText(Double.toString(item0+item1));
                    break;
                    case "-": txtKey.setText(Double.toString(item0-item1));
                    break;
                    case "/": txtKey.setText(Double.toString(item0/item1));
                    break;
                    case "*": txtKey.setText(Double.toString(item0*item1));
                    break;
                }
            }
        }
    }
}

