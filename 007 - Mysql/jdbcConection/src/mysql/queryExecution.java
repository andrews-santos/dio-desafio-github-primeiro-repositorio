package mysql;

//import java.sql.*;
//import java.util.ArrayList;
import java.util.List;

public class queryExecution {

    public static void main(String[] args) {

        cliforDAO cliforDAO = new cliforDAO();

        // =========================== 1 - Consulta =================================================
        List<clifor> clifors = cliforDAO.list();

        clifors.stream().forEach(System.out::println);


        // ======================= 1.1 - Consulta com filtro ========================================
    //    clifor alunoParaConsulta = cliforDAO.getById(1);

        //System.out.println(alunoParaConsulta);


        // =========================== 2 - Inserção =================================================
    //    clifor alunoParaInsercao = new clifor(
    //            "Matheus",
    //            43,
    //            "SP"
    //    );

        //cliforDAO.create(alunoParaInsercao);


        // =========================== 3 - Delete ===================================================
        //cliforDAO.delete(1);


        // =========================== 4 - Atualizar ================================================
    //    clifor alunoParaAtualizar = cliforDAO.getById(3);
    //    alunoParaAtualizar.setNome("Joaquim");
    //    alunoParaAtualizar.setIdade(18);
    //    alunoParaAtualizar.setEstado("RS");

        //cliforDAO.update(alunoParaAtualizar);
    }

}

