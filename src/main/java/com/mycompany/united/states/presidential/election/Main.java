/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.united.states.presidential.election;

import java.io.*;
import java.util.Scanner; 

/**
 *
 * @author ghandour
 */

public class Main {
    public static void main (String[] args) throws IOException {
        String path = "/home/ghandour/Desktop/elections.txt";
        File file = new File(path); 
        Scanner sc = new Scanner(file); 
        int numberOfCandidates = Integer.parseInt(sc.nextLine());
        President president[] = new President[numberOfCandidates];
        int maxElectoral = 0; // initial value
        String theWinningPresident = "";
        for (int i = 0; i < numberOfCandidates; i++) {
            String[] Lines = sc.nextLine().split(":");
            president[i] = new President(Lines[0],Lines[1],Lines[2]);
            int theElectoral = Integer.parseInt(president[i].getElectoralNum()) ;
            if (maxElectoral < theElectoral) {
                maxElectoral = theElectoral;
                theWinningPresident = president[i].getName();
            }
        }
        System.out.println(theWinningPresident + " is the 46th and incumbent president of the United States, With " + maxElectoral + " Electoral");
      } 
    }
