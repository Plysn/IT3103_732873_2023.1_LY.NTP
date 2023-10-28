package lab01;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */

import javax.swing.JOptionPane;

public class FirstDegreeEquaWith2var {
    public static void main(String[] args) {
        double a11, a12, b1, a21, a22, b2;
        a11 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "a11", "a11*x1 + a12*x2 = b1", JOptionPane.INFORMATION_MESSAGE));
        a12 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "a12", "a11*x1 + a12*x2 = b1", JOptionPane.INFORMATION_MESSAGE));
        b1 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "b1", "a11*x1 + a12*x2 = b1", JOptionPane.INFORMATION_MESSAGE));

        a21 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "a21", "a21*x1 + a22*x2 = b2", JOptionPane.INFORMATION_MESSAGE));
        a22 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "a22", "a21*x1 + a22*x2 = b2", JOptionPane.INFORMATION_MESSAGE));
        b2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "b2", "a21*x1 + a22*x2 = b2", JOptionPane.INFORMATION_MESSAGE));

        double D = a11 * a22 - a21 * a12, D1 = b1 * a22 - b2 * a12, D2 = a11 * b2 - a21 * b1;
        if (D != 0)
            JOptionPane.showMessageDialog(null, "x1 = " + D1 / D + "\nx2 = " + D2 / D, "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        if (D == 0 && D1 == 0 && D2 == 0) {
            JOptionPane.showMessageDialog(null, "System have infinintely solutions", "Result",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "System has no solution", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}