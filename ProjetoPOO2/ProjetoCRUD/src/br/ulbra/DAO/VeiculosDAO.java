/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import br.ulbra.entity.Veiculos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author s.lucas
 */
public class VeiculosDAO {
    Connection con;
        public VeiculosDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }
    public boolean checkLogin(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
    try {
        stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE emailUsu = ? and senhaUsu = ");
        stmt.setString(1, login);
        stmt.setString(2, senha);
        rs = stmt.executeQuery();
    if (rs.next()) {
        check = true;
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
    return check;
}
    public void create(Veiculos v) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbveiculos (tipoVeic, marcaVeic, modeloVeic, anoFabVeic, corVeic, placaVeic, kmVeic) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, v.gettipoVeic());
            stmt.setString(2, v.getmarcaVeic());
            stmt.setString(3, v.getmodeloVeic());
            stmt.setInt(4, v.getanoFabVeic());
            stmt.setString(5, v.getcorVeic());
            stmt.setString(6, v.getplacaVeic());
            stmt.setInt(7, v.getkmVeic());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    
    public void delete(Veiculos v) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbveiculos WHERE codVeic = ?");
            stmt.setInt(1, v.getcodVeic());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro do veículo excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void update(Veiculos v) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbveiculos SET tipoVeic = ?, marcaVeic = ?, modeloVeic = ? , anoFabVeic = ? , corVeic = ? , placaVeic = ? , kmVeic = ?   WHERE codVeic = ?");
            stmt.setString(1, v.gettipoVeic());
            stmt.setString(2, v.getmarcaVeic());
            stmt.setString(3, v.getmodeloVeic());
            stmt.setInt(4, v.getanoFabVeic());
            stmt.setString(5, v.getcorVeic());
            stmt.setString(6, v.getplacaVeic());
            stmt.setInt(7, v.getkmVeic());
            stmt.setInt(8, v.getcodVeic());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cadastro do veículo atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public ArrayList<Veiculos> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculos ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setcodVeic(rs.getInt("codVeic"));
                veiculo.settipoVeic(rs.getString("tipoVeic"));
                veiculo.setmarcaVeic(rs.getString("marcaVeic"));
                veiculo.setmodeloVeic(rs.getString("modeloVeic"));
                veiculo.setanoFabVeic(rs.getInt("anoFabVeic"));
                veiculo.setcorVeic(rs.getString("corVeic"));
                veiculo.setplacaVeic(rs.getString("placaVeic"));
                veiculo.setkmVeic(rs.getInt("kmVeic"));
                veiculos.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculos>) veiculos;
    }
    public List<Veiculos> readForDesc(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Veiculos> veiculos = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbveiculos WHERE modeloVeic LIKE ?");
        stmt.setString(1, "%"+nome+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Veiculos veiculo = new Veiculos();
        veiculo.setcodVeic(rs.getInt("codVeic"));
        veiculo.settipoVeic(rs.getString("tipoVeic"));
        veiculo.setmarcaVeic(rs.getString("marcaVeic"));
        veiculo.setmodeloVeic(rs.getString("modeloVeic"));
        veiculo.setanoFabVeic(rs.getInt("anoFabVeic"));
        veiculo.setcorVeic(rs.getString("corVeic"));
        veiculo.setplacaVeic(rs.getString("placaVeic"));
        veiculo.setkmVeic(rs.getInt("kmVeic"));
        veiculos.add(veiculo);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return veiculos;
}
    public ArrayList<Veiculos> readAZ() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculos ORDER BY modeloVeic");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setcodVeic(rs.getInt("codVeic"));
                veiculo.settipoVeic(rs.getString("tipoVeic"));
                veiculo.setmarcaVeic(rs.getString("marcaVeic"));
                veiculo.setmodeloVeic(rs.getString("modeloVeic"));
                veiculo.setplacaVeic(rs.getString("placaVeic"));
                veiculos.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculos>) veiculos;
    }
    public List<Veiculos> readZA() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculos ORDER BY modeloVeic DESC");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setcodVeic(rs.getInt("codVeic"));
                veiculo.settipoVeic(rs.getString("tipoVeic"));
                veiculo.setmarcaVeic(rs.getString("marcaVeic"));
                veiculo.setmodeloVeic(rs.getString("modeloVeic"));
                veiculo.setplacaVeic(rs.getString("placaVeic"));
                veiculos.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculos>) veiculos;
    }
    public ArrayList<Veiculos> readVeic() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Veiculos> veiculos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbveiculos ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Veiculos veiculo = new Veiculos();
                veiculo.setcodVeic(rs.getInt("codVeic"));
                veiculo.settipoVeic(rs.getString("tipoVeic"));
                veiculo.setmarcaVeic(rs.getString("marcaVeic"));
                veiculo.setmodeloVeic(rs.getString("modeloVeic"));
                veiculo.setplacaVeic(rs.getString("placaVeic"));
                veiculos.add(veiculo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VeiculosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Veiculos>) veiculos;
    }
    public List<Veiculos> readConsTipoVeic(String tipo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Veiculos> veiculos = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbVeiculos WHERE tipoVeic LIKE ?");
        stmt.setString(1, "%"+tipo+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Veiculos veiculo = new Veiculos();
        veiculo.setcodVeic(rs.getInt("codVeic"));
        veiculo.settipoVeic(rs.getString("tipoVeic"));
        veiculo.setmarcaVeic(rs.getString("marcaVeic"));
        veiculo.setmodeloVeic(rs.getString("modeloVeic"));
        veiculo.setplacaVeic(rs.getString("placaVeic"));
        veiculos.add(veiculo);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return veiculos;
}
    public List<Veiculos> readConsModeloVeic(String modelo) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Veiculos> veiculos = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbVeiculos WHERE modeloVeic LIKE ?");
        stmt.setString(1, "%"+modelo+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Veiculos veiculo = new Veiculos();
        veiculo.setcodVeic(rs.getInt("codVeic"));
        veiculo.settipoVeic(rs.getString("tipoVeic"));
        veiculo.setmarcaVeic(rs.getString("marcaVeic"));
        veiculo.setmodeloVeic(rs.getString("modeloVeic"));
        veiculo.setplacaVeic(rs.getString("placaVeic"));
        veiculos.add(veiculo);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return veiculos;
}
    public List<Veiculos> readConsPlacaVeic(String placa) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Veiculos> veiculos = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbVeiculos WHERE placaVeic LIKE ?");
        stmt.setString(1, "%"+placa+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Veiculos veiculo = new Veiculos();
        veiculo.setcodVeic(rs.getInt("codVeic"));
        veiculo.settipoVeic(rs.getString("tipoVeic"));
        veiculo.setmarcaVeic(rs.getString("marcaVeic"));
        veiculo.setmodeloVeic(rs.getString("modeloVeic"));
        veiculo.setplacaVeic(rs.getString("placaVeic"));
        veiculos.add(veiculo);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return veiculos;
}
}
