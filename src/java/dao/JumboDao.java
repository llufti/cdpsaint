/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Jumbo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author Luciano
 */
public class JumboDao {

    public void salvarGastos(Jumbo jumbo) throws ErroSistema {

        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;

            if (jumbo.getIdJumbo() == null) {
                ps = conexao.prepareCall("INSERT INTO `gastos` (`categoria`,`descGasto`,`valor`,`data`,`idCliente`) VALUES (?,?,?,?,?)");
            } else {
                ps = conexao.prepareStatement("update gastos set categoria=?,descGasto=?,valor=?,data=?,idCliente=? where id=?");
                ps.setInt(6, jumbo.getIdJumbo());
            }
            ps.setInt(1, jumbo.getIdJumbo());
            ps.setString(2, jumbo.getProduto());
            ps.setString(3, jumbo.getQuantidade());

            ps.execute();

        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao inserir", ex);
        } // final cath

    }
}