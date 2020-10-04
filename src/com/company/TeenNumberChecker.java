/**********************************
 * Author: Travis Ashcraft
 *
 * Teen Number Checker
 *
 * Travisashcraft.github.io
 *********************************/
package com.company;

public class TeenNumberChecker {

    public static boolean hasTeen(int x, int n, int y){
        if(x > 13 || n > 13 || y > 13){
            if(x < 19 || n < 19 || y < 19){
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int x){
        if(x > 13 && x < 19){
            return true;
        }
        return false;
    }
}
