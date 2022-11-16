package ListaA;

import java.util.HashSet;
import java.util.Set;

public class FuncionariosAdm extends Funcionarios {
    String funcaoAdm, senioridade;

    Set<funcionarioAdm> listaAdministrativos = new HashSet<>();

    public FuncionariosAdm(String nome, String cpf, String rg, String orgaoLotacao, double salario, String funcaoAdm) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

    public FuncionariosAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public FuncionariosAdm() {

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

    private class funcionarioAdm {
    }
}