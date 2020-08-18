package SortingPrototype;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 9, -1, 10, 20};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));

        //为了充分理解，展示出冒泡排序的演变过程

        bubbleSort(arr);

        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));

        /*//第二趟排序，就是将第二大的数排在倒所第二位
        for(int j = 0; j < arr.length - 1 - 1; j++){
            if(arr[j] > arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("第二趟排序后的数组");
        System.out.println(Arrays.toString(arr));


        //第三趟排序，就是将第三大的数排在倒所第三位
        for(int j = 0; j < arr.length - 1 - 2; j++){
            if(arr[j] > arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("第三趟排序后的数组");
        System.out.println(Arrays.toString(arr));

        //第四趟排序，就是将第四大的数排在倒所第四位
        for(int j = 0; j < arr.length - 1 - 3; j++){
            if(arr[j] > arr[j + 1]){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println("第四趟排序后的数组");
        System.out.println(Arrays.toString(arr));*/

    }

    //将前面的冒泡排序算法，封装成一个方法
    public static void bubbleSort(int[] arr) {
        //冒泡排序的时间复杂度 O(n^2)
        int temp = 0;
        boolean flag = false; //标示变量，表示是否进行过交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.println("第" + (i + 1) + "趟排序后的数组");
//            System.out.println(Arrays.toString(arr));

            if (!flag) {//在一趟排序中，一次交换都没有发生过
                break;
            } else {
                flag = false;  //重置flag，进行下次判断
            }
        }
    }

}
