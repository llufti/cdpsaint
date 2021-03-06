/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidade.Detento;
import entidade.Visitantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.ErroSistema;
import util.FabricaConexao;

/**
 *
 * @author Tic_Cdpsa
 */
public class CdpsaDao {
     public List<Detento> buscarDetentoPelaMatricula(Detento detento) throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM detentos WHERE detentos.matricula LIKE ? OR detentos.detento LIKE ?");
            ps.setString(1,detento.getMatricula());
            ps.setString(2,detento.getMatricula());
           
            
            ResultSet resultSet = ps.executeQuery();

            List<Detento> entidades = new ArrayList<>();

            while (resultSet.next()) {
                
                detento.setIdDetento(resultSet.getInt("idDetento"));
                detento.setDetento(resultSet.getString("detento"));
                detento.setMatricula(resultSet.getString("matricula"));

                entidades.add(detento);
            }
            FabricaConexao.fecharConexao();
            return entidades;
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao inserir na lista", ex);
        }
    }
      public List<Visitantes> buscarVisitaPeloRg(Visitantes visitantes, Detento detento) throws ErroSistema {
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("SELECT * FROM visitantes WHERE visitantes.rg LIKE ? AND visitantes.idDetento LIKE ? ");
            ps.setString(1,visitantes.getRg());
            ps.setInt(2,detento.getIdDetento());
            ResultSet resultSet = ps.executeQuery();

            List<Visitantes> entidades = new ArrayList<>();

            while (resultSet.next()) {
                visitantes.setIdVisitas(resultSet.getInt("idVisitas"));
                visitantes.setVisitante(resultSet.getString("visitante"));

                entidades.add(visitantes);
            }
            FabricaConexao.fecharConexao();
            return entidades;
        } catch (SQLException ex) {
            throw new ErroSistema("Erro ao inserir na lista", ex);
        }
    }
    
}
