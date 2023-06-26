/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit 
this template
 */
package tictactoe2;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Jframe;

/**
 *
 * @author matty
 */
public class NewJFrame extends javax.swing.JFrame {

    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public NewJFrame() {
        initComponents();
    }
    
    private void gameScore(){
        PLAYER1.setText(String.valueOf(xCount));
        PLAYER2.setText(String.valueOf(oCount));
    }
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else {
            startGame = "X";
        }
    }
    private void winning_Game(){
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
       
        if (b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
         JOptionPane.showMessageDialog(this,"Player O Wins",
     "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.MAGENTA);
            txtbtn2.setBackground(Color.MAGENTA);
            txtbtn3.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
        }
        if (b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
       JOptionPane.showMessageDialog(this,"Player O Wins",
              "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn4.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn6.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        if (b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
      JOptionPane.showMessageDialog(this,"Player O Wins", 
         "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn7.setBackground(Color.BLUE);
            txtbtn8.setBackground(Color.BLUE);
            txtbtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
         JOptionPane.showMessageDialog(this,"Player O Wins",
         "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.gray);
            txtbtn4.setBackground(Color.gray);
            txtbtn7.setBackground(Color.gray);
            oCount++;
            gameScore();
        }
          if (b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins",
           "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
        }if (b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
          JOptionPane.showMessageDialog(this,"Player O Wins",
           "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.BLUE);
            txtbtn6.setBackground(Color.BLUE);
            txtbtn9.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        if (b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
         JOptionPane.showMessageDialog(this,"Player O Wins",
    "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.PINK);
            txtbtn5.setBackground(Color.PINK);
            txtbtn9.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }if (b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
        JOptionPane.showMessageDialog(this,"Player O Wins",
              "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.BLUE);
            txtbtn5.setBackground(Color.BLUE);
            txtbtn7.setBackground(Color.BLUE);
            oCount++;
            gameScore();
        }
        
        
        
        
        
        
        
        if (b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
      JOptionPane.showMessageDialog(this,"Player X Wins",
           "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.BLUE);
            txtbtn2.setBackground(Color.BLUE);
            txtbtn3.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        if (b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
        JOptionPane.showMessageDialog(this,"Player X Wins",
   "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn4.setBackground(Color.CYAN);
            txtbtn5.setBackground(Color.CYAN);
            txtbtn6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        if (b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
        JOptionPane.showMessageDialog(this,"Player X Wins",
        "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn7.setBackground(Color.GREEN);
            txtbtn8.setBackground(Color.GREEN);
            txtbtn9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
            if (b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
         JOptionPane.showMessageDialog(this,"Player X Wins",
        "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.BLUE);
            txtbtn4.setBackground(Color.BLUE);
            txtbtn7.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
          if (b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
        JOptionPane.showMessageDialog(this,"Player X Wins",
         "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
        }if (b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
         JOptionPane.showMessageDialog(this,"Player x Wins",
      "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.BLUE);
            txtbtn6.setBackground(Color.BLUE);
            txtbtn9.setBackground(Color.BLUE);
            xCount++;
            gameScore();
        }
        if (b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
          JOptionPane.showMessageDialog(this,"Player X Wins",
           "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn1.setBackground(Color.yellow);
            txtbtn5.setBackground(Color.yellow);
            txtbtn9.setBackground(Color.yellow);
            xCount++;
            gameScore();
        }if (b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
         JOptionPane.showMessageDialog(this,"Player X Wins",
          "TIC TAC TOE",JOptionPane.INFORMATION_MESSAGE);
            txtbtn3.setBackground(Color.red);
            txtbtn5.setBackground(Color.red);
            txtbtn7.setBackground(Color.red);
            xCount++;
            gameScore();
        }
    
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn2 = new javax.swing.JButton();
        txtbtn3 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jplayer1 = new javax.swing.JLabel();
        PLAYER2 = new javax.swing.JLabel();
        PLAYER1 = new javax.swing.JLabel();
        txtstart = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();

        jButton3.setText("jButton1");

        jButton6.setText("jButton1");

        jButton8.setText("jButton1");

        jButton11.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setBackground(new java.awt.Color(129, 133, 127));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(128, 128, 128));

        jLabel1.setFont(new java.awt.Font("Adobe Garamond Pro Bold", 1, 36)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))
        );

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(128, 128, 128));

        jLabel2.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 24)); // NOI18N
        jLabel2.setText("Player O :");

        Jplayer1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 24)); // NOI18N
        Jplayer1.setText("Player X :");

        PLAYER2.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 24)); // NOI18N
        PLAYER2.setText("0");

        PLAYER1.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 24)); // NOI18N
        PLAYER1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLAYER1.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jplayer1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PLAYER1)
                    .addComponent(PLAYER2))
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jplayer1)
                    .addComponent(PLAYER1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PLAYER2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtstart.setBackground(new java.awt.Color(127, 127, 127));
        txtstart.setForeground(new java.awt.Color(255, 255, 255));
        txtstart.setText("NEW GAME");
        txtstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstartActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(127, 127, 127));
        txtexit.setForeground(new java.awt.Color(255, 255, 255));
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(127, 127, 127));
        txtreset.setForeground(new java.awt.Color(255, 255, 255));
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtstart, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstartActionPerformed
       txtbtn1.setEnabled(true);
       txtbtn2.setEnabled(true);
       txtbtn3.setEnabled(true);
       txtbtn4.setEnabled(true);
       txtbtn5.setEnabled(true);
       txtbtn6.setEnabled(true);
       txtbtn7.setEnabled(true);
       txtbtn8.setEnabled(true);
       txtbtn9.setEnabled(true);
       
       PLAYER1.setText("0");
       PLAYER2.setText("0");
       
       txtbtn1.setText("");
       txtbtn2.setText("");
       txtbtn3.setText("");
       txtbtn4.setText("");
       txtbtn5.setText("");
       txtbtn6.setText("");
       txtbtn7.setText("");
       txtbtn8.setText("");
       txtbtn9.setText("");
       
       txtbtn1.setBackground(Color.LIGHT_GRAY);
       txtbtn2.setBackground(Color.LIGHT_GRAY);
       txtbtn3.setBackground(Color.LIGHT_GRAY);
       txtbtn4.setBackground(Color.LIGHT_GRAY);
       txtbtn5.setBackground(Color.LIGHT_GRAY);
       txtbtn6.setBackground(Color.LIGHT_GRAY);
       txtbtn7.setBackground(Color.LIGHT_GRAY);
       txtbtn8.setBackground(Color.LIGHT_GRAY);
       txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtstartActionPerformed
private JFrame frame;
    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        frame = new JFrame("EXIT");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","TIC TAC TOE",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        txtbtn1.setEnabled(true);
       txtbtn2.setEnabled(true);
       txtbtn3.setEnabled(true);
       txtbtn4.setEnabled(true);
       txtbtn5.setEnabled(true);
       txtbtn6.setEnabled(true);
       txtbtn7.setEnabled(true);
       txtbtn8.setEnabled(true);
       txtbtn9.setEnabled(true);
       
       txtbtn1.setText("");
       txtbtn2.setText("");
       txtbtn3.setText("");
       txtbtn4.setText("");
       txtbtn5.setText("");
       txtbtn6.setText("");
       txtbtn7.setText("");
       txtbtn8.setText("");
       txtbtn9.setText("");
       
       txtbtn1.setBackground(Color.LIGHT_GRAY);
       txtbtn2.setBackground(Color.LIGHT_GRAY);
       txtbtn3.setBackground(Color.LIGHT_GRAY);
       txtbtn4.setBackground(Color.LIGHT_GRAY);
       txtbtn5.setBackground(Color.LIGHT_GRAY);
       txtbtn6.setBackground(Color.LIGHT_GRAY);
       txtbtn7.setBackground(Color.LIGHT_GRAY);
       txtbtn8.setBackground(Color.LIGHT_GRAY);
       txtbtn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtresetActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        txtbtn1.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
txtbtn2.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
txtbtn3.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
txtbtn4.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
txtbtn5.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
txtbtn6.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
txtbtn7.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
txtbtn8.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
txtbtn9.setText(startGame);
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else {
            checker = true;
        }
        choose_a_Player();
        winning_Game();        // TODO add your handling code here:
    }//GEN-LAST:event_txtbtn9ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jplayer1;
    private javax.swing.JLabel PLAYER1;
    private javax.swing.JLabel PLAYER2;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    private javax.swing.JButton txtstart;
    // End of variables declaration//GEN-END:variables

    private void JFrame(String exit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
