import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JLabel label = new JLabel();
		JTextField textField = new JTextField();
		JLabel label2 = new JLabel();
		frame.setVisible(true);
		frame.setBounds(100, 100, 800, 500);
		frame.setTitle("Temperature Calculator");
		label.setText("Enter Temperature");
		button.setText("Click");
		label2.setText("F");
		textField.setColumns(20);
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		panel.add(label2);
		frame.add(panel);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				String temperature = textField.getText();
				float celsius = Float.parseFloat(temperature);
				float fahrenhiet = (celsius*1.8F)+32;
				String temp = fahrenhiet+"F";
				label2.setText(temp);
				}
				catch (NumberFormatException nfe) {
					JOptionPane.showMessageDialog(frame, "Please enter temperature!");
				}
			}
		} );

	}

}
