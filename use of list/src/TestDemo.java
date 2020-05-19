import java.util.ArrayList;
import java.util.List;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/19
 * @Content:
 */

class Student{
    public String name;
    public  String classes;
    public double score;

    public Student(String name, String classes, double score) {
        this.name = name;
        this.classes = classes;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Student student1 = new Student("lxy","火箭2班",50.0);
        Student student2 = new Student("ysm","火箭1班",33.5);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        System.out.println(list);

    }

}
