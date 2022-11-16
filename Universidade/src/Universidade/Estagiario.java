package Universidade;

public class Estagiario extends Funcionario{
     String nomeEstagiario;
    private double valorBolsa;
    private String CPf;

    public Estagiario(String nomeEstagiario, double valorBolsa) {
        super();
        this.nomeEstagiario = nomeEstagiario;
        this.valorBolsa = valorBolsa;
    }

    public Estagiario() {
    }


    public Estagiario(String nomeEstagiario, double valorBolsa, String CPf) {
        this.nomeEstagiario = nomeEstagiario;
        this.valorBolsa = valorBolsa;
        this.CPf = CPf;
    }

    @Override
    double getPercentualReajuste() {
        return 0;
    }

    @Override
    public String getBolsaEstagio() {
        return null;
    }

    public void setNome(String nomeEstagiario) {
        this.nomeEstagiario = nomeEstagiario;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }

}
