package br.petshop.model;

import java.util.ArrayList;
import java.util.List;

public class PacoteServicos {
    private String nome;
    private List<Servico> servicos = new ArrayList<>();
    private double desconto;

    public PacoteServicos(String nome, double desconto) {
        this.nome = nome;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public double calcularPrecoTotal() {
        double total = 0;
        for (Servico s : servicos) total += s.getPreco();
        return total * (1 - desconto);
    }

  
    public String toString() {
        String texto = "Pacote: " + nome + " (Desconto: " + (int)(desconto * 100) + "%)\n";
        for (Servico s : servicos) texto += "  - " + s + "\n";
        texto += "  Total com desconto: R$" + String.format("%.2f", calcularPrecoTotal());
        return texto;
    }
}
