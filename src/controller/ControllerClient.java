package controller;

import javax.swing.JOptionPane;

import model.ModelCliente;
import repository.RepositoryClient;

public class ControllerClient {
    RepositoryClient repoClient = new RepositoryClient();

    public ModelCliente SaveClient(ModelCliente cliente) {
        if (!cliente.getNome().isEmpty() && cliente.getNome() != "") {
            ModelCliente returnRepo = repoClient.RepoSaveClient(cliente);
            return returnRepo;
        } else {
            JOptionPane.showMessageDialog(null, "O nome do cliente é obrigatório!");
            return null;
        }
    }
}
