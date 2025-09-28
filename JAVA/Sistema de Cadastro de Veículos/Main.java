import java.util.Scanner;

class Vehicle {
    
    private Integer id;
    private String marca;
    private String modelo;
    private String ano;
    private Double valorVenda;

    public Vehicle() {
        this.id = 0;
        this.marca = "";
        this.modelo = "";
        this.ano = "";
        this.valorVenda = 0.0;
    }

    public Vehicle(Integer id, String marca, String modelo, String ano, Double valorVenda) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valorVenda = valorVenda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    public String printVehicle() {
        return "Vehicle ID: " + this.id +
                "\n Brand: " + this.marca +
                "\n Model: " + this.modelo +
                "\n Color: " + this.ano +
                "\n Sell Price: " + this.valorVenda;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int id;
        String marca, modelo, ano;
        double valorVenda;
        
        System.out.println("Informe o ID do veiculo: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a marca do veiculo: ");
        marca = scanner.nextLine();
        System.out.println("Informe o modelo do veiculo: ");
        modelo = scanner.nextLine();
        System.out.println("Informe o ano do veiculo: ");
        ano = scanner.nextLine();
        System.out.println("Informe o valor de venda do veiculo: ");
        valorVenda = scanner.nextDouble();
        
        Vehicle a = new Vehicle();
        a.setId(id);
        a.setMarca(marca);
        a.setModelo(modelo);
        a.setAno(ano);
        a.setValorVenda(valorVenda);
        
        System.out.println(a.printVehicle());
        
    }   
}

