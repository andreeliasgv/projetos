import java.util.Scanner;
public class Calcular_idade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double aniversario, nascimento, anos, meses, dias;

        System.out.println("Informe o ano do seu nascimento: ");
        nascimento = scanner.nextDouble();
        System.out.println("Informe o ano do seu último aniversário: ");
        aniversario = scanner.nextDouble();

        anos = aniversario-nascimento;
        meses = anos*12;
        dias = anos*365;

        System.out.println("Sua idade é: ");
        System.out.println(anos+" anos ou");
        System.out.println(meses+" meses ou");
        System.out.println(dias+" dias.");

        if (anos >= 18) {
            System.out.println("Você é maior de idade.");
        } else {System.out.println("Você é menor de idade.");
    }
        scanner.close();
    }
}
