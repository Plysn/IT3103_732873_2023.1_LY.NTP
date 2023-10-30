package lab02;

/**
 * 
 * @author NguyenThiPhuongLy_20194612
 *
 */

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    CreateMyDate myDate = new CreateMyDate();
    System.out.println("Today : ");
    myDate.print();
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter a date : ");
    String inputDate = kb.nextLine();
    myDate = new CreateMyDate(inputDate);
    myDate.print();
    kb.close();
  }
}
