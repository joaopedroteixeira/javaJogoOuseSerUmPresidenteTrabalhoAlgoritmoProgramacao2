/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoJogoPresidente;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Melo
 */
public class TelaPrincipalAplicacaoJogoPresidente extends javax.swing.JFrame {
    private int meses;

    /**
     * Creates new form TelaPrincipalAplicacaoJogoPresidente
     */
    public TelaPrincipalAplicacaoJogoPresidente() {
    int y=2;
     int x= 1;
       
        
        initComponents();
    }
String nome=JOptionPane.showInputDialog("PRESIDENTE");
    public void imagemIcon(){
      Random num = new Random();
      int numero=num.nextInt(36);
        ImageIcon img = new ImageIcon(getClass().getResource("/imagem/cartas/Carta "+numero+".png"));
        jLabel2.setIcon(img);
    }  
    
    public void texto(){
        int meses=3;
        jLabel4.setText("PRESIDENTE : "+nome);
        jLabel5.setText(meses+" MESES NA PRESIDENCIA");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoOpcao1 = new javax.swing.JButton();
        botaoOpcao2 = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jprogressEducacao = new javax.swing.JProgressBar();
        jProgressSeguranca = new javax.swing.JProgressBar();
        jProgressEconomia = new javax.swing.JProgressBar();
        jProgressAprovacao = new javax.swing.JProgressBar();
        jProgressSaude = new javax.swing.JProgressBar();
        jProgressTransporte = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(815, 480));
        setPreferredSize(new java.awt.Dimension(815, 480));
        getContentPane().setLayout(null);

        botaoOpcao1.setBackground(new java.awt.Color(255, 255, 255));
        botaoOpcao1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoOpcao1.setText("OPÇÃO 1");
        botaoOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOpcao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botaoOpcao1);
        botaoOpcao1.setBounds(470, 320, 290, 40);

        botaoOpcao2.setBackground(new java.awt.Color(255, 255, 255));
        botaoOpcao2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        botaoOpcao2.setText("OPÇÃO 2");
        botaoOpcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOpcao2ActionPerformed(evt);
            }
        });
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

        jprogressEducacao.setBackground(new java.awt.Color(255, 255, 255));
        jprogressEducacao.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(jprogressEducacao);
        jprogressEducacao.setBounds(350, 10, 140, 40);
        jprogressEducacao.setValue(50);
        getContentPane().add(jProgressSeguranca);
        jProgressSeguranca.setBounds(350, 60, 140, 40);
        jProgressSeguranca.setValue(50);

        jProgressEconomia.setForeground(new java.awt.Color(51, 255, 51));
        getContentPane().add(jProgressEconomia);
        jProgressEconomia.setBounds(600, 10, 140, 40);
        jProgressEconomia.setValue(50);
        getContentPane().add(jProgressAprovacao);
        jProgressAprovacao.setBounds(600, 60, 140, 40);
        jProgressAprovacao.setValue(50);
        getContentPane().add(jProgressSaude);
        jProgressSaude.setBounds(90, 10, 140, 40);
        jProgressSaude.setValue(50);
        getContentPane().add(jProgressTransporte);
        jProgressTransporte.setBounds(90, 60, 140, 40);
        jProgressTransporte.setValue(50);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(710, 154, 0, 10);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 430, 310);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 210, 340, 60);

        jLabel4.setBackground(new java.awt.Color(0, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 150, 340, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ImagemPrincpalJogo.jpeg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 444);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //botao voltar ao menu inicial
    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
dispose();//fechando a tela principal
TelaInicioAplicacaoJogo inicial = new TelaInicioAplicacaoJogo();
inicial.setVisible(true);//visibilidade
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarActionPerformed


    private void botaoOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao1ActionPerformed
  
    texto();
   //valores testes
  
    imagemIcon();

        // TODO add your handling code here:
    }//GEN-LAST:event_botaoOpcao1ActionPerformed

    private void botaoOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao2ActionPerformed
imagemIcon();        // TODO add your handling code here:
    }//GEN-LAST:event_botaoOpcao2ActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JProgressBar jProgressAprovacao;
    private javax.swing.JProgressBar jProgressEconomia;
    private javax.swing.JProgressBar jProgressSaude;
    private javax.swing.JProgressBar jProgressSeguranca;
    private javax.swing.JProgressBar jProgressTransporte;
    private javax.swing.JProgressBar jprogressEducacao;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
