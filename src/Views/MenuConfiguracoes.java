/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Color;

/**
 *
 * @author geova
 */
public class MenuConfiguracoes extends javax.swing.JPanel {

    public static int l;
    public static int a;
    public MenuConfiguracoes() {
        initComponents();
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
        BotaoIgreja = new javax.swing.JButton();
        BotaoUsuario = new javax.swing.JButton();
        BotaoGlobais = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(1, 1, 34));
        jPanel1.setPreferredSize(new java.awt.Dimension(98, 444));

        BotaoIgreja.setBackground(new java.awt.Color(1, 1, 34));
        BotaoIgreja.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoIgreja.setForeground(new java.awt.Color(255, 255, 255));
        BotaoIgreja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Menorah_26px.png"))); // NOI18N
        BotaoIgreja.setText(" Igreja");
        BotaoIgreja.setBorder(null);
        BotaoIgreja.setFocusPainted(false);
        BotaoIgreja.setFocusable(false);
        BotaoIgreja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoIgreja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoIgrejaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoIgrejaMouseExited(evt);
            }
        });
        BotaoIgreja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoIgrejaActionPerformed(evt);
            }
        });

        BotaoUsuario.setBackground(new java.awt.Color(1, 1, 34));
        BotaoUsuario.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Male_User_26px_1.png"))); // NOI18N
        BotaoUsuario.setText("Usuarios");
        BotaoUsuario.setBorder(null);
        BotaoUsuario.setFocusPainted(false);
        BotaoUsuario.setFocusable(false);
        BotaoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BotaoUsuarioItemStateChanged(evt);
            }
        });
        BotaoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotaoUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotaoUsuarioMousePressed(evt);
            }
        });
        BotaoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoUsuarioActionPerformed(evt);
            }
        });

        BotaoGlobais.setBackground(new java.awt.Color(1, 1, 34));
        BotaoGlobais.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotaoGlobais.setForeground(new java.awt.Color(255, 255, 255));
        BotaoGlobais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8_Settings_30px.png"))); // NOI18N
        BotaoGlobais.setText("Globais");
        BotaoGlobais.setBorder(null);
        BotaoGlobais.setFocusPainted(false);
        BotaoGlobais.setFocusable(false);
        BotaoGlobais.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotaoGlobais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoGlobaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoGlobaisMouseExited(evt);
            }
        });
        BotaoGlobais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoGlobaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotaoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
            .addComponent(BotaoIgreja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotaoGlobais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BotaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoIgreja, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoGlobais, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoIgrejaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoIgrejaMouseEntered
       BotaoIgreja.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoIgrejaMouseEntered

    private void BotaoIgrejaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoIgrejaMouseExited
        BotaoIgreja.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BotaoIgrejaMouseExited

    private void BotaoUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoUsuarioMouseEntered
        BotaoUsuario.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoUsuarioMouseEntered

    private void BotaoUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoUsuarioMouseExited
        BotaoUsuario.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BotaoUsuarioMouseExited

    private void BotaoIgrejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoIgrejaActionPerformed
       TabelaConfiguracoes chamar = new TabelaConfiguracoes();
        
        
         l = Principal.Painel.getWidth();
         a = Principal.Painel.getHeight();
        
        Principal.Painel.removeAll();
        Principal.Painel.add(chamar);
        Principal.Painel.revalidate();
        Principal.Painel.repaint();
        String sql = "SELECT * FROM Configuracoes";        
        chamar.Preencher(sql);
        
       chamar.setSize(l, a);
    }//GEN-LAST:event_BotaoIgrejaActionPerformed

    private void BotaoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoUsuarioActionPerformed
        TabelaUsuarios chamar = new TabelaUsuarios();
       
        
        l = Principal.Painel.getWidth();
        a = Principal.Painel.getHeight(); 
        
        Principal.Painel.removeAll();
        Principal.Painel.add(chamar);
        Principal.Painel.revalidate();
        Principal.Painel.repaint();
        
        String sql = "SELECT CodigoUsuario,NomeUsuario FROM Usuario ORDER BY CodigoUsuario DESC";
        chamar.Povoar(sql);
        chamar.setSize(l, a);
    }//GEN-LAST:event_BotaoUsuarioActionPerformed

    private void BotaoGlobaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGlobaisMouseEntered
        BotaoGlobais.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoGlobaisMouseEntered

    private void BotaoGlobaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoGlobaisMouseExited
        BotaoGlobais.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BotaoGlobaisMouseExited

    private void BotaoGlobaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoGlobaisActionPerformed
        CadastroGlobais cha = new CadastroGlobais(null, true);
        cha.setVisible(true);
    }//GEN-LAST:event_BotaoGlobaisActionPerformed

    private void BotaoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoUsuarioMouseClicked
       
    }//GEN-LAST:event_BotaoUsuarioMouseClicked

    private void BotaoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoUsuarioMousePressed
        
    }//GEN-LAST:event_BotaoUsuarioMousePressed

    private void BotaoUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BotaoUsuarioItemStateChanged
       BotaoIgreja.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoUsuarioItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton BotaoGlobais;
    public static javax.swing.JButton BotaoIgreja;
    public static javax.swing.JButton BotaoUsuario;
    public static javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}