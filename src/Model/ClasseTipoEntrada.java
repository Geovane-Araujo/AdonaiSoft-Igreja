
package Model;

import BancoDados.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseTipoEntrada {
    
    public static int IDTipo;
    
    public static String Descricao;

    
    ConexaoBanco conectar = new ConexaoBanco();
    

    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO TipoEntrada(descricao) VALUES (?)";
        
        try{
            
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);

            stmt.setString(1, Descricao);

            
           
            
            stmt.execute();
            JOptionPane.showMessageDialog(null,"cadastrado com Sucesso");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "O visitante que está tentando cadastrar já contém na base de dados");
        }finally{
            con.close();
        }
    }
    
    public void Edit() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE TipoEntrada\n" +
                    "	SET descricao=?\n" +
                    "	WHERE IDTipo=? ";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, Descricao);
            stmt.setInt(2, IDTipo);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso");            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"falha ao alterar verifique -> " +e );
        }finally{
            con.close();
        }
        
    }
    
    public void Delete() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM TipoEntrada WHERE IDTipo = ?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, IDTipo);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não é possível excluir pois já há registros vinculados com este Registro");
        }finally{
            con.close();
        }
        
    }
   

}
