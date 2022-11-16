package Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean escolha = true;

        Scanner input = new Scanner(System.in);

        Vendedor vendedor = new Vendedor(" ", " ", " ");
        Cliente cliente = new Cliente(" ", " ", " ");
        RealizaVenda r2 = new RealizaVenda(" ", " ", " ", 0, " ", "");
        while (escolha) {
            System.out.println(" Digite a ação desejada ");
            System.out.println(" 1 - Iniciar uma Venda ");
            System.out.println(" 2 - Cadastrar Vendedores ");
            System.out.println(" 3 - Mostrar Vendedores Cadastrados ");
            System.out.println(" 4 - Cadastrar Clientes ");
            System.out.println(" 5 - Mostrar Clientes Cadastrados ");
            System.out.println(" 6 - Consultar Compra por Cliente ");
            System.out.println(" 7 - Consultar Vendas por Vendedor ");
            System.out.println(" 8 - Sair do Programa ");
            int opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    r2.validaVenda(vendedor.ListaVendedor, cliente.listaClientes, vendedor, cliente);
                    break;
                case 2:
                    vendedor.adicionaVendedor();
                    break;
                case 3:
                    vendedor.exibirVendedor();
                    break;
                case 4:
                    cliente.cadastraCliente();
                    break;
                case 5:
                    cliente.exibeCliente();
                    break;
                case 6:
                    r2.pesquisaClienteCPF();
                    break;
                case 7:
                    r2.pesquisaVendedorEmail();
                    break;
                case 8:
                    escolha = false;
                    break;
                default:
                    System.out.println("Escolha invalida");
            }
            System.out.println("---------------------------------------------------------");
        }
    }
}