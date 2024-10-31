package view;

import javax.swing.JOptionPane;

import controller.ControllerClient;
import model.ModelCliente;

public class ViewMenu {
    public void main() {
        // Cadastro de clientes - Nome - CPF - E-mail - Telefone
        // Cadastro de quartos - Número do quarto - Tipo do quarto (ex: simples, duplo,
        // suíte) - Preço por noite - Status (disponível, reservado, em manutenção)
        // Reservas de quartos - Cliente que fez a reserva - Data de entrada - Data de
        // saída - Quarto reservado
        ModelCliente cliente = new ModelCliente();
        ViewCliente clienteView = new ViewCliente();
        ControllerClient controllerClient = new ControllerClient();
        String menu = "1 - Para Cadastrar Clientes\n2 - Para listar todos os clientes cadastrados\n0 - Para Sair";
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcao) {
                case 1:
                    cliente = clienteView.setInformationClient();
                    String RetornControllerClient =  controllerClient.SaveClient(cliente);
                    JOptionPane.showMessageDialog(null, RetornControllerClient);
                    break;
                case 2:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
            }
        } while (opcao != 0);
    }
}
