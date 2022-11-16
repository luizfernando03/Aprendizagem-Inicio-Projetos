package ListaA;

import java.util.HashSet;
import java.util.Set;

public class Coordenadores extends Funcionarios {
    private int quantidadeProfessores = 1;

    private Set<Professores> professoresSupervisionados = new HashSet<>();


    public Coordenadores(String nome, String cpf, String rg, String orgaoLotacao, double salario, int quantidadeProfessores) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public Coordenadores(int quantidadeProfessores) {
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public Coordenadores() {

    }

    @Override
    double getPercentualReajuste() {
        return 0.05;
    }

    void adicionarProfessor(Professores p) {
        if (professoresSupervisionados.size() < quantidadeProfessores) {
            this.professoresSupervisionados.add(p);
        }

    }

    public int getQuantidadeProfessores() {
        return quantidadeProfessores;
    }

    public void setQuantidadeProfessores() {
        this.quantidadeProfessores = quantidadeProfessores;
    }

    public Set<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }
}
