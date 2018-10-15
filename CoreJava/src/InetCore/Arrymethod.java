package InetCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrymethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Arrymethod ar=new Arrymethod();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter value :");
			arr[i]=Integer.parseInt(br.readLine());	
		}
		ar.display(arr);
	    }
	    void display(int[] temp){
		for (int i : temp) {
			System.out.println(i);
		}
	}

}
