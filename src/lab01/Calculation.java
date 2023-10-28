package lab01;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */

import javax.swing.JOptionPane;

public class Calculation {
	public static void main(String[] args) {
		String strNum1, strNum2;
		strNum1 = JOptionPane.showInputDialog(null, 
				"Please input the first number: ", "Nguyen Thi Phuong Ly -20194612",
				JOptionPane.INFORMATION_MESSAGE);
		strNum2 = JOptionPane.showInputDialog(null, 
				"Please input the second number: ", "Nguyen Thi Phuong Ly -20194612",
				JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		System.out.printf("Sum of two numbers: %f%n", num1 + num2);
		System.out.printf("Difference of two numbers: %f%n", num1 - num2);
		System.out.printf("Product of two numbers: %f%n", num1 * num2);
		System.out.printf("Quotient of two numbers: %f%n", num1 / num2);
		System.exit(0);
	}
}
