package controle;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;*/
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoBD {

    public Statement stn; //Fazer esquisa
    public ResultSet rs; //Retorna o resultado da pesquisa
    private String driver = "org.postgresql.Driver"; //Notifica o nosso serviço
    private String caminho = "jdbc:postgresql://localhost:5432/PrjClinica"; //Qual o caminho do BD
    private String usuario = "postgres"; //Usuario BD
    private String senha = "K@frinhachenchi33"; //Usuario BD
    private Connection con; //Realizar a conexão

    public void conexao() {

        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conexão não efetuada:\n" + ex.getMessage());
        }
    }

    public void desconecta() {
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "BD Desconectado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "BD Erro ao fechar a conexão ao banco de dados:\n" + ex.getMessage());
        }
    }
}
