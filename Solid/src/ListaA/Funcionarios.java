package ListaA;

public abstract class Funcionarios {

    private String nome, cpf, rg, orgaoLotacao;

    private double salario;

    public Funcionarios(String nome, String cpf, String rg, String orgaoLotacao, double salario) {
    }

    public Funcionarios() {

    }

    public void Funcionarios(String nome, String cpf, String rg, String Lotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    abstract double getPercentualReajuste();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao() {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = salario;
    }
}

