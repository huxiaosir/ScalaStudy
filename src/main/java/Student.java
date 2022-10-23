/**
 * @author : joisen
 * @date : 15:41 2022/10/22
 */
public class Student {
    private String name;
    private Integer age;
    private static String school = "Peking U";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public void printInfo(){
        System.out.println(this.name + "  "+this.age+"  "+Student.school);
    }

    public static void main(String[] args) {
        Student zs = new Student("zs", 11);
        zs.printInfo();
    }
}
