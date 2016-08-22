/** 
 * @projectName:Sort 
 * @fileName:SortTest.java 
 * @packageName:club.younge.test 
 * @date:2016年8月22日下午11:56:50 
 * @copyright (c) 2016, heqy@finansir.nt All Rights Reserved. 
 * 
 */  
  
package club.younge.test;

import club.younge.sort.SortUtil;

/** 
 * @className:SortTest 
 * @function: 排序测试  
 * @reason:   
 * @date:     2016年8月22日 下午11:56:50
 * @author   Younge 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class SortTest {

	public static void main(String[] args) {
		int[] data = new int[20];
		
		System.out.print("Switch big sort:");
		System.out.print("\nBefore sort:");
		SortUtil.generateRandomData(data);
		
		data = SortUtil.directChooseBigSort(data);
		System.out.print("\nAfter sort:");
		SortUtil.printData(data);
		
		System.out.print("\n\nSwitch small sort:");
		System.out.print("\nBefore sort:");
		SortUtil.generateRandomData(data);
		data = SortUtil.directChooseSmallSort(data);
		System.out.print("\nAfter sort:");
		SortUtil.printData(data);
		
		System.out.print("\n\nBubble small sort:");
		System.out.print("\nBefore sort:");
		SortUtil.generateRandomData(data);
		data = SortUtil.directChooseSmallSort(data);
		System.out.print("\nAfter sort:");
		SortUtil.printData(data);
		
		System.out.print("\n\nBubble big sort:");
		System.out.print("\nBefore sort:");
		SortUtil.generateRandomData(data);
		data = SortUtil.directChooseSmallSort(data);
		System.out.print("\nAfter sort:");
		SortUtil.printData(data);
	}
}

