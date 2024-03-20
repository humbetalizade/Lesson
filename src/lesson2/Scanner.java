package lesson2;

public class Scanner {
        public static void main(String[] args) {
                 java.util.Scanner scanner=new java.util.Scanner(System.in);
//                System.out.println("Adinizi daxil edin");
//                String a=input.nextLine();
//                System.out.println("Yasinizi daxil edin");
//                int b=input.nextInt();
//                System.out.println("Adiniz "+a+"dir"+" ve "+b+ " yasiniz var.");


                System.out.println("Zehmet olmasa deyer daxil edin : ");
                char c = scanner.next().charAt(0);


                System.out.println("Deyer: "  + c);

        }
}

