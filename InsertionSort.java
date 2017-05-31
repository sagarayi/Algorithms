/**
 * Created by sagarayi on 29/05/17.
 */
public class InsertionSort {
    public static  void main(String []args)
    {
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(new int[]{5, 2, 4, 6 , 1,3});
    }
    public void insertionSort(int arr[])
    {
        int key ,j;
        for(int i = 1;i< arr.length; i++)
        {
             key = arr[i];
             j= i-1;
            while(j>=0 &&  arr[j] > key)
            {
                arr[j+1] = arr[j];

                j = j-1;

            }
            arr[j+1] = key;

        }
        for(int i = 0;i<arr.length ; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
