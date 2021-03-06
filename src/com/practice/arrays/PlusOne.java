package com.practice.arrays;

import java.math.BigInteger;

/*
 * Plus One
  Go to Discuss
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class PlusOne {

	public static void main(String[] args) {
		PlusOne plusOne = new PlusOne();
		int[] nums = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
		int[] result = plusOne.plusOne(nums);
		for(int i=0; i<result.length; i++) {
			System.out.println("Result: "+result[i]);
		}
	}
	//added comments
	 public int[] plusOne(int[] digits) {
		 StringBuilder str = new StringBuilder();
		 for(int i=0; i<digits.length; i++) {
			 str.append(String.valueOf(digits[i]));
		 }
		 BigInteger sumOfDigits = new BigInteger(str.toString());
		 //BigInteger one = new BigInteger("1");
		 sumOfDigits = sumOfDigits.add(BigInteger.valueOf(1));
		 System.out.println(sumOfDigits.toString());
		 int count = 0;
		 BigInteger n = sumOfDigits;
		 while (!n.equals(BigInteger.valueOf(0))){
		     n = n.divide(BigInteger.valueOf(10));
		     count++;
		 }
		 int output[] = new int[count];
		 if(count!=0){
			   n = sumOfDigits;
			   while (!n.equals(BigInteger.valueOf(0))){
			       output[--count] = n.mod(BigInteger.valueOf(10)).intValue();
			       n = n.divide(BigInteger.valueOf(10));
			       //count--;
			   }
		}
		return output;
	 }

}
