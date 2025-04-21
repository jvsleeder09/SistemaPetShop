package br.petshop.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Servico {
    private String nome;
    protected double preco;
    private LocalDateTime dataAgendamento;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDateTime getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(LocalDateTime dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getDataAgendamentoFormatado() {
        if (dataAgendamento != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            return dataAgendamento.format(formatter);
        }
        return "Não agendado";
    }

    public abstract double calcularPreco();


    public String toString() {
        return nome + " (Preço: R$" + String.format("%.2f", preco)
             + ", Agendado para: " + getDataAgendamentoFormatado() + ")";
    }
}
