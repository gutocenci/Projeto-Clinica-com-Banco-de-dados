package modeloDoa;

import modeloConection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelobeans.BeansMedico;

/**
 *
 * @author Gustavo
 */
public class DaoMedico {

    ConexaoBD conex = new ConexaoBD();
    BeansMedico mod = new BeansMedico();

    public void salvar(BeansMedico mod) {
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into medico(nome_medico,especialidade_medico,crm_medico) values(?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getEspecialidade());
            pst.setInt(3, mod.getCrm());
            pst.execute();
            //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Dados nao inseridos no BD" + ex);
        }
        conex.desconecta();

    }
    
    public BeansMedico buscaMedico(BeansMedico mod){
        conex.conexao();
        conex.executaSQL("select * from medico where nome_medico like '%"+mod.getPesquisa()+"%'");
        try {
            conex.rs.first();
            mod.setCodigo(conex.rs.getInt("cod_medico"));
            mod.setNome(conex.rs.getString("nome_medico"));
            mod.setEspecialidade(conex.rs.getString("especialidade_medico"));
            mod.setCrm(conex.rs.getInt("crm_medico"));
            JOptionPane.showMessageDialog(null, "Pesquisa realizada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO ao pesquisar medico" + ex);
        }
        conex.desconecta();
        return mod;
        
    }
}
