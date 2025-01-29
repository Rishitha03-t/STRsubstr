import java.util.Scanner;

public class substr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a string with letters more than 6 : ");
        String a=sc.nextLine();
        System.out.println(a.substring(0,6));
    }
}