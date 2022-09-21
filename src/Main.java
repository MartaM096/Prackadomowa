import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //ForEachLoop
        String[] names=new String[] {"Jacek", "Marcin", "Wojtek", "Daniel", "Konrad"};
        for (String name:names){
            System.out.println(name);
            System.out.println("Enter your age");
            Scanner scanner = new Scanner (System.in);
            int age = scanner.nextInt();
            if (age <18) {
                System.out.println(name + " " + "you can't enter the club");
            } else {
                System.out.println(name + " " + "you can enter the club");
              if (age>18&25>age) {
                  System.out.println("You have a free beer");
              }
              else {
                  System.out.println("Sorry you're too old");
              }
            }








        }
    }
}