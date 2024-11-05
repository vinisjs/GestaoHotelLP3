package view;

import java.util.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controller.ControllerClient;
import model.ModelCliente;

public class ViewMenu {
    public void main() {
        List<ModelCliente> listClients = new ArrayList<ModelCliente>();

        ModelCliente cliente = new ModelCliente();
        ViewCliente clienteView = new ViewCliente();
        ControllerClient controllerClient = new ControllerClient();
        String menu = "Sistema de Gestão de Clientes\n" + "Opções:\n" + "1 - Cadastrar Cliente\n"
                + "2 - Listar Clientes\n"
                + "0 - Sair";
        int opcao = 0;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (opcao) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do Sistema");
                    break;
                case 1:
                    cliente = clienteView.setInformationClient();
                    ModelCliente RetornControllerClient = controllerClient.SaveClient(cliente);
                    listClients.add(RetornControllerClient);
                    JOptionPane.showMessageDialog(null,
                            "Cliente " + RetornControllerClient.getNome() + " Cadastrado com Sucesso!");
                    break;
                case 2:
                    for (ModelCliente client : listClients) {
                        JOptionPane.showMessageDialog(null, "Nome: " + client.getNome() + "\nCPF: " + client.getCpf()
                                + "\nEmail: " + client.getEmail() + "\nTelefone: " + client.getTelefone());
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        } while (opcao != 0);
    }
}
