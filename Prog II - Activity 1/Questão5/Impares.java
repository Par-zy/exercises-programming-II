public class Impares{
    public static void main(String[] args) {
        int soma = 0;
        double multi = 1;
        for (int i = 1; i<=30; i++){
            if(i%2 != 0){
               soma = soma + i;
            }
            if(i%2 == 0){
                multi = multi * i;
            }
        }
        System.out.println("A soma dos números ímpares entre 1 e 30 é igual a " + soma);
        System.out.println("A multiplicação dos números pares entre 1 e 30 é igual a " + multi);
    }
}