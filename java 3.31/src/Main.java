import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2 ,num3,num4;
        Scanner sc = new Scanner(System.in);


        System.out.print("숫자를 입력하시오: ");
        num1 = sc.nextInt();
        System.out.print("숫자를 입력하시오: ");
        num2 = sc.nextInt();
        System.out.print("숫자를 입력하시오: ");
        num3 = sc.nextInt();
        System.out.print("숫자를 입력하시오: ");
        num4 = sc.nextInt();

        

        System.out.println("총점: "  + (num1+num2+num3+num4));
        System.out.printf("평균값: %d\n", (num1+num2+num3+num4)/ 4);
        System.out.printf("실수 평균값: %2f", (double)(num1+num2+num3+num4)/4);


    }
}