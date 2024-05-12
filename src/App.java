import java.util.Scanner;

import DAO.ClientesDAO;
import DAO.MercadoriasDAO;
import clientes.Clientes;

import mercadorias.Mercadorias;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        operacao();
    }

    public static void operacao() {
        System.out.println("---------------------------------------------------");
        System.out.println("---------Olá Seja Bem-Vindo A Nossa Loja-----------");
        System.out.println("---------------------------------------------------");
        System.out.println(" Selecione uma operação que deseja realizar ");
        System.out.println("---------------------------------------------------");

        System.out.println("|   Opção 1 - Cadastrar Clientes       |");
        System.out.println("|   Opção 2 - Cadastrar Mercadorias    |");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                cadastrarClientes();
                break;

            case 2:
                cadastrarMercadorias();
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
    }

    public static void cadastrarMercadorias() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Mercadorias");

        System.out.println(" Nome Da Mercadoria:");
        String nome = scanner.nextLine();

        System.out.println(" Quantidade da Mercadoria: ");
        int quantidade = scanner.nextInt();

        System.out.println("Localização da Mercadoria: ");
        String localizacao = scanner.nextLine();

        Mercadorias mercadorias = new Mercadorias(localizacao, nome, localizacao);

        MercadoriasDAO mercadoriasDAO = new MercadoriasDAO();

        try {
            mercadorias.cadastrarMercadorias(mercadorias);
            System.out.println("Mercadoria cadastrada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar mercadoria: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void cadastrarClientes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro para Clientes");

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Sobrenome: ");
        String sobreNome = scanner.nextLine();

        System.out.println("Whatsapp: ");
        String whatsapp = scanner.nextLine();

        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        Clientes cliente = new Clientes(nome, sobreNome, whatsapp, endereco, cpf);

        ClientesDAO clientesDAO = new ClientesDAO();

        try {
            clientesDAO.cadastrarClientes(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar cliente: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
