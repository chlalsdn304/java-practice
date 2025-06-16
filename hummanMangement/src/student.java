import javax.swing.*;
import java.util.ArrayList;

public class student extends person {
    private ArrayList<String> courses;

    public student(){

        super();
        this.courses = new ArrayList<>();

//        this.id = "";
//        this.name = "";
//        this.status = "";
//        this.birthDate = "";
//        this.courses = new ArrayList<>();
    }

    public student(String id, String name, String status, String birthDate, String contact){
        super(id, name,status,birthDate,contact);
        this.course = new ArrayList<>();

    }

    public void addCourse(String course){
        course.add(courses);
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("수강 교과목 목록");
        if (courses.isEmpty()) {
            System.out.println("없음");
        }
        else {
            for (String course: courses) {
                System.out.println(course);
            }
        }
    }
}

//import java.util.ArrayList;
//
//public class student {
//    private String id;
//    private String name;
//    private String status;
//    private String birthDate;
//    private String contact;
//    private ArrayList<String> courses;
//
//    public student()
//    {
//        id="";
//        name="";
//        status="";
//        birthDate="";
//        contact="";
//        courses=new ArrayList<>();
//    }
//    //constructor
//    public student(String id,String name,String status, String birthDate,String contact) {
//        this.id=id;
//        this.name=name;
//        this.status=status;
//        this.birthDate=birthDate;
//        this.contact=contact;
//        courses=new ArrayList<>();
//    }
//    //method
//    public void setStudent(String id,String name,String status,String birthDate,String contact) {
//        this.id=id;
//        this.name=name;
//        this.status=status;
//        this.birthDate=birthDate;
//        this.contact=contact;
//        courses=new ArrayList<>();
//
//    }
//
//    public void addCourse(String courseName) {
//        this.courses.add(courseName);
//    }
//    public void printCourses() {
//        if (courses.isEmpty()) {
//            System.out.println("없음");
//        } else {
//            for (String course : courses)
//                System.out.println(course);
//        }
//    }
//
//    public void printInfo(){
//        System.out.println("ID: "+id);
//        System.out.println("Name: "+name);
//        System.out.println("Status: "+status);
//        System.out.println("Birth Date: "+birthDate);
//        System.out.println("Contact: "+contact);
//        System.out.println("");
//    }
//}
//

