package chenPack;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double weight=scanner.nextDouble();
        double height=scanner.nextDouble();
        double bmi=weight/(height*height);
        System.out.printf("BMI : %.2f\n",bmi);
        if(bmi>32){
            System.out.println("非常肥胖");
        }else if(bmi>=28){
            System.out.println("肥胖");
        }else if(bmi>=25){
            System.out.println("过重");
        }else if(bmi>=18.5){
            System.out.println("正常");
        }else{
            System.out.println("过轻");
        }
    }
}
