import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        int sum= 0;

        for(int i = 0; i<=num; i++)
            if(i % 2 ==1){
                sum += i;
            }

        System.out.printf("1부터 %d까지 홀수의 합:%d",num,sum);
    }
}