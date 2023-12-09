package project2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * @authors Ahmed Ibrahim Abd_El-Ghany 
 * Ahmed Wael Farag 
 * RemonNasser Mahrous  
 * Mohamed Tamer Mohamed  
 * Kerolos Fatouh Ibrahim 
 */
public class project extends JFrame implements ActionListener {

  JScrollPane sccrol_table;

  //tapels and connection
  //coniction varibles
  String path = "jdbc:sqlserver://localhost;databaseName=mail_order";
  String username = "123";
  String password = "123";

  //connection of updat order
  JLabel num11 = new JLabel("num ::");
  JLabel price11 = new JLabel("Price ::");
  JLabel Quantity11 = new JLabel("Quantity in stock ::");
  JTextField num12 = new JTextField();
  JTextField price12 = new JTextField();
  JTextField Quantity12 = new JTextField();

  //create all Taples
  JTable temployee = new JTable();
  JTable tcostumer = new JTable();
  JTable torder = new JTable();
  JTable tpart = new JTable();
  JTable tcostumer_order = new JTable();
  JTable search_table = new JTable();
  JTable employee_orders = new JTable();

  DefaultTableModel model;
  Connection con;
  Statement stmt;
  ResultSet rs;

  String employeeid, employeepass, from, ids;
  String from1;

  JTextField text_confirm = new JTextField();
  JTextField text_num_ord = new JTextField();
  JLabel confirm_label = new JLabel("date");
  JLabel ord_label = new JLabel("order num");

  // Buttons
  JButton orderconfirm = new JButton("Confirm");
  JButton employee = new JButton("Employee");
  JButton costumer = new JButton("Costumer");
  JButton us = new JButton("About US");
  JButton next = new JButton("Next");
  JButton next1 = new JButton("Next");
  JButton next2 = new JButton("Next");
  JButton next3 = new JButton("Next");
  JButton next4 = new JButton("Next");
  JButton back = new JButton("Back");
  JButton back1 = new JButton("Back");
  JButton back2 = new JButton("Back");
  JButton back3 = new JButton("Back");
  JButton back4 = new JButton("Back");
  JButton back5 = new JButton("Back");
  JButton back6 = new JButton("Back");
  JButton back7 = new JButton("Back");
  JButton back8 = new JButton("Back");
  JButton back9 = new JButton("Back");
  JButton back10 = new JButton("Back");
  JButton back11 = new JButton("Back");
  JButton back12 = new JButton("Back");
  JButton back13 = new JButton("back");
  JButton back14 = new JButton("Back");
  JButton back15 = new JButton("Back");
  JButton search = new JButton("Search");
  JButton signup = new JButton("Admin");
  JButton signup1 = new JButton("Sign up");
  JButton admin_employees = new JButton("show all Employees");
  JButton admin_costumers = new JButton("show all costumers");
  JButton admin_orders = new JButton("show all orders");
  JButton admin_parts = new JButton("show all parts");
  JButton new_or = new JButton("New Order ");
  JButton follow = new JButton("follow your order");
  JButton log_out = new JButton("log_out");
  JButton new_employee = new JButton("NEW EMPLOYEE");
  JButton delete_employee = new JButton("DELETE EMPLOYEE");
  JButton next_del = new JButton("delete");
  JButton addpart = new JButton("Add part");
  JButton back_p = new JButton("back");
  JButton insert = new JButton("insert");
  JButton up_part = new JButton("update order ");
  JButton update11 = new JButton("update ");
  JButton order_confirm = new JButton("Confirm order");

  //labels
  JLabel id = new JLabel(" ID ");
  JLabel id1 = new JLabel(" ID ");
  JLabel pass = new JLabel(" Password ");
  JLabel pass1 = new JLabel(" password ");
  JLabel pass2 = new JLabel("password ");
  JLabel pass3 = new JLabel("password ");
  JLabel user = new JLabel(" user name ");
  JLabel fname1 = new JLabel("F_Name ");
  JLabel lname1 = new JLabel("L_Name ");
  JLabel zip1 = new JLabel("ZIP ");
  JLabel passhint = new JLabel(
    "pass must be more than 8 char contine[0,9] and [A,Z] "
  );

  JLabel fname2 = new JLabel("F_Name ");
  JLabel lname2 = new JLabel("L_Name ");
  JLabel zip2 = new JLabel("ZIP ");
  JLabel pass4 = new JLabel("password ");
  JLabel passhint1 = new JLabel(
    "pass must be more than 8 char contine[0,9] and [A,Z] "
  );

  JLabel name_p = new JLabel("Name  :: ");
  JLabel price = new JLabel("price :: ");
  JLabel q_s = new JLabel("Quantity_in_stock :: ");
  JLabel l_del_em = new JLabel("ENTER ID OF EMPOYEE ");

  //textfields
  JTextField textfield = new JTextField();
  JTextField textfield1 = new JTextField();
  JTextField name = new JTextField();
  JTextField name2 = new JTextField();
  JTextField name3 = new JTextField();
  JTextField tzip1 = new JTextField();
  JTextField name4 = new JTextField();
  JTextField name5 = new JTextField();
  JTextField tzip2 = new JTextField();
  JTextField tsearch = new JTextField();
  JTextField name_tp = new JTextField();
  JTextField price_tp = new JTextField();
  JTextField q_s_tp = new JTextField();
  JTextField del_em = new JTextField();

  //passwordfield
  JPasswordField passwordfield = new JPasswordField();
  JPasswordField passwordfield1 = new JPasswordField();
  JPasswordField passwordfield2 = new JPasswordField();
  JPasswordField passwordfield3 = new JPasswordField();
  JPasswordField passwordfield4 = new JPasswordField();

  //fonts
  Font font = new Font("ALGERIAN", Font.BOLD, 24);
  Font font1 = new Font("Serif", Font.BOLD, 26);
  Font font2 = new Font("Arial Black", Font.BOLD, 18);
  Font font3 = new Font("Arial ", Font.BOLD, 12);

  // frames
  JFrame Start_screen = new JFrame("Start_screen  ");
  JFrame Employee_login = new JFrame("Employee log in screen  ");
  JFrame Costumer_login = new JFrame("Costumer log in screen  ");
  JFrame admin_login = new JFrame("Admin log in screen  ");
  JFrame admin = new JFrame("Admin screen  ");
  JFrame admin_employee = new JFrame("Admin Employee screen  ");
  JFrame admin_costumer = new JFrame("Admin costumer screen  ");
  JFrame admin_order = new JFrame("Admin order screen  ");
  JFrame admin_part = new JFrame(" Admin part screen  ");
  JFrame Costumer_signup = new JFrame("costumer sign up screen  ");
  JFrame Employee = new JFrame("Employee sign up screen  ");
  JFrame Costumer = new JFrame("customer screen  ");
  JFrame order = new JFrame("order details");
  JFrame follow_order = new JFrame("your orders");
  JFrame US = new JFrame("About US");
  JFrame add_employee = new JFrame("Add Employee");
  JFrame fdelete_employee = new JFrame("delete Employee");
  JFrame add_part = new JFrame("Add Part");
  JFrame customer_c = new JFrame("customer do");
  JFrame update_part = new JFrame("update part");
  JFrame search_frame = new JFrame("Search result");
  JFrame confirm_order_fram = new JFrame("Search result");

  int s = 0;

  project() {
    fdelete_employee.setLayout(null);
    fdelete_employee.setBounds(500, 500, 400, 300);
    fdelete_employee.setResizable(false);
    fdelete_employee.setDefaultCloseOperation(HIDE_ON_CLOSE);

    confirm_order_fram.setLayout(null);
    confirm_order_fram.setBounds(500, 500, 400, 300);
    confirm_order_fram.setResizable(false);
    confirm_order_fram.setDefaultCloseOperation(HIDE_ON_CLOSE);

    //set defoult of all frames
    setVisible(false);
    defult_of_frame(Start_screen);
    defult_of_frame(Employee);
    defult_of_frame(Employee_login);
    defult_of_frame(Costumer);
    defult_of_frame(Costumer_login);
    defult_of_frame(Costumer_signup);
    defult_of_frame(admin_login);
    defult_of_frame(admin);
    defult_of_frame(admin_employee);
    defult_of_frame(admin_costumer);
    defult_of_frame(admin_order);
    defult_of_frame(admin_part);
    defult_of_frame(US);
    defult_of_frame(add_employee);
    defult_of_frame(add_part);
    defult_of_frame(customer_c);
    defult_of_frame(update_part);
    defult_of_frame(follow_order);
    defult_of_frame(search_frame);
    //set bound of all Tables buttons and labels
    admin_employees.setBounds(300, 75, 400, 50);
    admin_costumers.setBounds(300, 225, 400, 50);
    admin_orders.setBounds(300, 375, 400, 50);
    admin_parts.setBounds(300, 525, 400, 50);

    ord_label.setBounds(20, 25, 125, 50);
    text_num_ord.setBounds(175, 25, 200, 50);
    confirm_label.setBounds(20, 125, 100, 50);
    text_confirm.setBounds(175, 125, 200, 50);
    orderconfirm.setBounds(100, 200, 200, 50);

    orderconfirm.setFont(font);
    text_num_ord.setFont(font2);
    text_confirm.setFont(font2);
    ord_label.setFont(font2);
    confirm_label.setFont(font2);

    //set font of all Tables buttons and labels
    admin_employees.setFont(font);
    admin_costumers.setFont(font);
    admin_orders.setFont(font);
    admin_parts.setFont(font);

    //set bound of all Tables
    temployee.setBounds(0, 0, 1000, 450);
    tcostumer.setBounds(0, 0, 1000, 600);
    torder.setBounds(0, 0, 1000, 450);
    tpart.setBounds(0, 0, 1000, 450);
    tcostumer_order.setBounds(0, 0, 1000, 600);
    search_table.setBounds(0, 0, 1000, 600);
    employee_orders.setBounds(0, 0, 1000, 450);

    //set fonts of all Tables
    temployee.setFont(font3);
    tcostumer.setFont(font3);
    torder.setFont(font3);
    tpart.setFont(font3);
    tcostumer_order.setFont(font3);
    search_table.setFont(font3);
    employee_orders.setFont(font3);

    //set bound of all buttons
    employee.setBounds(150, 500, 200, 50);
    costumer.setBounds(600, 500, 200, 50);
    us.setBounds(835, 612, 155, 50);
    next.setBounds(620, 500, 150, 50);
    next1.setBounds(620, 500, 150, 50);
    next2.setBounds(545, 500, 150, 50);
    next3.setBounds(620, 500, 150, 50);
    next4.setBounds(620, 500, 150, 50);
    insert.setBounds(620, 450, 150, 50);
    back.setBounds(200, 500, 150, 50);
    back1.setBounds(200, 500, 150, 50);
    back2.setBounds(842, 612, 150, 50);
    back3.setBounds(842, 612, 150, 50);
    back4.setBounds(842, 612, 150, 50);
    back5.setBounds(842, 612, 150, 50);
    back6.setBounds(200, 500, 150, 50);
    back7.setBounds(842, 612, 150, 50);
    back8.setBounds(200, 500, 150, 50);
    back9.setBounds(842, 612, 150, 50);
    back10.setBounds(842, 612, 150, 50);
    back11.setBounds(842, 612, 150, 50);
    back12.setBounds(842, 612, 150, 50);
    back14.setBounds(842, 612, 150, 50);
    back15.setBounds(842, 612, 150, 50);
    back_p.setBounds(200, 450, 150, 50);
    signup.setBounds(390, 600, 200, 50);
    signup1.setBounds(390, 600, 200, 50);
    search.setBounds(650, 500, 200, 50);
    new_employee.setBounds(150, 500, 300, 50);
    delete_employee.setBounds(550, 500, 300, 50);
    addpart.setBounds(150, 500, 300, 50);
    next_del.setBounds(150, 150, 100, 50);
    new_or.setBounds(350, 150, 300, 50);
    follow.setBounds(350, 300, 300, 50);
    log_out.setBounds(350, 450, 300, 50);
    up_part.setBounds(600, 500, 300, 50);
    order_confirm.setBounds(350, 550, 300, 50);

    //set font of all buttons
    employee.setFont(font);
    costumer.setFont(font);
    us.setFont(font);
    next.setFont(font);
    next1.setFont(font);
    next2.setFont(font);
    next3.setFont(font);
    next4.setFont(font);
    insert.setFont(font);
    back.setFont(font);
    back1.setFont(font);
    back2.setFont(font);
    back3.setFont(font);
    back4.setFont(font);
    back5.setFont(font);
    back6.setFont(font);
    back7.setFont(font);
    back8.setFont(font);
    back9.setFont(font);
    back10.setFont(font);
    back11.setFont(font);
    back12.setFont(font);
    back13.setFont(font);
    back14.setFont(font);
    back15.setFont(font);
    back_p.setFont(font);
    signup.setFont(font);
    signup1.setFont(font);
    new_employee.setFont(font);
    addpart.setFont(font);
    delete_employee.setFont(font);
    l_del_em.setFont(font);
    next_del.setFont(font3);
    up_part.setFont(font);
    search.setFont(font);
    new_or.setFont(font);
    follow.setFont(font);
    log_out.setFont(font);
    order_confirm.setFont(font);

    //set bounds of all labels
    id.setBounds(250, 300, 50, 50);
    id1.setBounds(250, 300, 50, 50);
    pass.setBounds(250, 400, 120, 50);
    pass1.setBounds(250, 400, 120, 50);
    user.setBounds(250, 300, 170, 50);
    fname1.setBounds(250, 100, 150, 50);
    lname1.setBounds(250, 200, 150, 50);
    zip1.setBounds(250, 300, 150, 50);
    pass2.setBounds(250, 400, 150, 50);
    pass3.setBounds(250, 400, 150, 50);
    passhint.setBounds(430, 440, 320, 50);
    fname2.setBounds(250, 100, 150, 50);
    lname2.setBounds(250, 200, 150, 50);
    zip2.setBounds(250, 300, 150, 50);
    pass4.setBounds(250, 400, 150, 50);
    passhint1.setBounds(430, 440, 320, 50);
    l_del_em.setBounds(50, 20, 350, 100);
    name_p.setBounds(240, 150, 150, 50);
    price.setBounds(250, 250, 150, 50);
    q_s.setBounds(100, 350, 250, 50);
    //set font of all labels
    id.setFont(font1);
    id1.setFont(font1);
    pass.setFont(font1);
    pass1.setFont(font1);
    user.setFont(font1);
    fname1.setFont(font1);
    lname1.setFont(font1);
    zip1.setFont(font1);
    pass2.setFont(font1);
    pass3.setFont(font1);
    passhint.setFont(font3);
    fname2.setFont(font1);
    lname2.setFont(font1);
    zip2.setFont(font1);
    pass4.setFont(font1);
    name_p.setFont(font1);
    price.setFont(font1);
    q_s.setFont(font1);
    passhint1.setFont(font3);
    //        set Opacity of all labels
    //        id.setOpaque(0.8f);
    //        id1.setOpaque(0.8f);
    //        pass.setOpaque(0.8f);
    //        pass1.setOpaque(0.8f);
    //        user.setOpaque(0.8f);
    //        fname1.setOpaque(0.8f);
    //        lname1.setOpaque(0.8f);
    //        zip1.setOpaque(0.8f);
    //        pass2.setOpaque(0.8f);
    //        pass3.setOpaque(0.8f);

    //add background to labels
    id.setBackground(Color.LIGHT_GRAY);
    id.setOpaque(true);
    id.setForeground(Color.BLACK);
    id1.setBackground(Color.LIGHT_GRAY);
    id1.setOpaque(true);
    id1.setForeground(Color.BLACK);
    pass.setBackground(Color.LIGHT_GRAY);
    pass.setOpaque(true);
    pass.setForeground(Color.BLACK);
    pass1.setBackground(Color.LIGHT_GRAY);
    pass1.setOpaque(true);
    pass1.setForeground(Color.BLACK);

    //set bound of all text and password fields
    textfield.setBounds(420, 300, 250, 50);
    textfield1.setBounds(420, 300, 250, 50);
    name.setBounds(450, 300, 250, 50);
    name2.setBounds(450, 100, 250, 50);
    name3.setBounds(450, 200, 250, 50);
    tzip1.setBounds(450, 300, 250, 50);
    passwordfield.setBounds(420, 400, 250, 50);
    passwordfield1.setBounds(420, 400, 250, 50);
    passwordfield2.setBounds(450, 400, 250, 50);
    passwordfield3.setBounds(450, 400, 250, 50);
    name4.setBounds(450, 100, 250, 50);
    name5.setBounds(450, 200, 250, 50);
    tzip2.setBounds(450, 300, 250, 50);
    name_tp.setBounds(400, 160, 250, 50);
    price_tp.setBounds(400, 250, 250, 50);
    q_s_tp.setBounds(400, 350, 250, 50);
    passwordfield4.setBounds(450, 400, 250, 50);
    del_em.setBounds(150, 100, 100, 30);
    tsearch.setBounds(150, 500, 400, 50);

    //set font of all text and password fields
    textfield.setFont(font2);
    textfield1.setFont(font2);
    name.setFont(font2);
    name2.setFont(font2);
    name3.setFont(font2);
    tzip1.setFont(font2);
    passwordfield.setFont(font2);
    passwordfield1.setFont(font2);
    passwordfield2.setFont(font2);
    passwordfield3.setFont(font2);
    name4.setFont(font2);
    name5.setFont(font2);
    tzip2.setFont(font2);
    name_tp.setFont(font2);
    price_tp.setFont(font2);
    q_s_tp.setFont(font2);
    passwordfield4.setFont(font2);
    tsearch.setFont(font2);

    //insert all objects of start screen
    //buttons
    Start_screen.add(employee);
    Start_screen.add(costumer);
    Start_screen.add(us);

    //insert all objects of employee screen
    //buttons
    Employee.add(back3);
    Employee.add(order_confirm);
    //tabels
    Employee.add(employee_orders);

    //insert all objects of embloyee login screen
    //buttons
    Employee_login.add(next);
    Employee_login.add(back);
    Employee_login.add(signup);
    //labels
    Employee_login.add(id);
    Employee_login.add(pass);
    //passwordfield
    Employee_login.add(textfield);
    Employee_login.add(passwordfield);

    //insert all objects of costumer screen
    //buttons
    Costumer.add(log_out);
    Costumer.add(follow);
    Costumer.add(new_or);
    //tabels

    //insert all objects off costumer login screen
    //buttons
    Costumer_login.add(next1);
    Costumer_login.add(back1);
    Costumer_login.add(signup1);
    //labels
    Costumer_login.add(id1);
    Costumer_login.add(pass1);
    //text fields
    Costumer_login.add(textfield1);
    //passwordfield
    Costumer_login.add(passwordfield1);

    //insert all objects of costumer sign up screem
    //buttons
    Costumer_signup.add(back6);
    Costumer_signup.add(next3);
    //labels
    Costumer_signup.add(fname1);
    Costumer_signup.add(lname1);
    Costumer_signup.add(zip1);
    Costumer_signup.add(pass3);
    Costumer_signup.add(passhint);
    //text fields
    Costumer_signup.add(name2);
    Costumer_signup.add(name3);
    Costumer_signup.add(tzip1);
    //passwordfield
    Costumer_signup.add(passwordfield3);

    //insert all objects of admin log in up screen
    //buttons
    admin_login.add(back5);
    admin_login.add(next2);
    //labels
    admin_login.add(user);
    admin_login.add(pass2);
    //text fields
    admin_login.add(name);
    //passwordfield
    admin_login.add(passwordfield2);

    //insert all objects of admin up screen
    //buttons
    admin.add(admin_employees);
    admin.add(admin_costumers);
    admin.add(admin_orders);
    admin.add(admin_parts);
    admin.add(back7);

    //insert all objects of admin_employee up screen
    //buttons
    admin_employee.add(back9);
    admin_employee.add(new_employee);
    admin_employee.add(delete_employee);
    admin_employee.add(temployee);

    //insert all objects of admin_costumer up screen
    //buttons
    admin_costumer.add(back10);
    admin_costumer.add(tcostumer);

    //insert all objects of admin_order up screen
    //buttons
    admin_order.add(back11);
    admin_order.add(torder);
    admin_order.add(search);
    admin_order.add(tsearch);

    //insert all objects of search_frame up screen
    search_frame.add(back15);
    search_frame.add(search_table);

    //insert all objects of admin_part up screen
    //buttons
    admin_part.add(addpart);
    admin_part.add(back12);
    admin_part.add(tpart);
    admin_part.add(up_part);

    //insert all objects of addemployee sign up screem
    //buttons
    add_employee.add(back8);
    add_employee.add(next4);
    //labels
    add_employee.add(fname2);
    add_employee.add(lname2);
    add_employee.add(zip2);
    add_employee.add(pass4);
    add_employee.add(passhint1);
    //text fields
    add_employee.add(name4);
    add_employee.add(name5);
    add_employee.add(tzip2);
    //passwordfield
    add_employee.add(passwordfield4);

    fdelete_employee.add(l_del_em);
    fdelete_employee.add(del_em);
    fdelete_employee.add(next_del);

    add_part.add(name_p);
    add_part.add(price);
    add_part.add(q_s);
    add_part.add(name_tp);
    add_part.add(price_tp);
    add_part.add(q_s_tp);
    add_part.add(back_p);
    add_part.add(insert);

    //insert all object of us screen
    //buttons
    US.add(back2);

    follow_order.add(back14);
    follow_order.add(tcostumer_order);

    customer_c.add(back4);

    ///
    update_part.add(num11);
    update_part.add(num12);
    update_part.add(price11);
    update_part.add(price12);
    update_part.add(Quantity12);
    update_part.add(Quantity11);
    update_part.add(back13);
    update_part.add(update11);

    confirm_order_fram.add(confirm_label);
    confirm_order_fram.add(ord_label);
    confirm_order_fram.add(text_confirm);
    confirm_order_fram.add(orderconfirm);
    confirm_order_fram.add(text_num_ord);

    num11.setBounds(240, 150, 150, 50);
    price11.setBounds(240, 250, 150, 50);
    Quantity11.setBounds(100, 350, 250, 50);
    num12.setBounds(400, 160, 250, 50);
    price12.setBounds(400, 260, 250, 50);
    Quantity12.setBounds(400, 360, 250, 50);
    num11.setFont(font1);
    price11.setFont(font1);
    Quantity11.setFont(font1);
    num12.setFont(font2);
    price12.setFont(font2);
    Quantity12.setFont(font2);
    back13.setBounds(200, 450, 150, 50);
    update11.setBounds(600, 450, 150, 50);
    back13.setFont(font);
    update11.setFont(font);
    
    showpart();
    //add back ground to all frames
    add_background();

    // add action listner to all buttons
    employee.addActionListener(this);
    costumer.addActionListener(this);
    next.addActionListener(this);
    next1.addActionListener(this);
    next2.addActionListener(this);
    next3.addActionListener(this);
    back.addActionListener(this);
    back1.addActionListener(this);
    back2.addActionListener(this);
    back3.addActionListener(this);
    back4.addActionListener(this);
    back5.addActionListener(this);
    back6.addActionListener(this);
    back7.addActionListener(this);
    back8.addActionListener(this);
    back9.addActionListener(this);
    back10.addActionListener(this);
    back11.addActionListener(this);
    back12.addActionListener(this);
    back13.addActionListener(this);
    back14.addActionListener(this);
    back15.addActionListener(this);
    back_p.addActionListener(this);
    insert.addActionListener(this);
    us.addActionListener(this);
    signup.addActionListener(this);
    signup1.addActionListener(this);
    admin_employees.addActionListener(this);
    admin_costumers.addActionListener(this);
    admin_orders.addActionListener(this);
    admin_parts.addActionListener(this);
    new_employee.addActionListener(this);
    addpart.addActionListener(this);
    next4.addActionListener(this);
    delete_employee.addActionListener(this);
    next_del.addActionListener(this);
    log_out.addActionListener(this);
    follow.addActionListener(this);
    new_or.addActionListener(this);
    up_part.addActionListener(this);
    update11.addActionListener(this);
    search.addActionListener(this);
    order_confirm.addActionListener(this);
    orderconfirm.addActionListener(this);

    //set visible of all frames
    Start_screen.setVisible(true);
  }

  public void add_background() {
    //add background >>>> look out the path of pictures if you copy code
    JLabel background1;
    ImageIcon i1 = new ImageIcon("D:\\project\\backgrounds\\1.jpg");
    background1 = new JLabel("", i1, JLabel.CENTER);
    background1.setBounds(0, 0, 1000, 700);

    JLabel background2;
    ImageIcon i2 = new ImageIcon("D:\\project\\backgrounds\\2.jpg");
    background2 = new JLabel("", i2, JLabel.CENTER);
    background2.setBounds(0, 0, 1000, 700);

    JLabel background3;
    ImageIcon i3 = new ImageIcon("D:\\project\\backgrounds\\3.jpg");
    background3 = new JLabel("", i3, JLabel.CENTER);
    background3.setBounds(0, 0, 1000, 700);

    JLabel background4;
    ImageIcon i4 = new ImageIcon("D:\\project\\backgrounds\\4.jpg");
    background4 = new JLabel("", i4, JLabel.CENTER);
    background4.setBounds(0, 0, 1000, 700);

    JLabel background5;
    ImageIcon i5 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background5 = new JLabel("", i5, JLabel.CENTER);
    background5.setBounds(0, 0, 1000, 700);

    JLabel background6;
    ImageIcon i6 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background6 = new JLabel("", i6, JLabel.CENTER);
    background6.setBounds(0, 0, 1000, 700);

    JLabel background7;
    ImageIcon i7 = new ImageIcon("D:\\project\\backgrounds\\7.jpg");
    background7 = new JLabel("", i7, JLabel.CENTER);
    background7.setBounds(0, 0, 1000, 700);

    JLabel background8;
    ImageIcon i8 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background8 = new JLabel("", i8, JLabel.CENTER);
    background8.setBounds(0, 0, 1000, 700);

    JLabel background9;
    ImageIcon i9 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background9 = new JLabel("", i9, JLabel.CENTER);
    background9.setBounds(0, 0, 1000, 700);

    JLabel background10;
    ImageIcon i10 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background10 = new JLabel("", i10, JLabel.CENTER);
    background10.setBounds(0, 0, 1000, 700);

    JLabel background11;
    ImageIcon i11 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background11 = new JLabel("", i11, JLabel.CENTER);
    background11.setBounds(0, 0, 1000, 700);

    JLabel background12;
    ImageIcon i12 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background12 = new JLabel("", i12, JLabel.CENTER);
    background12.setBounds(0, 0, 1000, 700);

    JLabel background13;
    ImageIcon i13 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background13 = new JLabel("", i13, JLabel.CENTER);
    background13.setBounds(0, 0, 1000, 700);

    JLabel background14;
    ImageIcon i14 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background14 = new JLabel("", i14, JLabel.CENTER);
    background14.setBounds(0, 0, 1000, 700);

    JLabel background15;
    ImageIcon i15 = new ImageIcon("D:\\project\\backgrounds\\R.jpg");
    background15 = new JLabel("", i15, JLabel.CENTER);
    background15.setBounds(0, 0, 1000, 700);

    JLabel background16;
    ImageIcon i16 = new ImageIcon("D:\\project\\backgrounds\\16.jpg");
    background16 = new JLabel("", i16, JLabel.CENTER);
    background16.setBounds(0, 0, 1000, 700);

    //add backgrounds
    Start_screen.add(background1);
    Employee.add(background5);
    Employee_login.add(background2);
    Costumer.add(background6);
    Costumer_login.add(background3);
    Costumer_signup.add(background8);
    follow_order.add(background15);
    admin_login.add(background7);
    admin.add(background9);
    admin_employee.add(background11);
    admin_costumer.add(background12);
    admin_order.add(background13);
    admin_part.add(background14);
    add_employee.add(background10);
    US.add(background4);
    customer_c.add(background16);
  }

  int customer_id;

  void signup_cos() {
    char[] passwordChars = passwordfield3.getPassword();
    String passss = new String(passwordChars);

    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "SELECT ID FROM Customer WHERE F_name = ? AND L_name = ? AND E_ZIP = ? AND pass_world = ?;"
      );
      stmt1.setString(1, name2.getText());
      stmt1.setString(2, name3.getText());
      stmt1.setString(3, tzip1.getText());
      stmt1.setString(4, passss);
      ResultSet rs = stmt1.executeQuery();
      if (rs.next()) {
        int idcus = rs.getInt("ID");
        customer_id = idcus;
        JOptionPane.showMessageDialog(
          this,
          "WELCOEM YOU IN OUR FAMIL \n" +
          "YOUR ID IS : " +
          customer_id +
          "\n" +
          " YOUR PASSWORD IS : " +
          passss +
          "\n" +
          "PLEASE REMEMBER IT"
        );
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "ERROR",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  public void sinupcostomer() {
    char[] passwordChars = passwordfield3.getPassword();
    String passss = new String(passwordChars);

    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "INSERT INTO Customer (F_name, L_name, E_ZIP, pass_world) VALUES (?, ?, ?, ?)"
      );
      stmt1.setString(1, name2.getText());
      stmt1.setString(2, name3.getText());
      stmt1.setString(3, tzip1.getText());
      stmt1.setString(4, passss);
      stmt1.executeUpdate();
      signup_cos();
      Costumer_signup.setVisible(false);
      Costumer_login.setVisible(true);
      tzip1.setText("");
      name3.setText("");
      name2.setText("");
      passwordfield3.setText("");
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "ERROR",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  int xs;

  public void logincostomer() {
    int userId = Integer.parseInt(textfield1.getText());
    String passworld = new String(passwordfield1.getPassword());
    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "SELECT * FROM Customer WHERE ID = ? AND pass_world = ?"
      );
      stmt1.setInt(1, userId);
      stmt1.setString(2, passworld);
      ResultSet rs = stmt1.executeQuery();
      if (rs.next()) {
        xs = userId;
        showpart();
        Costumer_login.setVisible(false);
        Costumer.setVisible(true);
        textfield1.setText("");
        passwordfield1.setText("");
      } else {
        JOptionPane.showMessageDialog(this, "Invalid user ID or password.");
      }
      con.close();
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        this,
        "Error connecting to database: " + ex.getMessage()
      );
    }
  }

  String employee_id;

  public void loginemployee() {
    String userId = textfield.getText();
    String passworld = new String(passwordfield.getPassword());
    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt2 = con.prepareStatement(
        "SELECT * FROM Employee WHERE ID = ? AND pass_world = ?"
      );
      stmt2.setString(1, userId);
      stmt2.setString(2, passworld);
      ResultSet rs = stmt2.executeQuery();
      if (rs.next()) {
        employee_id = userId;
        Employee_login.setVisible(false);
        Employee.setVisible(true);
        show_employee_order();
        textfield.setText("");
        passwordfield.setText("");
      } else {
        JOptionPane.showMessageDialog(this, "Invalid user ID or password.");
      }
      con.close();
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        this,
        "Error connecting to database: " + ex.getMessage()
      );
    }
  }

  public void loginadmin() {
    String userId = name.getText();
    String passworld = new String(passwordfield2.getPassword());
    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt2 = con.prepareStatement(
        "SELECT * FROM Adminn WHERE username = ? AND pass_world = ?"
      );
      stmt2.setString(1, userId);
      stmt2.setString(2, passworld);
      ResultSet rs = stmt2.executeQuery();
      if (rs.next()) {
        //JOptionPane.showMessageDialog(this, "WELCOME ADMIN.");
        admin_login.setVisible(false);
        admin.setVisible(true);
        name.setText("");
        passwordfield2.setText("");
      } else {
        JOptionPane.showMessageDialog(this, "Invalid username or password.");
      }
      con.close();
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        this,
        "Error connecting to database: " + ex.getMessage()
      );
    }
  }

  public void data_employee() {
    char[] passwordChars = passwordfield4.getPassword();
    String passss = new String(passwordChars);

    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "INSERT INTO Employee (F_name, L_name, E_ZIP, pass_world) VALUES (?, ?, ?, ?)"
      );
      stmt1.setString(1, name4.getText());
      stmt1.setString(2, name5.getText());
      stmt1.setString(3, tzip2.getText());
      stmt1.setString(4, passss);
      stmt1.executeUpdate();
      JOptionPane.showMessageDialog(
        this,
        "ُEmployee data has added Successfully!"
      );
      add_employee.setVisible(false);
      data_of_admin_employee();
      admin_employee.setVisible(true);
      name4.setText("");
      name5.setText("");
      tzip2.setText("");
      passwordfield4.setText("");
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "ERROR",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  void delete_employee() {
    String q = del_em.getText();
    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt2 = con.prepareStatement(
        "DELETE FROM Employee WHERE ID=?"
      );
      stmt2.setString(1, q);
      int rowsDeleted = stmt2.executeUpdate();
      if (rowsDeleted > 0) {
        JOptionPane.showMessageDialog(
          this,
          "Employee record deleted successfully!");
            del_em.setText(""); 
        
      } else {
        JOptionPane.showMessageDialog(
          this,
          "No employee record found with ID: " + q
        );
      }
      data_of_admin_employee();
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        this,
        "Error connecting to database: " + ex.getMessage()
      );
    }
  }

  public void insert_part() {
    String w = name_tp.getText();
    int e = Integer.parseInt(price_tp.getText());

    int r = Integer.parseInt(q_s_tp.getText());
    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "INSERT INTO Part (Name, Price, Quantity_in_stock) VALUES (?, ?, ?)"
      );
      stmt1.setString(1, w);
      stmt1.setInt(2, e);
      stmt1.setInt(3, r);
      stmt1.executeUpdate();
      JOptionPane.showMessageDialog(this, "Inserted successful!");
      name_tp.setText(""); 
      price_tp.setText(""); 
      q_s_tp.setText(""); 
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "ERROR",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  int ord_num = 1;

  public void date() {
    LocalDateTime now = LocalDateTime.now();
    LocalTime currentTime = LocalTime.now();
    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
    String timeStr = currentTime.format(formatter1);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String dateStr = now.format(formatter2);

    try {
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "INSERT INTO or_der (Date_of_receipt,time_order,customer_id,employee_id) VALUES (?,?,?,(SELECT TOP 1 ID FROM Employee ORDER BY NEWID()))"
      );
      stmt1.setString(1, dateStr);
      stmt1.setString(2, timeStr);
      stmt1.setInt(3, xs);
      stmt1.executeUpdate();

      PreparedStatement stmt2 = con.prepareStatement(
        "SELECT Order_num FROM or_der WHERE Date_of_receipt=? AND time_order=? AND customer_id=?"
      );
      stmt2.setString(1, dateStr);
      stmt2.setString(2, timeStr);
      stmt2.setInt(3, 1);
      ResultSet rs = stmt2.executeQuery();
      if (rs.next()) {
        int _ord_num = rs.getInt("Order_num");
        ord_num = _ord_num;
      }
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "ERROR",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  int xss, co, cu;

  public void showpart() {
    JComboBox<String> partComboBox = new JComboBox<>();
    JComboBox<Integer> quantityComboBox = new JComboBox<>();
    JLabel priceLabel = new JLabel("");
    JButton calculateButton = new JButton("Add to your order");
    JLabel totalPriceLabel = new JLabel("");
    try {
      // Step 1: Connect to the database
      con = DriverManager.getConnection(path, username, password);

      // Step 2: Execute a SQL query
      Statement stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT Name FROM Part");

      // Step 3: Iterate through the result set and add each item to the JComboBox
      while (rs.next()) {
        String name = rs.getString("Name");
        partComboBox.addItem(name);
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }

    // Add an ActionListener to partComboBox
    partComboBox.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Get the selected item in partComboBox
          String selectedPart = (String) partComboBox.getSelectedItem();

          List<Integer> data = new ArrayList<>();

          try {
            // Step 1: Connect to the database
            con = DriverManager.getConnection(path, username, password);

            // Step 2: Execute a SQL query to get the price of the selected part
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
              "SELECT Price FROM Part WHERE Name = '" + selectedPart + "'"
            );

            // Step 3: Get the price from the result set and display it in the priceLabel
            if (rs.next()) {
              int price = rs.getInt("Price");
              priceLabel.setText("Price per one: $" + price);
            }

            // Execute another SQL query to get the quantity in stock
            rs =
              stmt.executeQuery(
                "SELECT Quantity_in_stock FROM Part WHERE Name = '" +
                selectedPart +
                "'"
              );

            // Step 4: Iterate through the result set and add each item to a List<Integer>
            while (rs.next()) {
              int qua = rs.getInt("Quantity_in_stock");
              for (int i = 1; i <= qua; i++) {
                data.add(i);
              }
            }
          } catch (SQLException ex) {
            ex.printStackTrace();
          }

          // Update the items in the quantityComboBox
          quantityComboBox.removeAllItems();
          for (Integer item : data) {
            quantityComboBox.addItem(item);
          }
        }
      }
    );

    // Add an ActionListener to the calculateButton
    // initialize the total price variable outside the action listener
    calculateButton.addActionListener(
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // Get the selected part and quantity
          String selectedPart = (String) partComboBox.getSelectedItem();
          int quantity = (int) quantityComboBox.getSelectedItem();

          try {
            // Step 1: Connect to the database
            con = DriverManager.getConnection(path, username, password);

            // Step 2: Execute a SQL query to get the price of the selected part
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
              "SELECT Price FROM Part WHERE Name = '" + selectedPart + "'"
            );

            // Step 3: Get the price from the result set and calculate the total price
            if (rs.next()) {
              int price = rs.getInt("Price");
              int totalPrice = price * quantity;
              co = quantity;
              s += totalPrice; // add the new total price to the previous value of "s"
              totalPriceLabel.setText("Total Price: $" + s);
            }
          } catch (SQLException ex) {
            ex.printStackTrace();
          }

          try {
            con = DriverManager.getConnection(path, username, password);
            PreparedStatement stmt1 = con.prepareStatement(
              "SELECT Quantity_in_stock FROM Part WHERE Name = '" +
              selectedPart +
              "'"
            );
            ResultSet rs = stmt1.executeQuery(); // assign rs to the result set returned by stmt1

            if (rs.next()) {
              int Qu_stock = rs.getInt("Quantity_in_stock");
              cu = Qu_stock;
            }
            System.out.println(cu - co);
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
              null,
              ex.getMessage(),
              "ERROR",
              JOptionPane.ERROR_MESSAGE
            );
          }

          try {
            con = DriverManager.getConnection(path, username, password);
            PreparedStatement stmt1 = con.prepareStatement(
              "SELECT Num FROM Part WHERE Name = '" + selectedPart + "'"
            );
            ResultSet rs = stmt1.executeQuery(); // assign rs to the result set returned by stmt1

            if (rs.next()) {
              int num = rs.getInt("Num");
              xss = num;
            }
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
              null,
              ex.getMessage(),
              "ERROR",
              JOptionPane.ERROR_MESSAGE
            );
          }

          try {
            con = DriverManager.getConnection(path, username, password);
            PreparedStatement stmt1 = con.prepareStatement(
              "INSERT INTO Part_of_order (Ord_ID,Quantity,Part_ID)  VALUES (?,?,?)"
            );
            stmt1.setInt(1, ord_num);
            stmt1.setInt(2, quantity);
            stmt1.setInt(3, xss);

            stmt1.executeUpdate();
            JOptionPane.showMessageDialog(null, "add successfully");
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
              null,
              ex.getMessage(),
              "ERROR",
              JOptionPane.ERROR_MESSAGE
            );
          }

          try {
            con = DriverManager.getConnection(path, username, password);
            PreparedStatement stmt1 = con.prepareStatement(
              "Update Part set  Quantity_in_stock=? where Num = ?"
            );
            int ca = cu - co;
            stmt1.setInt(1, ca);
            stmt1.setInt(2, xss);
            stmt1.executeUpdate();
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(
              null,
              ex.getMessage(),
              "ERROR",
              JOptionPane.ERROR_MESSAGE
            );
          }
        }
      }
    );

    // Add the initial JComboBoxes, JLabels, and JButton to the GUI
    partComboBox.setBounds(100, 200, 200, 50);
    customer_c.add(partComboBox);

    priceLabel.setBounds(100, 250, 200, 50);
    customer_c.add(priceLabel);

    quantityComboBox.setBounds(350, 200, 100, 50);
    customer_c.add(quantityComboBox);

    calculateButton.setBounds(500, 200, 150, 50);
    customer_c.add(calculateButton);

    totalPriceLabel.setBounds(350, 250, 200, 50);
    customer_c.add(totalPriceLabel);
  }

  public void defult_of_frame(JFrame f) {
    ImageIcon icon = new ImageIcon("D:\\project\\backgrounds\\i.png");
    f.setIconImage(icon.getImage());
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    f.setResizable(false);
    f.setVisible(false);
    f.setLayout(null);
    f.setSize(1000, 700);
  }

  void data_of_admin_employee() {
    model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("F_name");
    model.addColumn("L_name");
    model.addColumn("E_ZIP");
    model.addColumn("pass_world");

    temployee.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from Employee ");
      model.addRow(
        new Object[] { "ID", "F_Nmae", "L_Name", "ZIP", "PassWord" }
      );
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Id"),
            rs.getString("F_name"),
            rs.getString("L_name"),
            rs.getString("E_ZIP"),
            rs.getString("pass_world"),
          }
        );
      }
      temployee.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

  void data_of_admin_costumer() {
    model = new DefaultTableModel();
    model.addColumn("ID");
    model.addColumn("F_name");
    model.addColumn("L_name");
    model.addColumn("E_ZIP");
    model.addColumn("pass_world");

    tcostumer.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from Customer ");
      model.addRow(
        new Object[] { "ID", "F_Nmae", "L_Name", "ZIP", "PassWord" }
      );
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Id"),
            rs.getString("F_name"),
            rs.getString("L_name"),
            rs.getString("E_ZIP"),
            rs.getString("pass_world"),
          }
        );
      }
      tcostumer.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

  void data_of_admin_order() {
    model = new DefaultTableModel();
    model.addColumn("Order_num");
    model.addColumn("Date_of_receipt");
    model.addColumn("Ship_date");
    model.addColumn("Actual_ship_date");
    model.addColumn("time_order");
    model.addColumn("customer_id");
    model.addColumn("employee_id");
    torder.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from or_der ");
      model.addRow(
        new Object[] {
          "Order_num",
          "time_order",
          "Date_of_receipt",
          "Ship_date",
          "Actual_ship_date",
          "customer_id",
          "employee_id",
        }
      );
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Order_num"),
            rs.getString("time_order"),
            rs.getString("Date_of_receipt"),
            rs.getString("Ship_date"),
            rs.getString("Actual_ship_date"),
            rs.getString("customer_id"),
            rs.getString("employee_id"),
          }
        );
      }
      torder.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

  void data_of_admin_part() {
    model = new DefaultTableModel();
    model.addColumn("Num");
    model.addColumn("Name");
    model.addColumn("Price");
    model.addColumn("Quantity_in_stock");

    tpart.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs = stmt.executeQuery("select * from Part ");
      model.addRow(
        new Object[] { "Num", "Name", "Price", "Quantity_in_stock" }
      );
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Num"),
            rs.getString("Name"),
            rs.getString("Price"),
            rs.getString("Quantity_in_stock"),
          }
        );
      }
      tpart.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

public void update_part() {
    try {
        int x = Integer.parseInt(price12.getText());
        int y = Integer.parseInt(Quantity12.getText());
        int z = Integer.parseInt(num12.getText());
        con = DriverManager.getConnection(path, username, password);
        PreparedStatement stmt1 = con.prepareStatement(
                "UPDATE Part SET Price = ?, Quantity_in_stock = ? WHERE Num = ?;"
        );
        stmt1.setInt(1, x);
        stmt1.setInt(2, y);
        stmt1.setInt(3, z);
        int rowsUpdated = stmt1.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Part updated successfully");
            data_of_admin_part();
            update_part.setVisible(false);
            admin_part.setVisible(true);
            num12.setText(""); 
            price12.setText("");
            Quantity12.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "No part was updated. Invalid ID?");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(
                null,
                "Invalid input. Please enter a valid number.",
                "ERROR",
                JOptionPane.ERROR_MESSAGE
        );
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(
                null,
                "An error occurred while updating the part: " + ex.getMessage(),
                "ERROR",
                JOptionPane.ERROR_MESSAGE
        );
    }
}

  void fsearch() {
    admin_part.setVisible(false);
    String _id_ = tsearch.getText();
    model = new DefaultTableModel();
    model.addColumn("Ord_ID");
    model.addColumn("Part_ID");
    model.addColumn("Quantity");

    search_table.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs =
        stmt.executeQuery(
          "select * from Part_of_order where Ord_ID = '" + _id_ + "'"
        );
      model.addRow(new Object[] { "Order_ID", "Part_ID", "Quantity" });
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Ord_ID"),
            rs.getString("Part_ID"),
            rs.getString("Quantity"),
          }
        );
      }
      tcostumer.setEnabled(false);
      tsearch.setText("");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
    search_frame.setVisible(true);
  }

  void show_employee_order() {
    model = new DefaultTableModel();
    model.addColumn("Order_num");
    model.addColumn("Date_of_receipt");
    model.addColumn("Ship_date");
    model.addColumn("Actual_ship_date");
    model.addColumn("time_order");
    model.addColumn("customer_id");
    employee_orders.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs =
        stmt.executeQuery(
          "select * from or_der where employee_id = '" + employee_id + "'"
        );
      model.addRow(
        new Object[] {
          "Order_num",
          "time_order",
          "Date_of_receipt",
          "Ship_date",
          "Actual_ship_date",
          "customer_id",
        }
      );
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Order_num"),
            rs.getString("time_order"),
            rs.getString("Date_of_receipt"),
            rs.getString("Ship_date"),
            rs.getString("Actual_ship_date"),
            rs.getString("customer_id"),
          }
        );
      }
      employee_orders.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

  void update_order_emp() {
    try {
      String x = text_confirm.getText();
      String y = text_num_ord.getText();
      con = DriverManager.getConnection(path, username, password);
      PreparedStatement stmt1 = con.prepareStatement(
        "UPDATE or_der SET Actual_ship_date = ? WHERE Order_num = ?;"
      );

      stmt1.setString(1, x);
      stmt1.setString(2, y);
      stmt1.executeUpdate();
      JOptionPane.showMessageDialog(this, " updated successfully");
      show_employee_order();
      text_confirm.setText("");
      text_num_ord.setText("");
      confirm_order_fram.setVisible(false);
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(
        null,
        ex.getMessage(),
        "ERROR",
        JOptionPane.ERROR_MESSAGE
      );
    }
  }

  void data_customer_orders() {
    model = new DefaultTableModel();
    model.addColumn("Order_num");
    model.addColumn("time_order");
    model.addColumn("Date_of_receipt");
    model.addColumn("Ship_date");
    model.addColumn("Actual_ship_date");
    tcostumer_order.setModel(model);

    try {
      con = DriverManager.getConnection(path, username, password);
      stmt = con.createStatement();
      rs =
        stmt.executeQuery(
          "select * from or_der where customer_id = '" + xs + "'"
        );
      model.addRow(
        new Object[] {
          "Order_num",
          "time_order",
          "Date_of_receipt",
          "Ship_date",
          "Actual_ship_date",
        }
      );
      while (rs.next()) {
        model.addRow(
          new Object[] {
            rs.getString("Order_num"),
            rs.getString("time_order"),
            rs.getString("Date_of_receipt"),
            rs.getString("Ship_date"),
            rs.getString("Actual_ship_date"),
          }
        );
      }
      torder.setEnabled(false);
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(this, e.getMessage());
    }
  }

  //gave tasks to all buttons
  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == employee) {
      Start_screen.setVisible(false);
      Employee_login.setVisible(true);
    } else if (e.getSource() == costumer) {
      Start_screen.setVisible(false);
      Costumer_login.setVisible(true);
    } else if (e.getSource() == us) {
      Start_screen.setVisible(false);
      US.setVisible(true);
    } else if (e.getSource() == next) {
      employeeid = id.getText();
      employeepass = pass.getText();
      loginemployee();
    } else if (e.getSource() == next1) {
      logincostomer();
    } else if (e.getSource() == next2) {
      loginadmin();
    } else if (e.getSource() == next3) {
      sinupcostomer();
    } else if (e.getSource() == back) {
      Employee_login.setVisible(false);
      Start_screen.setVisible(true);
    } else if (e.getSource() == back1) {
      Costumer_login.setVisible(false);
      Start_screen.setVisible(true);
    } else if (e.getSource() == back2) {
      US.setVisible(false);
      Start_screen.setVisible(true);
    } else if (e.getSource() == back3) {
      Employee.setVisible(false);
      Employee_login.setVisible(true);
    } else if (e.getSource() == log_out) {
      Costumer.setVisible(false);
      Costumer_login.setVisible(true);
    } else if (e.getSource() == new_or) {
      Costumer.setVisible(false);
      customer_c.setVisible(true);
      date();
    } else if (e.getSource() == back5) {
      admin_login.setVisible(false);
      Employee_login.setVisible(true);
    } else if (e.getSource() == back6) {
      Costumer_signup.setVisible(false);
      Costumer_login.setVisible(true);
    } else if (e.getSource() == back7) {
      admin.setVisible(false);
      admin_login.setVisible(true);
    } else if (e.getSource() == back9) {
      admin_employee.setVisible(false);
      admin.setVisible(true);
    } else if (e.getSource() == back10) {
      admin_costumer.setVisible(false);
      admin.setVisible(true);
    } else if (e.getSource() == back11) {
      admin_order.setVisible(false);
      admin.setVisible(true);
    } else if (e.getSource() == back12) {
      admin_part.setVisible(false);
      admin.setVisible(true);
    } else if (e.getSource() == back13) {
      update_part.setVisible(false);
      admin_part.setVisible(true);
    } else if (e.getSource() == back14) {
      follow_order.setVisible(false);
      Costumer.setVisible(true);
    } else if (e.getSource() == back15) {
      search_frame.setVisible(false);
      admin_order.setVisible(true);
    } else if (e.getSource() == signup) {
      Employee_login.setVisible(false);
      admin_login.setVisible(true);
    } else if (e.getSource() == signup1) {
      Costumer_login.setVisible(false);
      Costumer_signup.setVisible(true);
    } else if (e.getSource() == admin_employees) {
      data_of_admin_employee();
      admin.setVisible(false);
      admin_employee.setVisible(true);
    } else if (e.getSource() == admin_costumers) {
      data_of_admin_costumer();
      admin.setVisible(false);
      admin_costumer.setVisible(true);
    } else if (e.getSource() == admin_orders) {
      data_of_admin_order();
      admin.setVisible(false);
      admin_order.setVisible(true);
    } else if (e.getSource() == admin_parts) {
      data_of_admin_part();
      admin.setVisible(false);
      admin_part.setVisible(true);
    } else if (e.getSource() == new_employee) {
      admin_employee.setVisible(false);
      add_employee.setVisible(true);
    } else if (e.getSource() == back8) {
      add_employee.setVisible(false);
      admin_employee.setVisible(true);
    } else if (e.getSource() == next4) {
      data_employee();
    } else if (e.getSource() == delete_employee) {
      admin_employee.setVisible(true);
      fdelete_employee.setVisible(true);
    } else if (e.getSource() == next_del) {
      delete_employee();
    } else if (e.getSource() == addpart) {
      admin_part.setVisible(false);
      add_part.setVisible(true);
    } else if (e.getSource() == back_p) {
      data_of_admin_part();
      add_part.setVisible(false);
      admin_part.setVisible(true);
    } else if (e.getSource() == insert) {
      insert_part();
    } else if (e.getSource() == back4) {
      customer_c.setVisible(false);
      Costumer.setVisible(true);
    } else if (e.getSource() == up_part) {
      update_part.setVisible(true);
      admin_part.setVisible(false);
    } else if (e.getSource() == update11) {
      update_part();
    } else if (e.getSource() == follow) {
      data_customer_orders();
      Costumer.setVisible(false);
      follow_order.setVisible(true);
    } else if (e.getSource() == search) {
      fsearch();
    } else if (e.getSource() == order_confirm) {
      confirm_order_fram.setVisible(true);
    } else if (e.getSource() == orderconfirm) {
      update_order_emp();
    }
  }

  //main method
  public static void main(String[] args) {
    new project();
  }
}

