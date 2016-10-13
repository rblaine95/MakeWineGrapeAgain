
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Se7en
 */
public class SearchBatch extends javax.swing.JFrame {

    /**
     * Creates new form SearchBatch
     */
    String batchid;
    String colour;
    String type;
    String stage;

    String[] data;

    /**
     * Creates new form main
     */

    public SearchBatch() {
        
        initComponents();
        
        try {
            switch (Pinwheel.getSearchType()) {
                case "batch":
                    this.colourBox.setModel(new DefaultComboBoxModel(Pinwheel.getColour().toArray()));
                    this.typeBox.setModel(new DefaultComboBoxModel(Pinwheel.getType().toArray()));
                    data = new String[5];
                    break;
                case "supplier":
                    batchTbl.getColumnModel().getColumn(0).setHeaderValue("Supplier name");
                    batchTbl.getColumnModel().getColumn(1).setHeaderValue("Contact No");
                    batchTbl.getColumnModel().getColumn(2).setHeaderValue("Email");
                    batchTbl.getColumnModel().getColumn(3).setHeaderValue("Contact Liason");
                    batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(4));

                    data = new String[4];

                    this.batchLbl.setText("Supplier Name");
                    this.colourLbl.setText("");
                    this.typeLbl.setText("");
                    this.stageLbl.setText("");

                    this.stageBox.setVisible(false);
                    this.colourBox.setVisible(false);
                    this.typeBox.setVisible(false);

                    this.stageBox.setEnabled(false);
                    this.colourBox.setEnabled(false);
                    this.typeBox.setEnabled(false);
                    break;
                case "chemical":
                    batchTbl.getColumnModel().getColumn(0).setHeaderValue("Chemical");
                    batchTbl.getColumnModel().getColumn(1).setHeaderValue("Value");
                    batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(2));
                    batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(3));
                    batchTbl.getColumnModel().removeColumn(batchTbl.getColumnModel().getColumn(4));

                    data = new String[2];

                    this.batchLbl.setText("Chemical Name");
                    this.colourLbl.setText("");
                    this.typeLbl.setText("");
                    this.stageLbl.setText("");

                    this.stageBox.setVisible(false);
                    this.colourBox.setVisible(false);
                    this.typeBox.setVisible(false);

                    this.stageBox.setEnabled(false);
                    this.colourBox.setEnabled(false);
                    this.typeBox.setEnabled(false);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchBatch.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.colourBox.addItem("All");
        this.typeBox.addItem("All");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        batchTbl = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        batchIdTxt = new javax.swing.JTextField();
        batchLbl = new javax.swing.JLabel();
        colourLbl = new javax.swing.JLabel();
        colourBox = new javax.swing.JComboBox();
        typeLbl = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        stageLbl = new javax.swing.JLabel();
        stageBox = new javax.swing.JComboBox();
        selectBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel6.setText("Wine Type");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 270));

        batchTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch ID", "Colour", "Type", "Stage", "Mass"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        batchTbl.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        batchTbl.getTableHeader().setReorderingAllowed(false);
        batchTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                batchTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(batchTbl);

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        batchLbl.setText("Batch ID");

        colourLbl.setText("Wine Colour");

        colourBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        typeLbl.setText("Wine Type");

        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        stageLbl.setText("Stage");

        stageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Fermentation", "Pressed", "Maturation", "Blending", "Prep for Bottling", "Bottling", "Storage" }));

        selectBtn.setText("Select");
        selectBtn.setEnabled(false);
        selectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batchLbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colourLbl)
                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeLbl)
                            .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stageLbl)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(selectBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitBtn)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batchLbl)
                            .addComponent(colourLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(typeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(stageLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn)
                            .addComponent(selectBtn)
                            .addComponent(exitBtn))))
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 310);

        setSize(new java.awt.Dimension(941, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed

        for (int i = 0; i < data.length; i++) {
            data[i] = (String) this.batchTbl.getValueAt(this.batchTbl.getSelectedRow(), i);
        }
        Pinwheel.setData(data);
        switch (Pinwheel.getBounce()) {
            case "mainsearch":
                Edit ed = new Edit();
                ed.setVisible(true);
                this.dispose();
                break;
            case "admindelete":
                Prompt p = new Prompt();
                p.setVisible(true);
                this.dispose();
                break;
            case "adminedit":
                AdminEdit ae = new AdminEdit();
                ae.setVisible(true);
                this.dispose();
        }
    }//GEN-LAST:event_selectBtnActionPerformed

    private void batchTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batchTblMouseClicked
        if (batchTbl.getSelectedRow() != -1) {
            this.selectBtn.setEnabled(true);
        }
    }//GEN-LAST:event_batchTblMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        this.selectBtn.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel) this.batchTbl.getModel();
        model.setRowCount(0);
        ResultSet rs;
        String sql;

        this.batchid = this.batchIdTxt.getText();
        this.colour = this.colourBox.getSelectedItem().toString();
        this.type = this.typeBox.getSelectedItem().toString();
        this.stage = this.stageBox.getSelectedItem().toString();
        boolean batch = !this.batchid.equals("");
        boolean col = !this.colour.equals("All");
        boolean wtype = !this.type.equals("All");
        boolean wstage = !this.stage.equals("All");
        boolean whered = false;
        sql = "";
        Object[] list;

        switch (Pinwheel.getSearchType()) {
            case "batch":
                sql = "SELECT batchid, colour, type, stage, mass FROM batch";
                list = new Object[5];
                if (batch || col || wtype || wstage) {
                    sql += " WHERE ";
                }
                if (batch) {
                    if (whered) {
                        sql += " AND ";
                    }
                    whered = true;
                    sql += " batchid = '" + this.batchid + "'";
                }
                if (col) {
                    if (whered) {
                        sql += " AND ";
                    }
                    whered = true;
                    sql += " colour = '" + this.colour + "'";
                }
                if (wtype) {
                    if (whered) {
                        sql += " AND ";
                    }
                    whered = true;
                    sql += " type = '" + this.type + "'";
                }
                if (wstage) {
                    if (whered) {
                        sql += " AND ";
                    }
                    sql += " stage = '" + Pinwheel.stageGetNo(this.stage) + "'";
                }
                try {
                    rs = Pinwheel.queryCCDB(sql);
                    int count = 0;
                    while (rs.next()) {

                        for (int i = 0; i < list.length; i++) {
                            list[i] = (rs.getString(i + 1));
                        }
                        list[3] = Pinwheel.stageGetWord(list[3] + "");
                        ((DefaultTableModel) this.batchTbl.getModel()).insertRow(count, list);
                        count++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SearchBatch.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "supplier":
                sql = "SELECT sname, tel, email, liason FROM supplier";
                list = new Object[4];
                if (batch) {
                    sql += "WHERE sname = '" + this.batchid + "'";
                }
                try {
                    rs = Pinwheel.queryCCDB(sql);
                    int count = 0;
                    while (rs.next()) {

                        for (int i = 0; i < list.length; i++) {
                            list[i] = (rs.getString(i + 1));
                        }

                        ((DefaultTableModel) this.batchTbl.getModel()).insertRow(count, list);
                        count++;
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(SearchBatch.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            case "chemical":
                System.out.println("Not support yet");
                break;
        }


    }//GEN-LAST:event_searchBtnActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchIdTxt;
    private javax.swing.JLabel batchLbl;
    private javax.swing.JTable batchTbl;
    private javax.swing.JComboBox colourBox;
    private javax.swing.JLabel colourLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JComboBox stageBox;
    private javax.swing.JLabel stageLbl;
    private javax.swing.JComboBox typeBox;
    private javax.swing.JLabel typeLbl;
    // End of variables declaration//GEN-END:variables
}
