package br.petshop.model;

public class Adestramento extends Servico {
    private int sessoes;
    private double precoPorSessao;

    public Adestramento(int sessoes, double precoPorSessao) {
        super("Adestramento", 0);
        this.sessoes = sessoes;
        this.precoPorSessao = precoPorSessao;
        calcularPreco();
    }

    public int getSessoes() {
        return sessoes;
    }

    public void setSessoes(int sessoes) {
        this.sessoes = sessoes;
        calcularPreco();
    }

    public double getPrecoPorSessao() {
        return precoPorSessao;
    }

    public void setPrecoPorSessao(double precoPorSessao) {
        this.precoPorSessao = precoPorSessao;
        calcularPreco();
    }

  
    public double calcularPreco() {
        preco = sessoes * precoPorSessao;
        return preco;
    }


    public String toString() {
        return super.toString() + " - " + sessoes + " sessões a R$" + String.format("%.2f", precoPorSessao) + " por sessão";
    }
}