package SortingPrototype;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        //要求升序
        int arr[] = {4,6,8,5,9};
        heapSort(arr);
    }

    public static void heapSort(int[] arr){
        int temp = 0;
        System.out.println("堆排序！！");

        //分布完成
//        adjustHeap(arr, 1, arr.length);
//        System.out.println("第一次" + Arrays.toString(arr));
//
//        adjustHeap(arr, 0, arr.length);
//        System.out.println("第二次" + Arrays.toString(arr));

        //完成最终代码
        //将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆
        for(int i = arr.length / 2 - 1; i >= 0; i--){
            adjustHeap(arr, i, arr.length);
        }

        /*
        将堆顶元素与末尾元素交换，将最大元素沉到数组末端
        重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换，直至整个序列有序
         */
        for(int j = arr.length - 1; j > 0; j --){
            //交换
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
        System.out.println("数组=" + Arrays.toString(arr));
    }

    //将一个数组（二叉树），调整成一个大顶堆
    /*
    功能：完成将以 i 对应的非叶子结点的树调整成大顶堆
    i：非叶子结点在数组中索引
    length：对多少个元素继续调整，length是在逐渐减少
    */
    public static void adjustHeap(int[] arr, int i, int length){

        int temp = arr[i];
        //开始调整
        //k = i * 2 + 1,k是i结点的左子结点
        for(int k = i * 2 + 1; k < length; k = k * 2 + 1){

            if(k+1 < length && arr[k] < arr[k + 1]){
                //说明左子结点值小于右子结点值
                k++;  //k 指向右子结点
            }

            if(arr[k] > temp){   //如果子结点大于父结点
                arr[i] = arr[k];
                i = k;  //i指向k，继续循环比较
            }else{
                break;
            }

        }
        //for循环结束，我们已经将以i为父结点的树的最大值，放在了最顶（局部）
        arr[i] = temp;  //将temp值放到调整后的位置
    }


}
