package ListaA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            Professores professores = new Professores();
            professores.setNome("");
            professores.setCpf("");
            professores.setRg("");
            professores.setOrgaoLotacao();
            professores.setSalario();
            professores.setNivelGraduacao("");
            professores.setDisciplinaEnsina("");
            professores.setQuantTurmas();


            Coordenadores coordenadores = new Coordenadores();
            coordenadores.setNome("");
            coordenadores.setCpf("");
            coordenadores.setRg("");
            coordenadores.setOrgaoLotacao();
            coordenadores.setSalario();
            coordenadores.setQuantidadeProfessores();


            FuncionariosAdm funcionariosAdm = new FuncionariosAdm();
            funcionariosAdm.setNome("");
            funcionariosAdm.setCpf("");
            funcionariosAdm.setRg("");
            funcionariosAdm.setOrgaoLotacao();
            funcionariosAdm.setSalario();
            funcionariosAdm.setFuncaoAdm("");
            funcionariosAdm.setSenioridade("");





    }
}
