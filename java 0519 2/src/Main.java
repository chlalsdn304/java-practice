import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("학생수를 입력하세요: ");
        int studentCount = sc.nextInt();
        System.out.println("과목수를 입력하세요: ");
        int subjectCount = sc.nextInt();
        int[][] scores = new int[studentCount][subjectCount];

        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = sc.nextInt();
            }
        }
        System.out.println("----성적표----");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적");
            for (int j = 0; j < subjectCount; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: "+scores[i][j]);
            }
        }
    }
}
