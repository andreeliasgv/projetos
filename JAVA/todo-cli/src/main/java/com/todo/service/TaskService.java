package com.todo.service;
import java.util.ArrayList;
import com.todo.model.Task;

public class TaskService {
    private ArrayList<Task> tarefas;
    
    public TaskService() {
        this.tarefas = new ArrayList<Task>();
    }
    
    public void adicionarTarefa(Task tarefa) {
        this.tarefas.add(tarefa);
    }
    
    public ArrayList<Task> listarTarefas() {
        return this.tarefas;
    }
    
    public Task buscarPorId (int id) {
        for (Task t : tarefas) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }
    
    public void concluirTarefa(int id) {
        Task tarefa = buscarPorId(id);
        if (tarefa != null) {
            tarefa.setConcluida(true);
        }
    }
    
    public void removerTarefa(int id) {
        Task tarefa = buscarPorId(id);
        if (tarefa != null) {
            tarefas.remove(tarefa);
        }
    }
    
    public void listarPorTag(String tag) {
        
        boolean encontrou = false;
        
        for (Task t : tarefas) {
            if (t.getTag().equalsIgnoreCase(tag)) {
                System.out.println(t);
                encontrou = true;
            }
        }
        
        if (!encontrou) {
            System.out.println("Nenhuma tarefa com essa tag foi encontrada.");
        }
    }
    
    public void mostrarTarefas() {
        
        if (this.tarefas.isEmpty()) {
            System.out.println("A lista de tarefas esta vazia.");
        } else {
            System.out.println("\nLista de Tarefas:");
            for (Task t : this.tarefas) {
                System.out.println(t);
            }
        }
    }
}