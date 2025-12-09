package model;

public abstract class Conta implements InterfaceConta {
    protected Integer agencia;
    protected Integer numero;
    protected Double saldo;
    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private Cliente cliente;
    private Banco banco;
    
    public Conta(Banco banco, Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0d;
        this.banco = banco;
        this.cliente = cliente;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        if (valor<=this.saldo) {
            this.saldo-=valor;
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: R$"+this.getSaldo());
        }
    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {
        if (valor<=this.saldo) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo atual: R$"+this.getSaldo());
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO:");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Banco: %s", this.banco.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: R$%.2f\n", this.saldo));
    }
}
