

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class Edit extends javax.swing.JFrame {

    String batch;

    String[] data = new String[7];

    /**
     * Creates new form Edit
     */
    public Edit() {
        initComponents();
        switch(Pinwheel.getSearchType()){
            case "batch":
                this.blendBtn.setEnabled(false);
                break;
            case "subbatch":
                this.subBatchBtn.setEnabled(false);
                break;
            case "blend":
                this.subBatchBtn.setEnabled(false);
                this.blendBtn.setEnabled(false);
                break;
        }
        data = Pinwheel.getData();
        this.batch = data[0];
        this.selectedTxt.setText(batch);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blendBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedTxt = new javax.swing.JTextField();
        chemBtn = new javax.swing.JButton();
        subBatchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        graphBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        viewChemicalsBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Batch");
        setMaximumSize(new java.awt.Dimension(370, 275));
        setMinimumSize(new java.awt.Dimension(370, 275));
        setPreferredSize(new java.awt.Dimension(370, 275));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        blendBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        blendBtn.setText("Create Blend");
        blendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blendBtnActionPerformed(evt);
            }
        });
        getContentPane().add(blendBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 129, -1));

        updateBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        updateBtn.setText("Update Batch/Blend");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Selected:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 20));

        selectedTxt.setEditable(false);
        selectedTxt.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        getContentPane().add(selectedTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 5, 220, 30));

        chemBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        chemBtn.setText("Add Chemicals");
        chemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chemBtnActionPerformed(evt);
            }
        });
        getContentPane().add(chemBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 147, -1));

        subBatchBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        subBatchBtn.setText("Create Sub-Batch");
        subBatchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBatchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(subBatchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        backBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        backBtn.setText("Close");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

        graphBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        graphBtn.setText("Graph Tools");
        graphBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphBtnActionPerformed(evt);
            }
        });
        getContentPane().add(graphBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 147, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Value Calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 129, -1));

        viewChemicalsBtn.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        viewChemicalsBtn.setText("View Chemicals");
        viewChemicalsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChemicalsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewChemicalsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 147, -1));

        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("Delete Selected");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 129, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 260));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        Update u = new Update();
        u.setVisible(true);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void chemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chemBtnActionPerformed
        Chemicals chem = new Chemicals();
        chem.setVisible(true);
    }//GEN-LAST:event_chemBtnActionPerformed

    private void subBatchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBatchBtnActionPerformed
        SubBatch sub = new SubBatch();
        sub.setVisible(true);
    }//GEN-LAST:event_subBatchBtnActionPerformed

    private void blendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blendBtnActionPerformed
        Blend b = new Blend();
        b.setVisible(true);
    }//GEN-LAST:event_blendBtnActionPerformed

    private void graphBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphBtnActionPerformed
        GraphUI g = new GraphUI();
        g.setVisible(true);
    }//GEN-LAST:event_graphBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Value v = new Value();
        v.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewChemicalsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChemicalsBtnActionPerformed
        ViewChems vc = new ViewChems();
        vc.setVisible(true);
        
    }//GEN-LAST:event_viewChemicalsBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Pinwheel.setBounce("delete");
        Prompt p = new Prompt();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton blendBtn;
    private javax.swing.JButton chemBtn;
    private javax.swing.JButton graphBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField selectedTxt;
    private javax.swing.JButton subBatchBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewChemicalsBtn;
    // End of variables declaration//GEN-END:variables
}
