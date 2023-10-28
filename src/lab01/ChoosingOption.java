package lab01;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */


import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Nguyen Thi Phuong Ly - 4612 - Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "you've chosen: " +  (option==JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}

}