package practice.leetcode.array;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;


public class Prime{
	public static void main(String[] args){
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the number");
			//int number = sc.nextInt(); 
			
			int number = Integer.parseInt(reader.readLine());
			List<Integer> intList = new ArrayList<Integer>();
			for(int i = 2 ; i < number; i++) {
				boolean isprime = false;
				for(int j = 2; j < i; j++ ) {
					if(i%j == 0) {
						isprime = true;
					}
				}
				if(!isprime) {
					intList.add(i);
				}

			}
			System.out.println("Length Of the Array: "+intList.size());
			System.out.println(intList);
		} catch(IOException e) {
			e.printStackTrace();
		}

		
	}
}
