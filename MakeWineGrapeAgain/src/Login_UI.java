
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DV2014-0217
 */
public class Login_UI extends javax.swing.JFrame {
Engine e = new Engine();
    /**
     * Creates new form PracticeGUI
     */
    public Login_UI() {
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

        loginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setState(0);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/burntcoaltexturebutton.png"))); // NOI18N
        loginBtn.setBorder(null);
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 540, 120, 120));

        passwordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordField.setToolTipText("Enter your password");
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 390, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/BarrelWoodFinish.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setDoubleBuffered(true);
        jLabel1.setFocusTraversalPolicyProvider(true);
        jLabel1.setFocusable(false);
        jLabel1.setName(""); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
       
        String password = passwordField.getText();
        String ps = "";
        
        if(password.equals(ps)){
            try {
                
                e.connect();
                main m = new main(e);
                this.dispose();
                m.setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Password incorrect");
        }
            
        
        
        
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    // End of variables declaration//GEN-END:variables
}
