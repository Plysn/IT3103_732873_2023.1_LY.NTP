package lab01;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */

import javax.swing.JOptionPane;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        String a, b;
        a = JOptionPane.showInputDialog(null, "a", "ax + b = 0 (a != 0)", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "b", "ax + b = 0 (a != 0)", JOptionPane.INFORMATION_MESSAGE);
        double result;
        try {

            result = -Double.parseDouble(b) / Double.parseDouble(a);
            JOptionPane.showMessageDialog(null, "x = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            // TODO: handle exception
            JOptionPane.showMessageDialog(null, "Input invalid", "Result", JOptionPane.INFORMATION_MESSAGE);

        }

        System.exit(0);
    }
}
