
package repository;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            cliente.exibirCliente();
            System.out.println("-------------");
        }
    }
}
