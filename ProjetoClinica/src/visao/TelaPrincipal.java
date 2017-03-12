/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConexaoBD;

/**
 *
 * @author Gustavo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        jPanelInternal = new javax.swing.JPanel();
        jButtonPainelCadMedico = new javax.swing.JButton();
        jLabelPainelCadastro = new javax.swing.JLabel();
        jButtonPainelCadastroEnfermeira = new javax.swing.JButton();
        jButtonPainelCadastroPaciente = new javax.swing.JButton();
        jLabelAPainelgenda = new javax.swing.JLabel();
        jButtonPainelAgenda = new javax.swing.JButton();
        jLabelPainelBemVindo = new javax.swing.JLabel();
        jButtonPainelSair = new javax.swing.JButton();
        jLabelFundoPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadastroMedico = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItemCadastroEnfermeira = new javax.swing.JMenuItem();
        jMenuItemCadastroUsario = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuFerramentas = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setTitle("Bem Vindo");
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        jPanelInternal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInternal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInternal.setLayout(null);

        jButtonPainelCadMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CadMedicos.png"))); // NOI18N
        jButtonPainelCadMedico.setToolTipText("Medico");
        jButtonPainelCadMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPainelCadMedicoActionPerformed(evt);
            }
        });
        jPanelInternal.add(jButtonPainelCadMedico);
        jButtonPainelCadMedico.setBounds(10, 40, 110, 100);

        jLabelPainelCadastro.setText("Cadastro");
        jPanelInternal.add(jLabelPainelCadastro);
        jLabelPainelCadastro.setBounds(20, 10, 60, 14);

        jButtonPainelCadastroEnfermeira.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-infermeira.png"))); // NOI18N
        jButtonPainelCadastroEnfermeira.setToolTipText("Enfermeira");
        jButtonPainelCadastroEnfermeira.setBorder(null);
        jPanelInternal.add(jButtonPainelCadastroEnfermeira);
        jButtonPainelCadastroEnfermeira.setBounds(120, 40, 110, 100);

        jButtonPainelCadastroPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadPacientes.png"))); // NOI18N
        jButtonPainelCadastroPaciente.setToolTipText("Paciente");
        jPanelInternal.add(jButtonPainelCadastroPaciente);
        jButtonPainelCadastroPaciente.setBounds(230, 40, 110, 100);

        jLabelAPainelgenda.setText("Agenda ");
        jPanelInternal.add(jLabelAPainelgenda);
        jLabelAPainelgenda.setBounds(20, 150, 60, 14);

        jButtonPainelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Agenda.png"))); // NOI18N
        jButtonPainelAgenda.setToolTipText("Agendamentp");
        jPanelInternal.add(jButtonPainelAgenda);
        jButtonPainelAgenda.setBounds(10, 170, 110, 100);

        jInternalFrameBemVindo.getContentPane().add(jPanelInternal);
        jPanelInternal.setBounds(10, 60, 630, 280);

        jLabelPainelBemVindo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPainelBemVindo.setText("Principais Funcionalidades");
        jInternalFrameBemVindo.getContentPane().add(jLabelPainelBemVindo);
        jLabelPainelBemVindo.setBounds(20, 20, 240, 17);

        jButtonPainelSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/exit.png"))); // NOI18N
        jButtonPainelSair.setToolTipText("Sair Painel Bem - Vindo");
        jButtonPainelSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPainelSairActionPerformed(evt);
            }
        });
        jInternalFrameBemVindo.getContentPane().add(jButtonPainelSair);
        jButtonPainelSair.setBounds(590, 10, 40, 40);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(210, 20, 670, 420);

        jLabelFundoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo_telaprincipal.jpg"))); // NOI18N
        getContentPane().add(jLabelFundoPrincipal);
        jLabelFundoPrincipal.setBounds(0, 0, 1120, 530);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadastroMedico.setText("Medicos");
        jMenuItemCadastroMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroMedicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadastroMedico);

        jMenuItem1.setText("Pacientes");
        jMenuCadastro.add(jMenuItem1);

        jMenuItemCadastroEnfermeira.setText("Enfermeiras");
        jMenuCadastro.add(jMenuItemCadastroEnfermeira);

        jMenuItemCadastroUsario.setText("Usuarios");
        jMenuCadastro.add(jMenuItemCadastroUsario);

        jMenuBar1.add(jMenuCadastro);

        jMenuRelatorio.setText("Relatorios");
        jMenuBar1.add(jMenuRelatorio);

        jMenuFerramentas.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Tela Bem- Vindo");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenuFerramentas.add(jMenuItemTelaBemVindo);

        jMenuBar1.add(jMenuFerramentas);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1137, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jButtonPainelSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPainelSairActionPerformed
        jInternalFrameBemVindo.dispose();
    }//GEN-LAST:event_jButtonPainelSairActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemCadastroMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroMedicoActionPerformed
        FormMedico tela = new FormMedico();
        tela.setVisible(true);    
    }//GEN-LAST:event_jMenuItemCadastroMedicoActionPerformed

    private void jButtonPainelCadMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPainelCadMedicoActionPerformed
        FormMedico tela = new FormMedico();
        tela.setVisible(true);
    }//GEN-LAST:event_jButtonPainelCadMedicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPainelAgenda;
    private javax.swing.JButton jButtonPainelCadMedico;
    private javax.swing.JButton jButtonPainelCadastroEnfermeira;
    private javax.swing.JButton jButtonPainelCadastroPaciente;
    private javax.swing.JButton jButtonPainelSair;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabelAPainelgenda;
    private javax.swing.JLabel jLabelFundoPrincipal;
    private javax.swing.JLabel jLabelPainelBemVindo;
    private javax.swing.JLabel jLabelPainelCadastro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFerramentas;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemCadastroEnfermeira;
    private javax.swing.JMenuItem jMenuItemCadastroMedico;
    private javax.swing.JMenuItem jMenuItemCadastroUsario;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelInternal;
    // End of variables declaration//GEN-END:variables
}
