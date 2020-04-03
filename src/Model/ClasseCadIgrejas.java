
package Model;

import BancoDados.ConexaoBanco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClasseCadIgrejas {

    public static int ID_Igreja;  //ok
    
    public static String nomeIgreja; // ok
    
    public static String endereco; //ok
    
    public static String bairro;  // ok
    
    public static String cidade; // ok
    
    public static int numero;
    
    public static String estado;  //ok
    
    public static String telefone; // ok
    
    public static String pastorResponsavel;
    
    public static String email;
    
    public static String cep;


    ConexaoBanco conectar = new ConexaoBanco();
    
   
    
    public void CadastrarIgreja(){
        
        String sql = "INSERT INTO igrejas(nomeigreja, telefone, email, pastorresponsavel, endereco, numero, bairro, cidade, uf, cep)\n" +
                    "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            Connection con = conectar.Conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            
            stmt.setString(1, nomeIgreja);
            stmt.setString(2, telefone);
            stmt.setString(3, email);
            stmt.setString(4, pastorResponsavel);
            stmt.setString(5, endereco);
            stmt.setInt(6, numero);
            stmt.setString(7, bairro);
            stmt.setString(8, cidade);
            stmt.setString(9, estado);
            stmt.setString(10, cep);
            
   
            stmt.execute();
            
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void AlterarIgreja(){// alterar aqui depois
        
        String sql = "UPDATE igrejas SET  nomeigreja=?, telefone=?, email=?, pastorresponsavel=?, endereco=?, numero=?, bairro=?, cidade=?, uf=?, cep=?\n" +
                    "	WHERE id_igreja=?";
        
        try{
            Connection con = conectar.Conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
            
            
            
            
            stmt.setString(1, nomeIgreja);
            stmt.setString(2, telefone);
            stmt.setString(3, email);
            stmt.setString(4, pastorResponsavel);
            stmt.setString(5, endereco);
            stmt.setInt(6, numero);
            stmt.setString(7, bairro);
            stmt.setString(8, cidade);
            stmt.setString(9, estado);
            stmt.setString(10, cep);
            stmt.setInt(11, ID_Igreja);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Deletar(){// alterar aqui depois
        
        String sql = "DELETE FROM Igrejas WHERE id_igreja=?";
        
        try{
            Connection con = conectar.Conectar();
            PreparedStatement stmt = con.prepareStatement(sql);
    
            stmt.setInt(1, ID_Igreja);
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso");
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
}
