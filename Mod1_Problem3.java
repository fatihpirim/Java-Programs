package com.company;

public class Mod1_Problem3 {
    /**
     * car ==> 60miles/60minutes
     * car turns every 5minutes, so car turns 12 times
     * car turns every 5miles, multiply final vertical and horizontal by 5
     * starts at (0,0) and ends up at (x,y)
     * to find TOTAL distance, find hypotenuse
     * sqrt[(y-0)+(x-0)]
     */
    public static void main(String[] args) {
        int randomNum;
        int vertical;
        int horizontal;
        double totalDistance;

        vertical = 0; // initial ==> (0,)
        horizontal = 0;

        for (int i = 1; i<=12; ++i){
            randomNum = (int)(Math.random() * 4); //range is up to 4 (0, 1, 2 , 3) (N, S, E, W)
            switch(randomNum){
                case 0:
                    vertical += 1; // NORTH
                    break;
                case 1:
                    vertical -= 1; //SOUTH
                    break;
                case 2:
                    horizontal += 1; //EAST
                    break;
                case 3:
                    horizontal -= 1; //WEST
                    break;

            }
        }

        vertical = 5 * vertical; //multiplied by 5 because 5 miles is travelled every time car turns
        horizontal = 5 * horizontal;

        //hypotenuse formula
        totalDistance = Math.sqrt((vertical*vertical) + (horizontal*horizontal));
        System.out.println("The direct distance from the initial point to the location point of the driver after one hour of driving is: ");
        System.out.println(totalDistance);

    }
}
