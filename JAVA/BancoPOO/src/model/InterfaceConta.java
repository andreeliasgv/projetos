package model;

public interface InterfaceConta {
    void depositar(Double valor);
    
    void sacar(Double valor);
    
    void transferir(Conta contaDestino, Double valor);
    
    void imprimirExtrato();
}
