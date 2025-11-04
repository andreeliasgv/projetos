import java.util.Scanner;

public class Contador {

    public static class ParametrosInvalidosException extends Exception {
		public ParametrosInvalidosException(String message) {
			super(message);
		}
	}
	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("Parâmetros inválidos");
        }
		
		int contagem = parametroDois - parametroUm;
		
        for (int i = 0; i <contagem; i++) {
            System.out.println("Imprimindo o numero: " + (i+1));
        }
	}

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
		}
		
        terminal.close();
	}
}