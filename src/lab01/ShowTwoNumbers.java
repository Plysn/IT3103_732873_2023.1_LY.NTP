package lab01;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */

import javax.swing.JOptionPane;
public class ShowTwoNumbers {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";
		
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Nguyen Thi Phuong Ly - 20194612",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		//message: Please input the first number, title: Nguyen Thi Phuong Ly - 20194612		
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Nguyen Thi Phuong Ly - 20194612",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		//message: Please input the second number, title: Nguyen Thi Phuong Ly - 20194612
		System.exit(0);
	}
}
