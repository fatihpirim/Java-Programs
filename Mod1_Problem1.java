/**
 *  1. divide the integer number representing your student id by 3, get the remainder, and add 3 to it ==> chapterNumber
 *
 *      myStudentID = 1234567
 *
 *     chapterNum = (myStudentID % 3) + 3 ==> % operator gives us remainder
 *
 *
 *
 * 2.
 *      initialize;
 *      a. if chapter number = 3 ==> problem_Num = (studentID % 34) + 1
 *      b. if chapter number = 4 ==> problem_Num = (studentID % 38) + 1
 *      c. if chapter number = 5 ==> problem_Num = (studentID % 46) + 1
 *
 *      if chapterNum == 4:
 *  *          chapterNum = 6;
 *
 *
 *  3. Scanner myScan = new Scanner(System.in);
 *      where is the page number located?
 *      String pageNum =myScan.nextLine();
 *
 *  4. PRINT
 *      Print(“Please solve programming exercise … (problemNum) from chapter …
 *      (chapterNum), from page … (pageNum)."
 *
 */


package com.company;
import java.util.Scanner;
public class Mod1_Problem1 {

    public static void main(String[] args) {

        int myStudentID = 1234567;

        int chapterNum = (myStudentID %3) +3; 
        System.out.println("My chapter number is: " + chapterNum);

        int problemNum; //my problem number is 23
        if (chapterNum == 3) {
            problemNum = (myStudentID % 34) + 1;
        } else if(chapterNum == 4) {
            problemNum = (myStudentID % 38) + 1;
        } else {
            problemNum = (myStudentID % 46) + 1;
        }

        if (chapterNum == 4) {
            chapterNum = 6;
        }

        System.out.println("My problem number is: " + problemNum);

        Scanner myScan = new Scanner(System.in);
        System.out.println("What page is this question on?"); 
        String pageNum = myScan.nextLine();

        System.out.println("Please solve programming exercise " + problemNum + " from chapter  " +
                chapterNum + ", on page " + pageNum + ".");
    }
}
