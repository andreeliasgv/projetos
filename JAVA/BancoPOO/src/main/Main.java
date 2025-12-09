package main;

import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        
        Banco itau = new Banco("Itau");
        Cliente andre = new Cliente("Andre");
        Conta cc = new ContaCorrente(itau, andre);
        cc.depositar(40000d);
        
        Banco bb = new Banco("Banco do Brasil");
        Conta cp = new ContaPoupanca(bb, andre);
        cp.depositar(10000d);
        
        cc.transferir(cp, 5000d);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}
