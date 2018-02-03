import java.awt.*;
import javax.swing.*;

public class Order extends JFrame {
	JLabel lunchName = new JLabel("Ordering page");
	JButton buttonItem1 = new JButton("Button Item 1");
	JButton buttonItem2 = new JButton("Button Item 2");
	JButton buttonItem3 = new JButton("Button Item 3");
	JButton buttonItem4 = new JButton("Button Item 4");
	JTextField sum = new JTextField(8);
		
	public Order() {
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(10);
		setLayout(grid);
		lunchName.setLayout(null);
		lunchName.setLocation(200, 0);
		add(lunchName);
		add(buttonItem1);
		add(buttonItem2);
		add(buttonItem3);
		add(buttonItem4);
		add(sum);
		setTitle("Ordering");
		setSize(500, 500);
		
	}
}
