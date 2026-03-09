
package main;

import service.ClienteService;

public class Main {

    public static void main(String[] args) {

        ClienteService service = new ClienteService();

        service.cadastrarCliente("Augusto", "augusto@email.com");
        service.cadastrarCliente("Maria", "maria@email.com");

        System.out.println("Lista de clientes:");

        service.listarClientes();
    }
}
