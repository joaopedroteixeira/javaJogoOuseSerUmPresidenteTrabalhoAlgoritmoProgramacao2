/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoJogoPresidente;

import javax.swing.JOptionPane;

/**
 *
 * @author Joao pedro,Rafael,Elias e Giovanni.
 */
public class TelaInicioAplicacaoJogo extends javax.swing.JFrame {
    

    /**
     * Creates new form TelaInicioAplicacaoJogo
     */
    public TelaInicioAplicacaoJogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCreditos = new javax.swing.JButton();
        botaoJogar = new javax.swing.JButton();
        imagemInicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OUSE SER UM PRESIDENTE NO BRASIL!");
        setMinimumSize(new java.awt.Dimension(815, 480));
        setPreferredSize(new java.awt.Dimension(815, 480));
        getContentPane().setLayout(null);

        botaoCreditos.setBackground(new java.awt.Color(255, 255, 255));
        botaoCreditos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoCreditos.setText("CRÉDITOS");
        botaoCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCreditos);
        botaoCreditos.setBounds(520, 360, 180, 50);

        botaoJogar.setBackground(new java.awt.Color(255, 255, 255));
        botaoJogar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoJogar.setText("JOGAR");
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoJogar);
        botaoJogar.setBounds(520, 300, 180, 50);

        imagemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ImagemIniciar.jpeg"))); // NOI18N
        getContentPane().add(imagemInicio);
        imagemInicio.setBounds(0, 0, 800, 444);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//acao do botao para ir a tela de creditos
    private void botaoCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCreditosActionPerformed
dispose();
TelaCreditosAplicacaoJogoPresidente creditos = new TelaCreditosAplicacaoJogoPresidente();
creditos.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_botaoCreditosActionPerformed
//acao do botao para ir a tela principal do jogo
    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
dispose();
TelaPrincipalAplicacaoJogoPresidente principal = new TelaPrincipalAplicacaoJogoPresidente();
principal.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_botaoJogarActionPerformed
  
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
            java.util.logging.Logger.getLogger(TelaInicioAplicacaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicioAplicacaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicioAplicacaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicioAplicacaoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicioAplicacaoJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCreditos;
    private javax.swing.JButton botaoJogar;
    private javax.swing.JLabel imagemInicio;
    // End of variables declaration//GEN-END:variables
}
