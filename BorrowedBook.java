/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecPackage ;
import javax.swing.*;
import java.awt.*;
//import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

/**
 *
 * @author helah
 */
public class BorrowedBook extends JFrame{
    private JButton Back ;
    private String columns[] = {"No." , "Title" , "Author","Genre","Borrowing Date" , "Returned Date", "By user" };
    private JTable table ;
    
    public BorrowedBook (){
    super("Borrowed Books");
   
    this.setSize(1024, 576);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocation(0,0);
    
    Font fontButton = new Font("Arial", Font.PLAIN, 16); 
    Font fontTable = new Font("Segoe UI Variable Display Semib", Font.BOLD, 14); 

    Back = new JButton("Back");
        Back.setFont(fontButton);
       
    
    DefaultTableModel model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        JTableHeader header = table.getTableHeader();
        header.setReorderingAllowed(false);
        header.setFont(fontTable);
        JScrollPane scrollPane = new JScrollPane(table);
       
    
    JPanel subPanel1 = new JPanel();
        subPanel1.setLayout(new BorderLayout());
        subPanel1.add(scrollPane);
        
     
    JPanel subPanel2 = new JPanel();
        subPanel2.add(Back);
    
    JPanel mainpanel = (JPanel) this.getContentPane();
        mainpanel.add(subPanel1,BorderLayout.NORTH);
        mainpanel.add(subPanel2,BorderLayout.PAGE_END);
    
    this.setVisible(true) ;

}
    
}
