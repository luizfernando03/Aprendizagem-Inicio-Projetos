package Universidade;

public abstract class Funcionario extends Salario {

        private static String nome;
    private static String cpf;
    private String rg;
    private static String orgaoLotacao;

        private static double salario;

        public Funcionario(String nome, String cpf, String rg, String orgaoLotacao, double salario) {
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.orgaoLotacao = orgaoLotacao;
            this.salario = salario;
        }

    public Funcionario() {

    }

    abstract double getPercentualReajuste();

        public static String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public static String getcpf() {
            return cpf;
        }

        public void setcpf(String cpf) {
            this.cpf = cpf;
        }

        public String getrg() {
            return rg;
        }

        public void setRg(String Rg) {
            this.rg = rg;
        }

        public static String getOrgaoLotacao() {
            return orgaoLotacao;
        }

        public void setOrgaoLotacao(String orgaoLotacao) {
            this.orgaoLotacao = orgaoLotacao;
        }

        public static double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public static String getRg() {
            return null;
        }

}
