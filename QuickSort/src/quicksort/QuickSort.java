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
public class QuickSort {
    
    public int partition(int[] arr, int left, int right){  
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right)/2]; 
        while (i <= j) {
            while (arr[i] < pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i <= j) {
                tmp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = tmp;
                i++; 
                j--;
            }
        }
        return i;
    } 
   
    void quickSortDC(int[] arr, int i, int j) { 
        if (i<j){
            int index = partition(arr, i, j);
            quickSortDC(arr, i, index-1); 
            quickSortDC(arr, index, j);
        }
    }    
}
