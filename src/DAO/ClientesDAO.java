package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import clientes.Clientes;
import conexao.Conexao;
import mercadorias.Mercadorias;

public class ClientesDAO {

    public void cadastrarClientes(Clientes clientes) {

        String sql = "INSERT INTO CLIENTES (NOME, SOBRENOME, WHATSAPP, ENDEREÇO, CPF) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, clientes.getNome());
            ps.setString(2, clientes.getEndereço());
            ps.setString(3, clientes.getWhatsapp());
            ps.setString(4, clientes.getEndereço());
            ps.setString(5, clientes.getCpf());

            ps.execute();
            ps.close();


        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }


    public void cadastrarMercadorias(Mercadorias mercadorias) {

        String sql = "INSERT INTO ESTOQUE (MERCADORIAS, QTS, LOZALIZAÇAO) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, mercadorias.getMercadorias());
            ps.setString(2, mercadorias.getQts());
            ps.setString(3, mercadorias.getLocalizaçao());
            

            ps.execute();
            ps.close();


        } catch (SQLException e) {
            
            e.printStackTrace();
        }
    }
    
}
