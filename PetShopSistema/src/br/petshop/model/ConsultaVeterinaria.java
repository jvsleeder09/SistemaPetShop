package br.petshop.model;

public class ConsultaVeterinaria extends Servico {
    private String especialidade;

    public ConsultaVeterinaria(String especialidade) {
        super("Consulta Veterinária", 65.0); // 
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double calcularPreco() {
        return preco;
    }

    public String toString() {
        return super.toString() + " - Especialidade: " + especialidade;
    }
}