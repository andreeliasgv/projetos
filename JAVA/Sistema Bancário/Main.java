import java.util.Scanner;
import java.util.Locale;

class Conta {
    
    public String banco;
    public String numeroAgencia;
    public String numeroConta;
    public Double saldoAtual;

    public Conta() {
        this.banco = "";
        this.numeroAgencia = "";
        this.numeroConta = "";
        this.saldoAtual = 0.0;
    }

    public Conta(String banco, String numeroAgencia, String numeroConta, Double saldoAtual) {
        this.banco = banco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoAtual = saldoAtual;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(Double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    public String depositar(double valor){
        this.saldoAtual += valor;
        return "\nDeposito concluIdo com sucesso!";
    }
    
    public String sacar(double valor){
        if (this.saldoAtual>=valor) {
            this.saldoAtual -= valor;
            return "\nSaque concluido com sucesso!";
        } else {
            return "\nSALDO INSUFICIENTE!";
        }
    }

    @Override
    public String toString() {
        String saldoFormatado = String.format("%.2f", saldoAtual);
        return "CONTA BANCARIA" + "\nBanco: " + banco + "\nNumero da Agencia: " + numeroAgencia + "\nNumero da Conta:" + numeroConta + "\nSaldo Atual: R$" + saldoFormatado;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);
        int op = 0;
        
        Conta c1 = new Conta();
        System.out.println("Informe seu banco:");
        c1.setBanco(scanner.nextLine());
        
        System.out.println("Informe o numero da agencia: ");
        c1.setNumeroAgencia(scanner.nextLine());
        
        System.out.println("Informe o numero da sua conta: ");
        c1.setNumeroConta(scanner.nextLine());
        
        System.out.println();
        
        System.out.println(c1.toString());
        
        while(op != 4) {
            System.out.println("\nEscolha uma opcao: ");
            System.out.println("1 - DEPOSITAR");
            System.out.println("2 - SACAR");
            System.out.println("3 - CONSULTAR INFORMACOES");
            System.out.println("4 - SAIR\n");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Informe a quantia para deposito: ");
                    System.out.println(c1.depositar(scanner.nextDouble()));
                    break;
                
                case 2:
                    System.out.println("Informe a quantia para saque: ");
                    System.out.println(c1.sacar(scanner.nextDouble()));
                    break;
                case 3:
                    System.out.println(c1.toString());
                    break;
                case 4:
                    System.out.println("APLICACAO FINALIZADA.");
                    break;
                default:
                    System.out.println("Por favor, selecione uma opção valida!");
                    break;
            }
        }
    }
    
}
