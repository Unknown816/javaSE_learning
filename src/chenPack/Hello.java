package chenPack;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("please choice:");
        System.out.println(" 1: Rock");
        System.out.println(" 2: Scissors");
        System.out.println(" 3: Paper");
        System.out.println(" else: Exit");
        // 用户输入:
        Scanner scanners = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {
            int choice = scanners.nextInt();
            // 计算机随机数 1, 2, 3:
            int random = 1 + (int) (Math.random() * 3);
            switch (choice) {
                case 1:
                    if (random == 1) System.out.println("You Rock, System Rock, draw!");
                    else if (random == 2) System.out.println("You Rock, System Scissors, win!");
                    else System.out.println("You Rock, System Paper, lost!");
                    break;
                case 2 :
                    if (random == 1) System.out.println("You Scissors, System Rock, lost!");
                    else if (random == 2) System.out.println("You Scissors, System Scissors, draw!");
                    else System.out.println("You Scissors, System Paper, win!");
                    break;
                case 3 :
                    if (random == 1) System.out.println("You Paper, System Rock, win!");
                    else if (random == 2) System.out.println("You Paper, System Scissors, lost!");
                    else System.out.println("You Paper, System Paper, draw!");
                    break;
                default :
                    flag=0;
                    break;
            }
        }
    }
}
