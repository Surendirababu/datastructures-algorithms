package com.suren.algorithms.arrays;


class OrderedArray{
	
	private static int arr[];
	private int lowIndex;
	private int highIndex;
	private int tempElement;
	private static int stepCount = 0;
	boolean flag = true;
	public OrderedArray(int n)
	{
		arr = new int[n];
	}
	
	public void setNum(int i,int n){
		arr[i] = n;
		
	}
	

	public int search(int searchKey)
	{
		highIndex = arr.length -1;
		while(flag){
			 
			if(tempElement == searchKey){
				flag = false;
				return (lowIndex+ highIndex)/2;
			}
			
			tempElement =findTempElement(lowIndex, highIndex);
			if((highIndex-1 == lowIndex) && (searchKey != tempElement)){ //Not Found Condition
				return -1;
			}
			if(searchKey < tempElement){
				lowIndex = lowIndex;
				highIndex = (lowIndex+ highIndex)/2;
			}else if(searchKey > tempElement){
				lowIndex = (lowIndex+ highIndex)/2;
				highIndex = highIndex;
			}	
		}
		return searchKey;
		
	}
	
	int findTempElement(int lowIndex,int highIndex){
		stepCount++;
		return arr[(lowIndex+ highIndex)/2];
	}
}
public class OrderedArrayMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderedArray arr = new OrderedArray(10);
		arr.setNum(0, 10);
		arr.setNum(1, 20);
		arr.setNum(2, 30);
		arr.setNum(3, 40);
		arr.setNum(4, 50);
		arr.setNum(5, 60);
		arr.setNum(6, 70);
		arr.setNum(7, 80);
		arr.setNum(8, 90);
		arr.setNum(9, 100);
		
	//Search in the ordered array using binary search
		int index = arr.search(111);
		System.out.println("30 is found in index "+index);
		
	}

}
