/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.DAO.VeiculosDAO;
import br.ulbra.entity.Veiculos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrConsVeicPlaca extends javax.swing.JFrame {

    /**
     * Creates new form FrConsulta1
     */
    public FrConsVeicPlaca() throws SQLException {
        initComponents();
        readJTableConsPlacaVeic();
        this.setLocationRelativeTo(null);
    }
    
    public void readJTableConsPlacaVeic() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbConsVeic.getModel();
        modelo.setNumRows(0);
        VeiculosDAO vdao = new VeiculosDAO();
        for (Veiculos v : vdao.readVeic()) {
            modelo.addRow(new Object[]{
                v.getcodVeic(),
                v.gettipoVeic(),
                v.getmarcaVeic(),
                v.getmodeloVeic(),
                v.getplacaVeic()
            });
        }
    }
    public void readConsPlacaVeic(String tipo) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbConsVeic.getModel();
        modelo.setNumRows(0);
        VeiculosDAO vdao = new VeiculosDAO();
        for (Veiculos v : vdao.readConsPlacaVeic(tipo)) {
            modelo.addRow(new Object[]{
                v.getcodVeic(),
                v.gettipoVeic(),
                v.getmarcaVeic(),
                v.getmodeloVeic(),
                v.getplacaVeic()
            });
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
        btConsVeicModelo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbConsVeic = new javax.swing.JTable();
        edPesquisaModeloVeic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(113, 140, 92));

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE VEÍCULOS POR PLACA");

        btConsVeicModelo.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 11)); // NOI18N
        btConsVeicModelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/18213_magnifying glass_zoom_find_search_icon (1).png"))); // NOI18N
        btConsVeicModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsVeicModeloActionPerformed(evt);
            }
        });

        tbConsVeic.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 11)); // NOI18N
        tbConsVeic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "COD", "Tipo", "Marca", "Modelo", "Placa"
            }
        ));
        jScrollPane1.setViewportView(tbConsVeic);

        edPesquisaModeloVeic.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edPesquisaModeloVeic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConsVeicModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edPesquisaModeloVeic)
                    .addComponent(btConsVeicModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btConsVeicModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsVeicModeloActionPerformed
        try {
            readConsPlacaVeic(edPesquisaModeloVeic.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsVeicModeloActionPerformed

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
            java.util.logging.Logger.getLogger(FrConsVeicPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrConsVeicPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrConsVeicPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrConsVeicPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrConsUsuEstado().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrConsUsuEstado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsVeicModelo;
    private javax.swing.JTextField edPesquisaModeloVeic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbConsVeic;
    // End of variables declaration//GEN-END:variables
}
