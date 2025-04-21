package br.petshop.model;

public class BanhoETosa extends Servico {
    private String porteAnimal;

    public BanhoETosa(String porteAnimal) {
        super("Banho e Tosa", 0); // 
        this.porteAnimal = porteAnimal;
        calcularPreco(); 
    }

    public String getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
        calcularPreco(); 
    }

    @Override
    public double calcularPreco() {
        switch (porteAnimal.toLowerCase()) {
            case "pequeno":
                preco = 50.0;
                break;
            case "médio":
                preco = 70.0;
                break;
            case "grande":
                preco = 90.0;
                break;
            default:
                preco = 60.0; 
        }
        return preco;
    }

 
    public String toString() {
        return super.toString() + " - Porte: " + porteAnimal;
    }
}