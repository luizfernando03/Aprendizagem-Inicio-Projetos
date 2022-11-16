package Universidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner criandoObjetos = new Scanner(System.in);

        Reembolso reembolso = new Rembolso<>();
        Salario salario = new Salario();
        Turma turma = new Turma();


        Professor professor = new Professor("lucas Silva", "000.333.222-11", "001", "PB", 10.000, "Doutorado", "Computacao");
        System.out.println();
        System.out.println("Lista Professor");
        System.out.println();
        System.out.println("Cadastrados dos profesores são: ");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Número CPF: " + professor.getcpf());
        System.out.println("Número RG: " + professor.getrg());
        System.out.println("Salário: R$ " + professor.getSalario());
        System.out.println("Formação Acadêmica: " + professor.getNivelGraduacao());
        System.out.println("Orgao de Lotação: " + professor.getOrgaoLotacao());
        System.out.println("Disciplina ministrada: " + professor.getDisciplinaEnsina());
        System.out.println();
        professor.adicionaTurma(turma);
        System.out.println("A turma adicionada foi: " + professor.getTurmasEscolhidas());
        Reembolso.Salario(professor);
        Salario.Reajuste(professor); // aqui apliquei Solid com principio OCP
        System.out.println("O salorio sera de : " + professor.getSalario());


        Coordenador coordenador1 = new Coordenador("Denis Sergio", "444.555.666-88", "002", "PB", 5000, 1);
        System.out.println();
        System.out.println("Lista Coordenador");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: " + Coordenador.getNome());
        System.out.println("Número CPF: " + Coordenador.getcpf());
        System.out.println("Número RG: " + Coordenador.getRg());
        System.out.println("Setor de Lotação: " + Coordenador.getOrgaoLotacao());
        System.out.println("Salário: R$ " + Coordenador.getSalario());
        System.out.println("Número de Professores supervisionados: " + coordenador1.getQuantidadeProfessores());
        System.out.println();
        Reembolso.Salario();
        Salario.Reajuste();
        System.out.println("O novo salário é de R$ " + Coordenador.getSalario());
        coordenador1.adicionarProfessor(professor);
        System.out.println("O professor subordinado é: \n" + professor.getNome());


        FuncionarioAdm funcionarioAdm = new FuncionarioAdm("Fernando Teves", "111.222.333-33", "003", "PB", 3.000, "Secretario", "Pleno");
        System.out.println();
        System.out.println("Lista Administrativos");
        System.out.println();
        System.out.println("Os dados cadastrados são: ");
        System.out.println("Nome: " + funcionarioAdm .getNome());
        System.out.println("Número CPF: " + FuncionarioAdm.getcpf());
        System.out.println("Número RG: " + FuncionarioAdm.getRg());
        System.out.println("Setor de Lotação: " + FuncionarioAdm.getOrgaoLotacao());
        System.out.println("Salário: " + FuncionarioAdm.getSalario());
        System.out.println("Função: " + FuncionarioAdm.getFuncao() + " / Senioridade função: " + funcionarioAdm.getSenioridade());
        System.out.println();Estagiario FuncionarioAdm = null;
        Reembolso.Salario(FuncionarioAdm);
        Salario.Reajuste(FuncionarioAdm);
        System.out.println("O novo salário é de R$ " + funcionarioAdm.getSalario());


        Estagiario estagiario = new Estagiario();
        System.out.println("..............................................................................");
        System.out.println("Estagiario : "+estagiario.getNome());
        System.out.println("Número CPF: "+estagiario.getcpf());
        System.out.println("Número RG: "+estagiario.getRg());
        System.out.println("Setor de Lotação: "+estagiario.getOrgaoLotacao());
        System.out.println();
        System.out.println("Valor da Bolsa Estágio é : R$ "+estagiario.getBolsaEstagio());
        Reembolso.Salario(estagiario);

        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Lista de professores e seus Estagiários:");
        System.out.println();
        professor.adicionaEstagiario(estagiario);
        System.out.println("O professor, "+professor.getNome()+" tem o seguinte estagiario : \n"+estagiario.getNome());

        System.out.println("O professor,  tem o seguinte estagiario: \n" + "\n"+ estagiario.getNome() + "\n"+estagiario.getNome());

    }

}