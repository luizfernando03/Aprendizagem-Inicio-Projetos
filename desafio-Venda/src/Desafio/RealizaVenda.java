package Desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class RealizaVenda extends Registro {


    private String nomeCliente;
    private double valorVenda;
    private String dataVenda;
    private String emailVendedor;

    public RealizaVenda(String cpf, String email, String nomeCliente, double valorVenda, String dataVenda, String emailVendedor) {
        super(cpf, email);
        this.nomeCliente = nomeCliente;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.emailVendedor = emailVendedor;
    }

    ArrayList<RealizaVenda> realizaVenda = new ArrayList<>();
    ArrayList<RealizaVenda> vendaRealizada = new ArrayList<>();
    ArrayList<RealizaVenda> compraRealizada = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public void cadastraVenda(Cliente cliente, String emailVendedor) {
        System.out.println("digite a data da venda: ");
        dataVenda = input.nextLine();

        System.out.println("Informe o valor da Venda");
        valorVenda = input.nextDouble();

        this.realizaVenda.add(new RealizaVenda(cliente.getCpfCliente(), cliente.getEmailCliente(), cliente.getNomeCliente(), valorVenda, dataVenda, emailVendedor));
        System.out.println("Cadastro finalizado com sucesso...");
    }

    public void validaVenda(ArrayList<Vendedor> listaVendedor, ArrayList<Cliente> listaCliente, Vendedor vendedor, Cliente cliente) {

        boolean temVendedor = false;
        boolean temCliente = false;

        String emailVendedor = " ";

        System.out.println("Informe o CPF do Vendedor ");
        String validaCpf = input.nextLine();
        for (int i = 0; i < listaVendedor.size(); i++) {
            if (validaCpf.equals(listaVendedor.get(i).getCpf())) {

                temVendedor = true;
                emailVendedor = listaVendedor.get(i).getEmail();
                break;
            }
        }
        if (!temVendedor) {
            System.out.println("Vendedor(a) não está cadastrado!");

            emailVendedor = vendedor.adicionaVendedor();

        }

        System.out.println("Informe o Nome do Cliente ");
        String validaNome = input.nextLine();
        for (int i = 0; i < listaCliente.size(); i++) {
            if (validaCpf.equals(listaCliente.get(i).getNomeCliente())) {
                temCliente = true;
                break;
            }
        }
        if (!temCliente) {
            System.out.println("Cliente não está cadastrado!");
            cliente.cadastraCliente();
        }

        this.cadastraVenda(cliente, emailVendedor);
    }

    public void pesquisaVendedorEmail() {

        System.out.println("Favor informar o e-mail do Vendedor ");
        String emailVend = input.nextLine();

        for (int i = 0; i < this.realizaVenda.size(); i++) {
            if (emailVend.equals(this.realizaVenda.get(i).emailVendedor)) {
                this.vendaRealizada.add(this.realizaVenda.get(i));
            }
        }
        if (this.vendaRealizada.size() > 0) {
            for (int i = 0; i < this.vendaRealizada.size(); i++) {
                System.out.println("Nome: " +this.vendaRealizada.get(i).getCpf() + " Email: " + this.vendaRealizada.get(i).getEmail() + " Nome Cliente: " + this.vendaRealizada.get(i).nomeCliente + " Venda Realizada " + this.vendaRealizada.get(i).valorVenda + " Data da Venda: " + this.vendaRealizada.get(i).dataVenda);
            }
        }
    }
    public void pesquisaClienteCPF() {

        System.out.print("Favor informar o CPF do Cliente ");
        String cpfCliente = input.nextLine();

        for (int i = 0; i < this.realizaVenda.size(); i++) {
            if (cpfCliente.equals(this.realizaVenda.get(i).getCpf())) {
                this.compraRealizada.add(this.realizaVenda.get(i));
            }

        }
        if (this.compraRealizada.size() > 0) {
            for (int i = 0; i < this.compraRealizada.size(); i++) {
                System.out.println("CPF Cliente " +this.compraRealizada.get(i).getCpf() + " E-mail Cliente: " + this.compraRealizada.get(i).getEmail() + " Nome do Cliente: " + this.compraRealizada.get(i).nomeCliente + " Valor da Compra: " + this.compraRealizada.get(i).valorVenda + " Data da Compra: " + this.compraRealizada.get(i).dataVenda);
            }
        }
    }


}



