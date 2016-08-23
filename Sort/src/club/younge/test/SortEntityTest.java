/** 
 * @projectName:Sort 
 * @fileName:SortEntityTest.java 
 * @packageName:club.younge.test 
 * @date:2016��8��23������2:01:43 
 * @copyright (c) 2016, heqy@finansir.nt All Rights Reserved. 
 * 
 */  
  
package club.younge.test;

import club.younge.sort.SortEntity;

/** 
 * @className:SortEntityTest 
 * @function: ����ʵ������� 
 * @reason:    
 * @date:     2016��8��23�� ����2:01:43
 * @author   Younge 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class SortEntityTest {
	public static void main(String[] args) {
		int[] data = new int[20];
		System.out.println("Before second divide sort(traverse):");
		SortEntity entity = new SortEntity(data);
		entity.println("\nAfter second divide sort(traverse):");
		entity.secondDivideTraverse();
		entity.printData();
		
		entity.println("\n\nBefore second divide sort(none traverse):");
		entity.generateRandomData();
		entity.println("\nAfter second divide sort(none traverse):");
		entity.secondDivide();
		entity.printData();
		
	}
}

