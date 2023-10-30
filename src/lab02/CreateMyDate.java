package lab02;

import java.time.LocalDate;

public class CreateMyDate {
  private int date, month, year;
  public CreateMyDate() {
    LocalDate today = java.time.LocalDate.now();
    this.date = today.getDayOfMonth();
    this.month = today.getMonthValue();
    this.year = today.getYear();
  }
  public int checkMonth(String month) {
    // System.out.println(month.equals("1"));
    if (month.equals("1") || (month.equals("January")) || month.equals("Jan.") || month.equals("Jan")) {
      // System.out.println("thang 1");
      return 1;
    } else if (month.equals("2") || month.equals("February") || month.equals("Feb.") || month.equals("Feb"))
      return 2;
    else if (month.equals("3") || month.equals("March") || month.equals("Mar.") || month.equals("Mar"))
      return 3;
    else if (month.equals("4") || month.equals("April") || month.equals("Apr.") || month.equals("Apr"))
      return 4;
    else if (month.equals("5") || month.equals("May"))
      return 5;
    else if (month.equals("6") || month.equals("June") || month.equals("Jun"))
      return 6;
    else if (month.equals("7") || month.equals("July") || month.equals("Jul"))
      return 7;
    else if (month.equals("8") || month.equals("August") || month.equals("Aug.") || month.equals("Aug"))
      return 8;
    else if (month.equals("9") || month.equals("September") || month.equals("Sept.") || month.equals("Sep"))
      return 9;
    else if (month.equals("10") || month.equals("October") || month.equals("Oct.") || month.equals("Oct"))
      return 10;
    else if (month.equals("11") || month.equals("November") || month.equals("Nov.") || month.equals("Nov"))
      return 11;
    else if (month.equals("12") || month.equals("December") || month.equals("Dec.") || month.equals("Dec"))
      return 12;
    else
      return 0;
  }
  public CreateMyDate(String date) {
    String[] split = date.split(" ");
    this.month = checkMonth(split[0]);
    // String d = split[1].substring(0, 2);
    this.date = Integer.parseInt(split[1], 0, split[1].length() - 2, 10);
    this.year = Integer.parseInt(split[2]);
  }
  public CreateMyDate(int date, int month, int year) {
    this.date = date;
    this.month = month;
    this.year = year;
  }
  public String toString() {
    return date + "/" + month + "/" + year;
  }
  public void print() {
    System.out.println("DAY/MONTH/YEAR\n" + date + "/" + month + "/" + year);
  }
  public int getDate() {
    return date;
  }
  public void setDate(int date) {
    this.date = date;
  }
  public int getMonth() {
    return month;
  }
  public void setMonth(int month) {
    this.month = month;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
}