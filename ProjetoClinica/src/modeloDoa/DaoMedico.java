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
}
