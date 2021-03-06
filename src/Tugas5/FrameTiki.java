/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

import java.awt.Color;
import javax.swing.JOptionPane;
import sun.misc.FloatingDecimal;

/**
 *
 * @author X455LA
 */
public class FrameTiki extends javax.swing.JFrame {

    /**
     * Creates new form FrameTiki
     */
    String Nama,NoHp,jenis;
    Integer Berat,Diskon;
    Float Total,uang;
    public FrameTiki() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        PDasar = new javax.swing.JPanel();
        PHeader = new javax.swing.JPanel();
        LHeader = new javax.swing.JLabel();
        PKiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TFNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFNoHP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFBerat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SliderDiskon = new javax.swing.JSlider();
        LDiskon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Bproses = new javax.swing.JButton();
        PJenis = new javax.swing.JPanel();
        RBReguler = new javax.swing.JRadioButton();
        RBExpress = new javax.swing.JRadioButton();
        PKanan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TAStruck = new javax.swing.JTextArea();
        BKeluar = new javax.swing.JButton();
        BUlang = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                formCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        PDasar.setBackground(new java.awt.Color(51, 51, 51));

        PHeader.setBackground(new java.awt.Color(0, 102, 102));
        PHeader.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PHeaderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PHeaderMouseExited(evt);
            }
        });

        LHeader.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        LHeader.setText("Form Pelanggan");

        javax.swing.GroupLayout PHeaderLayout = new javax.swing.GroupLayout(PHeader);
        PHeader.setLayout(PHeaderLayout);
        PHeaderLayout.setHorizontalGroup(
            PHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHeaderLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(LHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PHeaderLayout.setVerticalGroup(
            PHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PHeaderLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(LHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        PKiri.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nama");

        TFNama.setText("jTextField1");
        TFNama.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFNamaCaretUpdate(evt);
            }
        });
        TFNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("No.HP");

        TFNoHP.setText("jTextField1");
        TFNoHP.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFNoHPCaretUpdate(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Berat");

        TFBerat.setText("jTextField1");
        TFBerat.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TFBeratCaretUpdate(evt);
            }
        });
        TFBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFBeratActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("KG");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Diskon");

        SliderDiskon.setMajorTickSpacing(1);
        SliderDiskon.setPaintLabels(true);
        SliderDiskon.setPaintTicks(true);
        SliderDiskon.setSnapToTicks(true);
        SliderDiskon.setValue(10);
        SliderDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderDiskonStateChanged(evt);
            }
        });

        LDiskon.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LDiskon.setForeground(new java.awt.Color(0, 0, 0));
        LDiskon.setText("0 %");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Jenis Jasa");

        Bproses.setText("Proses");
        Bproses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BprosesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BprosesMousePressed(evt);
            }
        });
        Bproses.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BprosesComponentHidden(evt);
            }
        });
        Bproses.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                BprosesCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        Bproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BprosesActionPerformed(evt);
            }
        });

        PJenis.setBackground(new java.awt.Color(102, 102, 102));
        PJenis.setLayout(new java.awt.GridLayout(1, 0));

        buttonGroup1.add(RBReguler);
        RBReguler.setText("Reguler");
        PJenis.add(RBReguler);

        buttonGroup1.add(RBExpress);
        RBExpress.setText("Express");
        PJenis.add(RBExpress);

        javax.swing.GroupLayout PKiriLayout = new javax.swing.GroupLayout(PKiri);
        PKiri.setLayout(PKiriLayout);
        PKiriLayout.setHorizontalGroup(
            PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PKiriLayout.createSequentialGroup()
                        .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PKiriLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(TFNoHP))
                            .addGroup(PKiriLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNama))
                            .addGroup(PKiriLayout.createSequentialGroup()
                                .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addGroup(PKiriLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TFBerat, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(PKiriLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Bproses))
                                    .addGroup(PKiriLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(1, 1, 1)
                                        .addComponent(PJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(PKiriLayout.createSequentialGroup()
                        .addComponent(SliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))))
        );
        PKiriLayout.setVerticalGroup(
            PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TFNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PKiriLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PKiriLayout.createSequentialGroup()
                        .addGroup(PKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addComponent(LDiskon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(PJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bproses)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        PKanan.setBackground(new java.awt.Color(153, 153, 153));

        TAStruck.setEditable(false);
        TAStruck.setBackground(new java.awt.Color(0, 0, 51));
        TAStruck.setColumns(20);
        TAStruck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TAStruck.setForeground(new java.awt.Color(255, 255, 255));
        TAStruck.setRows(5);
        TAStruck.setText("Tempat Total dan lain lain");
        TAStruck.setDisabledTextColor(new java.awt.Color(255, 255, 0));
        jScrollPane1.setViewportView(TAStruck);

        BKeluar.setText("Keluar");
        BKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BKeluarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BKeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BKeluarMouseExited(evt);
            }
        });
        BKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarActionPerformed(evt);
            }
        });

        BUlang.setText("Ulang");
        BUlang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BUlangMousePressed(evt);
            }
        });
        BUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUlangActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Struk");

        javax.swing.GroupLayout PKananLayout = new javax.swing.GroupLayout(PKanan);
        PKanan.setLayout(PKananLayout);
        PKananLayout.setHorizontalGroup(
            PKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PKananLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BKeluar))
            .addGroup(PKananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PKananLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(BUlang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PKananLayout.setVerticalGroup(
            PKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PKananLayout.createSequentialGroup()
                .addGroup(PKananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PKananLayout.createSequentialGroup()
                        .addComponent(BKeluar)
                        .addGap(0, 62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PKananLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUlang)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout PDasarLayout = new javax.swing.GroupLayout(PDasar);
        PDasar.setLayout(PDasarLayout);
        PDasarLayout.setHorizontalGroup(
            PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDasarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PDasarLayout.createSequentialGroup()
                        .addComponent(PKiri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PDasarLayout.setVerticalGroup(
            PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDasarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PDasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PKiri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PKanan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PDasar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamaActionPerformed

    private void BKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BKeluarActionPerformed
    /*public Float Total(Float VDiskon){
     
     VDiskon =Float.valueOf(SliderDiskon.getValue());
    return Total = 11500*(Float.valueOf(TFBerat.getText()))-((VDiskon/100)*11500);
    
    }
    
    public Float Total( Float VDiskon,Float VBerat){
    
    VBerat= Float.valueOf(TFBerat.getText());
    VDiskon =Float.valueOf(SliderDiskon.getValue());
    Total = 11500*(VBerat)-((VDiskon/100)*11500);
    return uang = Total *1/2;
    }*/
    /* EVENT HANDLING 1*/
    private void BprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BprosesActionPerformed
        // TODO add your handling code here:
        Float VDiskon;
        Nama = TFNama.getText();
        NoHp = TFNoHP.getText();
        Diskon =SliderDiskon.getValue();
        if (RBReguler.isSelected()) {
            jenis= this.RBReguler.getText();
            VDiskon =Float.valueOf(SliderDiskon.getValue());
           Total = 11500*(Float.valueOf(TFBerat.getText()))-((VDiskon/100)*11500);
           uang = Total;
        }
        else if (RBExpress.isSelected()) {
            
           jenis= this.RBExpress.getText();
           VDiskon =Float.valueOf(SliderDiskon.getValue());
           Total = 11500*(Float.valueOf(TFBerat.getText()))-((VDiskon/100)*11500);
           uang = (Total*150/100);
        }
        TAStruck.setText("<x><x><x><x><x><x>=|STRUCK|<x><x><x><x><x><x>"+
                         "\nNAMA \t: "+Nama+
                         "\nNo. Hp \t: "+NoHp+
                         "\nBerat Barang \t:"+TFBerat.getText()+"KG"+
                         "\nJenis Jasa \t: "+jenis+
                         "\nDiskon \t: "+Diskon+"%"+
                         "\nTotal \t: Rp."+uang+"0");
    }//GEN-LAST:event_BprosesActionPerformed
    /* EVENT HANDLING 2*/
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        /*if (TFNama.getText().equals("")||TFNoHP.getText().equals("")||TFBerat.getText().equals("")) {
            Bproses.setEnabled(false);}*/   
       TFNama.setText("");
       TFNoHP.setText("");
       TAStruck.setText("");
       TFBerat.setText("0");
       
    }//GEN-LAST:event_formWindowOpened

    //slider muter muter
    /* EVENT HANDLING 3*/
    private void SliderDiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderDiskonStateChanged
        // TODO add your handling code here:
        LDiskon.setText(String.valueOf(SliderDiskon.getValue())+"%");
    }//GEN-LAST:event_SliderDiskonStateChanged
    /* EVENT HANDLING 4*/
    private void BKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKeluarMouseClicked
        // TODO add your handling code here:
        //System.exit(0);
        int pilihan = JOptionPane.showConfirmDialog(this,"Apa anda yakin ingin Keluar","Keluar???",JOptionPane.YES_NO_OPTION);
        if (pilihan==0) {
            System.exit(0);
        }
       
    }//GEN-LAST:event_BKeluarMouseClicked

    private void BprosesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BprosesMousePressed
        // TODO add your handling code here:
        /*if (TFNama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "isi data dengan lengkap");
        }
        else if(TFNoHP.getText().equals("")){
            JOptionPane.showMessageDialog(this, "isi data dengan lengkap");
        }
        else if(TFBerat.getText().equals("")){
            JOptionPane.showMessageDialog(this, "isi data dengan lengkap");
        } 
        else if(TFNoHP.getText().equals("")TFNama.getText().equals("")){
            JOptionPane.showMessageDialog(this, "isi data dengan lengkap");
        }*/
                
    }//GEN-LAST:event_BprosesMousePressed

    private void BprosesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BprosesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BprosesMouseClicked
    /* EVENT HANDLING 5*/
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       setSize(670,560);
       setVisible(true);
       
        
    }//GEN-LAST:event_formWindowActivated
    /* EVENT HANDLING 5*/
    private void PHeaderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PHeaderMouseEntered
        // TODO add your handling code here:
        PHeader.setBackground(Color.CYAN);
        LHeader.setForeground(Color.DARK_GRAY);
        
    }//GEN-LAST:event_PHeaderMouseEntered
    /* EVENT HANDLING 6*/
    private void PHeaderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PHeaderMouseExited
        float[] hsbvals;
        // TODO add your handling code here:
        PHeader.setBackground(Color.DARK_GRAY);
        LHeader.setForeground(Color.green);
    }//GEN-LAST:event_PHeaderMouseExited

    private void BprosesComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BprosesComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BprosesComponentHidden
    /* EVENT HANDLING 7*/
    private void BUlangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BUlangMousePressed
        // TODO add your handling code here:   
        //SliderDiskon.setMinimum(0);
        TFNama.setText("");
        TFNoHP.setText("");
        TAStruck.setText("");
        TFBerat.setText("");
        SliderDiskon.setValue(0);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_BUlangMousePressed

    private void formCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formCaretPositionChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formCaretPositionChanged

    private void BprosesCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_BprosesCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BprosesCaretPositionChanged
    /* EVENT HANDLING 8*/
    private void TFNamaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFNamaCaretUpdate
        // TODO add your handling code here:
        if (TFNama.getText().length()==0 && TFBerat.getText().length()!=0) {
            Bproses.setEnabled(false);
        }
        else if (TFNama.getText().length()!=0) {
            Bproses.setEnabled(true);
        }
        
    }//GEN-LAST:event_TFNamaCaretUpdate

    private void TFNoHPCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFNoHPCaretUpdate
        // TODO add your handling code here:
        
        if (TFNoHP.getText().length()==0 && !TFNoHP.getText().matches("[A-Z]")&& !TFNoHP.getText().matches("[a-z]")) {
            Bproses.setEnabled(false);
            
        }
        else if (TFNoHP.getText().length()!=0 && TFNoHP.getText().matches("[1-9]*") ) {
            Bproses.setEnabled(true);
        }
    }//GEN-LAST:event_TFNoHPCaretUpdate

    private void TFBeratCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TFBeratCaretUpdate
        // TODO add your handling code here:
        //VBerat= Float.valueOf(TFBerat.getText());
        Integer B;
        B =Integer.valueOf(TFBerat.getText());
        if (B==0) {
            Bproses.setEnabled(false);
        }
        else if (B!=0) {
            Bproses.setEnabled(true);
        }
    }//GEN-LAST:event_TFBeratCaretUpdate

    private void BKeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKeluarMouseEntered
        // TODO add your handling code here:
        BKeluar.setBackground(Color.RED);
        BKeluar.setForeground(Color.BLACK);
    }//GEN-LAST:event_BKeluarMouseEntered

    private void BKeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKeluarMouseExited
        // TODO add your handling code here:
        BKeluar.setForeground(Color.BLACK);
        BKeluar.setBackground(Color.WHITE );
    }//GEN-LAST:event_BKeluarMouseExited

    private void BUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUlangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUlangActionPerformed

    private void TFBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFBeratActionPerformed
   
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
            java.util.logging.Logger.getLogger(FrameTiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTiki.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new FrameTiki().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BKeluar;
    private javax.swing.JButton BUlang;
    private javax.swing.JButton Bproses;
    private javax.swing.JLabel LDiskon;
    private javax.swing.JLabel LHeader;
    private javax.swing.JPanel PDasar;
    private javax.swing.JPanel PHeader;
    private javax.swing.JPanel PJenis;
    private javax.swing.JPanel PKanan;
    private javax.swing.JPanel PKiri;
    private javax.swing.JRadioButton RBExpress;
    private javax.swing.JRadioButton RBReguler;
    private javax.swing.JSlider SliderDiskon;
    private javax.swing.JTextArea TAStruck;
    private javax.swing.JTextField TFBerat;
    private javax.swing.JTextField TFNama;
    private javax.swing.JTextField TFNoHP;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
