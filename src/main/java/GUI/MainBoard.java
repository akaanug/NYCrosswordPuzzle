/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;

/**
 *
 * @author kaan
 */
public class MainBoard extends javax.swing.JPanel {

    ArrayList<CellGUI> cellGUIs;

    /**
     * Creates new form MainBoard
     *
     * @param width
     * @param cellGUIs
     */
    public MainBoard( int width, ArrayList<CellGUI> cellGUIs ) {
        initComponents();
        setGrid( width );
        addCells( cellGUIs );
        this.cellGUIs = cellGUIs;
        
        cellGUIs.forEach( ( c ) -> {
            if ( !c.isBlock() ) {
                c.reveal();
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

        board = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        board.setLayout(new java.awt.GridLayout(1, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(board, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setGrid( int width ) {
        board.setLayout( new java.awt.GridLayout( width, width ) );
    }

    private void addCells( ArrayList<CellGUI> cells ) {
        cells.forEach( ( c ) -> {
            board.add( (CellGUI) c );
        } );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel board;
    // End of variables declaration//GEN-END:variables
}
