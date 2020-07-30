package SortingPrototype;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {101,34,119,1};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));

        selectSort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    public static void selectSort(int[] arr){

        //选择排序时间复杂度是O(n^2)
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            //将最小值，放在arr[0],即交换
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

//            System.out.println("第"+(i+1)+"轮后~~");
//            System.out.println(Arrays.toString(arr));
        }
        /*//第二轮
        int minIndex = 1;
        int min = arr[1];
        for(int j = 1 + 1; j < arr.length; j++){
            if(min > arr[j]){
                min = arr[j];
                minIndex = j;
            }
        }

        //将最小值，放在arr[0],即交换
        if(minIndex != 1) {
            arr[minIndex] = arr[1];
            arr[1] = min;
        }

        System.out.println("第二轮后~~");
        System.out.println(Arrays.toString(arr));

        //第三轮
        int minIndex = 2;
        int min = arr[2];
        for(int j = 2 + 1; j < arr.length; j++){
            if(min > arr[j]){
                min = arr[j];
                minIndex = j;
            }
        }

        //将最小值，放在arr[0],即交换
        if(minIndex != 2) {
            arr[minIndex] = arr[1];
            arr[2] = min;
        }

        System.out.println("第三轮后~~");
        System.out.println(Arrays.toString(arr));*/

    }


}
