import java.util.Scanner;
public class Maior {
    public static void main(String args[]) {
        int a, b;
        Scanner read = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        a = read.nextInt();
        System.out.println("Insira o segundo número: ");
        b = read.nextInt();

        if (a>b) {
            System.out.println("O número " + a + " é maior que " + b);
        } else if (b>a) {
            System.out.println("O número " + b + " é maior que " + a); 
        }
        else{
            System.out.println("Os números inseridos são iguais");
        }
    }  
}
