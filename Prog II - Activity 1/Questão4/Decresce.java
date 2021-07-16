import java.util.Scanner;

public class Decresce {

    public static void decrescer(int N) {
        for(int i = N; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o número inteiro: ");
        n = ler.nextInt();

        decrescer(n);

        ler.close();
    }
}