import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double kor,eng,math,sci,sum,doubleAvg;
        int intAvg;
        boolean boolResult=false;
        System.out.print("국어점수를 입력하세요");
        kor = sc.nextDouble();
        System.out.print("영어점수를 입력하세요");
        eng = sc.nextDouble();
        System.out.print("수학점수를 입력하세요");
        math = sc.nextDouble();
        System.out.print("과학점수를 입력하세요");
        sci = sc.nextDouble();

        sum = kor+eng+math+sci;
        intAvg = (int)(sum/4);
        doubleAvg = sum/4;
        boolResult=intAvg==doubleAvg;

        System.out.printf("총점: %.2f\n",sum);
        System.out.printf("int 평균값: %d\n",intAvg);
        System.out.printf("double 평균값: %.2f\n",doubleAvg);
        System.out.println("정수 실수 값 비교: "+boolResult);

        if (doubleAvg>80){
            System.out.print("합격");
        }else{
            System.out.print("불합격");
        }

    }
}