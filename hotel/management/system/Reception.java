package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;

    Reception(){
        b1 = new JButton("New Customer Form");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10,30,200,30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(10,80,200,30);
        b2.addActionListener(this);
        add(b2);

        b4 = new JButton("Employee Info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(10,130,200,30);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton("Customer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(10,180,200,30);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton("Manager Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(10,230,200,30);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(10,280,200,30);
        b7.addActionListener(this);
        add(b7);

        b8 = new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(10,330,200,30);
        b8.addActionListener(this);
        add(b8);

        b9 = new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(10,380,200,30);
        b9.addActionListener(this);
        add(b9);

        b11 = new JButton("Logout");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(10,430,200,30);
        b11.addActionListener(this);
        add(b11);


        setLayout(null);
        setBounds(500,200,800,570);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/images/icons/fourth.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(250,30,500,470);
        add(l1);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            new AddCustomer().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b2){
            new Room().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b4){
            new EmployeeInfo().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b5){
            new CustomerInfo().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b6){
            new ManagerInfo().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b7){
            new CheckOut().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b8){
            new UpdateCheck().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b9){
            new UpdateRoom().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b11){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Reception().setVisible(true);
    }
}
