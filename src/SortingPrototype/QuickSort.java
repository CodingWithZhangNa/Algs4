package SortingPrototype;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70};

        quickSort(arr, 0, arr.length - 1);
        System.out.println("arr=" + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        int l = left;
        int r = right;
        int pivot = arr[(left + right) / 2];  //中轴值
        int temp = 0; //临时变量，作为交换时使用

        //while循环的目的是让比pivot 值小放到左边，比pivot 值大放到右边
        while ( l < r ){
            //在pivot的左边一直找，找到大于等于pivot值，才能退出
            while ( arr[l] < pivot){
                l += 1;
            }
            //在pivot的右边一直找，找到小于等于pivot值，才能退出
            while ( arr[r] > pivot ){
                r -= 1;
            }
            //如果l >= r；说明pivot左右的值，已经全部是左边小于等于pivot值，右边全部大于等于pivot值
            if( l >= r){
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现这个arr[l] == pivot,r--
            if(arr[l] == pivot){
                r--;
            }
            //如果交换完后，发现这个arr[r] == pivot,l++
            if(arr[r] == pivot){
                l++;
            }

        }

        //如果 l==r,必须l++，r--，否则会出现栈溢出
        if(l == r){
            l++;
            r--;
        }

        //向左递归
        if(left < r){
            quickSort(arr, left, r);
        }
        //向右递归
        if(right > l){
            quickSort(arr, l, right);
        }

    }

}
