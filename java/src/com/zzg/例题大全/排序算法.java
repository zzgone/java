package com.zzg.例题大全;


public class 排序算法 {

	
	/**
	 * 测试结果
------------------------------------------
测试数据10000


冒泡排序：120ms


选择排序：32ms


插入排序：20ms


快速排序：7ms


------------------------------------------
测试数据100000


冒泡排序：13098ms


选择排序：2334ms


插入排序：1264ms


快速排序：23ms
	 * */
	
	
	
	
	
	
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		int[] arr = {8,3,5,6,4,9,7};
		排序算法.insertSort(arr);
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		
		System.out.println(System.currentTimeMillis()-a);
	}
	
	/**
	 * 冒泡排序
	 * 优点：简单  缺点：冒泡排序每比较一个下标数都需要把该下标位后面的所有数组数据比较一遍,速度最慢
	 * 
	 * 1.比较相邻的元素。如果第一个比第二个大，就交换他们两个
	 * 2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数
	 * 3.针对所有的元素重复以上的步骤，除了最后一个。
	 * 4.持续每次对越来越少的元素重复上面的步骤，知道没有任何一对数字需要比较
	 * 
	 * if中
	 * 升序排列(>) 数字由小到大
	 * 降序排列(<) 数字又大到小
	 * 
	 * 解释：为何arr.length - 1
	 * 第一次循环，0位获取最小的数字。
	 * 第二次循环，1位获取最小的数字。
	 * ....
	 * 第n次循环，n位获取最小的数字。
	 * 最后一次，由于前面已经都获取该位最小的数，所以最后一位肯定是最大的数字,符合第2.3点所述
	 * 
	 * 解释：为何int j = i + 1;
	 * 假设循环已经进行了多次，当需要取第3位最小数字时
	 * 由于前面几次循环已经获取了该位最小数，那么，就不需要再次去比较整个数组的前几位数，这是多余的。
	 * 所以 + 1是为了表示，永远比较该位的后一位。
	 * 
	 * */
	public static void bubbleSort(int[] arr){
		int temp;// 记录中间值
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {// 外循环i=0时，内循环j+1;下标+1，获取后一位下标的值
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//冒泡排序稍微优化
	public static void bubbleSortOptimize(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					// 这种方式直接操作内存
					arr[i] = arr[i] ^ arr[j];
					arr[j] = arr[j] ^ arr[i];
					arr[i] = arr[i] ^ arr[j];
				}
			}
		}
	}
	
	
	/**
	 * 快速排序
	 * 比冒泡排序速度要快.. 
	 * 降序没玩出来~~
	 * 优点：效率高 
	 * 
	 * 从数列中挑出一个元素，称为“基准”
	 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值的摆在基准的后面（相同的数可以房到任何一边）。
	 * 在这个分割之后，该基准是它的最后未知，这个称为分割操作。
	 * 递归的把小于基准值元素的子数列和大于基准值元素的子数列排序。
	 * 
	 * 如何理解快速排序
	 * {8,3,5,6,4,9,7};
	 * 第一次循环，以下标0为基数，把所有比8小的数放在8前面
	 * [7, 3, 5, 6, 4, 9, 8] 
	 * [4, 3, 5, 6, 7, 9, 8]
	 * [3, 4, 5, 6, 7, 9, 8]
	 * ...
	 * 第n次循环
	 * 
	 * @param 
	 * 	arr = array;
	 * 	start = 0;
	 * 	end = arr.lenght - 1;
	 * 
	 * */
	public static void quickSort(int[] arr,int start,int end){
		if(start < end){
			int base = arr[start];// 选定的基准值（第一个数值做为基准值）
			int temp;// 记录临时中间值
			int i = start,j = end;
			do {
				while(arr[i] < base && i < end){//i < end ,只计算指定的下标数，end表示指定下标数
					// 递增式判断下标值是否小于基数，这里选比基数小的数，放在前面。如果arr[i]下标小于base基数，i++,判断下一位arr[i]下标是否小于基数
					i++;
				}
				while(arr[j] > base && j > start){
					// 递减式判断下标值是否大于基数，如果大于基数，则放在后面，暂不计算，待下次循环再次计算
					j--;
				}
				if(i <= j){
					// 互换下标值，小的放前面，大的放后面。
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					// 双向判断
					i++;
					j--;
				}
			} while (i <= j);
			if(start < j){
				// 假设数组长度10，前下标i已经读到5，后下标读到4，这时再去比较数据已经失去意义。则重新调用次方法，设置重新读取数组 从前下标0开始，后下标4结束。 因为后面的5-10下标已经确认是比上一次循环的基数大的数
				quickSort(arr, start, j);
			}
			if(end > i){
				// 从右到左，到最后一个比基数大的下标值停止，从第一个比基数大的下标开始.
				quickSort(arr, i, end);
			}
		}
	}
	
	//快速排序的另一种实现方式
	public static int partition(int a[], int low, int height) {
		int key = a[low];
		while (low < height) {
			while (low < height && a[height] >= key){
				height--;
			}
			
			a[low] = a[height];
			
			while (low < height && a[low] <= key){
				low++;
			}
			
			a[height] = a[low];
		}
		a[low] = key;
		return low;
	}
	
	//快速排序的另一种实现方式
	public static void quickSort2(int a[], int low, int height) {
		if (low < height) {
			int result = partition(a, low, height);
			quickSort(a, low, result - 1);
			quickSort(a, result + 1, height);
		}
	}
	
	
	/**
	 * 选择排序
	 * 选择排序是一种简单直观的排序方法，每次寻找序列中的最小值，然后放在最末尾的位置
	 * 
	 * 在未排序序列中找到最小元素，存放到排序序列的起始位置
	 * 再从剩余未排序元素中继续寻找最小元素，然后房到排序序列末尾
	 * 以此类推，直到所有元素均排序完毕。
	 * 
	 * 性能：
	 * 比冒泡排序要快 *号代表下一次循环不会再读这个下标
	 * {8,3,5,6,4,9,7}
	 * {3,8,5,6,4,9,7}
	 * {*,4,5,6,8,9,7}
	 * {*,*,5,6,8,9,7}
	 * {*,*,*,6,8,9,7}
	 * 
	 * 优点：操作小数据要比其他排序方式方便快捷
	 * 
	 * */
	public static void selectSrot(int[] arr){
		int temp;
		for (int i = 0; i < arr.length; i++) {
			int k = i;
			for (int j = arr.length - 1; j > i; j--) {
				if(arr[j] < arr[k]){
					k = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
		}
	}
	
	/**
	 * 插入排序
	 * 插入排序的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入
	 * 
	 * 从第一个元素开始，该元素可以认为已经被排序
	 * 取出下一个元素，在已经排序的元素序列中从后向前扫描
	 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
	 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的未知
	 * 将新元素插入到该位置中
	 * 重复步骤2
	 * 
	 * */
	public static void insertSort(int arr[]) {
		int len = arr.length;
		for (int i = 1; i < len; i++) {
			int temp = arr[i];// 待插入的值
			int index = i;// 待插入的位置
			while (index > 0 && arr[index - 1] > temp) {
				arr[index] = arr[index - 1];// 待插入的位置重新赋更大的值
				index--;// 位置往前移
			}
			arr[index] = temp;
		}
	}
}
