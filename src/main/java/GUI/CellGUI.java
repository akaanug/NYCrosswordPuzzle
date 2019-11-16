/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import com.mycompany.nycrosswordpuzzle.Cell;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author kaan
 */
public class CellGUI extends javax.swing.JPanel {

    private final String correctWord;
    private String currentWord;
    private final int cellNo;
    private final boolean isBlock;
    private final int downClue;
    private final int acrossClue;
    private final Cell c;
    private final String clueLabel;

    /**
     * Creates new form Cell
     *
     * @param c
     */
    public CellGUI( Cell c ) {

        this.c = c;
        this.cellNo = c.getCellNo();
        this.correctWord = c.getCorrectWord();
        this.currentWord = c.getCurrentWord();
        this.isBlock = c.isIsBlock();
        this.downClue = c.getDownClue();
        this.acrossClue = c.getAcrossClue();
        this.clueLabel = c.getClueLabelAsString();

        initComponents();

        if ( isBlock ) {
//            answerText.setEditable( false );
            answerText.setEnabled( false );
            answerText.setForeground( Color.black );
            answerText.setBackground( Color.black );
        }

        answerText.addKeyListener( new KeyAdapter() {
            @Override
            public void keyTyped( KeyEvent e ) {
                if ( answerText.getText().length() >= 1 ) // limit textfield to 3 characters
                {
                    e.consume();
                }
            }
        } );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        answerText = new javax.swing.JTextField();
        clueNo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        answerText.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        answerText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerTextActionPerformed(evt);
            }
        });

        clueNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clueNo.setText(clueLabel);

        jLayeredPane1.setLayer(answerText, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(clueNo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(clueNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(answerText, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(clueNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(answerText, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void answerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerText;
    private javax.swing.JLabel clueNo;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables

    void reveal() {
        answerText.setText( correctWord );
        answerText.setEnabled(false);
//        System.out.println("revealed" + correctWord);
    }
    
    boolean isBlock() {
        return isBlock;
    }
}
