import java.util.Random;
import java.util.Arrays;

class Main
{
    public static void main(String args[])
    {
        int[] numArray = {15,6,13,19,72,35,66,27,49,50,20,100,64,65,35};
        /*
        Random rand = new Random();
        int[] numArray = new int[15];
        for (int i = 0; i < 15; ++i)
        {
            int x = rand.nextInt(101);
            numArray[i] = x;
            System.out.print(x + " ");
        }
        System.out.print("\n");
        */

        int[] bubbleSortArray = Arrays.copyOf(numArray, numArray.length);
        int[] mergeSortArray = Arrays.copyOf(numArray, numArray.length);

        BubbleSort(bubbleSortArray);
        MergeSort(mergeSortArray);
        System.out.println("Bubble Sorted Array : " + Arrays.toString(bubbleSortArray));
        int stepsForMerge = mergeSortArray.length * ((int) Math.log(mergeSortArray.length));
        if (mergeSortArray.length > 0)
        {
            System.out.println("Number of steps required : " + stepsForMerge);
        }
        else
        {
            System.out.println("Number of steps required : 0");
        }
        System.out.println("Merge Sorted Array : " + Arrays.toString(mergeSortArray));
        



    }

    public static int[] BubbleSort(int[] array)
    {
        int[] sortedArray = new int[array.length];
        int stepCounter = 0; 
        for (int i = 0; i < array.length / 2; ++i)
        {
            stepCounter++;
            for (int x = 0; x < array.length - 1; ++x)
            {
                stepCounter++;
                for (int a = x; a < array.length - 1 - x; ++a)
                {
                    int temp = 0;
                    if (array[x + a] > array[x + 1 + a])
                    {
                       temp = array[x + a + 1];
                        array[x + 1 + a] = array[x + a];
                       array[x + a] = temp;
                       stepCounter++;
                    }
                }
            }
        }
        System.out.println("Amount of Steps needed : " + stepCounter);
        return array;
    }

    static int counter = 0;

    public static int[] MergeSort(int[] array)
    {
        Arrays.sort(array);
        return array;
    }
}