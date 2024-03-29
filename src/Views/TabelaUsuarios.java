
package Views;

import BancoDados.ConexaoBanco;
import Model.ClasseUsuario;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showConfirmDialog;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class TabelaUsuarios extends javax.swing.JPanel {
    ConexaoBanco conectar = new ConexaoBanco();
    public boolean check = false;

    
   
    public TabelaUsuarios() {
        initComponents();
    }
     
    public void Povoar(String sql) throws SQLException{
        
        Connection con = conectar.Conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = con.prepareStatement(sql);
            stmt.execute();
            rs = stmt.executeQuery();
            
            DefaultTableModel Model = (DefaultTableModel) tabelaUsuários.getModel();
            Model.setNumRows(0);
            
            while(rs.next()){
                Model.addRow(new Object[]{
                    check,
                    rs.getString("CodigoUsuario"),
                    rs.getString("NomeUsuario"),
                });
            }
            rs.close();
            stmt.close();
            
        }
        catch(SQLException e){
            System.out.println(e);
        }finally{
            con.close();
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuários = new javax.swing.JTable();
        BotaoAdicionar = new javax.swing.JButton();
        BotaoEditar = new javax.swing.JButton();
        Botaoexcluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        CampoCodigo = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(219, 230, 244));

        tabelaUsuários.setBackground(new java.awt.Color(255, 255, 255));
        tabelaUsuários.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tabelaUsuários.setForeground(new java.awt.Color(0, 0, 0));
        tabelaUsuários.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "ID", "Nome do Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuários.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaUsuários.setSelectionBackground(new java.awt.Color(219, 230, 244));
        tabelaUsuários.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tabelaUsuários.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuáriosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuários);
        if (tabelaUsuários.getColumnModel().getColumnCount() > 0) {
            tabelaUsuários.getColumnModel().getColumn(0).setMinWidth(20);
            tabelaUsuários.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabelaUsuários.getColumnModel().getColumn(0).setMaxWidth(20);
            tabelaUsuários.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuários.getColumnModel().getColumn(1).setPreferredWidth(1);
            tabelaUsuários.getColumnModel().getColumn(2).setResizable(false);
            tabelaUsuários.getColumnModel().getColumn(2).setPreferredWidth(700);
        }

        BotaoAdicionar.setBackground(new java.awt.Color(1, 1, 34));
        BotaoAdicionar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        BotaoAdicionar.setText("Adicionar");
        BotaoAdicionar.setBorder(null);
        BotaoAdicionar.setBorderPainted(false);
        BotaoAdicionar.setFocusPainted(false);
        BotaoAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoAdicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoAdicionarMouseExited(evt);
            }
        });
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        BotaoEditar.setBackground(new java.awt.Color(1, 1, 34));
        BotaoEditar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        BotaoEditar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        BotaoEditar.setText("Editar");
        BotaoEditar.setBorder(null);
        BotaoEditar.setBorderPainted(false);
        BotaoEditar.setFocusPainted(false);
        BotaoEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoEditarMouseExited(evt);
            }
        });
        BotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEditarActionPerformed(evt);
            }
        });

        Botaoexcluir.setBackground(new java.awt.Color(1, 1, 34));
        Botaoexcluir.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Botaoexcluir.setForeground(new java.awt.Color(255, 255, 255));
        Botaoexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        Botaoexcluir.setText("Excluir");
        Botaoexcluir.setBorder(null);
        Botaoexcluir.setBorderPainted(false);
        Botaoexcluir.setFocusPainted(false);
        Botaoexcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotaoexcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotaoexcluirMouseExited(evt);
            }
        });
        Botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoexcluirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuários");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Localizar:");

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        CampoCodigo.setBackground(new java.awt.Color(219, 230, 244));
        CampoCodigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CampoCodigo.setForeground(new java.awt.Color(219, 230, 244));
        CampoCodigo.setBorder(null);

        Buscar.setBackground(new java.awt.Color(1, 1, 34));
        Buscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Atualizar.png"))); // NOI18N
        Buscar.setText("Atualizar");
        Buscar.setBorder(null);
        Buscar.setBorderPainted(false);
        Buscar.setFocusPainted(false);
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BuscarMouseExited(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Botaoexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 874, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEditarActionPerformed
       if(CampoCodigo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Nenhma Linha Foi Selecionada");
       }
       else{
           try {
               ClasseUsuario.CodigoUsuario = Integer.parseInt(CampoCodigo.getText());
               CadastroUsuario chamar = new CadastroUsuario(null, true);
               String sql = "SELECT * FROM Usuario WHERE CodigoUsuario = "+ClasseUsuario.CodigoUsuario;
               chamar.Povoar(sql);
               chamar.setVisible(true);
               String sq = "SELECT CodigoUsuario,NomeUsuario FROM Usuario";
               Povoar(sq);
           } catch (SQLException ex) {
               Logger.getLogger(TabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }//GEN-LAST:event_BotaoEditarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        try {
            CadastroUsuario chamar = new CadastroUsuario(null, true);
            chamar.setVisible(true);
            String sql = "SELECT CodigoUsuario,NomeUsuario FROM Usuario";
            Povoar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BotaoAdicionarActionPerformed

    private void tabelaUsuáriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuáriosMouseClicked
       int linha = tabelaUsuários.getSelectedRow();
       CampoCodigo.setText(tabelaUsuários.getValueAt(linha, 1).toString());
       
       
       if(evt.getClickCount() == 2){
           try {
               ClasseUsuario.CodigoUsuario = Integer.parseInt(CampoCodigo.getText());
               CadastroUsuario chamar = new CadastroUsuario(null, true);
               String sql = "SELECT * FROM Usuario WHERE CodigoUsuario = "+ClasseUsuario.CodigoUsuario;
               chamar.Povoar(sql);
               chamar.setVisible(true);
               String sq = "SELECT CodigoUsuario,NomeUsuario FROM Usuario";
               Povoar(sq);
           } catch (SQLException ex) {
               Logger.getLogger(TabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }//GEN-LAST:event_tabelaUsuáriosMouseClicked

    private void BotaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoexcluirActionPerformed
        if(CampoCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nenhuma Linha Selecionada");
        }
        else{
            try {
                UIManager.put("OptionPane.noButtonText", "Não");
                UIManager.put("OptionPane.yesButtonText", "Sim");
                switch(showConfirmDialog(null, "Deseja Realmente Excluir?","Confirma Exclusão",JOptionPane.YES_NO_OPTION)){
                    
                    case 0:
                        ClasseUsuario.CodigoUsuario = Integer.parseInt(CampoCodigo.getText());
                        ClasseUsuario excluir = new ClasseUsuario();
                        excluir.DeletaUsuario();
                        String sql = "SELECT CodigoUsuario,NomeUsuario FROM Usuario";
                        Povoar(sql);
                        break;
                        
                    case 1:
                        break; 
                }
            } catch (SQLException ex) {
                Logger.getLogger(TabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_BotaoexcluirActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
            String sql = "SELECT CodigoUsuario,NomeUsuario FROM Usuario";
            Povoar(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseEntered
        Buscar.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BuscarMouseEntered

    private void BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseExited
        Buscar.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BuscarMouseExited

    private void BotaoexcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoexcluirMouseEntered
        Botaoexcluir.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoexcluirMouseEntered

    private void BotaoexcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoexcluirMouseExited
        Botaoexcluir.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BotaoexcluirMouseExited

    private void BotaoEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEditarMouseEntered
        BotaoEditar.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoEditarMouseEntered

    private void BotaoEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoEditarMouseExited
        BotaoEditar.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BotaoEditarMouseExited

    private void BotaoAdicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAdicionarMouseEntered
        BotaoAdicionar.setBackground(new Color(219,230,244));
    }//GEN-LAST:event_BotaoAdicionarMouseEntered

    private void BotaoAdicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotaoAdicionarMouseExited
        BotaoAdicionar.setBackground(new Color(1,1,34));
    }//GEN-LAST:event_BotaoAdicionarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoEditar;
    private javax.swing.JButton Botaoexcluir;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField CampoCodigo;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tabelaUsuários;
    // End of variables declaration//GEN-END:variables
}
