import java.util.Scanner;
import java.util.Locale;

class Emprestimo {
    
    private String cliente;
    private String banco;
    private Double valorEmprestimo;
    private Integer numeroParcelas;
    private Double ValorParcela;
    private Double ValorParcelasPagas;
    private Double ValorParcelasPagar;

    public Emprestimo() {
        this.cliente = "";
        this.banco = "";
        this.valorEmprestimo = 0.0;
        this.numeroParcelas = 0;
        this.ValorParcela = 0.0;
        this.ValorParcelasPagas = 0.0;
        this.ValorParcelasPagar = 0.0;
    }

    public Emprestimo(String cliente, String banco, Double valorEmprestimo, Integer numeroParcelas, Double ValorParcela, Double ValorParcelasPagas, Double ValorParcelasPagar) {
        this.cliente = cliente;
        this.banco = banco;
        this.valorEmprestimo = valorEmprestimo;
        this.numeroParcelas = numeroParcelas;
        this.ValorParcela = ValorParcela;
        this.ValorParcelasPagas = ValorParcelasPagas;
        this.ValorParcelasPagar = ValorParcelasPagar;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(Double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public Double getValorParcela() {
        return ValorParcela;
    }

    public void setValorParcela(Double ValorParcela) {
        this.ValorParcela = ValorParcela;
    }

    public Double getValorParcelasPagas() {
        return ValorParcelasPagas;
    }

    public void setValorParcelasPagas(Double ValorParcelasPagas) {
        this.ValorParcelasPagas = ValorParcelasPagas;
    }

    public Double getValorParcelasPagar() {
        return ValorParcelasPagar;
    }

    public void setValorParcelasPagar(Double ValorParcelasPagar) {
        this.ValorParcelasPagar = ValorParcelasPagar;
    }
    
    public void valorParcela() {
        this.ValorParcela = this.valorEmprestimo / this.numeroParcelas;
    }

    @Override
    public String toString() {
        return "\nEMPRESTIMO \nCliente: " + cliente + "\nBanco: " + banco
                + "\nValor do Emprestimo: " + valorEmprestimo
                + "\nNumero de Parcelas: " + numeroParcelas
                + "\nValor da Parcela: R$" + ValorParcela + "\nValor Pago: R$"
                + ValorParcelasPagas + "\nValor Pendente: R$" + ValorParcelasPagar;
    }
    
    public String pagarParcela(int parcelas) {
        if (this.ValorParcelasPagar >= (parcelas*this.ValorParcela)) {
            this.ValorParcelasPagar -= (parcelas*this.ValorParcela);
            this.ValorParcelasPagas += (parcelas*this.ValorParcela);
            return "\n " + parcelas + " Parcela(s) paga(s) com sucesso!";
        } else if (this.ValorParcelasPagar/this.ValorParcela >= 1) {
            return "\n Foram encontradas somente " + this.ValorParcelasPagar/this.ValorParcela
                    + " parcelas no nome de " + this.cliente
                    + ". Informe um valor menor ou igual a esse.";
        } else {
            return "\nNenhuma parcela foi encontrada no nome de " + this.cliente
                    + ".";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        scanner.useLocale(Locale.US);
        int op = 0;
        
        Emprestimo e1 = new Emprestimo();
        System.out.println("Nome: ");
        e1.setCliente(scanner.nextLine());
        System.out.println("Banco: ");
        e1.setBanco(scanner.nextLine());
        System.out.println("Valor do Emprestimo: ");
        e1.setValorEmprestimo(scanner.nextDouble());
        scanner.nextLine();
        e1.setValorParcelasPagar(e1.getValorEmprestimo());
        System.out.println("Numero de Parcelas: ");
        e1.setNumeroParcelas(scanner.nextInt());
        scanner.nextLine();
        e1.valorParcela();
        
        System.out.println();
        System.out.println(e1.toString());
        
        while (op != 9) {
            System.out.println("\nSelecione uma opcao:");
            System.out.println("1 - Pagar Parcela");
            System.out.println("2 - Extrato Contrato");
            System.out.println("9 - Sair");
            op = scanner.nextInt();
            scanner.nextLine();
            
            switch (op) {
                case 1:
                    System.out.println("\nInforme a quantidade de parcelas a pagar:");
                    System.out.println(e1.pagarParcela(scanner.nextInt()));
                    scanner.nextLine();
                    break;
                
                case 2:
                    System.out.println(e1.toString());
                    break;
                    
                default:
                    System.out.println("\nSelecione uma opcao valida!");
                    break;
            }
        }

        System.out.println("\nSESSAO ENCERRADA.");
        
    }
}
