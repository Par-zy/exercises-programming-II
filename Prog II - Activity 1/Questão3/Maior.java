import java.util.Scanner;
public class Maior {
    
    public static void bigger(int A, int B) {
        if (A>B) {
            System.out.println("O número " + A + " é maior que " + B);
        } else if (B>A) {
            System.out.println("O número " + B + " é maior que " + A); 
        }
        else{
            System.out.println("Os números inseridos são iguais");
        }
    }

    public static void main(String args[]) {
        int a, b;
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        a = read.nextInt();
        System.out.println("Insira o segundo número: ");
        b = read.nextInt();

        bigger(a, b);

        read.close();
    }  
}
