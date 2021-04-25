
package Model;

import BancoDados.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseCadIgrejas {

    public static int ID_Igreja;  //ok
    
    public static String NomeIgreja; // ok
    
    public static String Endereco; //ok
    
    public static String Bairro;  // ok
    
    public static String Cidade; // ok
    
    public static int Numero;
    
    public static String Estado;  //ok
    
    public static String Telefone; // ok
    
    public static String PastorResponsavel;
    
    public static String Email;
    
    public static String Cep;


    ConexaoBanco conectar = new ConexaoBanco();
    
   
    
    public void CadastrarIgreja() throws SQLException{
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "INSERT INTO igrejas(nomeigreja, telefone, email, pastorresponsavel, endereco, numero, bairro, cidade, uf, cep)\n" +
                    "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, NomeIgreja);
            stmt.setString(2, Telefone);
            stmt.setString(3, Email);
            stmt.setString(4, PastorResponsavel);
            stmt.setString(5, Endereco);
            stmt.setInt(6, Numero);
            stmt.setString(7, Bairro);
            stmt.setString(8, Cidade);
            stmt.setString(9, Estado);
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
    
    public void AlterarIgreja() throws SQLException{// alterar aqui depois
        Connection con = null;
        PreparedStatement stmt = null;
        String sql = "UPDATE igrejas SET  nomeigreja=?, telefone=?, email=?, pastorresponsavel=?, endereco=?, numero=?, bairro=?, cidade=?, uf=?, cep=?\n" +
                    "	WHERE id_igreja=?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
            
            
            
            
            stmt.setString(1, NomeIgreja);
            stmt.setString(2, Telefone);
            stmt.setString(3, Email);
            stmt.setString(4, PastorResponsavel);
            stmt.setString(5, Endereco);
            stmt.setInt(6, Numero);
            stmt.setString(7, Bairro);
            stmt.setString(8, Cidade);
            stmt.setString(9, Estado);
            stmt.setString(10, Cep);
            stmt.setInt(11, ID_Igreja);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            con.close();
        }
    }
    
    public void Deletar() throws SQLException{// alterar aqui depois
        Connection con = null;
        PreparedStatement stmt = null;
        
        String sql = "DELETE FROM Igrejas WHERE id_igreja=?";
        
        try{
            con = conectar.Conectar();
            stmt = con.prepareStatement(sql);
    
            stmt.setInt(1, ID_Igreja);
            
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
