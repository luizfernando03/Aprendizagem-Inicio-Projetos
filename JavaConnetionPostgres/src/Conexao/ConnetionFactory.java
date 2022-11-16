package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnetionFactory {
    private String url = "jdbc:postgresql://localhost:5432/Escola";
    private  String user = "postgres";
    private String senha = "123456";
    public static Connection con;

    public Connection getConnect(){
        try {
            Class.forName ("org.postgresql.Driver");
            con = DriverManager.getConnection (url, user, senha);
            if (con != null) {
                System.out.println ("Conectado!");
            } else {
                System.out.println ("Não conectado!");
            }
        }catch (Exception e){
            System.out.println ("Erro de conexão" +e);
            e.printStackTrace ();

        }
        return con;
    }
    public int adicionarCidades(String sql){
        try{
            Statement stmt = con.createStatement();
            int res = stmt.executeUpdate(sql);
            con.close ();
            return res;
        }catch (Exception e){
            e.printStackTrace ();
            return 0;
        }

    }
    public ResultSet buscaCidades (String sqlBuscaCidades) {
        try {
            Statement stmt = con.createStatement ();
            ResultSet rs = stmt.executeQuery (sqlBuscaCidades);
            return rs;

        }catch (Exception e){
            e.printStackTrace ();
            return null;
    }

    }

}
