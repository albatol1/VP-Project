/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecPackage;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
/**
 *
 * @author helah
 */
public class BookInventory extends JFrame {
    private JButton Delete , Update , Back ;
    private String columns[] = {"No." , "Title" , "Author","Genre","Description" , "Puplishing Date" };
    private JTable table ;
    
    public BookInventory (){
        super("Book Inventory");
        
        //Window setting
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        
        //Font setting
        Font fontButton = new Font("Arial", Font.PLAIN, 16); 
        Font fontTable = new Font("Segoe UI Variable Display Semib", Font.BOLD, 14); 
       
        Delete = new JButton("Delete");
            Delete.setFont(fontButton);
        Update = new JButton("Update");
            Update.setFont(fontButton);
        Back = new JButton("Back");
            Back.setFont(fontButton);
            
        DefaultTableModel model = new DefaultTableModel(columns, 0);
            table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            JTableHeader header = table.getTableHeader();
            header.setReorderingAllowed(false);
            header.setFont(fontTable);
            
        JPanel subPanel1 = new JPanel();
            subPanel1.setLayout(new BorderLayout());
            subPanel1.add(scrollPane);
            
        JPanel subPanel2 = new JPanel();
            subPanel2.add(Delete);
            subPanel2.add(Update);
            subPanel2.add(Back);
            
        JPanel mainpanel = (JPanel) this.getContentPane();
        mainpanel.add(subPanel1,BorderLayout.NORTH);
        mainpanel.add(subPanel2,BorderLayout.PAGE_END);
        
    this.setVisible(true) ;

        
    }
}
