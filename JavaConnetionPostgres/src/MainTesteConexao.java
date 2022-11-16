import Conexao.ConnetionFactory;

import java.sql.ResultSet;

public class MainTesteConexao {
    public static void main(String[] args) {
        ConnetionFactory con = new ConnetionFactory ();
        con.getConnect ();

        String sql = "INSERT INTO cidades (id_cidade, nome_cidade, estado_id )" +
                "values (default,'campina', 1)";
        int adicionarCidadesCon = con.adicionarCidades(sql);
        if (adicionarCidadesCon > 0) {
            System.out.println ("cadastro realizado");
        }else{
            System.out.println ("Cadastro não realizado");

        }
        String sqlBuscaCidade = "select * from cidades";
        ResultSet rs = con.buscaCidades(sqlBuscaCidade);

        try {
            while (rs.next ()){
                int id_Cidades = rs.getInt ("id.Cidade");
                String nomeCidades = rs.getString ("nome_Cidade");
                String siglaCidades = rs.getString ("sigla_Cidade");
                System.out.println (id_Cidades + " - " + nomeCidades + " - " + siglaCidades);
            }

        }catch (Exception e){
            e.printStackTrace ();
        }

    }
}