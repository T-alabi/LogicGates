import java.util.Scanner;

public class simulate {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        XorGate a = new XorGate();

        System.out.println("enter Input 1 (a)");
        int a1 = scan.nextInt();
        System.out.println("enter Input 2 (b)");
        int b1 = scan.nextInt();

       int b = a.ReturnXorGate(a1,b1);
        System.out.println(b);
       // a.ReturnAndGate(a1, b1);
    }
}
