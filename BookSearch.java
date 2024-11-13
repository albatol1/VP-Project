/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecPackage;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author helah
 */
public class BookSearch extends JFrame{
    private JLabel searchBy , searchLabel ;
    private JComboBox list1 ;
    private JTextField field1  ;
    private JButton searchButton , back ;
    private String columns[] = {"Title","Author","Genre"};
    public BookSearch(){
        super("");
        
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);

        Font fontButton = new Font("Arial", Font.PLAIN, 16); 
        Font fontText = new Font("Segoe UI Variable Display Semib", Font.BOLD, 14); 
        Font fonttitle = new Font("Segoe UI Variable Display Semib", Font.BOLD, 16); 

        
        searchBy = new JLabel("Search by: ");
            searchBy.setFont(fontText);
        searchLabel = new JLabel("Search:      ");
            searchLabel.setFont(fontText);
        
        list1 = new JComboBox (columns);
            list1.setPreferredSize(new Dimension(150, 25));
        
        field1 = new JTextField();
            field1.setPreferredSize(new Dimension(150, 25));  
        
        searchButton = new JButton("Search");
            searchButton.setFont(fontButton);
        back = new JButton("Back");
            back.setFont(fontButton);
            
        
        JPanel subPanel1 = new JPanel();
            subPanel1.add(searchBy,FlowLayout.LEFT);
            subPanel1.add(list1);
            
        JPanel subPanel2 = new JPanel();
            subPanel2.add(searchLabel,FlowLayout.LEFT);
            subPanel2.add(field1);
            
        JPanel subPanel3 = new JPanel();
            subPanel3.add(searchButton);
            subPanel3.add(back);
            
            
        JPanel mainpanel1 =new JPanel();
            TitledBorder title;
            title = BorderFactory.createTitledBorder("Search Book");
            title.setTitleFont(fonttitle);
            mainpanel1.setBorder(title);
            mainpanel1.setLayout(new BoxLayout(mainpanel1 , BoxLayout.Y_AXIS));
            mainpanel1.add(Box.createVerticalStrut(20));
            mainpanel1.add(subPanel1);
            mainpanel1.add(Box.createVerticalStrut(20));
            mainpanel1.add(subPanel2);
            mainpanel1.add(Box.createVerticalStrut(20));
            mainpanel1.add(subPanel3);
            
        JPanel mainpanel = (JPanel) this.getContentPane();
            mainpanel.add(mainpanel1,BorderLayout.CENTER);

       this.setVisible(true) ;
            
    }
}
