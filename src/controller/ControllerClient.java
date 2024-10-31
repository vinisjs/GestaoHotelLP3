package controller;

import javax.swing.JOptionPane;

import model.ModelCliente;
import repository.RepositoryClient;

public class ControllerClient {
    RepositoryClient repoClient = new RepositoryClient();
    
    public String SaveClient(ModelCliente cliente) {
        if (!cliente.getNome().isEmpty() && cliente.getNome() != "") {
            String returnRepo = repoClient.RepoSaveClient(cliente);
            return returnRepo;
        } else {
            JOptionPane.showMessageDialog(null, "O nome do cliente é obrigatório!");
            return "O nome é Obrigatório";
        }
    }
}
