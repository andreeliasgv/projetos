package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList();
    }
    
    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }
    
    public void removerConta(Conta conta){
        if (this.contas.contains(conta)) {
            this.contas.remove(conta);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void listarContas(){
        for(Conta c : contas) {
            c.getNumero();
        }
    }
}
