package InetCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayMethodReturn {

	public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the size of the array :");
      int size=Integer.parseInt(br.readLine());
      int arr[]=new int[size];
      for(int i=0;i<size;i++){
    	  System.out.println("Enter The value :");
    	  arr[i]=Integer.parseInt(br.readLine());
      } 
	}	
}
