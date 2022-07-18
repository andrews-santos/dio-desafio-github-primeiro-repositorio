package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {


    //Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_teste","root","blablabla");
    //System.out.println("Conectado!");
    //conexao.close();

    public static Connection getConnection() {

          // 1 - Declarar objeto conexão (irá receber uma conexão após executar os passos abaixo)
          Connection connection = null;

          String connectionUrl = "jdbc:mysql://localhost:3306/db_teste";
          String user = "root";
          String password ="blablabla";

        try {
            connection = DriverManager.getConnection(connectionUrl, user, password);
            System.out.println("Conectado com Sucesso!");
            //connection.close();

        } catch (SQLException e) {
            System.out.println("FALHA ao tentar criar conexão");
            throw new RuntimeException(e);
        }

   
        return connection;
        
    }


}
