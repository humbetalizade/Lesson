package lesson10.students;

public class Student {
    String name="Amal Huseynov";
    int age=19;
    public void getGrade(int grade){
        grade=(grade-1)/10;
        switch (grade){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            default:
                System.out.println("-");
        }
    }
}
