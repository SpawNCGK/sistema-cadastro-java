
package service;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteService {

    private ClienteRepository repository = new ClienteRepository();

    public void cadastrarCliente(String nome, String email) {

        Cliente cliente = new Cliente(nome, email);
        repository.adicionarCliente(cliente);

        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void listarClientes() {
        repository.listarClientes();
    }
}
