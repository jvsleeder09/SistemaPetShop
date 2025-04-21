package br.petshop.main;

import br.petshop.model.*;
import br.petshop.agendamento.Agendamento;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {

    // Listas para armazenar os dados
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Agendamento> agendamentos = new ArrayList<>();

    public static void main(String[] args) {
        adicionarClientesIniciais();

        int opcao;
        do {
            opcao = mostrarMenu();

            switch (opcao) {
                case 1: cadastrarCliente(); break;
                case 2: listarClientes(); break;
                case 3: buscarCliente(); break;
                case 4: excluirCliente(); break;
                case 6: cadastrarPet(); break;
                case 7: listarPets(); break;
                case 8: excluirPet(); break;
                case 9: contratarServico(); break;
                case 10: listarServicos(); break;
                case 11: cancelarServico(); break;
                case 0: JOptionPane.showMessageDialog(null, "Saindo..."); break;
                default: JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void adicionarClientesIniciais() {
        Cliente c1 = new Cliente("Jon", "61-9999-8888", "jon@email.com");
        Cliente c2 = new Cliente("Lana", "61-8888-7777", "lana@email.com");
        c1.adicionarPet(new Pet("Jack", "Cachorro", "Poodle", 9, 17.0));
        c2.adicionarPet(new Pet("Kiara", "Gato", "Siames", 2, 4.0));
        clientes.add(c1);
        clientes.add(c2);
    }

    private static int mostrarMenu() {
        String[] opcoes = {
            "1. Cadastrar Cliente", "2. Listar Clientes", "3. Buscar Cliente",
            "4. Excluir Cliente", "6. Cadastrar Pet", "7. Listar Pets",
            "8. Excluir Pet", "9. Contratar Serviço", "10. Listar Serviços",
            "11. Cancelar Serviço", "0. Sair"
        };

        String escolha = (String) JOptionPane.showInputDialog(
            null, "Escolha uma opção:", "Menu", JOptionPane.PLAIN_MESSAGE,
            null, opcoes, opcoes[0]
        );

        if (escolha == null) return 0;
        return Integer.parseInt(escolha.split("\\.")[0]);
    }

    private static void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog("Nome:");
        String tel = JOptionPane.showInputDialog("Telefone:");
        String email = JOptionPane.showInputDialog("Email:");

        if (nome != null && tel != null && email != null && !nome.isEmpty() && !tel.isEmpty() && !email.isEmpty()) {
            clientes.add(new Cliente(nome, tel, email));
            JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Dados inválidos.");
        }
    }

    private static void listarClientes() {
        String lista = Cliente.listarClientes(clientes);
        JOptionPane.showMessageDialog(null, lista);
    }

    private static void buscarCliente() {
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente c = Cliente.buscarClientePorNome(clientes, nome);
        if (c != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado:\n" + c);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void excluirCliente() {
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        boolean excluido = Cliente.excluirCliente(clientes, nome);
        JOptionPane.showMessageDialog(null, excluido ? "Cliente excluído!" : "Cliente não encontrado.");
    }

    private static void cadastrarPet() {
        String nomeCliente = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente cliente = Cliente.buscarClientePorNome(clientes, nomeCliente);
        if (cliente != null) {
            String nomePet = JOptionPane.showInputDialog("Nome do pet:");
            String especie = JOptionPane.showInputDialog("Espécie:");
            String raca = JOptionPane.showInputDialog("Raça:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));

            cliente.adicionarPet(new Pet(nomePet, especie, raca, idade, peso));
            JOptionPane.showMessageDialog(null, "Pet cadastrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void listarPets() {
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente c = Cliente.buscarClientePorNome(clientes, nome);
        if (c != null) {
            JOptionPane.showMessageDialog(null, c.listarPets());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void excluirPet() {
        String nomeCliente = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente c = Cliente.buscarClientePorNome(clientes, nomeCliente);
        if (c != null) {
            String nomePet = JOptionPane.showInputDialog("Nome do pet:");
            boolean removido = c.removerPetPorNome(nomePet);
            JOptionPane.showMessageDialog(null, removido ? "Pet excluído!" : "Pet não encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void contratarServico() {
        String nomeCliente = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente c = Cliente.buscarClientePorNome(clientes, nomeCliente);
        if (c != null) {
            String nomePet = JOptionPane.showInputDialog("Nome do pet:");
            Pet p = c.buscarPetPorNome(nomePet);

            if (p != null) {
                String[] opcoes = {"Banho e Tosa", "Consulta Veterinária", "Hospedagem", "Adestramento"};
                String tipo = (String) JOptionPane.showInputDialog(null, "Tipo de serviço:", "Serviço",
                        JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

                Servico servico = null;
                if (tipo != null) {
                    if (tipo.equals("Banho e Tosa")) {
                        String porte = JOptionPane.showInputDialog("Porte (Pequeno/Médio/Grande):");
                        servico = new BanhoETosa(porte);
                    } else if (tipo.equals("Consulta Veterinária")) {
                        String esp = JOptionPane.showInputDialog("Especialidade:");
                        servico = new ConsultaVeterinaria(esp);
                    } else if (tipo.equals("Hospedagem")) {
                        int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias:"));
                        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço por diária:"));
                        servico = new Hospedagem(dias, preco);
                    } else if (tipo.equals("Adestramento")) {
                        int sessoes = Integer.parseInt(JOptionPane.showInputDialog("Sessões:"));
                        double valor = Double.parseDouble(JOptionPane.showInputDialog("Preço por sessão:"));
                        servico = new Adestramento(sessoes, valor);
                    }

                    String dataHora = JOptionPane.showInputDialog("Data e hora (DD/MM/AAAA HH:MM):");
                    agendamentos.add(new Agendamento(c, p, servico, dataHora));
                    JOptionPane.showMessageDialog(null, "Serviço agendado!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pet não encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void listarServicos() {
        String nome = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente c = Cliente.buscarClientePorNome(clientes, nome);
        if (c != null) {
            StringBuilder lista = new StringBuilder("Agendamentos:\n");
            for (Agendamento a : agendamentos) {
                if (a.getCliente().equals(c)) {
                    lista.append(a).append("\n\n");
                }
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }

    private static void cancelarServico() {
        String nomeCliente = JOptionPane.showInputDialog("Nome do cliente:");
        Cliente c = Cliente.buscarClientePorNome(clientes, nomeCliente);
        if (c != null) {
            String nomePet = JOptionPane.showInputDialog("Nome do pet:");
            Pet p = c.buscarPetPorNome(nomePet);
            if (p != null) {
                String nomeServico = JOptionPane.showInputDialog("Nome do serviço:");
                Agendamento encontrado = null;
                for (Agendamento a : agendamentos) {
                    if (a.getCliente().equals(c) && a.getPet().equals(p) &&
                            a.getServico().getNome().equalsIgnoreCase(nomeServico)) {
                        encontrado = a;
                        break;
                    }
                }
                if (encontrado != null) {
                    agendamentos.remove(encontrado);
                    JOptionPane.showMessageDialog(null, "Serviço cancelado!");
                } else {
                    JOptionPane.showMessageDialog(null, "Agendamento não encontrado.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Pet não encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }
}
