package repository;

import java.util.ArrayList;
import java.util.List;

import model.ModelCliente;

public class RepositoryClient {
    List<ModelCliente> listClients = new ArrayList<ModelCliente>();

    public ModelCliente RepoSaveClient(ModelCliente cliente) {
        listClients.add(cliente);
        return cliente;
    }
}
