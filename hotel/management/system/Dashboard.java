package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3;

    public Dashboard(){
        mb = new JMenuBar();
        add(mb);
        m1 = new JMenu("HOTEL MANAGEMENT");
        mb.add(m1);

        m2 = new JMenu("ADMIN");
        mb.add(m2);

        i1 = new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);

        i2 = new JMenuItem("ADD EMPLOYEES");
        i2.addActionListener(this);
        m2.add(i2);

        i3 = new JMenuItem("ADD ROOMS");
        i3.addActionListener(this);
        m2.add(i3);

        mb.setBounds(0,0,1950,30);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/images/icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1950, 1000);
        add(l1);

        JLabel l2 = new JLabel("J W MARRIOTT WELCOMES YOU");
        l2.setBounds(360,-350,1950,1000);
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("Tahoma",Font.BOLD,50));
        l1.add(l2);

        setLayout(null);
        setBounds(0,0,1950,1020);
        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD EMPLOYEES")){
            new AddEmployee().setVisible(true);
        }else if(ae.getActionCommand().equals("ADD ROOMS")){
            new AddRooms().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
}
