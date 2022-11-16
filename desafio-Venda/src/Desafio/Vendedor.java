package Desafio;

import java.util.Scanner;
import java.util.ArrayList;

public class Vendedor {
    private String nomeVendedor;
    private String cpf;
    private String email;
    Scanner input = new Scanner(System.in);
    ArrayList<Vendedor> ListaVendedor = new ArrayList<>();
    private boolean continuarCadastrandoVendedo = true;

    public Vendedor(String cpf, String email, String nomeVendedor) {
        this.cpf = cpf;
        this.email = email;
        this.nomeVendedor = nomeVendedor;


    }/// adicionar

    public String adicionaVendedor() {
        System.out.println("Vamos iniciar o cadastro:\nInforme o nome do(a) vendedor(a)");
        nomeVendedor = input.nextLine();

        System.out.println("Digite o CPF do(a) vendedor(a) ?  ");
        cpf = input.nextLine();
        for (int i = 0; i < ListaVendedor.size(); i++) {
            if (ListaVendedor.contains(cpf)) {
                System.out.println("Esse CPF já existe na base dados, por favor informar novamente ");
                cpf = input.nextLine();
            }
        }

        System.out.println("Digite o email do(a) vendedor(a) ? ");
        email = input.next();
        for (int i = 0; i < ListaVendedor.size(); i++) {
            if (ListaVendedor.contains(email)) {
                System.out.println("Esse email já existe na base dados, por favor informar novamente ");
                email = input.nextLine();
            }
        }

        if (email.contains("@") && email.contains(".com") || email.contains(".br")) {
            Vendedor vendedor1 = new Vendedor(cpf, email, nomeVendedor);
            ListaVendedor.add(vendedor1);
        } else {
            System.out.println("Email está incorreto Favor verificar e informar novamente  ");
            System.out.println("");
            System.out.println("Cadastro não realizado");
        }
        continuarCadastrandoVendedor();
        return email;
    }

    public void continuarCadastrandoVendedor() {
        Scanner recadastroVendedor = new Scanner(System.in);

        while (continuarCadastrandoVendedo) {
            System.out.println("Deseja cadastrar mais vendedor ? S / N ");
            String cadVendedor = recadastroVendedor.nextLine();

            if (cadVendedor.equalsIgnoreCase("S")) {
                adicionaVendedor();
            } else {
                continuarCadastrandoVendedo = false;
            }
        }
    }
    /// Exibir
    public void exibirVendedor() {
        System.out.println("LIsta de vendedores cadastrados ");
        for (int i = 0; i < ListaVendedor.size(); i++)
            System.out.println("Nome: " + ListaVendedor.get(i).nomeVendedor + " Número do CPF " + ListaVendedor.get(i).getCpf() + " Email " + ListaVendedor.get(i).getEmail());
    }
     public void imprimeLista(){
        for (int i = 0; i < ListaVendedor.size(); i++) {
            System.out.println(ListaVendedor.get(i).getCpf());

        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
}
