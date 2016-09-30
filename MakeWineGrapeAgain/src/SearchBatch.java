
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
 * @author MUFFIN
 */
public class SearchBatch extends javax.swing.JFrame {

    /**
     * Creates new form SearchBatch
     */
    Engine e;
    String batchid;
    String colour;
    String type;
    String stage;

    /**
     * Creates new form main
     */
    public SearchBatch() {
        initComponents();
    }

    public SearchBatch(Engine e) {
        this.e = e;
        initComponents();
        this.colourBox.setModel(new DefaultComboBoxModel(e.getColour().toArray()));
        this.typeBox.setModel(new DefaultComboBoxModel(e.getType().toArray()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        colourBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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

        jLabel2.setText("Batch ID");

        jLabel4.setText("Wine Colour");

        colourBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Wine Type");

        typeBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Stage");

        stageBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Fermentation", "Pressed", "Maturation", "Blending", "Prep for Bottling", "Bottling", "Stroage" }));

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(batchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(stageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(selectBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn)))
                        .addGap(18, 18, 18)
                        .addComponent(exitBtn)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batchIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colourBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchBtn)
                            .addComponent(selectBtn)
                            .addComponent(exitBtn))))
                .addGap(10, 10, 10))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 690, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagery/WoodNew.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 310);

        setSize(new java.awt.Dimension(719, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void selectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectBtnActionPerformed
        String batch = this.batchTbl.getValueAt(this.batchTbl.getSelectedRow(), 0) + "";
        Edit ed = new Edit(batch, e);
        ed.setVisible(true);
    }//GEN-LAST:event_selectBtnActionPerformed

    private void batchTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_batchTblMouseClicked
        if (batchTbl.getSelectedRow() != -1) {
            this.selectBtn.setEnabled(true);
        }
    }//GEN-LAST:event_batchTblMouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
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
        sql = "SELECT batchid, colour, type, stage, mass FROM batch";
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
            sql += " stage = '" + this.stage + "'";
        }

        Object[] list;
        list = new Object[5];
        try {
            rs = e.query(sql);
            int count = 0;
            while (rs.next()) {

                for (int i = 0; i < 5; i++) {
                    list[i] = (rs.getString(i + 1));


                }
                System.out.println(list[3]);
                switch ((String) list[3]) {
                    case "1":
                        list[3] = "Fermentation";
                        break;
                    case "2":
                        list[3] = "Pressed";
                        break;
                    case "3":
                        list[3] = "Maturation";
                        break;
                    case "4":
                        list[3] = "Blending";
                        break;
                    case "5":
                        list[3] = "Prep For Bottling";
                        break;
                    case "6":
                        list[3] = "Bottling";
                        break;
                    case "7":
                        list[3] = "Storage";
                        break;
                }
                ((DefaultTableModel) this.batchTbl.getModel()).insertRow(count, list);
                count++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchBatch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchIdTxt;
    private javax.swing.JTable batchTbl;
    private javax.swing.JComboBox colourBox;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton selectBtn;
    private javax.swing.JComboBox stageBox;
    private javax.swing.JComboBox typeBox;
    // End of variables declaration//GEN-END:variables
}
