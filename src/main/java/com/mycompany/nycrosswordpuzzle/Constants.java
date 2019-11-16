/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nycrosswordpuzzle;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kaan
 */
public class Constants {

    private final int cellAmount;
    private final ArrayList<Boolean> isBlock;
    private final ArrayList<String> answers;
    private final HashMap<Integer, String> acrossClues;
    private final HashMap<Integer, String> downClues;
    private final HashMap<Integer, Integer> clueLabelsOnCells;

    public Constants() {
        this.cellAmount = getCellAmount();
        this.acrossClues = acrossClues();
        this.downClues = downClues();
        this.isBlock = isTheBlock();
        this.clueLabelsOnCells = clueLabelsOnCells();
        this.answers = retAnswers();
    }
    
    public final ArrayList<String> getAnswers() {
        return answers;
    }
    
    public final HashMap<Integer, Integer> getClueLabelsOnCells() {
        return clueLabelsOnCells;
    }

    public final HashMap<Integer, String> getAcross() {
        return acrossClues;
    }

    public final HashMap<Integer, String> getDown() {
        return downClues;
    }

    public final int getCellAmount() {
        return Parser.getCellAmount();
    }

    public final ArrayList<Boolean> getIsBlock() {
        return isBlock;
    }

    /**
     * (cell number, clue Number) 
     * adds 0 as clue number if the is none
     *
     * @return
     */
    public final HashMap clueLabelsOnCells() {
        HashMap<Integer, Integer> clueLabels = new HashMap<>();
        ArrayList<Integer> clueNums = Parser.getClueLabelsOnCells();
        for ( int i = 0; i < cellAmount; i++ ) {
            System.out.println("Cell Num:" + i + " CLUE: " + clueNums.get( i ));
            clueLabels.put( i, clueNums.get( i ) );
        }

        return clueLabels;
    }

    public final ArrayList<Boolean> isTheBlock() {
        ArrayList isBox;
        isBox = new ArrayList();
        for ( int i = 0; i < cellAmount; i++ ) {
            if ( Parser.getBoxes().contains( i ) ) {
                System.out.println( "true" );
                isBox.add( true );
            } else {
                System.out.println( "false" );
                isBox.add( false );
            }
        }
        return isBox;
    }

    public final HashMap acrossClues() {
        HashMap<Integer, String> clues = new HashMap<>();
        int clueSize = Parser.getClues().size() / 2;
        for ( int i = 0; i < clueSize; i++ ) {
            int clueLabel = (int) Parser.getClueLabels().get( i );
            String clue = (String) Parser.getClues().get( i );
            clues.put( clueLabel, clue );
        }
        return clues;
    }

    public final HashMap downClues() {
        HashMap<Integer, String> clues = new HashMap<>();
        int clueSize = Parser.getClues().size() / 2;
        for ( int i = clueSize; i < clueSize * 2; i++ ) {
            int clueLabel = (int) Parser.getClueLabels().get( i );
            String clue = (String) Parser.getClues().get( i );
            clues.put( clueLabel, clue );
        }
        return clues;
    }
    
    public final ArrayList<String> retAnswers() {
        return Parser.getAnswers();
    }

    public int getCellCount() {
        System.out.println( cellAmount );
        return cellAmount;
    }

}
