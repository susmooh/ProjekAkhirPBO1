/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import javax.swing.JFrame;
/**
 *
 * @author Alexigos
 */
public class Menu_Utama extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Menu_Utama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_navbar = new javax.swing.JPanel();
        panel_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fitur = new javax.swing.JPanel();
        panel_content = new javax.swing.JPanel();
        panel_fitur = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_navbar.setBackground(new java.awt.Color(102, 204, 255));
        panel_navbar.setPreferredSize(new java.awt.Dimension(900, 75));

        javax.swing.GroupLayout panel_navbarLayout = new javax.swing.GroupLayout(panel_navbar);
        panel_navbar.setLayout(panel_navbarLayout);
        panel_navbarLayout.setHorizontalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        panel_navbarLayout.setVerticalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        getContentPane().add(panel_navbar, java.awt.BorderLayout.PAGE_START);

        panel_sidebar.setBackground(new java.awt.Color(204, 204, 204));
        panel_sidebar.setPreferredSize(new java.awt.Dimension(200, 400));

        fitur.setLayout(new javax.swing.BoxLayout(fitur, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(fitur);

        javax.swing.GroupLayout panel_sidebarLayout = new javax.swing.GroupLayout(panel_sidebar);
        panel_sidebar.setLayout(panel_sidebarLayout);
        panel_sidebarLayout.setHorizontalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panel_sidebarLayout.setVerticalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        getContentPane().add(panel_sidebar, java.awt.BorderLayout.LINE_START);

        panel_fitur.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fitur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_fitur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel_content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(916, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fitur;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_fitur;
    private javax.swing.JPanel panel_navbar;
    private javax.swing.JPanel panel_sidebar;
    // End of variables declaration//GEN-END:variables
}
