import java.util.Scanner;

public class Maior_numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int s, n, m=0;

        System.out.println("Deseja informar um numero?");
        System.out.println("1 - Sim");
        System.out.println("0 - Nao");
        s = scanner.nextInt();

        while (s>0) {
            
            System.out.println("Informe um numero: ");
            n = scanner.nextInt();
            if (n>m) {
            m = n;

        System.out.println("Deseja informar outro numero?");
        System.out.println("1 - Sim");
        System.out.println("0 - Nao");
        s = scanner.nextInt();
            }
        }

        System.out.println("O maior numero foi: "+m);

        scanner.close();
    }
}
