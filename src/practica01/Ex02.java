package practica01;

import java.util.Objects;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();
/*
        System.out.println("hello!");
        System.exit(200);
*/
        ex02.read_line_and_exit();

    }

    public void read_line_and_exit()
    {
        Scanner sc = new Scanner(System.in);
        String str;
        String correct;
        String incorrect;

        str = sc.nextLine();
        correct = "BYE";
        incorrect = "ERROR";
       while (!Objects.equals(str, correct) || Objects.equals(str, incorrect ))
       {
           if (Objects.equals(str, correct))
           {
               System.out.println("correct");
               System.exit(200);
           }
           else if (Objects.equals(str, incorrect))
           {
               System.out.println("error");
               System.exit(200);
           }
           str = sc.nextLine();
       }

    }
}
