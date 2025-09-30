import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Paciente {
    public Integer id;
    public String nome;
    public String diagnostico;
    public Integer idade;

    public Paciente() {
        this.id = 0;
        this.nome = "";
        this.diagnostico = "";
        this.idade = 0;
    }

    public Paciente(Integer id, String nome, String diagnostico, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.diagnostico = diagnostico;
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nPACIENTES\nID: " + id + "\nNome: " + nome + "\nDiagnostico: "
                + diagnostico + "\nIdade: " + idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.diagnostico);
        hash = 31 * hash + Objects.hashCode(this.idade);
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
        final Paciente other = (Paciente) obj;
        return Objects.equals(this.id, other.id);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int continuar = 1;
        int cont = 0;
        
        List<Paciente> pacientes = new ArrayList<>();
        while (continuar == 1) {
            cont++;
            Paciente paciente = new Paciente();
            System.out.print("CADASTRO DE PACIENTE:");
            paciente.setId(cont);
            System.out.print("\nNome: ");
            paciente.setNome(scanner.nextLine());
            System.out.print("\nIdade: ");
            paciente.setIdade(scanner.nextInt());
            scanner.nextLine();
            System.out.print("\nDiagnostico: ");
            paciente.setDiagnostico(scanner.nextLine());
            pacientes.add(paciente);
            
            System.out.println("\nDeseja cadastrar outro paciente?");
            System.out.println("1 - Sim.");
            System.out.println("2 - Nao.");
            continuar = scanner.nextInt();
            scanner.nextLine();
            
        }
        
        for(Paciente paciente : pacientes) {
            System.out.println(paciente.toString());
        }
        
        System.out.printf("\nPacientes Cadastrados: %d\n", cont);
        
        scanner.close();
    }
}
