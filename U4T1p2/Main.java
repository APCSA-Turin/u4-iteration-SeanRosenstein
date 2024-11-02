package U4T1p2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What number do you want to halve to one? ");
    int num = scanner.nextInt();
    int newNum=num;
    int count = 0;
    while (!(newNum==1)){
        System.out.println(newNum/2);
        newNum/=2;
        count++;
  }
   System.out.println("It takes " + count + " halvings to get from " + num + " to 1.");
    scanner.close();
  }
}
