/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kis.vh.nursery.stackandlist;

/**
 *
 * @author karko
 */
public interface IntDataStructure {

    final int EMPTY_STACK_VALUE = 0;
    
    boolean callCheck();

    void countIn(final int value);

    int countOut();

    boolean isFull();

    int peekaboo();
    
}