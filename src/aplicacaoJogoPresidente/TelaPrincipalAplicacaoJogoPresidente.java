/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoJogoPresidente;

/**
 *
 * @author Lucas Melo
 */
public class TelaPrincipalAplicacaoJogoPresidente extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalAplicacaoJogoPresidente
     */
    public TelaPrincipalAplicacaoJogoPresidente() {
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

        botaoOpcao1 = new javax.swing.JButton();
        botaoOpcao2 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(815, 480));
        setPreferredSize(new java.awt.Dimension(815, 480));
        getContentPane().setLayout(null);

        botaoOpcao1.setBackground(new java.awt.Color(255, 255, 255));
        botaoOpcao1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoOpcao1.setText("OPÇÃO 1");
        getContentPane().add(botaoOpcao1);
        botaoOpcao1.setBounds(470, 320, 290, 40);

        botaoOpcao2.setBackground(new java.awt.Color(255, 255, 255));
        botaoOpcao2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoOpcao2.setText("OPÇÃO 2");
        getContentPane().add(botaoOpcao2);
        botaoOpcao2.setBounds(470, 370, 290, 40);

        voltar.setBackground(new java.awt.Color(255, 255, 255));
        voltar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(680, 420, 80, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ImagemPrincpalJogo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 444);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
dispose();
TelaInicioAplicacaoJogo inicial = new TelaInicioAplicacaoJogo();
inicial.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalAplicacaoJogoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAplicacaoJogoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAplicacaoJogoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalAplicacaoJogoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalAplicacaoJogoPresidente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoOpcao1;
    private javax.swing.JButton botaoOpcao2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}