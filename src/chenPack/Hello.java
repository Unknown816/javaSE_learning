package chenPack;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pastSC=scanner.nextInt();
        int nowSC=scanner.nextInt();
        System.out.printf("%.2f%%",100.0*(nowSC-pastSC)/pastSC);
    }
}
