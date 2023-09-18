import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    static void checkNum(int b,int c,int d){
        if(d==2 && b==c){
            System.out.println("Congratulations!! Correct Answer");
            exit(1);
        }
        else if(d==2 && b!=c){
            System.out.println("Woops! Try again");
            exit(1);
        }
        else if (b == c) {
            System.out.println("Congratulations!! Correct Answer");
            exit(1);
        } else if (b > c) {
            System.out.println("Try a higher number");
        } else {
            System.out.println("Try a lower number");
        }
    }


    public static void main(String[] args) {
        int i=0;
        Random random = new Random();
        int x = random.nextInt(100);
        System.out.println("A Random Number between 1-100 is generated");
        System.out.println("You have 3 attempts");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i <3; i++) {
            System.out.println(+i + 1 + " attempt");
            int a = sc.nextInt();
            checkNum(x, a, i );
        }
    }
}