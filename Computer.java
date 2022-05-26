import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Computer extends JFrame {
    private JLabel tfIPAddress;
    private JTextField textField1;
    private JLabel tfValue;
    private JTextField textField2;
    private JButton addbutton;
    private JButton showComputersButton;
    private JButton clearButton;
    private JButton exitAppButton;
    private JLabel tfComputerLab;
    private JLabel lbLabApp;
    private JPanel mainPanel;
    private JTable table1;

    public Computer(){
        setContentPane(mainPanel);
        setTitle("Lab App");
        setSize(20,30);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String IPAddres = tfIPAddress.getText();
               String Value = tfValue.getText();
               lbLabApp.setText("lab App"+ "IPAddress " + " "+ Value );
            }
        });
    }
    public static void main (String[] args){
        Computer myComputer = new Computer();
    }
}
