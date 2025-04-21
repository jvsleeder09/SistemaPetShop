package br.petshop.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private List<Pet> pets;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.pets = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public String listarPets() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pets do cliente ").append(nome).append(":\n");

        if (pets.isEmpty()) {
            sb.append("Nenhum pet cadastrado.");
        } else {
            for (Pet pet : pets) {
                sb.append("- ").append(pet).append("\n");
            }
        }

        return sb.toString();
    }

    public static String listarClientes(List<Cliente> lista) {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes cadastrados:\n");

        if (lista.isEmpty()) {
            sb.append("Nenhum cliente encontrado.");
        } else {
            for (Cliente c : lista) {
                sb.append(c).append("\n");
            }
        }

        return sb.toString();
    }

    public static Cliente buscarClientePorNome(List<Cliente> lista, String nome) {
        for (Cliente c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public static boolean excluirCliente(List<Cliente> lista, String nome) {
        Cliente c = buscarClientePorNome(lista, nome);
        if (c != null) {
            lista.remove(c);
            return true;
        }
        return false;
    }

 
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Telefone: " + telefone + "\n" +
               "Email: " + email;
    }

    public Pet buscarPetPorNome(String nomePet) {
        for (Pet p : pets) {
            if (p.getNome().equalsIgnoreCase(nomePet)) {
                return p;
            }
        }
        return null;
    }

    public boolean removerPetPorNome(String nomePet) {
        Pet p = buscarPetPorNome(nomePet);
        if (p != null) {
            pets.remove(p);
            return true;
        }
        return false;
    }

	}

