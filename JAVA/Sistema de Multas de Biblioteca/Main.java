import java.util.Scanner;

class Biblioteca {
    private Integer idEmprestimo;
    private String nomeAluno;
    private String nomeLivro;
    private Double valorMultaDia;
    private Double nroDiasAtraso;
    private Double valorMultaPagar;
    
    
    public Biblioteca() {
        this.idEmprestimo = 0;
        this.nomeAluno = "";
        this.nomeLivro = "";
        this.valorMultaDia = 0.0;
        this.nroDiasAtraso = 0.0;
        this.valorMultaPagar = 0.0;
    }

    public Biblioteca(Integer idEmprestimo, String nomeAluno, String nomeLivro, Double valorMultaDia, Double nroDiasAtraso, Double valorMultaPagar) {
        this.idEmprestimo = idEmprestimo;
        this.nomeAluno = nomeAluno;
        this.nomeLivro = nomeLivro;
        this.valorMultaDia = valorMultaDia;
        this.nroDiasAtraso = nroDiasAtraso;
        this.valorMultaPagar = valorMultaPagar;
    }

    public Integer getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Integer idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public Double getValorMultaDia() {
        return valorMultaDia;
    }

    public void setValorMultaDia(Double valorMultaDia) {
        this.valorMultaDia = valorMultaDia;
    }

    public Double getNroDiasAtraso() {
        return nroDiasAtraso;
    }

    public void setNroDiasAtraso(Double nroDiasAtraso) {
        this.nroDiasAtraso = nroDiasAtraso;
    }

    public Double getValorMultaPagar() {
        return valorMultaPagar;
    }

    public void setValorMultaPagar(Double valorMultaPagar) {
        this.valorMultaPagar = valorMultaPagar;
    }
    
    public Double printValorMultaPagar() {
        return this.valorMultaPagar = this.nroDiasAtraso*this.valorMultaDia;
    }
    
    public String printBiblioteca() {
        return "ID do Emprestimo: " + this.idEmprestimo +
                "\n Nome do Aluno: " + this.nomeAluno +
                "\n Nome do Livro: " + this.nomeLivro +
                "\n Valor da Multa Diaria R$: " + this.valorMultaDia +
                "\n Dias em atraso: " + this.nroDiasAtraso +
                "\n\n Multa Total a pagar: R$";
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Informe o ID do emprestimo: ");
        biblioteca.setIdEmprestimo(scanner.nextInt());
        System.out.println("Informe o nome do Aluno: ");
        scanner.nextLine();
        biblioteca.setNomeAluno(scanner.nextLine());
        System.out.println("Informe o nome do Livro: ");
        biblioteca.setNomeLivro(scanner.nextLine());
        System.out.println("Informe o valor da multa diária: ");
        biblioteca.setValorMultaDia(scanner.nextDouble());
        System.out.println("Informe o numero de dias em atraso: ");
        biblioteca.setNroDiasAtraso(scanner.nextDouble());
        
        System.out.println();
        
        System.out.println(biblioteca.printBiblioteca());
        System.out.println(biblioteca.printValorMultaPagar());  
    }
}
