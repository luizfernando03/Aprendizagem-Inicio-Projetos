package ListaA;

public class Estagiarios {

    private String condicao;
    private double despesas;
    private String nome, cpf, rg, orgaoLotacao;


    public Estagiarios() {
        this.condicao = condicao;
        this.despesas = despesas;
    }

    public void addEstagiario(){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoLotacao = orgaoLotacao;
        this.condicao = condicao;
        this.despesas = despesas;
    }

    public void exibirCalculos(){
        System.out.println("O valor do reembolso é de: " + calculoreembolso());
    }

    public Estagiarios(String condicao) {
        this.condicao = condicao;
    }

    public Estagiarios(double despesas) {
        this.despesas = despesas;
    }

    private String calculoreembolso() {
        return null;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
}