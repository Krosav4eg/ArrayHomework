public class ArrayMethods {
    int size;

    int[] arr = new int[10];

    public void createArray()
    {
        for(int i=1;i<=10;i++)
            arr[i-1]=i*2-1;
    }

    public void printArray()
    {
        for(int i=0;i<10;i++)
        {
            if (i!=9) System.out.print(arr[i]+", ");
            else System.out.println(arr[i]);
        }
    }

    public int maxValue()
    {
        int max=arr[0];
        for(int i=1;i<10;i++)
            if(arr[i]>max) max=arr[i];
        return max;
    }

    public int averageValue()
    {
        int average = 0;
        for(int i=0;i<10;i++)
            average+=arr[i];
        average/=10;
        return average;
    }
}
