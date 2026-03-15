package com.todo.app;
import com.todo.service.TaskService;
import com.todo.model.Task;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        TaskService service = new TaskService();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Filtrar por tag");
            System.out.println("6 - Sair");
            System.out.println();
            System.out.print("Escolha uma opcao:\n> ");
            
            int opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("\nDigite o ID da tarefa:\n> ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("\nDigite a descricao da tarefa:\n> ");
                    String descricao = scanner.nextLine();
                    System.out.print("\nDigite a tag da tarefa:\n> ");
                    String tag = scanner.nextLine();
                    service.adicionarTarefa(new Task(id, descricao, tag));
                    System.out.println("\nTarefa adicionada com sucesso!");
                    break;
                    
                case 2:
                    service.mostrarTarefas();
                    break;
                
                case 3:
                    service.mostrarTarefas();
                    System.out.print("\nInforme o ID da tarefa a ser concluida:\n> ");
                    service.concluirTarefa(scanner.nextInt());
                    System.out.println("\nTarefa concluida!");
                    break;
                    
                case 4:
                    service.mostrarTarefas();
                    System.out.print("\nInforme o ID da tarefa a ser removida:\n> ");
                    service.removerTarefa(scanner.nextInt());
                    System.out.println("\nTarefa removida");
                    break;
                    
                case 5:
                    System.out.println("\nInforme a tag:\n> ");
                    service.listarPorTag(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("\nEncerrando...");;
                    return;
                    
                default:
                    System.out.println("\nERRO: Informe uma opcao valida!");
            }
        }
    }
}
