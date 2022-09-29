/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatormultifungsipbo;

import javax.swing.JOptionPane;
import sc.Persegi;
import sc.PersegiPanjang;
import sc.Segitiga;
/**
 *
 * @author user
 */
public class MenuBangundatar extends javax.swing.JFrame {
    

    /**
     * Creates new form MenuBangundatar
     */
    public MenuBangundatar() {
        initComponents();
    }
    double a,b,c, luas, keliling;

    Persegi p = new Persegi();
    PersegiPanjang pj = new PersegiPanjang();
    Segitiga s = new Segitiga();
    
    void persegi(){
        a = Double.valueOf(sisi.getText());
        luas = 0;
        keliling = 0;
        p.setA(a);
        p.hitungLuas();
        p.HitungKeliling();
        luas = p.getLuas();
        keliling = p.getKeliling();
        luasPersegi.setText(Double.toString(luas));
        kelilingPersegi.setText(Double.toString(keliling));
                
    }
    void persegiPanjang(){
        a = Double.valueOf(pjg.getText());
        b = Double.valueOf(lbr.getText());
        luas = 0;
        keliling = 0;
        pj.setA(a);
        pj.setB(b);
        pj.hitungLuas();
        pj.hitungKeliling();
        luas = pj.getLuas();
        keliling = pj.getKeliling();
        luasPp.setText(Double.toString(luas));
        kelilingPp.setText(Double.toString(keliling));
    }
    void luasSegitiga(){
        a = Double.valueOf(alas.getText());
        b = Double.valueOf(tinggi.getText());
        luas = 0;
        keliling = 0;
        s.setA(a);
        s.setB(b);
        s.hitungLuas();
        luas = s.getLuas();
        keliling = s.getKeliling();
        hasil.setText(Double.toString(luas));      
    }
    void kelilingSegitiga(){
        a = Double.valueOf(va.getText());
        b = Double.valueOf(vb.getText());
        c = Double.valueOf(vc.getText());
        luas = 0;
        keliling = 0;
        s.setA(a);
        s.setB(b);
        s.setC(c);
        s.hitungKeliling();
        keliling = s.getKeliling();
        hasil.setText(Double.toString(keliling));  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnbentuk = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtpjg = new javax.swing.JLabel();
        sisi = new javax.swing.JTextField();
        hitungPersegi = new javax.swing.JButton();
        txtluas = new javax.swing.JLabel();
        txtkeliling = new javax.swing.JLabel();
        luasPersegi = new javax.swing.JTextField();
        kelilingPersegi = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtpjg1 = new javax.swing.JLabel();
        txtlbr1 = new javax.swing.JLabel();
        pjg = new javax.swing.JTextField();
        lbr = new javax.swing.JTextField();
        hitungPersegiPanjang = new javax.swing.JButton();
        txtluas1 = new javax.swing.JLabel();
        txtkeliling1 = new javax.swing.JLabel();
        luasPp = new javax.swing.JTextField();
        kelilingPp = new javax.swing.JTextField();
        refresh1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtpjg2 = new javax.swing.JLabel();
        alas = new javax.swing.JTextField();
        htgluasSegitiga = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        refresh2 = new javax.swing.JButton();
        txttng = new javax.swing.JLabel();
        tinggi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        va = new javax.swing.JTextField();
        vb = new javax.swing.JTextField();
        vc = new javax.swing.JTextField();
        htgkelilingSegitiga = new javax.swing.JButton();
        txthsl = new javax.swing.JLabel();
        btnBMI = new javax.swing.JLabel();
        btnBentuk = new javax.swing.JLabel();
        btnSuhu = new javax.swing.JLabel();
        btnSains = new javax.swing.JLabel();
        btnexit = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnbentuk.setBackground(new java.awt.Color(245, 245, 245));

        jTabbedPane1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        txtpjg.setText("Sisi");

        hitungPersegi.setText("Hitung");
        hitungPersegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungPersegiActionPerformed(evt);
            }
        });

        txtluas.setText("Luas");

        txtkeliling.setText("Keliling");

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refresh)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtluas)
                            .addGap(43, 43, 43))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtkeliling)
                            .addGap(24, 24, 24)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtpjg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hitungPersegi)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sisi, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(luasPersegi)
                        .addComponent(kelilingPersegi)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpjg)
                    .addComponent(sisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(hitungPersegi)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluas)
                    .addComponent(luasPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkeliling)
                    .addComponent(kelilingPersegi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(refresh)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Persegi", jPanel1);

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        txtpjg1.setText("Panjang");

        txtlbr1.setText("Lebar");

        hitungPersegiPanjang.setText("Hitung");
        hitungPersegiPanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungPersegiPanjangActionPerformed(evt);
            }
        });

        txtluas1.setText("Luas");

        txtkeliling1.setText("Keliling");

        refresh1.setText("Refresh");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtpjg1)
                                        .addComponent(txtlbr1))
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(txtluas1)
                                    .addGap(43, 43, 43)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtkeliling1)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbr, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(pjg)
                            .addComponent(luasPp)
                            .addComponent(kelilingPp)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(hitungPersegiPanjang)))
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(refresh1)
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpjg1)
                    .addComponent(pjg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlbr1)
                    .addComponent(lbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(hitungPersegiPanjang)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtluas1)
                    .addComponent(luasPp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtkeliling1)
                    .addComponent(kelilingPp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(refresh1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Persegi Panjang", jPanel2);

        jPanel3.setBackground(new java.awt.Color(245, 245, 245));

        txtpjg2.setText("Alas");

        htgluasSegitiga.setText("Luas");
        htgluasSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htgluasSegitigaActionPerformed(evt);
            }
        });

        refresh2.setText("Refresh");
        refresh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh2ActionPerformed(evt);
            }
        });

        txttng.setText("Tinggi");

        jLabel1.setText("a");

        jLabel2.setText("b");

        jLabel3.setText("c");

        htgkelilingSegitiga.setText("Keliling");
        htgkelilingSegitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                htgkelilingSegitigaActionPerformed(evt);
            }
        });

        txthsl.setText("Hasil");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(va)
                                .addComponent(vb)
                                .addComponent(vc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refresh2))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtpjg2)
                                .addGap(29, 29, 29)
                                .addComponent(alas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txttng)
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(htgluasSegitiga)
                                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(htgkelilingSegitiga)))
                        .addContainerGap(58, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txthsl)
                .addGap(195, 195, 195))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpjg2)
                    .addComponent(alas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(va, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttng)
                    .addComponent(tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(vb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(htgkelilingSegitiga)
                    .addComponent(htgluasSegitiga))
                .addGap(37, 37, 37)
                .addComponent(txthsl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(refresh2)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Segitiga", jPanel3);

        javax.swing.GroupLayout mnbentukLayout = new javax.swing.GroupLayout(mnbentuk);
        mnbentuk.setLayout(mnbentukLayout);
        mnbentukLayout.setHorizontalGroup(
            mnbentukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mnbentukLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        mnbentukLayout.setVerticalGroup(
            mnbentukLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        getContentPane().add(mnbentuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 410, 460));

        btnBMI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBMIMouseClicked(evt);
            }
        });
        getContentPane().add(btnBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 800, 60, 70));

        btnBentuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBentukMouseClicked(evt);
            }
        });
        getContentPane().add(btnBentuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 810, 70, 50));

        btnSuhu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuhuMouseClicked(evt);
            }
        });
        getContentPane().add(btnSuhu, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 800, 60, 60));

        btnSains.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSainsMouseClicked(evt);
            }
        });
        getContentPane().add(btnSains, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 800, 60, 60));

        btnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnexitMouseClicked(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 60, 60));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBMIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMIMouseClicked
        // TODO add your handling code here:
        new MenuBMI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBMIMouseClicked

    private void btnBentukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBentukMouseClicked
        // TODO add your handling code here:
        new MenuBangundatar().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBentukMouseClicked

    private void btnSuhuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuhuMouseClicked
        // TODO add your handling code here:
        new MenuSuhu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSuhuMouseClicked

    private void btnSainsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSainsMouseClicked
        // TODO add your handling code here:
        new MenuScientific().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSainsMouseClicked

    private void btnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnexitMouseClicked
        // TODO add your handling code here:
        int X= JOptionPane.showConfirmDialog(null,"Keluar Program","Exit",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(X==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnexitMouseClicked

    private void hitungPersegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungPersegiActionPerformed
         persegi();
    }//GEN-LAST:event_hitungPersegiActionPerformed

    private void hitungPersegiPanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungPersegiPanjangActionPerformed
         persegiPanjang();
    }//GEN-LAST:event_hitungPersegiPanjangActionPerformed

    private void htgluasSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htgluasSegitigaActionPerformed
        luasSegitiga();
    }//GEN-LAST:event_htgluasSegitigaActionPerformed

    private void htgkelilingSegitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_htgkelilingSegitigaActionPerformed
        kelilingSegitiga();
    }//GEN-LAST:event_htgkelilingSegitigaActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        sisi.setText("");
        luasPersegi.setText("");
        kelilingPersegi.setText("");
    }//GEN-LAST:event_refreshActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        // TODO add your handling code here:
        pjg.setText("");
        lbr.setText("");
        luasPp.setText("");
        kelilingPp.setText("");
    }//GEN-LAST:event_refresh1ActionPerformed

    private void refresh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh2ActionPerformed
        // TODO add your handling code here:
        alas.setText("");
        tinggi.setText("");
        va.setText("");
        vb.setText("");
        vc.setText("");
        hasil.setText("");
    }//GEN-LAST:event_refresh2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBangundatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBangundatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBangundatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBangundatar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBangundatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alas;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel btnBMI;
    private javax.swing.JLabel btnBentuk;
    private javax.swing.JLabel btnSains;
    private javax.swing.JLabel btnSuhu;
    private javax.swing.JLabel btnexit;
    private javax.swing.JTextField hasil;
    private javax.swing.JButton hitungPersegi;
    private javax.swing.JButton hitungPersegiPanjang;
    private javax.swing.JButton htgkelilingSegitiga;
    private javax.swing.JButton htgluasSegitiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kelilingPersegi;
    private javax.swing.JTextField kelilingPp;
    private javax.swing.JTextField lbr;
    private javax.swing.JTextField luasPersegi;
    private javax.swing.JTextField luasPp;
    private javax.swing.JPanel mnbentuk;
    private javax.swing.JTextField pjg;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refresh1;
    private javax.swing.JButton refresh2;
    private javax.swing.JTextField sisi;
    private javax.swing.JTextField tinggi;
    private javax.swing.JLabel txthsl;
    private javax.swing.JLabel txtkeliling;
    private javax.swing.JLabel txtkeliling1;
    private javax.swing.JLabel txtlbr1;
    private javax.swing.JLabel txtluas;
    private javax.swing.JLabel txtluas1;
    private javax.swing.JLabel txtpjg;
    private javax.swing.JLabel txtpjg1;
    private javax.swing.JLabel txtpjg2;
    private javax.swing.JLabel txttng;
    private javax.swing.JTextField va;
    private javax.swing.JTextField vb;
    private javax.swing.JTextField vc;
    // End of variables declaration//GEN-END:variables
}
