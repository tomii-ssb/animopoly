package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] dice = new int[] {0,0};
        String[] textBoard = new String[] {"  ","  ","  "};
        char boardLocation[][] = new char[24][4];
        for (char[] row : boardLocation)
            Arrays.fill(row, ' ');


        String board = String.format(
                ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,\n" +
                "*    GO    |            |          |          |          |         |           *\n" +
                "*   %c  %c   |    %c  %c    |   %c  %c   |   %c  %c   |   %c  %c   |  %c  %c   |   %c  %c    *\n" +
                "*   %c  %c   |    %c  %c    |   %c  %c   |   %c  %c   |   %c  %c   |  %c  %c   |   %c  %c    *\n" +
                "*__________|_______________________________________________________|___________*\n" +
                "*          |                                                       |           *\n" +
                "*          |                                                       |           *\n" +
                "*   %c  %c   |                &   &                                  |   %c  %c    *\n" +
                "*   %c  %c   |              &        &         ╔═══╗   ╔═══╗         |   %c  %c    *\n" +
                "*__________|           ,.            .#      ║ %d ║   ║ %d ║         |___________*\n" +
                "*          |         @               &       ╚═══╝   ╚═══╝         |           *\n" +
                "*          |       &               &                               |           *\n" +
                "*   %c  %c   |     #              *                                  |   %c  %c    *\n" +
                "*   %c  %c   |      &           &                                    |   %c  %c    *\n" +
                "*__________|         &      &                                      |___________*\n" +
                "*          |           ./ /                                        |           *\n" +
                "*          |                                                       |           *\n" +
                "*   %c  %c   |                                         (  .          |   %c  %c    *\n" +
                "*   %c  %c   |                                       &      &        |   %c  %c    *\n" +
                "*__________|                                     &           &     |___________*\n" +
                "*          |   ╔═══════════════════╗          .*              #    |           *\n" +
                "*          |   ║  Turn: %s         ║        &               &      |           *\n" +
                "*   %c  %c   |   ║                   ║      &               &        |   %c  %c     *\n" +
                "*   %c  %c   |   ║                   ║     &             ,.          |   %c  %c    *\n" +
                "*__________|   ║  Balance: %s      ║        &        &             |___________*\n" +
                "*          |   ║  Output: %s       ║           &   &               |           *\n" +
                "*   %c  %c   |   ║                   ║             .                 |   %c  %c    *\n" +
                "*   %c  %c   |   ╚═══════════════════╝                               |   %c  %c    *\n" +
                "*__________|_______________________________________________________|___________*\n" +
                "*          |            |          |          |          |         |           *\n" +
                "*   %c  %c   |    %c  %c    |   %c  %c   |   %c  %c   |  %c  %c    |  %c  %c   |   %c  %c    *\n" +
                "*   %c  %c   |    %c  %c    |   %c  %c   |   %c  %c   |  %c  %c    |  %c  %c   |   %c  %c    *\n" +
                ",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,",

                //row one
                boardLocation[0][0],boardLocation[0][1],boardLocation[0][2],boardLocation[0][3],
                boardLocation[1][0],boardLocation[1][1],boardLocation[1][2],boardLocation[1][3],
                boardLocation[2][0],boardLocation[2][1],boardLocation[2][2],boardLocation[2][3],
                boardLocation[3][0],boardLocation[3][1],boardLocation[3][2],boardLocation[3][3],
                boardLocation[4][0],boardLocation[4][1],boardLocation[4][2],boardLocation[4][3],
                boardLocation[5][0],boardLocation[5][1],boardLocation[5][2],boardLocation[5][3],
                boardLocation[6][0],boardLocation[6][1],boardLocation[6][2],boardLocation[6][3],

                //row two
                boardLocation[7][0],boardLocation[7][1],boardLocation[7][2],boardLocation[7][3],
                boardLocation[8][0],boardLocation[8][1],boardLocation[8][2],boardLocation[8][3],

                //dice
                dice[0],dice[1],

                //row three
                boardLocation[14][0],boardLocation[0][1],boardLocation[0][2],boardLocation[0][3],
                boardLocation[15][0],boardLocation[1][1],boardLocation[1][2],boardLocation[1][3],

                //row four
                boardLocation[14][0],boardLocation[0][1],boardLocation[0][2],boardLocation[0][3],
                boardLocation[15][0],boardLocation[1][1],boardLocation[1][2],boardLocation[1][3],

                //turn
                textBoard[0],

                //row five
                boardLocation[14][0],boardLocation[0][1],boardLocation[0][2],boardLocation[0][3],
                boardLocation[15][0],boardLocation[1][1],boardLocation[1][2],boardLocation[1][3],

                //balance and output
                textBoard[1],textBoard[2],

                //row six
                boardLocation[14][0],boardLocation[0][1],boardLocation[0][2],boardLocation[0][3],
                boardLocation[15][0],boardLocation[1][1],boardLocation[1][2],boardLocation[1][3],

                //row seven
                boardLocation[0][0],boardLocation[0][1],boardLocation[0][2],boardLocation[0][3],
                boardLocation[1][0],boardLocation[1][1],boardLocation[1][2],boardLocation[1][3],
                boardLocation[2][0],boardLocation[2][1],boardLocation[2][2],boardLocation[2][3],
                boardLocation[3][0],boardLocation[3][1],boardLocation[3][2],boardLocation[3][3],
                boardLocation[4][0],boardLocation[4][1],boardLocation[4][2],boardLocation[4][3],
                boardLocation[5][0],boardLocation[5][1],boardLocation[5][2],boardLocation[5][3],
                boardLocation[6][0],boardLocation[6][1],boardLocation[6][2],boardLocation[6][3]
                );

        while (true) {
            dice[0] = (int) (Math.random() * ((6 - 1) + 1) + 1);
            dice[1] = (int) (Math.random() * ((6 - 1) + 1) + 1);
            System.out.println(board);
        }
    }
}
