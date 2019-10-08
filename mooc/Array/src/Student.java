import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Student {

    private String name;
    private int score;

    public Student(String studentName, int studentScore){
        name = studentName;
        score = studentScore;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %d)", name, score);
    }

    public static void main(String[] args) {
//        StringBuffer
//         HashMap0.75 List1+0.5
//        ArrayList
//        Hashtable
//        StringBuffer
        //2，引用数据类型
        Array<Student> arr = new Array<>();
        arr.addLast(new Student("Alice", 100));
        arr.addLast(new Student("Bob", 66));
        arr.addLast(new Student("Charlie", 88));
        System.out.println(arr);




        ArrayList list = new ArrayList();
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);

    }
}
