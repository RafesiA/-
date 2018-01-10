import java.awt.*;
import javax.swing.*;

public class Order extends Lunch {
	JLabel lunchName = new JLabel("Ordering page");
	JButton buttonItem1 = new JButton("Button Item 1");
	JButton buttonItem2 = new JButton("Button Item 2");
	JButton buttonItem3 = new JButton("Button Item 3");
	JButton buttonItem4 = new JButton("Button Item 4");
		
	public Order() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		add(lunchName);
		add(buttonItem1);
		add(buttonItem2);
		add(buttonItem3);
		add(buttonItem4);
		setTitle("Ordering");
		setSize(500, 500);
		
	}
}
