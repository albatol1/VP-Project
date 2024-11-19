import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
public class BorrowedTableBook extends JFrame{
    
    private JButton Back ;
    private String columns[] = {"No." , "Title" , "Author","Genre","Borrowing Date" , "Returned", "Overdue" };
    private JTable table ;
    
    public BorrowedTableBook(){
        super( "Borrowed Book");
        
        //Window setting
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        
        //Font setting
        Font fontButton = new Font("Arial", Font.PLAIN, 16); 
        Font fontTable = new Font("Segoe UI Variable Display Semib", Font.BOLD, 14); 
       
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
            subPanel2.add(Back);
            
        JPanel mainpanel = (JPanel) this.getContentPane();
        mainpanel.add(subPanel1,BorderLayout.NORTH);
        mainpanel.add(subPanel2,BorderLayout.PAGE_END);
        
    this.setVisible(true) ;

        
    } 
}
