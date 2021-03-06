/*
 * The MIT License
 *
 * Copyright 2019 kaan.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package GUI;

import com.mycompany.nycrosswordpuzzle.Constants;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.swing.Timer;

/**
 *
 * @author kaan
 */
public class GameFrame extends javax.swing.JFrame {

    Constants c;

    /**
     * Creates new form GameFrame
     *
     * @param b
     * @param c
     */
    public GameFrame( MainBoard b, Constants c ) {
        this.c = c;
        initComponents();
        board.setLayout( new java.awt.GridLayout() );
        board.add( b );

        int interval = 1000; // 1000 ms

        new Timer( interval, ( ActionEvent e ) -> {
            dateLabel.setText( getCurrentDate() + "" );
        } ).start();
    }

    public Date getCurrentDate() {
        SimpleDateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy HH:mm:ss" );
        Date date = new Date();
        return date;
    }

    public String getAcrossClues() {
        Map<Integer, String> across = c.getAcross();
        String clues = "";

        for ( int key : across.keySet() ) {
            clues = clues + key + ": " + across.get( key ) + "\n";
        }

        return clues;
    }
    
    public String getGeneratedAcrossClues() {
        Map<Integer, String> across = c.getGeneratedAcross();
        String clues = "";

        for ( int key : across.keySet() ) {
            clues = clues + key + ": " + across.get( key ) + "\n";
        }

        return clues;
    }
    
    public String getGeneratedDownClues() {
        Map<Integer, String> down = c.getGeneratedDown();
        String clues = "";

        for ( int key : down.keySet() ) {
            clues = clues + key + ": " + down.get( key ) + "\n";
        }

        return clues;
    }

    public String getDownClues() {
        Map<Integer, String> down = c.getDown();
        String clues = "";

        for ( int key : down.keySet() ) {
            clues = clues + key + ": " + down.get( key ) + "\n";
        }

        return clues;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        board = new javax.swing.JPanel();
        groupNick = new javax.swing.JLabel();
        acrossTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        acrossText = new javax.swing.JTextPane();
        downTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        downText = new javax.swing.JTextPane();
        dateLabel = new javax.swing.JLabel();
        genDownLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        genDownTextField = new javax.swing.JTextPane();
        genAcrossLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        genAcrossTextField = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout boardLayout = new javax.swing.GroupLayout(board);
        board.setLayout(boardLayout);
        boardLayout.setHorizontalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 328, Short.MAX_VALUE)
        );
        boardLayout.setVerticalGroup(
            boardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        groupNick.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        groupNick.setForeground(new java.awt.Color(0, 0, 0));
        groupNick.setText("  SOLVER");

        acrossTitle.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        acrossTitle.setText("Across");

        acrossText.setText(getAcrossClues());
        jScrollPane1.setViewportView(acrossText);

        downTitle.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        downTitle.setText("Down");

        downText.setText(getDownClues());
        jScrollPane2.setViewportView(downText);

        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateLabel.setText( getCurrentDate() + "" );

        genDownLabel.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        genDownLabel.setText("Generated Down");

        genDownTextField.setText(getGeneratedDownClues());
        jScrollPane3.setViewportView(genDownTextField);

        genAcrossLabel.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        genAcrossLabel.setText("Generated Across");

        genAcrossTextField.setText(getGeneratedAcrossClues());
        jScrollPane4.setViewportView(genAcrossTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(groupNick, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acrossTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(genAcrossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genDownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(acrossTitle)
                            .addComponent(genAcrossLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downTitle)
                            .addComponent(genDownLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupNick, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane acrossText;
    private javax.swing.JLabel acrossTitle;
    private javax.swing.JPanel board;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextPane downText;
    private javax.swing.JLabel downTitle;
    private javax.swing.JLabel genAcrossLabel;
    private javax.swing.JTextPane genAcrossTextField;
    private javax.swing.JLabel genDownLabel;
    private javax.swing.JTextPane genDownTextField;
    private javax.swing.JLabel groupNick;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
