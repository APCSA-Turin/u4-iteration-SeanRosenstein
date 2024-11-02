package U4T1p2;

import java.util.Scanner;

public class Snake {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int roll = 1;
    int eye1 = 0;
    int eye2 = 0;
    int extra = 0;
    while (!((eye1==1)&&(eye2==1))) {
      if(extra!=0){
      System.out.println("Not snake eyes, rolling again!");
      }
      eye1 = (int)(Math.random()*6)+1;
      eye2 = (int)(Math.random()*6)+1;
      System.out.println("Roll #" + roll + ": " + eye1 + " and " + eye2);
      roll++;
      extra++;
    }
    System.out.println("Finally, snake eyes!");
    scanner.close();
  }
}
