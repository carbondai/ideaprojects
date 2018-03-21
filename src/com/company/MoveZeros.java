package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by ht706 on 18-3-15.
 */
public class MoveZeros {
    public void moveZeros(int[] nums) {
        int temp;
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] != 0){
                continue;
            }
            else {
                for(int j = i; j < nums.length-1; j++) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public void moveZero(int[] nums) {
        int temp;
        int k = 0;
        for(int i = 0; i < nums.length-k; ) {
            if(nums[i] == 0) {
                k++;
                for(int j = i; j < nums.length-k; j++) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            else {
                i++;
            }
        }
    }
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index++;
            }
        }
        if(index>=nums.length){
            return;
        }
        for(int i=index;i<nums.length;i++){
            nums[i] = 0;
        }
    }
    public int moveZeroe(int[] nums) {
        int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=3){
                exch(nums,index,i);
                index++;
            }
        }
        return index;
    }
    public void exch(int[]a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = { 3,2,2,3};
        MoveZeros moveZeros = new MoveZeros();
        int m = moveZeros.moveZeroe(nums);
        System.out.print(m);
    }
}
