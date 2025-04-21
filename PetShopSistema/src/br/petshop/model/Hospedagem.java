package br.petshop.model;

public class Hospedagem extends Servico {
    private int diarias;
    private double precoPorDia;

    public Hospedagem(int diarias, double precoPorDia) {
        super("Hospedagem", 0);
        this.diarias = diarias;
        this.precoPorDia = precoPorDia;
        calcularPreco();
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
        calcularPreco();
    }

    public double getPrecoPorDia() { 
    	
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
        calcularPreco();
    }

    public double calcularPreco() {
        preco = diarias * precoPorDia;
        return preco;
    }

  
    public String toString() {
        return super.toString() + " - " + diarias + " diárias a R$" + String.format("%.2f", precoPorDia) + " por dia";
    }
}