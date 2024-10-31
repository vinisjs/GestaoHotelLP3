import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cadastro de clientes - Nome - CPF - E-mail - Telefone
        // Cadastro de quartos - Número do quarto - Tipo do quarto (ex: simples, duplo,
        // suíte) - Preço por noite - Status (disponível, reservado, em manutenção)
        // Reservas de quartos - Cliente que fez a reserva - Data de entrada - Data de
        // saída - Quarto reservado
        Cliente cliente = new Cliente();
        List<Cliente> listaDeClientes = new ArrayList<Cliente>();
        String menu = "1 - Para Cadastrar Clientes\n2 - Para listar todos os clientes cadastrados\n0 - Para Sair";
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcao) {
                case 1:
                    cliente.setNome(JOptionPane.showInputDialog(null, "entre com o nome do cliente"));
                    cliente.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "entre com o CPF do cliente")));
                    cliente.setEmail(JOptionPane.showInputDialog(null, "entre com o e-mail do cliente"));
                    cliente.setTelefone(Long
                            .parseLong(JOptionPane.showInputDialog(null, "entre com o número do telefone do cliente")));
                    if (!cliente.getNome().isEmpty() && cliente.getNome() != "") {
                        listaDeClientes.add(cliente);
                        JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "O nome do cliente é obrigatório!");
                    }
                    break;
                case 2:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
            }
        } while (opcao != 0);
    }
}