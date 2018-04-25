/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program4;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * Author: Connor Ludwig and Kendell Prather
 * Date: 4/24/18
 * Overview: Algorithm that returns the minimum number of coins for a given amount, used dynamic iteration. 
 * That method is tested using JUnit tests.
 */
public class Program4Test {
    
 @Test
    public void testMethod() {
        int array[] = {1,5,10,25};
        ArrayList<Integer> coins = new ArrayList<Integer>();
        coins.add(25);
        assertEquals(coins, Program4.greedy(array, 25));
    }
    
     @Test
    public void testMethod2() {
        int array[] = {1,7,8,33};
        ArrayList<Integer> coins = new ArrayList<Integer>();
        coins.add(33);
        coins.add(33);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, Program4.greedy(array, 72));
    }
    
    
     @Test
    public void testMethod3() {
        int array[] = {1,5,7,8,9};
        ArrayList<Integer> coins = new ArrayList<Integer>();
        coins.add(9);
        coins.add(9);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, Program4.greedy(array, 20));
    }
    
    @Test
    public void testMethod4(){
        int array[] = {};
        boolean thrown = false;
        try {
        Program4.greedy(array, 0);
        } 
        catch (IllegalArgumentException e) {
            thrown = true;
        }
        
    assertTrue(thrown);
  }
    
}
