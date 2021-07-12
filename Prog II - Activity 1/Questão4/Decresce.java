import java.util.Scanner;

public class Decresce {
    public static void main(String[] args) {
        int n;
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o número inteiro: ");
        n = ler.nextInt();
        for(int i = n; i >= 0; i--){
            System.out.println(i);
        }

        ler.close();
    }
}

//falta jogar tudo no método.
