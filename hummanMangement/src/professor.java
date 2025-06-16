import java.util.ArrayList;

public class professor extends person {
    private ArrayList<String> lectures;

    public professor(String id, String name, String status, String birthDate, String contact) {
        super(id, name, status, birthDate, contact);
        this.lectures = new ArrayList<>();
    }

    public void addLecture(String lecture) {
        this.lectures.add(lecture);

    }

    public void printlectures() {
        super.printInfo();
        System.out.println("수강 교과목 목록");
        if (lectures.isEmpty()) {
            System.out.println("없음");
        } else {
            for (String course : lectures) {
                System.out.println(course);
            }
        }
    }
}
