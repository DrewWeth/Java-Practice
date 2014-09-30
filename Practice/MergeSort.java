
/**
 * Write a description of class MergeSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergeSort
{
    private int[] arr;
    private int length;
    private int[] tempArr;

    public void sort(int[] arr)
    {
        this.arr = arr;
        this.length = arr.length;
        this.tempArr = new int[length];
        diverge(0, length - 1);
    }
    
    public static void main (String [] args)
    {
        int[] arr = {2,5,2,6,1,7,8,3940,271,79,3,7,21,67,2488,22,26,545,7};
        MergeSort ms = new MergeSort();
        ms.sort(arr);
        
        for(int f:arr){
            System.out.print(f + " ");
        }
        
    }
    
    private void diverge(int lowIndex, int highIndex){
        if (lowIndex < highIndex)
        {
            int middle = lowIndex + (highIndex - lowIndex) / 2; // This is super weird, but okay
            // Below step sorts the left side of the array
            diverge(lowIndex, middle);
            
            // Below step sorts the right side of the array
            diverge(middle + 1, highIndex);
            
            // Now merge both sides
            merge(lowIndex, middle, highIndex);
            
            
        }
        
    }
    
    private void merge(int lowIndex, int middle, int highIndex)
    {
        for (int i = lowIndex; i <= highIndex; i++)
        {
                System.arraycopy(arr, 0, tempArr, 0, arr.length);
        }
        
        int i = lowIndex;
        int j = middle + 1;
        int k = lowIndex;
        
        while (i <= middle && j <= highIndex){
            if (tempArr[i] <= tempArr[j]){
                arr[k] = tempArr[i];
                i++;
            }
            else
            {
                arr[k] = tempArr[j];
                j++;
                
            }
            k++;
        }
        
        while (i <= middle){
            arr[k] = tempArr[i];
            k++;
            i++;
            
        }
        
        
    }
}
