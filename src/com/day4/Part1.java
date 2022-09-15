package com.day4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) throws IOException {
        Scanner steps;
        Scanner boards;
        String line;
        int x =0;

        int[][] boardsTab = new int[5][5];

        steps = new Scanner(new File("C:\\Users\\aleks\\IdeaProjects\\AoC_2021\\src\\com\\day4\\steps.txt"));
        boards = new Scanner(new File("C:\\Users\\aleks\\IdeaProjects\\AoC_2021\\src\\com\\day4\\boards.txt"));

        while (boards.hasNext()) {
            line = boards.nextLine();
            for (int a=0; a<100; a++) {
                for (int b=0; b<5; b++) {
                    for (int c=0; c<5; c++) {
                        boardsTab[b][c]=line.charAt(0);
                    }
                }
            }
        }
        System.out.println(x);
    }
}