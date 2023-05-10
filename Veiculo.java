
// Classe abstrata que representa um veículo
abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected double capacidadeTanque;
    protected double consumoMedio;
    
    public Veiculo(String marca, String modelo, double capacidadeTanque, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoMedio = consumoMedio;
    }
    
    // Método abstrato que calcula a autonomia do veículo, implementado nas subclasses
    public abstract double calcularAutonomia();
    
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
    
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }
    
    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public double getConsumoMedio() {
        return consumoMedio;
    }
    
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}

// Classe que representa um carro
class Carro extends Veiculo {
    public Carro(String marca, String modelo, double capacidadeTanque, double consumoMedio) {
        super(marca, modelo, capacidadeTanque, consumoMedio);
    }
    
    // Implementação do método abstrato calcularAutonomia
    public double calcularAutonomia() {
        return capacidadeTanque * consumoMedio;
    }
}

// Classe que representa uma moto
class Moto extends Veiculo {
    public Moto(String marca, String modelo, double capacidadeTanque, double consumoMedio) {
        super(marca, modelo, capacidadeTanque, consumoMedio);
    }
    
    // Implementação do método abstrato calcularAutonomia
    public double calcularAutonomia() {
        return capacidadeTanque * consumoMedio;
    }
}

// Classe que representa um carro elétrico
class CarroEletrico extends Veiculo {
    private double autonomiaBateria;
    
    public CarroEletrico(String marca, String modelo, double autonomiaBateria) {
        super(marca, modelo, 0, 0);
        this.autonomiaBateria = autonomiaBateria;
    }
    
    public CarroEletrico(String marca, String modelo, double capacidadeTanque, double consumoMedio) {
        super(marca, modelo, capacidadeTanque, consumoMedio);
    }

    // Implementação do método abstrato calcularAutonomia
    public double calcularAutonomia() {
        return autonomiaBateria;
    }
    
    public double getAutonomiaBateria() {
        return autonomiaBateria;
    }
    
    public void setAutonomiaBateria(double autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }
}