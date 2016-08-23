/** 
 * @projectName:Sort 
 * @fileName:SortEntity.java 
 * @packageName:club.younge.sort 
 * @date:2016年8月23日下午1:54:19 
 * @copyright (c) 2016, heqy@finansir.nt All Rights Reserved. 
 * 
 */  
  
package club.younge.sort;

import java.util.Random;

/** 
 * @className:SortEntity 
 * @function: 排序实体类抽离数组和数组长度  
 * @reason:   TODO ADD REASON. 
 * @date:     2016年8月23日 下午1:54:19
 * @author   Younge 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class SortEntity {
	private int[] data;
	private int len;
	public SortEntity(int[] data){
		this.data = data;
		this.len = data.length;
		this.generateRandomData();
	}
	public int[] getData() {
		return data;
	}
	public void setData(int[] data) {
		this.data = data;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	
	public final void generateRandomData(){
		Random random = new Random(20l);
		for (int i = 0; i < len; i++) {
			data[i] = Math.abs(random.nextInt()%20);
			System.out.print(" "+ data[i]);
		}
	}
	
	public  final void printData(){
		for (int i = 0; i < len; i++) {
			System.out.print(" "+ data[i]);
		}
	}
	
	public void println(String message){
		System.out.println(message);
	}
	
	public final int[] directChooseBigSort(){
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
	
	public final int[] directChooseSmallSort(int[] data){
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
	
	public final int[] bubbleSmallSort(int[] data){
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
	
	public  final int[] bubbleBigSort(int[] data){
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
	
	//非递归查找插入点
	public final int[] secondDivide() {
		int left, right, middle, j;
		int comp;
		for (int i = 1; i < len; i++) {
			left = 0;
			right = i - 1;
			comp = data[i];// 比较点
			// 二分法寻找left插入点
			while (right >= left) {
				middle = (left + right) / 2;
				if (comp >= data[middle]) {
					left = middle + 1;
				} else {
					right = middle - 1;
				}
			}
			// left插入点（含）至比较点前一元素整体后移一个单位
			for (j = i - 1; j >= left; j--) {
				data[j + 1] = data[j];
			}
			// left插入点插入比较点元素
			data[left] = comp;
		}
		return data;

	}
	
	//递归查找插入点
	public int[] secondDivideTraverse() {
		int left, right, j;
		int comp;
		for (int i = 1; i < len; i++) {
			left = 0;
			right = i - 1;
			comp = data[i];// 比较点
			// 二分法寻找left插入点
			left = this.findLeft(left, right, data, comp);
			// left插入点（含）至比较点前一元素整体后移一个单位
			for (j = i - 1; j >= left; j--) {
				data[j + 1] = data[j];
			}
			// left插入点插入比较点元素
			data[left] = comp;
		}
		return data;
	}

	public int findLeft(int left, int right, int[] data, int comp) {
		int m = (left + right) / 2;
		if (left > right) {
			return left;
		} else {
			if (comp >= data[m]) {
				return findLeft(m + 1, right, data, comp);
			} else {
				return findLeft(left, m - 1, data, comp);
			}
		}
	}
	
}

