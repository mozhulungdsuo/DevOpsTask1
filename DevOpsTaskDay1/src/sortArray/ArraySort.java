package sortArray;

import java.util.Arrays; 
public class ArraySort {
public static void main(String[] args){   
    
    int[] array1 = {1,2,3,8};
            
    String[] array2 = {"a","e","d"};        
    System.out.println("Original numeric array :"+Arrays.toString(array1));
    Arrays.sort(array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
    
    System.out.println("Original string array : "+Arrays.toString(array2));
    Arrays.sort(array2);
    System.out.println("Sorted string array : "+Arrays.toString(array2));
    }
}
