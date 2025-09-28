import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    int numero, resultado, c;
    System.out.println("INFORME O NUMERO DA TABUADA: ");
    numero = scanner.nextInt();
    
    for (c=0;c<=10;c++) {
        resultado = numero*c;
        System.out.println(numero+"x"+c+"="+resultado);
    }

    scanner.close();

    }

}
