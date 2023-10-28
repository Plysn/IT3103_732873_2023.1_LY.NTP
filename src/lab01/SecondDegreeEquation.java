package lab01;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */

import javax.swing.JOptionPane;

public class SecondDegreeEquation {
    public static void main(String[] args) {
        double a, b, c;
        double result;

        try {

            a = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "a", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE));
            b = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "b", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE));
            c = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "c", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE));
            if (a == 0) {
                JOptionPane.showInputDialog(null, "a cannot be 0", "ax^2+bx+c=0", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            double delta = b * b - 4 * a * c;
            if (delta < 0)
                JOptionPane.showMessageDialog(null, "Equation has no solution", "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            if (delta == 0) {
                result = -b / 2 * a;
                JOptionPane.showMessageDialog(null, "Equation has double root\nx = " + result, "Result",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a), x2 = (-b - Math.sqrt(delta)) / (2 * a);

                JOptionPane.showMessageDialog(null, "Equation has two distinct root\nx1 = " + x1 + "\nx2 = " + x2,
                        "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Input invalid", "Result", JOptionPane.INFORMATION_MESSAGE);
        }

        System.exit(0);
    }
}