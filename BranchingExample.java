
import java.util.Scanner;

public class BranchingExample {

  public static void main(String[] args) {
    // switch Example
    System.out.println("Enter the day number: ");
    Scanner sc = new Scanner(System.in);
    int day = sc.nextInt();
    String dayName;
    dayName = switch (day) {
      case 1 -> "monday";
      case 2 -> "tuesday";
      case 3 -> "wednesday";
      case 4 -> "thrusday";
      case 5 -> "friday";
      case 6 -> "saturday";
      case 7 -> "sunday";
      default -> "Invalid day";
    };
    System.out.println("You choose: " + dayName);

    // 2nd example of branching
    BreakStatement(5);
  }

  public static void BreakStatement(int num) {
    for (int i = 0; i < 10; i++) {
      if (i == num) {
        break;
      }
      System.out.println(i);
    }
    System.out.println("out of loop");
  }
}