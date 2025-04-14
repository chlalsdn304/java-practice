import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double kor=85,eng=92,math=78,sci=95,sum,doubleAvg;
        int intAvg;
        boolean boolResult=false;

        sum = kor+eng+math+sci;
        intAvg = (int)(sum/4);
        doubleAvg = sum/4;
        boolResult=intAvg==doubleAvg;

        System.out.printf("총점: %.2f\n",sum);
        System.out.printf("int 평균값: %d\n",intAvg);
        System.out.printf("double 평균값: %.2f\n",doubleAvg);
        System.out.println("정수 실수 값 비교"+boolResult);



    }
}