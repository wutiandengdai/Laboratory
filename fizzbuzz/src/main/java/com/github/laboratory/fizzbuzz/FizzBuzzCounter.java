package com.github.laboratory.fizzbuzz;

import java.util.Map;

/**
 * Description:
 * Creating Sound - divided by key or contains key
 * Print out count if no criteria meets
 * @Param upto: looping number starts from 0
 * @Param map: key and sound pairs
 */
class FizzBuzzCounter{
    public void count(final long upto, final Map<Long, String> map){
        if(upto <= 0){
            System.out.println("Invalid Number, please input a positive number...");
        }
        for(long i= 1; i<= upto; i++){
            if(isLuckyNumber(i, map)){
                //Newline if any criteria meets
                System.out.println();
            }else{
                //Printout digit if nothing meet
                System.out.println(i);
            };
        }
    }

    /**
     * Check if the looping number i meets the critirea of "contains and can be divided by"
     */
    private boolean isLuckyNumber(final long i, final Map<Long, String> map){
        long number = i;
        boolean isLucky=false;
        for(Map.Entry<Long, String> en: map.entrySet()){
            long key = en.getKey();
            //ignore if some given key is smaller than 0
            if(key < 0){
                continue;
            }
            String sound = en.getValue();

            //when key is 0, check contains
            if(key == 0){
                if(contains(key, number)){
                    System.out.print(sound);
                    isLucky = true;
                }
            
            //when the key is non-zero, check both devident and contains
            }else if( number%key == 0 || contains(key, number)){
                System.out.print(sound);
                isLucky = true;
            }
        }
        return isLucky;
    }


    /**
     * Find out if the key(target digit) is contained in the context(searching digit)
     */
    private boolean contains(final long key, final long context){
        long number = context;

        //Define nubmer of digits of the key
        int zoom = 10;
        for(;zoom < key; zoom = zoom*10){}

        while(number != 0){
            if(number%zoom == key){
                return true;
            }
            number = number/10;
        }
        return false;
    }
}