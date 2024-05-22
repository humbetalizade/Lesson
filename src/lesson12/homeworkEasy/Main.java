package lesson12.homeworkEasy;

public class Main {
    public static void main(String[] args) {
        Example e1=new Example();
        e1.setName("Samad");
        e1.setSurName("Alizade");
        e1.setAge(24);
        System.out.println(e1.getName());
        System.out.println(e1.getSurName());
        System.out.println(e1.getAge());



        Example e2=new Example();
        e2.setName("Samad");
        e2.setSurName("Alizade");
        e2.setAge(24);
        System.out.println(e2.getName());
        System.out.println(e2.getSurName());
        System.out.println(e2.getAge());


        System.out.println(e1.equals(e2));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}
