
package Model;

import BancoDados.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseClasses {
    
    public static int IDClasse;
    
    public static String Descricao;

    
    ConexaoBanco conectar = new ConexaoBanco();
    

    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO Classe(descricao) VALUES (?)";
        
        try{
            
             con = conectar.Conectar();
             stmt = con.prepareStatement(sql);
            
            stmt.setString(1, Descricao);
            stmt.execute();
            
            
            
            JOptionPane.showMessageDialog(null,"Classe cadastrado com Sucesso!");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            con.close();
        }
    }
    
    public void Edit() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE Classe\n" +
                    "	SET descricao=? \n" +
                    "	WHERE IdClasse=? ";
        
        try{
             con = conectar.Conectar();
             stmt = con.prepareStatement(sql);
            
            stmt.setString(1, Descricao);
            stmt.setInt(2, IDClasse);
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null,"Alterado com Sucesso");            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"falha ao alterar verifique -> " +e );
        } finally{
            con.close();
        }
    }
    
    public void Delete() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM CLasse WHERE IDClasse = ?";
        
        try{
             con = conectar.Conectar();
             stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, IDClasse);
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null,"Deletado com Sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não é possível excluir pois já há registros vinculados com este Classe");
        }   finally{
            con.close();
        }
    }
}
