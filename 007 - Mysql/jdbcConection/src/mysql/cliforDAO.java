package mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class cliforDAO {

    // 1 - Consulta
    public List<clifor> list() {
        //Preparar lista que irá retornar clifors após consultar o banco de dados;
        List<clifor> clifors = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()) {
            //Preparar consulta SQL.
            String sql = "SELECT * FROM clifor";

            //Preparar statement com os parâmetros recebclifor_idos (nesta função não tem parâmetros, pois irá retornar todos os valores da tabela clifor)
            PreparedStatement stmt = conn.prepareStatement(sql);

            //Executa consulta e armazena o retorno da consulta no objeto "rs".
            ResultSet rs = stmt.executeQuery();

            //Criar um objeto clifor e guardar na lista de clifors.
            while(rs.next()){
                String clifor_id = rs.getString("clifor_id");
                String clifor_razao = rs.getString("clifor_razao");
               // String clifor_fantasia = rs.getString("clifor_fantasia");
                String clifor_cnpj = rs.getString("clifor_cnpj");

                clifors.add(new clifor(
                        clifor_id,
                        clifor_razao,
                       // clifor_fantasia,
                        clifor_cnpj
                ));
            }
        } catch (SQLException e) {
            System.out.println("Listagem de clifors FALHOU!");
            e.printStackTrace();
        }

        //Retornar todos os clifors encontrados no banco de dados.
        return clifors;
    }

//    // 1.1 - Consulta com filtro
//    public clifor getByclifor_id(String clifor_id) {
//        //Preparar objeto aluno para receber os valores do banco de dados.
//        clifor clifor = new clifor();
//
//        try (Connection conn = ConnectionFactory.getConnection()) {
//            //Preparar consulta SQL
//            String sql = "SELECT * FROM clifor WHERE clifor_id = ?";
//
//            //Preparar statement com os parâmetros recebclifor_idos
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setInt(1, clifor_id);
//
//            //Executa consulta e armazena o retorno da consulta no objeto "rs".
//            ResultSet rs = stmt.executeQuery();
//
//            //Guardar valores retornados da tabela clifor no objeto clifor
//            if (rs.next()){
//                clifor.setclifor_id(rs.getInt("clifor_id"));
//                clifor.setclifor_razao(rs.getString("clifor_razao"));
//                clifor.setclifor_fantasia(rs.getInt("clifor_fantasia"));
//                clifor.setclifor_cnpj(rs.getString("clifor_cnpj"));
//            }
//
//        } catch (SQLException e) {
//            System.out.println("Listagem de clifors FALHOU!");
//            e.printStackTrace();
//        }
//
//        //Retorna clifor encontrado no banco de dados.
//        return clifor;
//    }

    // 2 - Inserção
//   public voclifor_id create(clifor clifor) {
//       try (Connection conn = ConnectionFactory.getConnection()) {
//
//            //Preparar SQL para inserção de dados do clifor.
//            String sql = "INSERT INTO clifor(clifor_razao, clifor_fantasia, clifor_cnpj) VALUES(?, ?, ?)";
//
//            //Preparar statement com os parâmetros recebclifor_idos
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setString(1 , clifor.getclifor_razao());
//            stmt.setInt(2, clifor.getclifor_fantasia());
//            stmt.setString(3 , clifor.getclifor_cnpj());
//
//            //Executa inserção e armazena o numero de linhas afetadas
//            int rowsAffected = stmt.executeUpdate();
//
//            System.out.println("Inserção BEM SUCEDclifor_idA!. Foi adicionada " + rowsAffected + " linha");
//        } catch (SQLException e) {
//            System.out.println("Inserção FALHOU!");
//            e.printStackTrace();
//        }
//    }

 //   // 3 - Delete
 //   public voclifor_id delete(String clifor_id) {
 //       try (Connection conn = ConnectionFactory.getConnection()) {
 //
 //           //Preparar SQL para deletar uma linha.
 //           String sql = "DELETE FROM clifor WHERE clifor_id = ?";
 //
 //           //Preparar statement com os parâmetros recebclifor_idos
 //           PreparedStatement stmt = conn.prepareStatement(sql);
 //           stmt.setInt(1 , clifor_id);
 //
 //           //Executa delete e armazena o numero de linhas afetadas
 //           int rowsAffected = stmt.executeUpdate();
 //
 //           System.out.println("Delete BEM SUCEDclifor_idA! Foi deletada " + rowsAffected + " linha");
 //       } catch (SQLException e) {
 //           System.out.println("Delete FALHOU!");
 //           e.printStackTrace();
 //       }
 //   }

// // 4 - Atualizar
// public voclifor_id update(clifor clifor) {
//     try (Connection conn = ConnectionFactory.getConnection()) {
//
//       //Preparar SQL para atualizar linhas.
//       String sql = "UPDATE clifor SET clifor_razao = ?, clifor_fantasia = ?, clifor_cnpj = ? WHERE clifor_id = ?";
//
//            //Preparar statement com os parâmetros recebclifor_idos
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setString(1, clifor.getclifor_razao());
//            stmt.setInt(2, clifor.getclifor_fantasia());
//            stmt.setString(3, clifor.getclifor_cnpj());
//            stmt.setInt(4, clifor.getclifor_id());
//
//            //Executa atualização e armazena o numero de linhas afetadas
//            int rowsAffected = stmt.executeUpdate();
//
//            System.out.println("Atualização BEM SUCEDclifor_idA! Foi atualizada: " + rowsAffected + " linha");
//        } catch (SQLException e) {
//            System.out.println("Atualização FALHOU!");
//            e.printStackTrace();
//        }
//   }

}

