import java.util.Scanner;

import DAO.ClientesDAO;
import clientes.Clientes;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro para Clientes");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("whatsapp: ");
        String whatsapp = scanner.nextLine();

        System.out.println("Endereço: ");
        String endereço = scanner.nextLine();

        System.out.println("cpf: ");
        String cpf = scanner.nextLine();

        Clientes clientes = new Clientes(nome, sobreNome, whatsapp, endereço, cpf);

        ClientesDAO clientesDAO = new ClientesDAO();

        try {
            clientesDAO.cadastrarClientes(clientes);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente" + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}