import javax.swing.*;
import java.awt.*;
             
public class NewMember extends JFrame{
    
    private JLabel labelUserName, labelPassword, labelDOB, labelGender, labelEmail;
    private JTextField textUserName,textPassword, textDOB, textEmail;
    private JRadioButton radioMale, radioFemale;
    private JButton buttonAdd, buttonBack;
    private ButtonGroup genderGroup;
    
    public NewMember() {
        super("New Member Details");
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        
        // Initializing labels
        labelUserName = new JLabel("User Name:");
        textUserName = new JTextField(20);
        labelUserName.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        labelPassword = new JLabel("Password:");
        textPassword = new JTextField(20);
        labelPassword.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        labelDOB = new JLabel("Date of Birth:");
        textDOB = new JTextField(20);
        labelDOB.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
        labelGender = new JLabel("Gender:");
         labelGender.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
         
        radioMale = new JRadioButton("Male");
        radioFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(radioMale);
        genderGroup.add(radioFemale);
        
        labelEmail = new JLabel("Email:");
        textEmail = new JTextField(20);
        labelEmail.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        
         // Initializing buttons
        buttonAdd = new JButton("Add");
        buttonBack = new JButton("Back");
 // Creating panels to group components
        JPanel mainPanel = (JPanel) this.getContentPane();
        JPanel formPanel = new JPanel(new GridLayout(5, 1));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        // Panels for grouping individual input fields
        JPanel panelUserName = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelUserName.add(labelUserName);
        panelUserName.add(textUserName);
        panelUserName.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        JPanel panelPassword = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelPassword.add(labelPassword);
        panelPassword.add(textPassword);
         panelPassword.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        JPanel panelDOB = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelDOB.add(labelDOB);
        panelDOB.add(textDOB);
        panelDOB.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        
        JPanel panelGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelGender.add(labelGender);
        panelGender.add(radioMale);
        panelGender.add(radioFemale);
         panelGender.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
         
        JPanel panelEmail = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelEmail.add(labelEmail);
        panelEmail.add(textEmail);
 panelEmail.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        // Adding panels to the form panel
        formPanel.add(panelUserName);
        formPanel.add(panelPassword);
        formPanel.add(panelDOB);
        formPanel.add(panelGender);
        formPanel.add(panelEmail);

        // Adding buttons to the button panel
        buttonPanel.add(buttonAdd);
        buttonPanel.add(buttonBack);

        // Adding main sections to the window
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

          this.setVisible(true) ;
    }
  
    
}
