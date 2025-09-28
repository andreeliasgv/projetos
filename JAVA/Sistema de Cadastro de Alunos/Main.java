import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

class Aluno {
    public Integer idAluno;
    public String nomeAluno;
    public Double notaTrabalhoAV1;
    public Double notaProvaAV1;
    private Double mediaAV1;
    public Double notaTrabalhoAV2;
    public Double notaProvaAV2;
    private Double mediaAV2;
    private Double mediaFinal;

    public Aluno() {
        this.idAluno = 0;
        this.nomeAluno = "";
        this.notaTrabalhoAV1 = 0.0;
        this.notaProvaAV1 = 0.0;
        this.mediaAV1 = 0.0;
        this.notaTrabalhoAV2 = 0.0;
        this.notaProvaAV2 = 0.0;
        this.mediaAV2 = 0.0;
        this.mediaFinal = 0.0;
    }

    public Aluno(Integer idAluno, String nomeAluno, Double notaTrabalhoAV1, Double notaProvaAV1, Double mediaAV1, Double notaTrabalhoAV2, Double notaProvaAV2, Double mediaAV2, Double mediaFinal) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.notaTrabalhoAV1 = notaTrabalhoAV1;
        this.notaProvaAV1 = notaProvaAV1;
        this.mediaAV1 = mediaAV1;
        this.notaTrabalhoAV2 = notaTrabalhoAV2;
        this.notaProvaAV2 = notaProvaAV2;
        this.mediaAV2 = mediaAV2;
        this.mediaFinal = mediaFinal;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public Double getNotaTrabalhoAV1() {
        return notaTrabalhoAV1;
    }

    public void setNotaTrabalhoAV1(Double notaTrabalhoAV1) {
        this.notaTrabalhoAV1 = notaTrabalhoAV1;
    }

    public Double getNotaProvaAV1() {
        return notaProvaAV1;
    }

    public void setNotaProvaAV1(Double notaProvaAV1) {
        this.notaProvaAV1 = notaProvaAV1;
    }

    public Double getMediaAV1() {
        return mediaAV1;
    }

    public void setMediaAV1(Double mediaAV1) {
        this.mediaAV1 = mediaAV1;
    }

    public Double getNotaTrabalhoAV2() {
        return notaTrabalhoAV2;
    }

    public void setNotaTrabalhoAV2(Double notaTrabalhoAV2) {
        this.notaTrabalhoAV2 = notaTrabalhoAV2;
    }

    public Double getNotaProvaAV2() {
        return notaProvaAV2;
    }

    public void setNotaProvaAV2(Double notaProvaAV2) {
        this.notaProvaAV2 = notaProvaAV2;
    }

    public Double getMediaAV2() {
        return mediaAV2;
    }

    public void setMediaAV2(Double mediaAV2) {
        this.mediaAV2 = mediaAV2;
    }

    public Double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(Double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    @Override
    public String toString() {
        return "\nALUNO\nID: " + idAluno + "\nNOME: " + nomeAluno + "\nNOTA TRABALHO AV1: "
                + notaTrabalhoAV1 + "\nNOTA PROVA AV1: " + notaProvaAV1 + "\nMEDIA AV1: "
                + mediaAV1 + "\nNOTA TRABALHO AV2: " + notaTrabalhoAV2 + "\nNOTA PROVA AV2:"
                + notaProvaAV2 + "\nMEDIA AV2: " + mediaAV2 + "\nMEDIA FINAL: " + mediaFinal;
    }
    
    public void calcularMediaAV1() {
        this.mediaAV1 = (this.notaProvaAV1 + this.notaTrabalhoAV1)/2;
    }
    
    public void calcularMediaAV2() {
        this.mediaAV2 = (this.notaProvaAV2 + this.notaTrabalhoAV2)/2;
    }
    
    public void calcularMediaFinal() {
        this.mediaFinal = (this.mediaAV1 + this.mediaAV2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        ArrayList<Aluno> alunos = new ArrayList<>();
        
        int op = 0, id = 1;
        
        while (op != 2) {
            System.out.println("\nSelecione uma opcao");
            System.out.println("1 - ADICIONAR ALUNO");
            System.out.println("2 - IMPRIMIR RESULTADOS\n");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    Aluno aluno = new Aluno();
                    
                    System.out.println("CADASTRAR ALUNO:");
                    aluno.setIdAluno(id++);
                    scanner.nextLine();
                    System.out.print("NOME: ");
                    aluno.setNomeAluno(scanner.nextLine());
                    System.out.print("NOTA TRABALHO AV1: ");
                    aluno.setNotaTrabalhoAV1(scanner.nextDouble());
                    System.out.print("NOTA PROVA AV1: ");
                    aluno.setNotaProvaAV1(scanner.nextDouble());
                    System.out.print("NOTA TRABALHO AV2: ");
                    aluno.setNotaTrabalhoAV2(scanner.nextDouble());
                    System.out.print("NOTA PROVA AV2: ");
                    aluno.setNotaProvaAV2(scanner.nextDouble());
                    aluno.calcularMediaAV1();
                    aluno.calcularMediaAV2();
                    aluno.calcularMediaFinal();
                    alunos.add(aluno);
                    break;
                    
                case 2:
                    break;
                    
                default:
                    System.out.println("INFORME UMA OPCAO VALIDA!");
                    break;
            }  
        }
        
        System.out.println("\n========= ALUNOS CADASTRADOS =========");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("\n========= ALUNOS CADASTRADOS =========");
        
            scanner.close();
    }
}
