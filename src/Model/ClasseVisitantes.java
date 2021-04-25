
package Model;

import BancoDados.ConexaoBanco;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseVisitantes {
    
    public static int CodigoVisitante;
    
    public static String NomeVisitante;
    
    public static Date DataVisita;
    
    public static String Denominacao;
    
    public static String Cidade;
    
    public static String UF;
    
    public static int IdVisitante;
    
    public static Date DataVisitah;
    
    public static String Denominacaoh;
    
    
   
    
    ConexaoBanco conectar = new ConexaoBanco();
    

    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO Visitantes(NomeVisitante,DataVisita,Denominacao,Cidade,UF) VALUES(?,?,?,?,?)";
        
        try{
            
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, NomeVisitante);
            stmt.setDate(2 ,DataVisita);
            stmt.setString(3, Denominacao);
            stmt.setString(4 ,Cidade);
            stmt.setString(5, UF);
            
           
            
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Visitante cadastrado com Sucesso");
            
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
        String sql = "UPDATE Visitantes SET NomeVisitante = ?,\n" +
                    "DataVisita =?,\n" +
                    "Denominacao =?,Cidade = ?,UF = ? WHERE CodigoVisitante = ?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, NomeVisitante);
            stmt.setString(3, Denominacao);
            stmt.setString(4 ,Cidade);
            stmt.setString(5,UF);
            
            
            stmt.setInt(6, CodigoVisitante);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Visitante alterado com Sucesso");            
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
        String sql = "DELETE FROM Visitantes WHERE CodigoVisitante = ?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, CodigoVisitante);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Usuário Deletado com Sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Não é possível excluir pois já há registros vinculados com este Visitante");
        }finally{
            con.close();
        }
        
    }
   
    public void InserirRegistro() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO HistoricoVisita(IdVisitante,DataVisita,Anotacoes) VALUES(?,?,?)";
        
        try{
            
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            stmt.setInt(1, IdVisitante);
            stmt.setDate(2 ,DataVisitah);
            stmt.setString(3, Denominacaoh);            
           
            
            stmt.execute();
            JOptionPane.showMessageDialog(null,"Visitante registrado com Sucesso");
            
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con.close();
        }
    }
}
