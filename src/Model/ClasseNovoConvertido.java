
package Model;

import BancoDados.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseNovoConvertido {

    public static int id_NovoConverido;  //ok
    
    public static String NomeConvertido; // ok
    
    public static String Endereco; //ok
    
    public static String Bairro;  // ok
    
    public static String Cidade; // ok
    
    public static int Numero;
    
    public static String Estado;  //ok
    
    public static String Telefone; // ok
    
    public static String DataConversao;
    
    public static String Obs;
    
    public static String Cep;


    ConexaoBanco conectar = new ConexaoBanco();
    
   
    
    public void Add() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO novoconvertido(\n" +
                    "	nomeconvertido, endereco, bairro, numero, cidade, uf, dataconversao, obs, telefone, cep)\n" +
                    "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, NomeConvertido);
            stmt.setString(2, Endereco);
            stmt.setString(3, Bairro);
            stmt.setInt(4, Numero);
            stmt.setString(5, Cidade );
            stmt.setString(6, Estado);
            stmt.setString(7, DataConversao);
            stmt.setString(8, Obs);
            stmt.setString(9, Telefone);
            stmt.setString(10, Cep);
            
   
            stmt.execute();
            
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con.close();
        }
    }
    
    public void Edit() throws SQLException{// alterar aqui depois
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE novoconvertido\n" +
                    "	SET nomeconvertido=?, endereco=?, bairro=?, numero=?, cidade=?, uf=?, dataconversao=?, obs=?, telefone=?, cep=?\n" +
                    "	WHERE id_novoconverido=?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            
            
             stmt.setString(1, NomeConvertido);
            stmt.setString(2, Endereco);
            stmt.setString(3, Bairro);
            stmt.setInt(4, Numero);
            stmt.setString(5, Cidade );
            stmt.setString(6, Estado);
            stmt.setString(7, DataConversao);
            stmt.setString(8, Obs);
            stmt.setString(9, Telefone);
            stmt.setString(10, Cep);
            stmt.setInt(11, id_NovoConverido);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con.close();
        }
    }
    
    public void Delete() throws SQLException{// alterar aqui depois
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "DELETE FROM novoconvertido\n" +
"	WHERE id_novoconverido=? ";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
    
            stmt.setInt(1, id_NovoConverido);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con.close();
        }
    }
        
}
