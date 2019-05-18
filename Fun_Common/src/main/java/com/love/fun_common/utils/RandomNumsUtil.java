package com.love.fun_common.utils;

public class RandomNumsUtil {
    //参数说明：num--无重复随机数的个数   scope--随机数所在范围(不包含scope)
    public static Integer[] getRandomArrayByIndex(int num, int scope){
        //1.获取scope范围内的所有数值，并存到数组中
        Integer[] randomArray=new Integer[scope];
        for(int i=0;i<randomArray.length;i++){
            randomArray[i]=i;
        }

        //2.从数组random中取数据，取过后的数改为-1
        Integer[] numArray=new Integer[num];//存储num个随机数
        int i=0;
        while(i<numArray.length){
            int index=(int)(Math.random()*scope);
            if(randomArray[index]!=-1){
                numArray[i]=randomArray[index];
                randomArray[index]=-1;
                i++;
            }
        }

        return numArray;
    }

   /* public static void main(String[] args) {
        int[] ints = RandomNumsUtil.getRandomArrayByIndex(5, 14);
        for (Integer i: ints) {
            System.out.println(i);
        }

    }*/
}
