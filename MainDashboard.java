
import javax.swing.*;
import java.awt.*;

public class MainDashboard extends JFrame {

    private JButton buttonSearch, buttonBorrowed, buttonReturn;

    public MainDashboard() {
        super("Main Dashboard");
        this.setSize(1024, 576);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,0);
        // Creating buttons
        buttonSearch = new JButton("Search Book");
        buttonSearch.setPreferredSize(new Dimension(200, 30));
        buttonBorrowed = new JButton("Borrowed Book");
        buttonBorrowed.setPreferredSize(new Dimension(200, 30));
        buttonReturn = new JButton("Return Book");
        buttonReturn.setPreferredSize(new Dimension(200, 30));

        // Creating panels and adding buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1)); // Grid layout with gaps
        buttonPanel.add(buttonSearch);
        buttonPanel.add(buttonBorrowed);
        buttonPanel.add(buttonReturn);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Padding around panel

        
        JPanel mainPanel =(JPanel)this.getContentPane() ;
        mainPanel.setLayout(new GridBagLayout()); // Center the button panel
        mainPanel.add(buttonPanel);

        this.setVisible(true);
    }

   
}
