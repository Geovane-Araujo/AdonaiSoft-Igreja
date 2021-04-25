
package Model;

import BancoDados.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;


public class ClasseRegistroChamada {
    
    public static int ID;
    
    public static int IDChamada;
     
    public static int IDMatriculado;
    
    public static boolean Presente;
    


    ConexaoBanco conectar = new ConexaoBanco();
    

    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO RegistroChamada(IDChamada,IDMatriculado,Presente) VALUES (?,?,?)";
        
        try{
            
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            stmt.setInt(1,IDChamada);
            stmt.setInt(2, IDMatriculado);
            stmt.setBoolean(3, Presente);
            
            stmt.execute();
            
            
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        } finally{
            con.close();
        }
    }
    
    
    
//    public void Delete(){
//        
//        String sql = "DELETE FROM Chamada WHERE ID = ?";
//        
//        try{
//            Connection con = conectar.Conectar();
//            PreparedStatement stmt = con.prepareStatement(sql);
//            
//            stmt.setInt(1,ID);
//            stmt.executeUpdate();
//   
//        }
//        catch(SQLException e){
//            JOptionPane.showMessageDialog(null,"Erro ao Excluir");
//        }   
//    }
}
