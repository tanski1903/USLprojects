/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author s.lucas
 */
public class Frmenu extends javax.swing.JFrame {

    /**
     * Creates new form Frmenu
     */
    public Frmenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void showRel1Usu() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaulapoo2", "root", "");
        JasperPrint print = JasperFillManager.fillReport("C:\\Relatorio\\rel1Usu.jasper", null, con);

            JasperViewer.viewReport(print, false);

        } catch (SQLException | JRException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        } finally {
            con.close();
        }
    }
    
    public void showRel1Veic() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaulapoo2", "root", "");
        JasperPrint print = JasperFillManager.fillReport("C:\\Relatorio\\rel1Veic.jasper", null, con);

            JasperViewer.viewReport(print, false);

        } catch (SQLException | JRException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        } finally {
            con.close();
        }
    }
    
    public void showRel2Usu() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaulapoo2", "root", "");
        JasperPrint print = JasperFillManager.fillReport("C:\\Relatorio\\rel2Usu.jasper", null, con);

            JasperViewer.viewReport(print, false);

        } catch (SQLException | JRException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        } finally {
            con.close();
        }
    }
    
    public void showRel2Veic() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaulapoo2", "root", "");
        JasperPrint print = JasperFillManager.fillReport("C:\\Relatorio\\rel2Veic.jasper", null, con);

            JasperViewer.viewReport(print, false);

        } catch (SQLException | JRException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        } finally {
            con.close();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadUsu = new javax.swing.JMenuItem();
        cadVei = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ConsUsuAZ = new javax.swing.JMenuItem();
        ConsUsuEstado = new javax.swing.JMenuItem();
        ConsUsuCidade = new javax.swing.JMenuItem();
        ConsUsuFone = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ConsVeicModeloAZ = new javax.swing.JMenuItem();
        ConsVeicTipo = new javax.swing.JMenuItem();
        ConsVeicModelo = new javax.swing.JMenuItem();
        ConsVeicPlaca = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(113, 140, 92));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/67531_128_minicar_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N

        jMenu1.setText("Cadastros");

        cadUsu.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        cadUsu.setText("Cadastro de Usuários");
        cadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadUsuActionPerformed(evt);
            }
        });
        jMenu1.add(cadUsu);

        cadVei.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        cadVei.setText("Cadastro de Veículos");
        cadVei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadVeiActionPerformed(evt);
            }
        });
        jMenu1.add(cadVei);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas de Usuários");

        ConsUsuAZ.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsUsuAZ.setText("Consulta de Usuários por Ordem Alfabética");
        ConsUsuAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsUsuAZActionPerformed(evt);
            }
        });
        jMenu2.add(ConsUsuAZ);

        ConsUsuEstado.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsUsuEstado.setText("Consulta de Usuários por Estado");
        ConsUsuEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsUsuEstadoActionPerformed(evt);
            }
        });
        jMenu2.add(ConsUsuEstado);

        ConsUsuCidade.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsUsuCidade.setText("Consulta de Usuários por Cidade");
        ConsUsuCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsUsuCidadeActionPerformed(evt);
            }
        });
        jMenu2.add(ConsUsuCidade);

        ConsUsuFone.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsUsuFone.setText("Consulta de Usuários por Telefone");
        ConsUsuFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsUsuFoneActionPerformed(evt);
            }
        });
        jMenu2.add(ConsUsuFone);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas de Veículos");

        ConsVeicModeloAZ.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsVeicModeloAZ.setText("Consulta de Veículos por Ordem Alfabética");
        ConsVeicModeloAZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsVeicModeloAZActionPerformed(evt);
            }
        });
        jMenu3.add(ConsVeicModeloAZ);

        ConsVeicTipo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsVeicTipo.setText("Consulta de Veículos por Tipo");
        ConsVeicTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsVeicTipoActionPerformed(evt);
            }
        });
        jMenu3.add(ConsVeicTipo);

        ConsVeicModelo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsVeicModelo.setText("Consulta de Veículos por Modelo");
        ConsVeicModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsVeicModeloActionPerformed(evt);
            }
        });
        jMenu3.add(ConsVeicModelo);

        ConsVeicPlaca.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 12)); // NOI18N
        ConsVeicPlaca.setText("Consulta de Veículos por Placa");
        ConsVeicPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsVeicPlacaActionPerformed(evt);
            }
        });
        jMenu3.add(ConsVeicPlaca);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Relatórios");

        jMenuItem1.setText("Relatório de Usuários Modelo 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem3.setText("Relatório de Usuários Modelo 2");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem2.setText("Relatório de Veículos Modelo 1");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem4.setText("Relatório de Veículos Modelo 2");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadVeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadVeiActionPerformed
        try {
            new FrCarros().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadVeiActionPerformed

    private void cadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadUsuActionPerformed
        try {
            new FrUsuario().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cadUsuActionPerformed

    private void ConsUsuAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsUsuAZActionPerformed
        try {
            new FrConsUsuOA().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsUsuAZActionPerformed

    private void ConsUsuEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsUsuEstadoActionPerformed
        try {
            new FrConsUsuEstado().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsUsuEstadoActionPerformed

    private void ConsUsuCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsUsuCidadeActionPerformed
         try {
            new FrConsUsuCidade().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsUsuCidadeActionPerformed

    private void ConsUsuFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsUsuFoneActionPerformed
        try {
            new FrConsUsuFone().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsUsuFoneActionPerformed

    private void ConsVeicModeloAZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsVeicModeloAZActionPerformed
        try {
            new FrConsVeicOA().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsVeicModeloAZActionPerformed

    private void ConsVeicTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsVeicTipoActionPerformed
        try {
            new FrConsVeicTipo().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsVeicTipoActionPerformed

    private void ConsVeicModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsVeicModeloActionPerformed
        try {
            new FrConsVeicModelo().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsVeicModeloActionPerformed

    private void ConsVeicPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsVeicPlacaActionPerformed
        try {
            new FrConsVeicPlaca().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConsVeicPlacaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            showRel1Usu();
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            showRel1Veic();
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            showRel2Usu();
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        try {
            showRel2Veic();
        } catch (SQLException ex) {
            Logger.getLogger(Frmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsUsuAZ;
    private javax.swing.JMenuItem ConsUsuCidade;
    private javax.swing.JMenuItem ConsUsuEstado;
    private javax.swing.JMenuItem ConsUsuFone;
    private javax.swing.JMenuItem ConsVeicModelo;
    private javax.swing.JMenuItem ConsVeicModeloAZ;
    private javax.swing.JMenuItem ConsVeicPlaca;
    private javax.swing.JMenuItem ConsVeicTipo;
    private javax.swing.JMenuItem cadUsu;
    private javax.swing.JMenuItem cadVei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
