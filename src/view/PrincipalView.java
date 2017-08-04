package view;

import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.UsuarioM;

public class PrincipalView extends javax.swing.JFrame {

    UsuarioM usuarioAtivo = new UsuarioM();
 
    public PrincipalView(UsuarioM usuario) {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.usuarioAtivo = usuario;

        if(usuarioAtivo.isAdmin() == false){
             mnuArquivos.setEnabled(false);
             //mnuConsulta.setEnabled(false);
             mnuRelatorio.setEnabled(false);
             mnuUsuarios.setEnabled(false);
             ConsultaConvidadoView consulta = new ConsultaConvidadoView();
             pnlPrincipal.removeAll();
             pnlPrincipal.add(consulta);
             pnlPrincipal.updateUI();
             
        }

        //icone da barra superior
        URL url = this.getClass().getResource("/view/icones/icon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        pnlPrincipal = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuArquivos = new javax.swing.JMenu();
        mmiFuncionario = new javax.swing.JMenuItem();
        mniDepartamento = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuConsulta = new javax.swing.JMenu();
        mniPesquisaComercio = new javax.swing.JMenuItem();
        mniPesquisaFuncionario = new javax.swing.JMenuItem();
        mnuRelatorio = new javax.swing.JMenu();
        mnuUsuarios = new javax.swing.JMenu();
        mniGerenciarUsuarios = new javax.swing.JMenuItem();
        mniMinhaConta = new javax.swing.JMenuItem();
        mnuSobre = new javax.swing.JMenu();

        jMenu5.setText("jMenu5");

        jMenuItem1.setText("jMenuItem1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu2.setText("jMenu2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agenda");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1275, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );

        jMenuBar2.setPreferredSize(new java.awt.Dimension(56, 48));

        mnuArquivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Icon-Arquivo.png"))); // NOI18N
        mnuArquivos.setText("Arquivos");
        mnuArquivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnuArquivos.setHideActionText(true);

        mmiFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mmiFuncionario.setText("Funcionários");
        mmiFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiFuncionarioActionPerformed(evt);
            }
        });
        mnuArquivos.add(mmiFuncionario);

        mniDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniDepartamento.setText("Setores");
        mniDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDepartamentoActionPerformed(evt);
            }
        });
        mnuArquivos.add(mniDepartamento);

        jMenuBar2.add(mnuArquivos);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Icon-Comercio.png"))); // NOI18N
        jMenu1.setText("Comércio");
        jMenu1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu1);

        mnuConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Icon-Consulta.png"))); // NOI18N
        mnuConsulta.setText("Consultas");
        mnuConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnuConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuConsultaMouseClicked(evt);
            }
        });

        mniPesquisaComercio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniPesquisaComercio.setText("Comércios");
        mniPesquisaComercio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPesquisaComercioActionPerformed(evt);
            }
        });
        mnuConsulta.add(mniPesquisaComercio);

        mniPesquisaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniPesquisaFuncionario.setText("Funcionários");
        mniPesquisaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPesquisaFuncionarioActionPerformed(evt);
            }
        });
        mnuConsulta.add(mniPesquisaFuncionario);

        jMenuBar2.add(mnuConsulta);

        mnuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Icon-Relatório.png"))); // NOI18N
        mnuRelatorio.setText("Relatório");
        mnuRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnuRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuRelatorioMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuRelatorio);

        mnuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Icon-Usuário.png"))); // NOI18N
        mnuUsuarios.setText("Usuários");
        mnuUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        mniGerenciarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniGerenciarUsuarios.setText("Gerenciar usários");
        mniGerenciarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGerenciarUsuariosActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mniGerenciarUsuarios);

        mniMinhaConta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mniMinhaConta.setText("Minha conta");
        mniMinhaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMinhaContaActionPerformed(evt);
            }
        });
        mnuUsuarios.add(mniMinhaConta);

        jMenuBar2.add(mnuUsuarios);

        mnuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/Icon-Sobre.png"))); // NOI18N
        mnuSobre.setText("Sobre");
        mnuSobre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mnuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuSobreMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnuSobre);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmiFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiFuncionarioActionPerformed
        
        if(usuarioAtivo.isAdmin() == true)
        {
            FuncionarioView contato = new FuncionarioView();
            pnlPrincipal.removeAll();
            pnlPrincipal.add(contato);
            pnlPrincipal.updateUI();
        }
    }//GEN-LAST:event_mmiFuncionarioActionPerformed

    private void mniDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDepartamentoActionPerformed
        
        if(usuarioAtivo.isAdmin() == true)
        {
            SetorView departamento = new SetorView();
            pnlPrincipal.removeAll();
            pnlPrincipal.add(departamento);
            pnlPrincipal.updateUI();
        }
    }//GEN-LAST:event_mniDepartamentoActionPerformed

    private void mnuConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuConsultaMouseClicked

    }//GEN-LAST:event_mnuConsultaMouseClicked

    private void mniGerenciarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGerenciarUsuariosActionPerformed
        
        if(usuarioAtivo.isAdmin() == true)
        {
            UsuarioView usuario = new UsuarioView();
            pnlPrincipal.removeAll();
            pnlPrincipal.add(usuario);
            pnlPrincipal.updateUI();
        }
        
    }//GEN-LAST:event_mniGerenciarUsuariosActionPerformed

    private void mniMinhaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMinhaContaActionPerformed
        
        if(usuarioAtivo.isAdmin() == true)
        {
            MinhaContaView minhaconta = new MinhaContaView(usuarioAtivo);
            pnlPrincipal.removeAll();
            pnlPrincipal.add(minhaconta);
            pnlPrincipal.updateUI();
        }
        
    }//GEN-LAST:event_mniMinhaContaActionPerformed

    private void mnuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuSobreMouseClicked

        SobreView sobre = new SobreView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(sobre);
        pnlPrincipal.updateUI();

    }//GEN-LAST:event_mnuSobreMouseClicked

    private void mnuRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuRelatorioMouseClicked
    
        if(usuarioAtivo.isAdmin() == true)
        {
            RelatorioView relatorio = new RelatorioView();
            pnlPrincipal.removeAll();
            pnlPrincipal.add(relatorio);
            pnlPrincipal.updateUI();
        }
    }//GEN-LAST:event_mnuRelatorioMouseClicked

    private void mniPesquisaComercioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPesquisaComercioActionPerformed
        ConsultaComercioView pesquisacomercio = new ConsultaComercioView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(pesquisacomercio);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_mniPesquisaComercioActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
            ComercioView comercio = new ComercioView();
            pnlPrincipal.removeAll();
            pnlPrincipal.add(comercio);
            pnlPrincipal.updateUI();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void mniPesquisaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPesquisaFuncionarioActionPerformed

        if(usuarioAtivo.isAdmin() == false)
        {
            ConsultaConvidadoView pesquisaConvidado = new ConsultaConvidadoView();
            pnlPrincipal.add(pesquisaConvidado);
            pesquisaConvidado.setVisible(true);
            pesquisaConvidado.setPosicao();
            
            pnlPrincipal.removeAll();
            pnlPrincipal.add(pesquisaConvidado);
            pnlPrincipal.updateUI();
           
            
        }else
        {
            ConsultaView pesquisa = new ConsultaView();
            pnlPrincipal.removeAll();
            pnlPrincipal.add(pesquisa);
            pnlPrincipal.updateUI();
        }
    }//GEN-LAST:event_mniPesquisaFuncionarioActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private javax.swing.JMenuItem mmiFuncionario;
    private javax.swing.JMenuItem mniDepartamento;
    private javax.swing.JMenuItem mniGerenciarUsuarios;
    private javax.swing.JMenuItem mniMinhaConta;
    private javax.swing.JMenuItem mniPesquisaComercio;
    private javax.swing.JMenuItem mniPesquisaFuncionario;
    private javax.swing.JMenu mnuArquivos;
    private javax.swing.JMenu mnuConsulta;
    private javax.swing.JMenu mnuRelatorio;
    private javax.swing.JMenu mnuSobre;
    private javax.swing.JMenu mnuUsuarios;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
