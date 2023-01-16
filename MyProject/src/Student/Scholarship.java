package Student;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class Scholarship implements ActionListener {
JFrame f;
String[] gender={"Gender","Male","Female","Others"};
String[] category={"GENERAL","OBC","SC/ST","EWS"};
String[] state={"State","Andhra Pradesh","Haryana","Manipur","Sikkim","Arunachal Pradesh","Himachal Pradesh","Meghalaya","Tamil Nadu","Assam","Jharkhand","Mizoram","Telangana","Bihar","Karnataka","Nagaland","Tripura","Chhattisgarh","Kerala","Odisha","Uttarakhand","Goa","Madhya Pradesh","Punjab","Uttar Pradesh","Gujarat","Maharashtra","Rajasthan","West Bengal"};                                                                                                 
JLabel L1=new JLabel("NAME :-");
JLabel L2=new JLabel("COLLEGE-ID :-");
JLabel L3=new JLabel("COLLEGE-NAME :-");
JLabel L4=new JLabel("COURSE :-");
JLabel L5=new JLabel("DURATION :-");
JLabel L6=new JLabel("E-MAIL :-");
JLabel L7=new JLabel("CONFIRM E-MAIL :-");
JLabel L8=new JLabel("PHONE NUMBER :-");
JLabel L9=new JLabel("GENDER :-");
JLabel L10=new JLabel("DOB(DD/MM/YYYY) :-");
JLabel L11=new JLabel("CATEGORY :-");
JLabel L12=new JLabel("CREATE PASSWORD :-");
JLabel L13=new JLabel("CONFIRM PASSWORD :-");
JLabel L14=new JLabel("FATHER NAME :-");
JLabel L15=new JLabel("MOTHER NAME :-");
JLabel L16=new JLabel("GURDIAN CONTACTNUMBER :-");
JTextField T1=new JTextField();	
JTextField T2=new JTextField();	
JTextField T3=new JTextField();	
JTextField T4=new JTextField();	
JTextField T5=new JTextField();	
JTextField T6=new JTextField();	
JTextField T7=new JTextField();	
JTextField T8=new JTextField();	
JTextField T9=new JTextField("DD/MM/YYYY");	
JTextField T10=new JTextField("************************");	
JTextField T11=new JTextField("************************");
JTextField T12=new JTextField();
JTextField T13=new JTextField();
JTextField T14=new JTextField();
JComboBox<?> g= new JComboBox<Object>(gender);
JComboBox<?> c= new JComboBox<Object>(category);
JButton R1=new JButton("SUBMIT");
JButton R2=new JButton("RESET");
JLabel L17=new JLabel("--------------------------------------ADDRESS------------------------------------");
JLabel L18=new JLabel("HOUSE NO. :-");
JLabel L19=new JLabel("STREET/AREA :-");
JLabel L20=new JLabel("CITY :-");
JLabel L21=new JLabel("PINCODE :-");
JLabel L22=new JLabel("STATE :-");
JComboBox<?> h= new JComboBox<Object>(state);
JLabel L23=new JLabel("COUNTRY :-");
JTextField T15=new JTextField();
JTextField T16=new JTextField();
JTextField T17=new JTextField();
JTextField T18=new JTextField();
JTextField T19=new JTextField();
Scholarship()
{
	createWindow();
	setLocationAndSize();
	addComponentsToFrame();
     actionEvent();            
}

public void createWindow()
{
	f= new JFrame();
	f.setTitle("SCHOLARSHIP FORM");
	f.setBounds(30,0,1200,1000);
	f.getContentPane().setBackground(Color.yellow);
	f.getContentPane().setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setResizable(true);
}

public void setLocationAndSize()
{
L1.setBounds(20,20,80,80);
L2.setBounds(20,70,90,70);
L3.setBounds(20,120,120,70);
L4.setBounds(20,170,80,70);
L5.setBounds(20,220,80,70);
L6.setBounds(20,270,80,70);
L7.setBounds(20,320,150,70);
L8.setBounds(20,370,150,70);
L9.setBounds(20,420,100,70);
L10.setBounds(20,470,150,70);
L11.setBounds(20,530,150,70);
L12.setBounds(20,590,150,70);
L13.setBounds(20,650,150,70);
T1.setBounds(70,45,100,30);
T2.setBounds(110,90,110,30);
T3.setBounds(130,140,190,30);
T4.setBounds(110,190,120,30);
T5.setBounds(110,240,120,30);
T6.setBounds(110,290,190,30);
T7.setBounds(150,340,190,30);
T8.setBounds(150,390,150,30);
T9.setBounds(150,490,150,30);
T10.setBounds(170,610,170,30);
T11.setBounds(170,670,170,30);
g.setBounds(120,440,150,30);
R1.setBounds(480,790,100,40);
R2.setBounds(680,790,100,40);
c.setBounds(120,550,150,30);
L14.setBounds(600,20,200,80);
L15.setBounds(600,70,200,80);
L16.setBounds(600,120,200,80);
T12.setBounds(700,45,175,30);
T13.setBounds(710,95,175,30);
T14.setBounds(790,145,190,30);
L17.setBounds(600,190,400,50);
L18.setBounds(600,250,200,50);
L19.setBounds(600,300,200,50);
L20.setBounds(600,350,200,50);
L21.setBounds(600,400,200,50);
L22.setBounds(600,450,200,50);
L23.setBounds(600,500,200,50);
T15.setBounds(790,260,170,30);
T16.setBounds(790,310,170,30);
T17.setBounds(790,360,170,30);
T18.setBounds(790,410,170,30);
h.setBounds(790,460,150,30);
T19.setBounds(790,510,170,30);
}

public void addComponentsToFrame()
{
	f.add(L1);
	f.add(L2);
	f.add(L3);
	f.add(L4);
	f.add(L5);
	f.add(L6);
	f.add(L7);
	f.add(L8);
	f.add(T1);
	f.add(T2);
	f.add(T3);
	f.add(T4);
	f.add(T5);
	f.add(T6);
	f.add(T7);
	f.add(T8);
	f.add(R1);
	f.add(R2);
	f.add(L9);
	f.add(L10);
	f.add(T9);
	f.add(g);
	f.add(c);
	f.add(L11);
	f.add(L12);
	f.add(L13);
	f.add(T10);
	f.add(T11);
	f.add(T12);
	f.add(T13);
	f.add(T14);
	f.add(L14);
	f.add(L15);
	f.add(L16);
	f.add(L17);
	f.add(L18);
	f.add(L19);
	f.add(L20);
	f.add(L21);
	f.add(L22);
	f.add(L23);
	f.add(T15);
	f.add(T16);
	f.add(T17);
	f.add(T18);
	f.add(h);
	f.add(T19);
}

public void actionEvent()
{
	R1.addActionListener(this);
	R2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==R1)
	{
		try {
			Connection a1= DriverManager.getConnection("jdbc:mysql://localhost/Mywork","root","root@123");
			PreparedStatement Pstatement=a1.prepareStatement("insert into StudentDetail(studentname, collegeid, collegename, course, duration, Email, ConfirmEmail, PhoneNumber,Gender,DOB,category,password,confirmpassword,fathername,mothername,gurdiancontactnumber,housenumber,locality,city,pincode,state,country) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			Pstatement.setString(1,T1.getText());
			Pstatement.setString(2,T2.getText());
			Pstatement.setString(3,T3.getText());
			Pstatement.setString(4,T4.getText());
			Pstatement.setString(5,T5.getText());
			Pstatement.setString(6,T6.getText());
			Pstatement.setString(7,T7.getText());
			Pstatement.setString(8,T8.getText());
			Pstatement.setString(9,g.getSelectedItem().toString());
			Pstatement.setString(10,T9.getText());
			Pstatement.setString(11,c.getSelectedItem().toString());
			Pstatement.setString(12,T10.getText());
			Pstatement.setString(13,T11.getText());
			Pstatement.setString(14,T12.getText());
			Pstatement.setString(15,T13.getText());
			Pstatement.setString(16,T14.getText());
			Pstatement.setString(17,T15.getText());
			Pstatement.setString(18,T16.getText());
			Pstatement.setString(19,T17.getText());
			Pstatement.setString(20,T18.getText());
			Pstatement.setString(21,h.getSelectedItem().toString());
			Pstatement.setString(22,T19.getText());
			Pstatement.executeUpdate();
			JOptionPane.showMessageDialog(null,"DATA SUBMITTED SUCCESFULLY");
			
		}catch(SQLException e1)
		{
			e1.printStackTrace();
		}
	}
	if(e.getSource()==R2)
	{
		T1.setText("");
		T2.setText("");
		T3.setText("");
		T4.setText("");
		T5.setText("");
		T6.setText("");
		T7.setText("");
		T8.setText("");
		T9.setText("");
		T10.setText("");
		T11.setText("");
		T12.setText("");
		T13.setText("");
		T14.setText("");
		T15.setText("");
		T16.setText("");
		T17.setText("");
		T18.setText("");
		T19.setText("");
		g.setSelectedItem("Gender");
		c.setSelectedItem("GENERAL");
		h.setSelectedItem("State");
	}
	
}
}

class Main2
{
	public static void main(String s[])
	{
		new Scholarship();
	}
}
