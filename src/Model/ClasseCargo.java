
package Model;

import BancoDados.ConexaoBanco;
import Views.TabelaCadCargo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseCargo {
    
    public static int IDCargo;
    
    public static String Descricao;

    
    ConexaoBanco conectar = new ConexaoBanco();
    

    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO cargo(descricao) VALUES (?)";
        
        try{
            
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, Descricao);
            stmt.execute();
            
            
            
            JOptionPane.showMessageDialog(null,"Cargo cadastrado com Sucesso");
            
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
        String sql = "UPDATE cargo\n" +
                    "	SET descricao=?\n" +
                    "	WHERE idcargo=? ";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, Descricao);
            stmt.setInt(2, IDCargo);
            
            stmt.executeUpdate();
            TabelaCadCargo cad = new TabelaCadCargo();
            String sq = "SELECT IdCargo,Descricao FROM Cargo";
            cad.Povoar(sq);
            
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
        String sql = "DELETE FROM Cargo WHERE IDCargo = ?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, IDCargo);
            
            stmt.executeUpdate();
            TabelaCadCargo cad = new TabelaCadCargo();
            String sq = "SELECT IdCargo,Descricao FROM Cargo";
            cad.Povoar(sq);
            
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não é possível excluir pois já há registros vinculados com este Cargo");
        }finally{
            con.close();
        }
        
    }
   

}
