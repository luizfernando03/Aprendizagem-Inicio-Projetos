package Universidade;

import java.util.HashSet;
import java.util.Set;

public class FuncionarioAdm extends Funcionario {
    String funcaoAdm, senioridade;

    Set<FuncionarioAdm> listaAdministrativos = new HashSet<>();

    public FuncionarioAdm(String nome, String cpf, String rg, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    public static String getFuncao() {
        return null;
    }

    @Override
    double getPercentualReajuste() {
        return 0.10;
    }

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public String getBolsaEstagio() {
        return null;
    }
}

