package com.demo.test;

import com.demo.service.ArrayService;

public class TestArray {
	
	public static void main(String[] args) {
		int[]arr= {2,10,30,7,70,50,40,80};
		int max=ArrayService.findMax(arr);
		System.out.println("maxmimum"+max);
		
		int max2=ArrayService.findSecondMax(arr);
		System.out.println("2nd max"+max2);
		
		int min=ArrayService.findMin(arr);
		System.out.println("minimum:"+min);
		
		int sum =ArrayService.findPrimeSum(arr);
		System.out.println("Addition:"+sum);
		
		int val=7;
		int pos=ArrayService.SequentialSearch(arr,val);
		if(pos!=-1)
		{
			System.out.println("Number found at position"+pos);
		}else
		{
			System.out.println("Not found...");
		}
		
	}
}