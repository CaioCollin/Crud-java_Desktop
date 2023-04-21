package DAO;

import DTO.funcionarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class funcionarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<funcionarioDTO> lista = new ArrayList<>();

    public void cadastrarFuncionario(funcionarioDTO objfuncionariodto) {
        String sql = "insert into funcionario (nome_funcionario, endereco_funcionario) value (?,?)";

        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "funcionario cadastrado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO Cadastrar: " + e);
        }
    }

    public ArrayList<funcionarioDTO> PesquisarFuncionario() {
        String sql = "select * from funcionario";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                funcionarioDTO objfuncionarioDTO = new funcionarioDTO();
                objfuncionarioDTO.setId_funcionario(rs.getInt("id_usuario"));
                objfuncionarioDTO.setNome_funcionario(rs.getString("nome_funcionario"));
                objfuncionarioDTO.setEndereco_funcionario(rs.getString("endereco_funcionario"));

                lista.add(objfuncionarioDTO);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FuncionarioDAO Pesquisar: " + e);
        }
        return lista;

    }

    public void alterarFuncionario(funcionarioDTO objfuncionariodto) {
        String sql = "update funcionario set nome_funcionario = ?, endereco_funcionario = ? where id_usuario = ?";
        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome_funcionario());
            pstm.setString(2, objfuncionariodto.getEndereco_funcionario());
            pstm.setInt(3, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "funcionario Alterado");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO Alterar: " + e);
        }

    }

    public void ExcluirFuncionario(funcionarioDTO objfuncionariodto) {
        String sql = "delete from funcionario where id_usuario = ?";

        conn = new conexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objfuncionariodto.getId_funcionario());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "funcionario Excluido");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "funcionarioDAO Excluir: " + e);
        }

    }

}
