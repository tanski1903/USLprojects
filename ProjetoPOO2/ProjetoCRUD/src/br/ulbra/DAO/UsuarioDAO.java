/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.ulbra.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s.lucas
 */
public class UsuarioDAO {

    Connection con;

    public UsuarioDAO() throws SQLException {
        con = ConnectionFactory.getConnection();
    }

    public boolean checkLogin(String login, String senha) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        try {
            stmt = con.prepareStatement("SELECT * FROM tbusuario WHERE emailUsu = ? and senhaUsu = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                check = true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public void create(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO tbusuario (nomeusu, emailusu, senhausu, foneusu, sexousu, cepusu, lograusu, bairrousu, cidadeusu, estadousu, nmrcasausu) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setString(6, u.getCepUsu());
            stmt.setString(7, u.getLograUsu());
            stmt.setString(8, u.getBairroUsu());
            stmt.setString(9, u.getCidadeUsu());
            stmt.setString(10, u.getEstadoUsu());
            stmt.setString(11, u.getNmrUsu());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM tbusuario WHERE idusu = ?");
            stmt.setInt(1, u.getIdUsu());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Usuario u) {
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE tbusuario SET nomeUsu = ?, emailusu = ?, senhausu = ? , foneusu = ? , sexousu = ?, cepusu = ?, lograusu = ?, bairrousu = ?, cidadeusu = ?, estadousu = ?, nmrcasausu = ? WHERE idusu = ?");
            stmt.setString(1, u.getNomeUsu());
            stmt.setString(2, u.getEmailUsu());
            stmt.setString(3, u.getSenhaUsu());
            stmt.setString(4, u.getFoneUsu());
            stmt.setInt(5, u.getSexoUsu());
            stmt.setString(6, u.getCepUsu());
            stmt.setString(7, u.getLograUsu());
            stmt.setString(8, u.getBairroUsu());
            stmt.setString(9, u.getCidadeUsu());
            stmt.setString(10, u.getEstadoUsu());
            stmt.setString(11, u.getNmrUsu());
            stmt.setInt(12, u.getIdUsu());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public ArrayList<Usuario> read() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM tbUsuario ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setSenhaUsu(rs.getString("senhausu"));
                usuario.setFoneUsu(rs.getString("foneusu"));
                usuario.setSexoUsu(rs.getInt("sexousu"));
                usuario.setCepUsu(rs.getString("cepusu"));
                usuario.setLograUsu(rs.getString("lograusu"));
                usuario.setBairroUsu(rs.getString("bairrousu"));
                usuario.setCidadeUsu(rs.getString("cidadeusu"));
                usuario.setEstadoUsu(rs.getString("estadousu"));
                usuario.setNmrUsu(rs.getString("nmrcasausu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }
    public List<Usuario> readForDesc(String nome) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbUsuario WHERE nomeUsu LIKE ?");
        stmt.setString(1, "%"+nome+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Usuario usuario = new Usuario();
        usuario.setIdUsu(rs.getInt("idusu"));
        usuario.setNomeUsu(rs.getString("nomeusu"));
        usuario.setEmailUsu(rs.getString("emailusu"));
        usuario.setSenhaUsu(rs.getString("senhausu"));
        usuario.setFoneUsu(rs.getString("foneusu"));
        usuario.setSexoUsu(rs.getInt("sexousu"));
        usuario.setCepUsu(rs.getString("cepusu"));
        usuario.setLograUsu(rs.getString("lograusu"));
        usuario.setBairroUsu(rs.getString("bairrousu"));
        usuario.setCidadeUsu(rs.getString("cidadeusu"));
        usuario.setEstadoUsu(rs.getString("estadousu"));
        usuario.setNmrUsu(rs.getString("nmrcasausu"));
        usuarios.add(usuario);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return usuarios;
}
public ArrayList<Usuario> readCons1() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT idusu,nomeusu,emailusu,cidadeusu,estadousu FROM tbUsuario ORDER BY nomeusu");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setCidadeUsu(rs.getString("cidadeusu"));
                usuario.setEstadoUsu(rs.getString("estadousu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }
public ArrayList<Usuario> readCons1ForDesc() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT idusu,nomeusu,emailusu,cidadeusu,estadousu FROM tbUsuario ORDER BY nomeusu DESC");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setCidadeUsu(rs.getString("cidadeusu"));
                usuario.setEstadoUsu(rs.getString("estadousu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }
public List<Usuario> readCons2ForEstado(String estado) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbUsuario WHERE estadoUsu LIKE ?");
        stmt.setString(1, "%"+estado+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Usuario usuario = new Usuario();
        usuario.setIdUsu(rs.getInt("idusu"));
        usuario.setNomeUsu(rs.getString("nomeusu"));
        usuario.setEmailUsu(rs.getString("emailusu"));
        usuario.setCidadeUsu(rs.getString("cidadeusu"));
        usuario.setEstadoUsu(rs.getString("estadousu"));
        usuarios.add(usuario);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return usuarios;
}
public List<Usuario> readCons3ForCidade(String cidade) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT * FROM tbUsuario WHERE cidadeUsu LIKE ?");
        stmt.setString(1, "%"+cidade+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Usuario usuario = new Usuario();
        usuario.setIdUsu(rs.getInt("idusu"));
        usuario.setNomeUsu(rs.getString("nomeusu"));
        usuario.setEmailUsu(rs.getString("emailusu"));
        usuario.setCidadeUsu(rs.getString("cidadeusu"));
        usuario.setEstadoUsu(rs.getString("estadousu"));
        usuarios.add(usuario);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return usuarios;
}
public List<Usuario> readCons4ForFone(String fone) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
    try {
        stmt = con.prepareStatement("SELECT idusu,nomeusu,foneusu FROM tbUsuario WHERE foneusu LIKE ?");
        stmt.setString(1, "%"+fone+"%");
        rs = stmt.executeQuery();
    while (rs.next()) {
        Usuario usuario = new Usuario();
        usuario.setIdUsu(rs.getInt("idusu"));
        usuario.setNomeUsu(rs.getString("nomeusu"));
        usuario.setFoneUsu(rs.getString("foneusu"));
        usuarios.add(usuario);
}
}   catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
}   finally {
        ConnectionFactory.closeConnection(con, stmt, rs);
}
return usuarios;
}
public ArrayList<Usuario> readConsAZ() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT idusu,nomeusu,emailusu,cidadeusu,estadousu FROM tbUsuario ORDER BY nomeusu");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setEmailUsu(rs.getString("emailusu"));
                usuario.setCidadeUsu(rs.getString("cidadeusu"));
                usuario.setEstadoUsu(rs.getString("estadousu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
    }
public ArrayList<Usuario> readConsFone() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT idusu,nomeusu,foneusu FROM tbUsuario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsu(rs.getInt("idusu"));
                usuario.setNomeUsu(rs.getString("nomeusu"));
                usuario.setFoneUsu(rs.getString("foneusu"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return (ArrayList<Usuario>) usuarios;
}
}
    


