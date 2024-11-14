import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class OnlineLibaryManagementSystem extends JFrame {
    
    private JLabel TitleLabel , userNameLabel , passwordLabel ;
    private JTextField userNameTextField  ;
    private JPasswordField passwordTextField;
    private JButton LogInButton , ExitButton ;
    private JCheckBox showPassword ;
    
    public OnlineLibaryManagementSystem(){
        
        
        this.setTitle("Online Libary Management System");
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        JPanel mainP = (JPanel) this.getContentPane();
        mainP.setLayout(new GridLayout(6,1));

        JPanel m1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        TitleLabel = new  JLabel("Welcome to  Libary Management System");
        m1.add(TitleLabel);
        
        JPanel m2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        userNameLabel = new JLabel("Username   ");
        userNameTextField = new JTextField(15);
        m2.add(userNameLabel);
        m2.add(userNameTextField);
        
        JPanel m3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        passwordLabel = new JLabel("Password   ");
        passwordTextField = new JPasswordField(15);
        m3.add(passwordLabel);
        m3.add(passwordTextField);
        
        JPanel m4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        showPassword = new JCheckBox("show Password");
        m4.add(showPassword);
        
       JPanel m5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        LogInButton = new JButton("  Login  ");
        m5.add(LogInButton);
        
       
        JPanel m6 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ExitButton = new JButton("  Exit  ");
        m6.add(ExitButton);
      
        mainP.add(m1);
        mainP.add(m2);
        mainP.add(m3);
        mainP.add(m4);
        mainP.add(m5);
        mainP.add(m6);



        LogInButton.addActionListener(new LogInButtonAction());
        ExitButton.addActionListener(new ExitButtonAction());
        
       showPassword.addItemListener(new ItemListener() { 
                     public void itemStateChanged(ItemEvent e) { 
                         if (e.getStateChange() == ItemEvent.SELECTED) {
                                 passwordTextField.setEchoChar((char) 0);  
                       } else {  
                                  passwordTextField.setEchoChar('*');  
            } 
    }
});
      this.setVisible(true);
      

          
    }
    
     public class LogInButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            try{
           if(userNameTextField.getText().equals(""))
               throw new EmptyException("User Name is Empty , Please Enter User Name");
            if(passwordTextField.getText().equals(""))
                throw new EmptyException("Password is Empty , Please Enter Password");
            
            String uName = userNameTextField.getText();
            String password = new String(passwordTextField.getPassword());
            if(authenticate(uName ,password ))
                 JOptionPane.showMessageDialog(null , "Login successful ! ","Successful",JOptionPane.INFORMATION_MESSAGE);
            else
                throw new ErrorLogin("Login unsuccessful , Check your information");
             new DashboardAdmin();
             dispose();
            }catch(EmptyException e2){
               JOptionPane.showMessageDialog(null , e2.getMessage(),"Empty text",JOptionPane.WARNING_MESSAGE);
            }catch(ErrorLogin e2){
               JOptionPane.showMessageDialog(null , e2.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }

     
    public class EmptyException extends Exception{
        public EmptyException(String msg){
            super(msg);
        }
    }
    
     public class ErrorLogin extends Exception{
        public ErrorLogin(String msg){
            super(msg);
        }
    }
    public class ExitButtonAction implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }
    
    public boolean authenticate(String Uname , String password){
        String query = "SELECT * FROM Users WHERE UserName = ? AND Password = ? ";
        try{
            // هنا يتغير المسار حسب وين مكان حفظك لقاعدة البيانات
          Connection c = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/LibraryDB.accdb");
          PreparedStatement stmt = c.prepareStatement(query);
          stmt.setString(1, Uname);
          stmt.setString(2,password);
          ResultSet rs = stmt.executeQuery();
          return rs.next();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false ;
    }
    public static void main(String[] args) {
       OnlineLibaryManagementSystem L1 = new OnlineLibaryManagementSystem();

    }
}
