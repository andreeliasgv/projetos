import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
    
    public void calcularValorMultaPagar() {
        this.valorMultaPagar = this.nroDiasAtraso*this.valorMultaDia;
    }

    @Override
    public String toString() {
        return "\nID do Emprestimo: " + this.idEmprestimo +
                "\n Nome do Aluno: " + this.nomeAluno +
                "\n Nome do Livro: " + this.nomeLivro +
                "\n Valor da Multa Diaria R$: " + this.valorMultaDia +
                "\n Dias em atraso: " + this.nroDiasAtraso +
                "\n Multa Total a pagar: R$" + this.valorMultaPagar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.idEmprestimo);
        hash = 73 * hash + Objects.hashCode(this.nomeAluno);
        hash = 73 * hash + Objects.hashCode(this.valorMultaPagar);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        return Objects.equals(this.idEmprestimo, other.idEmprestimo);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int cont = 0, continuar =1;
        
        List<Biblioteca> emprestimos = new ArrayList<>();
        
        while (continuar==1) {
            Biblioteca emprestimo = new Biblioteca();
            cont++;
            System.out.println("\nCadastro de Emprestimo");
            emprestimo.setIdEmprestimo(cont);
            System.out.print("\nAluno: ");
            emprestimo.setNomeAluno(scanner.nextLine());
            System.out.print("\nNome do Livro: ");
            emprestimo.setNomeLivro(scanner.nextLine());
            System.out.print("\nValor da multa diaria: ");
            emprestimo.setValorMultaDia(scanner.nextDouble());
            System.out.print("\nDias em atraso: ");
            emprestimo.setNroDiasAtraso(scanner.nextDouble());
            emprestimo.calcularValorMultaPagar();
            emprestimos.add(emprestimo);
            
            System.out.println("Deseja cadastrar outro emprestimo?");
            System.out.println("1-Sim");
            System.out.println("2-Nao");
            continuar = scanner.nextInt();
            scanner.nextLine();
        }
        
        for (Biblioteca emprestimo : emprestimos) {
            System.out.println(emprestimo.toString());
        }
        
        scanner.close();
        
    }
}
