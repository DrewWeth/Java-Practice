import java.util.*;
import java.io.*;

/**
 * Write a description of class Heap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heap
{
    
    public Heap()
    {
    
    }
    
    

    public void p(int value){
        
        System.out.println(value);
    }
    
    
    private void UpHeap(List<Integer> arr, int child){
        int parent = child / 2;
        if (arr.get(parent) > arr.get(child)){
            Collections.swap(arr, parent, child);
            UpHeap(arr, parent);
        }
    }
    
    
    
    private void DownHeap(List<Integer> arr, int parent){
        int left_child = parent * 2;
        int size = arr.size() - 1;
        boolean left = false, right = false;
        
        if (left_child <= size)
            left = true;
        if (left_child + 1 <= size)
            right = true;
        
        if ( left && right )
        {
            if(arr.get(left_child) <= arr.get(left_child+1))
            {
                if (arr.get(parent) > arr.get(left_child))
                {
                    Collections.swap(arr, parent, left_child);
                    DownHeap(arr, left_child);
                }
            }
            else {
                if (arr.get(parent) > arr.get(left_child+1)){
                    Collections.swap(arr, parent, left_child+1);
                    DownHeap(arr, left_child+1);
                }
            }
        }
        else if (left)
        {
            if(arr.get(parent) > arr.get(left_child))
            {
                Collections.swap(arr, parent, left_child);
                DownHeap(arr, left_child);
            }
        }
        else if (right)
        {
            if(arr.get(parent) <= arr.get(left_child+1))
            {
                Collections.swap(arr, parent, left_child+1);
                DownHeap(arr, left_child+1);
            }
        }
         
            
            
        
    }
    
    private int PopHeap(List<Integer> arr)
    {
        if(arr.size() == 1)
        {
            return -9999;
        }
        else
        {
            int value = arr.get(1);
            arr.set(1, arr.get(arr.size()-1));
            arr.remove(arr.size()-1);
            
            DownHeap(arr, 1);
            return value;
        }
        
    }
    
    public static void main (String [] args)
    {
        
        
        ArrayList<Integer> arr = new ArrayList<Integer>();    
        arr.add(-9999); // Offset the array by 1 because the heap cant start at zero.
        
        Scanner scan = new Scanner(System.in);
            
        while(true)
        {
            Heap root = new Heap();
            
            System.out.println("Enter something to add to heap (or -1 to pop off from heap): ");
            int input = scan.nextInt();
            
            if (input == -1)
            {
                int check = root.PopHeap(arr);
                root.p(check);

            }
            else
            {
                    
            
                arr.add(input);
                root.UpHeap(arr, arr.size() -1 );
            }
            System.out.println("Printing heap: ");
            for(int i: arr)
            {
                System.out.print(i + ", ");
            }
            System.out.print("\n");
        }
        
    }
    
    
}


