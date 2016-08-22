/** 
 * @projectName:Sort 
 * @fileName:SortUtil.java 
 * @packageName:club.younge.sort 
 * @date:2016年8月22日下午11:56:41 
 * @copyright (c) 2016, heqy@finansir.nt All Rights Reserved. 
 * 
 */  
  
package club.younge.sort;

import java.util.Random;

/** 
 * @className:SortUtil 
 * @function: 排序工具类  
 * @reason:   包含排序算法，生成随机数组，打印结果数组等 
 * @date:     2016年8月22日 下午11:56:41
 * @author   Younge 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class SortUtil {
	
	public static final void generateRandomData(int[] data){
		Random random = new Random(20l);
		int len = data.length;
		for (int i = 0; i < len; i++) {
			data[i] = Math.abs(random.nextInt()%20);
			System.out.print(" "+ data[i]);
		}
	}
	
	public static final void printData(int[] data){
		int len = data.length;
		for (int i = 0; i < len; i++) {
			System.out.print(" "+ data[i]);
		}
	}
	
	public static final int[] directChooseBigSort(int[] data){
		int len = data.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				//直接选择排序， 降序
				if(data[i] < data[j]){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		return data;
	}
	
	public static final int[] directChooseSmallSort(int[] data){
		int len = data.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				//直接选择排序， 升序
				if(data[i] > data[j]){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
			
		}
		return data;
	}
	
	public static final int[] bubbleSmallSort(int[] data){
		int len = data.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i -1; j++) {
				//最大的往下沉，一个i循环排好一个数， 一次排序轻的在上面
				if(data[j] > data[j + 1]){
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}
	
	public static final int[] bubbleBigSort(int[] data){
		int len = data.length;
		int temp;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - i -1; j++) {
				//最小的往下沉，一个i循环排好一个数， 一次排序重的在上面，反重力
				if(data[j] < data[j + 1]){
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}
	
	
}

