package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class RemoveEmployee extends JFrame implements ActionListener {
    Choice choiceempid;

    JButton delete,back;
    RemoveEmployee(){

        JLabel label=new JLabel("Employee ID");
        label.setBounds(50,50,100,30);
        label.setFont(new Font("Tahoma",Font.BOLD,15));
        add(label);

        choiceempid=new Choice();
        choiceempid.setBounds(200,55,150,30);
        add(choiceempid);

        try {
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from employee");
            while(resultSet.next()){
                choiceempid.add(resultSet.getString("empID"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel labelName=new JLabel("Name");
        labelName.setBounds(50,100,100,30);
        labelName.setFont(new Font("Tahoma",Font.BOLD,15));
        add(labelName);

        JLabel textname=new JLabel();
        textname.setBounds(200,100,100,30);
        add(textname);

        JLabel labelPhone=new JLabel("Phone");
        labelPhone.setBounds(50,150,100,30);
        labelPhone.setFont(new Font("Tahoma",Font.BOLD,15));
        add(labelPhone);

        JLabel textphone=new JLabel();
        textphone.setBounds(200,150,100,30);
        add(textphone);

        JLabel labelemail=new JLabel("Email");
        labelemail.setBounds(50,200,100,30);
        labelemail.setFont(new Font("Tahoma",Font.BOLD,15));
        add(labelemail);

        JLabel textemail=new JLabel();
        textemail.setBounds(200,200,100,30);
        add(textemail);

        try {
            Conn c=new Conn();
            ResultSet resultSet=c.statement.executeQuery("select * from employee where empID ='"+choiceempid.getSelectedItem()+"'");
            while(resultSet.next()){
                textname.setText(resultSet.getString("name"));
                textphone.setText(resultSet.getString("phone"));
                textemail.setText(resultSet.getString("email"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        choiceempid.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                try {
                    Conn c=new Conn();
                    ResultSet resultSet=c.statement.executeQuery("select * from employee where empID ='"+choiceempid.getSelectedItem()+"'");
                    while(resultSet.next()) {
                        textname.setText(resultSet.getString("name"));
                        textphone.setText(resultSet.getString("phone"));
                        textemail.setText(resultSet.getString("email"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

            delete=new JButton("Delete");
            delete.setBounds(80,300,100,30);
            delete.setBackground(Color.BLACK);
            delete.setForeground(Color.white);
            delete.addActionListener(this);
            add(delete);

        back=new JButton("Back");
        back.setBounds(220,300,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);

//image lagana hai tho
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(700,80,200,200);
        add(img);
//background image ke liye

        ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
        Image i22=i11.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i33=new ImageIcon(i22);
        JLabel img1=new JLabel(i33);
        img1.setBounds(0,0,1120,630);
        add(img1);



        setSize(1000,400);
        setLocation(300,150);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==delete){
            try {
                Conn c=new Conn();
                String query="delete from employee where empID='"+choiceempid.getSelectedItem()+"'";
                c.statement.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Employee deleted successfully ");
                setVisible(false);
                new Main_class();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new RemoveEmployee();
    }
}
