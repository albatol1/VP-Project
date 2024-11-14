import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DashboardAdmin extends JFrame {
    
    private   JButton AddButton , BorrowedButton , SearchButton,UpdateButton , AddMemberButton , UpdateMemberButton , StatisticsButton;

    
    public DashboardAdmin(){

        this.setTitle("Dashboard Admin");
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        JPanel mainP = (JPanel) this.getContentPane();
        mainP.setLayout(new GridLayout(7,1));
        
        AddButton = new JButton("     Add Book     ");
        JPanel m1 = new JPanel(new FlowLayout());
        m1.add(AddButton);

        BorrowedButton = new JButton("Borrowed Book");
        JPanel m2 = new JPanel(new FlowLayout());
        m2.add(BorrowedButton);
        
        SearchButton = new JButton("  Search Book  ");
        JPanel m3 = new JPanel(new FlowLayout());
        m3.add(SearchButton);
        
        UpdateButton = new JButton("  Update Book  ");
        JPanel m4 = new JPanel(new FlowLayout());
        m4.add(UpdateButton);
  
        AddMemberButton = new JButton("  Add Member  ");
        JPanel m5 = new JPanel(new FlowLayout());
        m5.add(AddMemberButton);
        
        UpdateMemberButton = new JButton("Update Member"); 
        JPanel m6 = new JPanel(new FlowLayout());
        m6.add(UpdateMemberButton);
        
        StatisticsButton = new JButton("Statistics Report");
        JPanel m7 = new JPanel(new FlowLayout());
        m7.add(StatisticsButton);
        
        mainP.add(m1);
        mainP.add(m2);
        mainP.add(m3);
        mainP.add(m4);
        mainP.add(m5);
        mainP.add(m6);
        mainP.add(m7);
 
        this.setVisible(true);

        AddButton.addActionListener(new addBookButton());
        BorrowedButton.addActionListener(new Borrowed() );
        SearchButton.addActionListener(new searchBook());
        UpdateButton.addActionListener(new updateBook());
        AddMemberButton.addActionListener(new addMember());
        UpdateMemberButton.addActionListener(new updateMember());
        StatisticsButton.addActionListener(new statisticReport());
    }
    
    public class addBookButton implements ActionListener{
    public void actionPerformed(ActionEvent e){
        new addBook();
        dispose();
    
    }}
    
    public class Borrowed implements ActionListener{
    public void actionPerformed(ActionEvent e){
    new BorrowedBook();
            dispose();
    }}
    
      public class searchBook implements ActionListener{
    public void actionPerformed(ActionEvent e){
    new BookSearch();
            dispose();
    }}
      
        public class updateBook implements ActionListener{
    public void actionPerformed(ActionEvent e){
     new BookInventory();
            dispose();
    }}
        
    public class addMember implements ActionListener{
    public void actionPerformed(ActionEvent e){
    
    }}
            
    public class updateMember implements ActionListener{
    public void actionPerformed(ActionEvent e){
    
    }}
    
    public class statisticReport implements ActionListener{
    public void actionPerformed(ActionEvent e){
            new ReportModule();
            dispose();

    }}
   
}
