/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Verly
 */
public class Driver {
    
    public static void main(String[] args) {
        int[] A = {4,12,23,9,21,1,35,2,24,56}; 
        QuickSort qs = new QuickSort();
        
        qs.quickSortDC(A, 0, (A.length-1));
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
}
