package view;

import javax.swing.JOptionPane;

import model.ModelCliente;

public class ViewCliente {
    ModelCliente cliente = new ModelCliente();

    public ModelCliente setInformationClient() {

        cliente.setNome(JOptionPane.showInputDialog(null, "Nome do cliente"));
        cliente.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "CPF do cliente")));
        cliente.setEmail(JOptionPane.showInputDialog(null, "Email do cliente"));
        cliente.setTelefone(Long.parseLong(JOptionPane.showInputDialog(null, "Telefone do cliente")));
        return cliente;
    }
}
