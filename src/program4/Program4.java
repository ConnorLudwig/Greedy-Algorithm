/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program4;
import java.util.ArrayList;

/**
 *
 * Author: Connor Ludwig and Kendell Prather
 * Date: 4/24/18
 * Overview: Algorithm that returns the minimum number of coins for a given amount, used dynamic iteration. 
 * That method is tested using JUnit tests.
 */
public class Program4 {

    public static ArrayList<Integer> greedy(int[] coins, int total){
            //catches exception if array is empty
            if(coins.length == 0) {
		throw new IllegalArgumentException("Array of size 0 is not allowed");
            }
            ArrayList<Integer> list = new ArrayList<>(); //creates an array list to hold coin amounts
                for(int i = coins.length - 1; i>=0; i--){ //for loops that starts at the far right of the array
                    if(coins[i] <= total){ //enters if statment if the value of coin in index i is equal to or less than amount
                        total = total - coins[i]; //subtracts coin amount from total
                        list.add(coins[i]); //adds coin denomination to array list
                        if(total == 0){ //if total is equal to zero, the algorthim is complete so it returns the list
                            return list;
                        }
                        else{ //if the total is not 0 more coins must be chosen
                        i++; //starts the array over again at current coin value it was at to check to see if it can be used again
                    }
                  }
                }
            
             return list; //returns list
        }
    
}
