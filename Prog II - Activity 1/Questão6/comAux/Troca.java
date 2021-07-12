import java.util.Scanner;

public class Troca {
    public static void main(String[] args) {
        int a, b, aux;
        Scanner read = new Scanner(System.in);  

        System.out.println("Insira o número A: ");
        a = read.nextInt();
        System.out.println("Insira o número B: ");
        b = read.nextInt();
        System.out.println("Antes da troca, o valor de A era " + a + " e o valor de B era " + b);

        aux = b;
        b = a;
        a = aux;

        System.out.println("Depois da troca, o valor de A é " + a + " e o valor de B é " + b);



        read.close();
    }
}