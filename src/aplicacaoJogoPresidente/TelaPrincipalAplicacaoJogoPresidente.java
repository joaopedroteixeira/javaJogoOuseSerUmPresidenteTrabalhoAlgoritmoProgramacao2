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
   

    /**
     * Creates new form TelaPrincipalAplicacaoJogoPresidente
     */
    public TelaPrincipalAplicacaoJogoPresidente() {
  
        initComponents();
    }
  
    public static int numero,transporte =50,saude=50,educacao=50,seguranca=50,aprovacao=50,economia=50,meses=0,ano=0;
String nome=JOptionPane.showInputDialog("PRESIDENTE");
    public void imagemIcon(){
      Random num = new Random();
     numero=num.nextInt(36);
    
        ImageIcon img = new ImageIcon(getClass().getResource("/imagem/cartas/Carta "+numero+".png"));
        jLabel2.setIcon(img);
    }  
    
    public void texto(){
        jLabel4.setText("\tPRESIDENTE : "+nome);
       
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
        jprogressEducacao.setStringPainted(true);
        getContentPane().add(jprogressEducacao);
        jprogressEducacao.setBounds(350, 10, 140, 40);
        jprogressEducacao.setValue(educacao);

        jProgressSeguranca.setStringPainted(true);
        getContentPane().add(jProgressSeguranca);
        jProgressSeguranca.setBounds(350, 60, 140, 40);
        jProgressSeguranca.setValue(seguranca);

        jProgressEconomia.setForeground(new java.awt.Color(51, 255, 51));
        jProgressEconomia.setStringPainted(true);
        getContentPane().add(jProgressEconomia);
        jProgressEconomia.setBounds(600, 10, 140, 40);
        jProgressEconomia.setValue(economia);

        jProgressAprovacao.setStringPainted(true);
        getContentPane().add(jProgressAprovacao);
        jProgressAprovacao.setBounds(600, 60, 140, 40);
        jProgressAprovacao.setValue(aprovacao);

        jProgressSaude.setBackground(new java.awt.Color(51, 255, 51));
        jProgressSaude.setForeground(new java.awt.Color(255, 51, 51));
        jProgressSaude.setStringPainted(true);
        getContentPane().add(jProgressSaude);
        jProgressSaude.setBounds(90, 10, 140, 40);
        jProgressSaude.setValue(saude);

        jProgressTransporte.setStringPainted(true);
        getContentPane().add(jProgressTransporte);
        jProgressTransporte.setBounds(90, 60, 140, 40);
        jProgressTransporte.setValue(transporte);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(710, 154, 0, 10);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 120, 430, 310);

        jLabel5.setBackground(new java.awt.Color(0, 255, 153));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 204), null, null));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 210, 340, 60);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(460, 140, 320, 40);

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

    switch(numero){
        case 1:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 2:
            saude-=20;
            educacao+=10;
            transporte+=5;
            seguranca+=5;
            aprovacao+=10;
            economia-=5;
            break;
         case 3:
            saude+=5;
            educacao-=5;
            transporte-=10;
            seguranca-=10;
            aprovacao-=10;
            economia+=5;
            break;
        case 4:
            saude-=10;
            educacao-=100;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 5:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 6:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
       case 7:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
      case 8:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 9:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
      case 10:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 11:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 12:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 13:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
       case 14:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 15:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 16:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 17:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 18:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 19:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 20:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 21:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 22:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
       
        case 23:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 24:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 25:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 26:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 27:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 28:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 29:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 30:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 31:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 32:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 33:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 34:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 35:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 36:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
            
    }
    jProgressSaude.setValue(saude);
    jProgressTransporte.setValue(transporte);
    jprogressEducacao.setValue(educacao);
    jProgressSeguranca.setValue(seguranca);
    jProgressAprovacao.setValue(aprovacao);
    jProgressEconomia.setValue(economia);
    meses+=3;
     if(meses==12){
        meses=0;
        ano+=1;
        
    }
    jLabel5.setText("\t"+ano+"ANO(S) E "+meses+" MESES NA PRESIDENCIA");
    
     if(saude==0||educacao==0||transporte==0||seguranca==0||aprovacao==0||economia==0){
         dispose();
               InterfacePerdeu perdeu=new InterfacePerdeu() ;
               perdeu.setVisible(true);
            }
    }//GEN-LAST:event_botaoOpcao1ActionPerformed

    private void botaoOpcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpcao2ActionPerformed
imagemIcon(); 
// TODO add your handling code here:
switch(numero){
        case 1:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 2:
            saude-=20;
            educacao+=10;
            transporte+=5;
            seguranca+=5;
            aprovacao+=10;
            economia-=5;
            break;
         case 3:
            saude+=5;
            educacao-=5;
            transporte-=10;
            seguranca-=10;
            aprovacao-=10;
            economia+=5;
            break;
        case 4:
            saude-=10;
            educacao-=100;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 5:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 6:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
       case 7:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
      case 8:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 9:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
      case 10:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 11:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 12:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 13:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
       case 14:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 15:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 16:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 17:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 18:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 19:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 20:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 21:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 22:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
       
        case 23:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 24:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 25:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 26:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 27:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 28:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 29:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 30:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 31:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 32:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 33:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
        case 34:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 35:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
         case 36:
            saude+=20;
            educacao-=10;
            transporte-=5;
            seguranca-=5;
            aprovacao-=10;
            economia+=5;
            break;
            
    }
    jProgressSaude.setValue(saude);
    jProgressTransporte.setValue(transporte);
    jprogressEducacao.setValue(educacao);
    jProgressSeguranca.setValue(seguranca);
    jProgressAprovacao.setValue(aprovacao);
    jProgressEconomia.setValue(economia);
    
     meses+=3;
    jLabel5.setText("\t"+ano+"ANO(S)"+meses+" MESES NA PRESIDENCIA");
    if(meses==12){
        meses=0;
        ano+=1;
        
    }
     if(saude==0||educacao==0||transporte==0||seguranca==0||aprovacao==0||economia==0){
         dispose();
               InterfacePerdeu perdeu=new InterfacePerdeu() ;
               perdeu.setVisible(true);
            }
                                        
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
