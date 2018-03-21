package com.company;

import java.util.Arrays;

/**
 * Created by ht706 on 18-3-14.
 */
public class MinCostClimbingStairs {
    public int minCost(int[] cost) {
        int[] f = new int[cost.length];
        for(int i = cost.length-1; i >= 0; i--) {
            if( i == cost.length-1 || i == cost.length-2){
                f[i] = cost[i];
            }else {
                f[i] = cost[i] + Math.min(f[i + 1], f[i + 2]);
            }
        }
        return Math.min(f[0], f[1]);
    }
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        MinCostClimbingStairs mccs = new MinCostClimbingStairs();
        int m = mccs.minCost(cost);
        System.out.print(m);
        String[][] s = new String[][]{{"a","b"},{"c","d"}};
        System.out.print(Arrays.deepToString(s));


    }
}
