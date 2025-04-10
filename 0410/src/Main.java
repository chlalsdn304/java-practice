import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seam1, seam2, seam3;

        System.out.print("전체 좌석수를 입력하세요");
        seam1 = sc.nextInt();
        System.out.print("이용중인 좌석수를 입력하세요");
        seam2 = sc.nextInt();

        seam3 = seam1 - seam2;

        if (seam3 >0){
        System.out.printf("이용 가능한 자석은 %d 석 입니다\n",seam3);
        }else{
        System.out.println("예매 하실 수 없습니다 ");
        }



    }
}