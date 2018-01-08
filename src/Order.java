import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Order extends JFrame {
	JLabel lunchName = new JLabel("Ordering page");
	public Order() {
		setTitle("Ordering");
		add(lunchName);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
