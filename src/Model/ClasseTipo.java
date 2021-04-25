
package Model;

import BancoDados.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseTipo {
    
    public static int IDTipo;
    
    public static String Descricao;
    
    public static String PConta;

    
    ConexaoBanco conectar = new ConexaoBanco();
    

    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO tipo(descricao, pconta) VALUES (?, ?)";
        
        try{
            
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, Descricao);
            stmt.setString(2, PConta);

            
           
            
            stmt.execute();
            JOptionPane.showMessageDialog(null,"cadastrado com Sucesso");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con.close();
        }
    }
    
    public void Edit() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE tipo SET  descricao=?, pconta=?	WHERE idtipo=?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, Descricao);
            stmt.setString(2, PConta);
            stmt.setInt(3, IDTipo);
            
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
        String sql = "DELETE FROM Tipo WHERE IDTipo = ?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, IDTipo);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não é possível excluir pois já há registros vinculados com este Registro");
        }
        finally{
            con.close();
        }
    }
   

}
