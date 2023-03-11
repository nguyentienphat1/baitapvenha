import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri a");
        a= scanner.nextInt();
        System.out.println("nhap gia tri b");
        b= scanner.nextInt();
        System.out.println("nhap gia tri c");
        c= scanner.nextInt();
        if (a>b) {
            System.out.println("a la so lon b");
            if (a > c) {
                System.out.println("a lon hon c");
            } else {
                System.out.println(" c lon hon a");
            }
        }
        else{
            System.out.println("b lon hon a");
        }
        if (a>b && a>c){
            System.out.println("a la so lon nhat");
        }
        else {
            System.out.println("a nho nhat");
        }
    }
}