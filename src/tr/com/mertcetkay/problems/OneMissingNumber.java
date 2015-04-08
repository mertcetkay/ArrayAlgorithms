package tr.com.mertcetkay.problems;

/**
 * 1-100 arasi sayilarin oldugu bir arrayde
 * eksik olan bir sayi nasil bulunur?
 *
 * Assumptions;
 * duplicate sayi yok,
 * sadece 1 tane eksik sayi var
 *
 * Created by Mert on 9.4.2015.
 */
public class OneMissingNumber {

    /**
     * Buradaki trick 1-100 arasi sayilarin toplaminin n(n+1)/2 oldugudur.
     */
    public static int findOneMissingNumber(int[] givenArray){
        int n = givenArray.length;
        int sum = n*(n+1)/2;
        int arraySum = 0;
        for (int i = 0; i < givenArray.length; i++){
            arraySum += givenArray[i];
        }
        return sum-arraySum;
    }

    public static void main(String[] args) {
        int arrayLength = 100;
        int missingNumber = 57;
        int[] intArray = new int[arrayLength];
        for (int i = 1; i <= arrayLength; i++){
            if(i != missingNumber){
                intArray[i-1] = i;
            }
        }

        System.out.println(findOneMissingNumber(intArray));
    }
}
