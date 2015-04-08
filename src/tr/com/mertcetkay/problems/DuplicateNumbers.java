package tr.com.mertcetkay.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Duplicate number iceren array problemleri
 *
 *
 * Trick: arraydeki elemanlari set icerisine koy
 *        iki kumenin elemanlarinin toplaminin farki
 *        duplicate olan sayiyi verecektir.
 *
 * Created by Mert on 9.4.2015.
 */
public class DuplicateNumbers {

    /**
     * Problem #1
     * 1-100 sayilarinin oldugu arrayde sadece bir tane
     * duplicate sayi nasil bulunur.
     */
    public static int getDuplicateNumber(Integer[] array){
        Set<Integer> intSet = new HashSet<Integer>();
        Collections.addAll(intSet,array);
        int arraySum = 0;
        int setSum = 0;
        //calculate array sum
        for(int i = 0; i < array.length; i++ ){
            arraySum += array[i];
        }
        //calculate setSum
        for(Integer integer : intSet){
            setSum += integer;
        }



        return arraySum - setSum;
    }


    /**
     * todo
     */
    public static Integer[] getMultipleDuplicates(Integer[] array){

        return null;
    }

    public static void main(String[] args) {
        int arrayLength = 100;
        int duplicateNumber = 78;
        Integer[] intArray = new Integer[arrayLength];
        for (int i = 1; i <= arrayLength; i++){
            if(i != duplicateNumber){
                intArray[i-1] = i;
            }else{
                intArray[i-1] = i;
                intArray[i] = i;
                i++;
            }
        }

        System.out.println(getDuplicateNumber(intArray));
    }
}
