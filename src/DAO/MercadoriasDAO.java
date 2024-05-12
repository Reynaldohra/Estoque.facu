package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import mercadorias.Mercadorias;

public class MercadoriasDAO {
    public void cadastrarMercadorias(Mercadorias mercadorias) {

        String sql = "INSERT INTO ESTOQUE (MERCADORIAS, QUANTIDADE, LOZALIZAÇAO) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, mercadorias.getMercadorias());
            ps.setString(2, mercadorias.getQuantidade());
            ps.setString(3, mercadorias.getLocalizaçao());
            

            ps.execute();
            ps.close();


        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
}
