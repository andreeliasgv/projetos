package com.todo.model;
public class Task {
    
    private int id;
    private String descricao;
    private boolean concluida;
    private String tag;
    
    public Task(int id, String descricao, String tag) {
            this.id = id;
            this.descricao = descricao;
            this.tag = tag;
            this.concluida = false;
    }
    
    public int getId() {
        return this.id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    public boolean isConcluida() {
        return this.concluida;
    }
    public String getTag() {
        return this.tag;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public void setConcluida(boolean concluida){
        this.concluida = concluida;
    }
    public void setTag(String tag){
        this.tag = tag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nID: ").append(id);
        sb.append("\nDescricao: ").append(descricao);
        sb.append("\nConcluida: ").append(concluida);
        sb.append("\nTag: ").append(tag);
        System.out.println();
        return sb.toString();
    }
    
    
}
