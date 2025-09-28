import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class OrdemServico {
    
    public Integer id;
    public String nomeCliente;
    public String nomeProfissional;
    public Double valorServicoHora;
    public Double valorKmDeslocamento;
    public Double nroHorasTrabalhadas;
    public Double nroKmPercorrido;
    public Double valorServico;
    public Double valorDeslocamento;
    private Double valorPagar;    

    public OrdemServico() {
        this.id = 0;
        this.nomeCliente = "";
        this.nomeProfissional = "";
        this.nroHorasTrabalhadas = 0.0;
        this.valorKmDeslocamento = 0.0;
        this.nroKmPercorrido = 0.0;
        this.valorDeslocamento = 0.0;
        this.valorPagar = 0.0;
        this.valorServico = 0.0;
        this.valorServicoHora = 0.0;
    }

    public OrdemServico(Integer id, String nomeCliente, String nomeProfissional, Double valorServicoHora, Double valorKmDeslocamento, Double nroHorasTrabalhadas, Double nroKmPercorrido, Double valorServico, Double valorDeslocamento, Double valorPagar) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.nomeProfissional = nomeProfissional;
        this.valorServicoHora = valorServicoHora;
        this.valorKmDeslocamento = valorKmDeslocamento;
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
        this.nroKmPercorrido = nroKmPercorrido;
        this.valorServico = valorServico;
        this.valorDeslocamento = valorDeslocamento;
        this.valorPagar = valorPagar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public Double getValorServicoHora() {
        return valorServicoHora;
    }

    public void setValorServicoHora(Double valorServicoHora) {
        this.valorServicoHora = valorServicoHora;
    }

    public Double getValorKmDeslocamento() {
        return valorKmDeslocamento;
    }

    public void setValorKmDeslocamento(Double valorKmDeslocamento) {
        this.valorKmDeslocamento = valorKmDeslocamento;
    }

    public Double getNroHorasTrabalhadas() {
        return nroHorasTrabalhadas;
    }

    public void setNroHorasTrabalhadas(Double nroHorasTrabalhadas) {
        this.nroHorasTrabalhadas = nroHorasTrabalhadas;
    }

    public Double getNroKmPercorrido() {
        return nroKmPercorrido;
    }

    public void setNroKmPercorrido(Double nroKmPercorrido) {
        this.nroKmPercorrido = nroKmPercorrido;
    }

    public Double getValorServico() {
        return valorServico;
    }

    public void setValorServico(Double valorServico) {
        this.valorServico = valorServico;
    }

    public Double getValorDeslocamento() {
        return valorDeslocamento;
    }

    public void setValorDeslocamento(Double valorDeslocamento) {
        this.valorDeslocamento = valorDeslocamento;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }

    @Override
    public String toString() {
        return "\nORDEM DE SERVICO\nID: " + id + "\nCliente: " + nomeCliente
                + "\nProfissional: " + nomeProfissional + "\nValor da Hora do Servico: "
                + valorServicoHora + "\nValor do Km Deslocado: " + valorKmDeslocamento +"\nNumero de Horas Trabalhadas: "
                + nroHorasTrabalhadas + "\nKM Percorrido: " + nroKmPercorrido
                + "\nValor do Servico: R$" + valorServico + "\nValor do Deslocamento: R$"
                + valorDeslocamento + "\nTotal a Pagar: R$" + valorPagar;
    }
    
    public void calcularValorServico() {
        this.valorServico = this.valorServicoHora * this.nroHorasTrabalhadas;
    }
    
    public void calcularValorDeslocamento(){
        this.valorDeslocamento = this.valorKmDeslocamento * this.nroKmPercorrido;
    }
    
    public void calcularValorPagar() {
        this.valorPagar = this.valorServico + this.valorDeslocamento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nomeCliente);
        hash = 17 * hash + Objects.hashCode(this.nomeProfissional);
        hash = 17 * hash + Objects.hashCode(this.nroHorasTrabalhadas);
        hash = 17 * hash + Objects.hashCode(this.nroKmPercorrido);
        hash = 17 * hash + Objects.hashCode(this.valorPagar);
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
        final OrdemServico other = (OrdemServico) obj;
        if (!Objects.equals(this.nomeCliente, other.nomeCliente)) {
            return false;
        }
        if (!Objects.equals(this.nomeProfissional, other.nomeProfissional)) {
            return false;
        }
        if (!Objects.equals(this.valorServicoHora, other.valorServicoHora)) {
            return false;
        }
        if (!Objects.equals(this.valorKmDeslocamento, other.valorKmDeslocamento)) {
            return false;
        }
        if (!Objects.equals(this.nroHorasTrabalhadas, other.nroHorasTrabalhadas)) {
            return false;
        }
        if (!Objects.equals(this.nroKmPercorrido, other.nroKmPercorrido)) {
            return false;
        }
        if (!Objects.equals(this.valorServico, other.valorServico)) {
            return false;
        }
        if (!Objects.equals(this.valorDeslocamento, other.valorDeslocamento)) {
            return false;
        }
        return Objects.equals(this.valorPagar, other.valorPagar);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<OrdemServico> ordens = new ArrayList<>();
        int continuar = 1;
        
        while (continuar == 1) {
            OrdemServico ordem = new OrdemServico();
            System.out.print("\nNome do Cliente: ");
            ordem.setNomeCliente(scanner.nextLine());
            System.out.print("\nNome do Profissional: ");
            ordem.setNomeProfissional(scanner.nextLine());
            System.out.print("\nValor da Hora do Servico: ");
            ordem.setValorServicoHora(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("\nValor do KM Deslocado: ");
            ordem.setValorKmDeslocamento(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("\nHoras Trabalhadas: ");
            ordem.setNroHorasTrabalhadas(scanner.nextDouble());
            scanner.nextLine();
            System.out.print("\nKM Percorridos: ");
            ordem.setNroKmPercorrido(scanner.nextDouble());
            scanner.nextLine();
            ordem.calcularValorDeslocamento();
            ordem.calcularValorServico();
            ordem.calcularValorPagar();
            ordem.setId(ordem.hashCode());
            ordens.add(ordem);
            
            System.out.println();
            System.out.println("Deseja informar outra ordem?");
            System.out.println("1- Sim.");
            System.out.println("2- Nao.");
            System.out.println();
            continuar = scanner.nextInt();
            scanner.nextLine();
            
            if (continuar == 2) {
                for(OrdemServico os : ordens) {
                    System.out.println(os.toString());
                }
            }
        }
        scanner.close();
    }
}
