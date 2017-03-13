package com.suren.algorithms.arrays;


class LowArray{
	private long[] a; 
	
	public LowArray(int size) 
	{ 
		a = new long[size]; 
	} 
	public void setElem(int index, long value) 
	{
		a[index] = value; 
	}

	public long getElem(int index) 
	{
		return a[index]; 
	}
}
public class LowArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LowArray arr; // reference
		arr = new LowArray(10); // create LowArray object
		int nElems = 0; // number of items in array
		int j; // loop variable
		arr.setElem(0, 77); // insert 10 items
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElems = 10; // now 10 items in array
		for(j=0; j<nElems; j++){ // display items
		System.out.print(arr.getElem(j) + "");
		System.out.println("");
		}
		
		//Search Functionality -------- Start
		int searchKey = 55; // 
		for(j=0; j<nElems; j++)
		{
			if(arr.getElem(j) == searchKey){
				break;
			}
		}
		System.out.println("j val---"+j);
		if(j == nElems){
			System.out.println(searchKey + " Not Found");
		}else{
			System.out.println(searchKey + " Found");
			}
		
		//Search Functionality -------- End
		
		
		//Delete Functionality --------- Start
		int toBeDeleted = 88;
		boolean found = false;
		for(j=0;j<nElems;j++){
			
			if(arr.getElem(j) == toBeDeleted){
				found =true;
				break;
			}
		}
		if(found){
		System.out.println("j-->"+j);
		for(int k=j;k<nElems -1;k++)
		{
		arr.setElem(k,arr.getElem(k+1));
		}
		nElems --;
		}
		//Delete Functionality --------- End
		
		
		for(j=0; j<nElems; j++){ // display items
			System.out.print(arr.getElem(j) + "");
			System.out.println("");
			}
	}

}
