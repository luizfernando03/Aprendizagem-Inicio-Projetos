package Universidade;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario{
    private String nivelGraduacao, disciplinaEnsina;
    private int quantAlunos, quantTurmas;
    private int quantEstagiarios = 2;


    Set<Professor> listaProfessor = new HashSet<Professor>();
    private Set<Turma> turmasEscolhidas = new HashSet<>();
    private Set<Estagiario> estagiarioEscolhido = new HashSet<>();


    public Professor(String nome, String cpf, String rg, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaEnsina) {
        super(nome, cpf, rg, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaEnsina = disciplinaEnsina;
    }

    @Override
    double getPercentualReajuste() {
        return 0.10;
    }

    void adicionaTurma(Turma turma){
        if(turmasEscolhidas.size()<quantTurmas){
            this.turmasEscolhidas.add(turma);
            System.out.println("Turma "+turma+" adicionada com sucesso!");
        }
    }

    void adicionaEstagiario(Estagiario estagiario){
        if(estagiarioEscolhido.size()<quantEstagiarios){
            this.estagiarioEscolhido.add(estagiario);
        }
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaEnsina() {
        return disciplinaEnsina;
    }

    public void setDisciplinaEnsina(String disciplinaEnsina) {
        this.disciplinaEnsina = disciplinaEnsina;
    }

    public int getQuantAlunos() {
        return quantAlunos;
    }

    public void setQuantAlunos(int quantAlunos) {
        this.quantAlunos = quantAlunos;
    }

    public int getQuantTurmas() {
        return quantTurmas;
    }

    public void setQuantTurmas(int quantTurmas) {
        this.quantTurmas = quantTurmas;
    }

    public Set<Turma> getTurmasEscolhidas() {
        return turmasEscolhidas;
    }

    public void setTurmasEscolhidas(Set<Turma> turmasEscolhidas) {
        this.turmasEscolhidas = turmasEscolhidas;
    }

}
