package practice.leetcode.array;

import java.io.FileWriter;
import java.io.IOException;
public class RandomSetOfInteger{
	public static void main(String[] args) throws IOException{
 //		FileWriter fileWriter = new FileWriter("/Users/sankipalli/Documents/Java_Programs/samplefilename.txt");
 //    	fileWriter.write(String.format("  %5s %17s \n", "Value ", " Count"));
		int arr[] = new int[997940];
		int countArray[] = new int[20];
		int i=0,dataSetCount=0;
		while(dataSetCount < 997940){	 
			int random = (int)(Math.random()*20+1);
			if(random == 1 && countArray[0] < 83000){
 				arr[i++] = random;
				countArray[0]++;
				dataSetCount++;
			}else if(random == 2 && countArray[1] < 83000){
				arr[i++] = random;
				countArray[1]++;
				dataSetCount++;
			}else if(random == 3 && countArray[2] < 83000){
				arr[i++] = random;
				countArray[2]++;
				dataSetCount++;
			}else if(random == 4 && countArray[3] < 83000){
				arr[i++] = random;
				countArray[3]++;
				dataSetCount++;
			}else if(random == 5 && countArray[4] < 83000){
				arr[i++] = random;
				countArray[4]++;
				dataSetCount++;
			}else if(random == 6 && countArray[5] < 83000){
				arr[i++] = random;
				countArray[5]++;
				dataSetCount++;
			}else if(random == 7 && countArray[6] < 83000){
				arr[i++] = random;
				countArray[6]++;
				dataSetCount++;
			}else if(random == 8 && countArray[7] < 83000){
				arr[i++] = random;
				countArray[7]++;
				dataSetCount++;
				
			}else if(random == 9 && countArray[8] < 83000){
				arr[i++] = random;
				countArray[8]++;
				dataSetCount++;
				
			}else if(random == 10 && countArray[9] < 83000){
				arr[i++] = random;
				countArray[9]++;
				dataSetCount++;
			}else if(random == 11 && countArray[10] < 83000){
				arr[i++] = random;
				countArray[10]++;
				dataSetCount++;
			}else if(random == 12 && countArray[11] < 83000){
				arr[i++] = random;
				countArray[11]++;
				dataSetCount++;
			}else if(random == 13 && countArray[12] < 1000){
				arr[i++] = random;
				countArray[12]++;
				dataSetCount++;
			}else if(random == 14 && countArray[13] < 500){
				arr[i++] = random;
				countArray[13]++;
				dataSetCount++;
			}else if(random == 15 && countArray[14] < 250){
				arr[i++] = random;
				countArray[14]++;
				dataSetCount++;
			}else if(random == 16 && countArray[15] < 100){
				arr[i++] = random;
				countArray[15]++;
				dataSetCount++;
			}else if(random == 17 && countArray[16] < 50){
				arr[i++] = random;
				countArray[16]++;
				dataSetCount++;
			}else if(random == 18 && countArray[17] < 25){
				arr[i++] = random;
				countArray[17]++;
				dataSetCount++;
			}else if(random == 19 && countArray[18] < 10){
				arr[i++] = random;
				countArray[18]++;
				dataSetCount++;
			}else if(random == 20 && countArray[19] < 5){
				arr[i++] = random;
				countArray[19]++;
				dataSetCount++;
			}
		}
		System.out.printf(" %5s %16s \n", "Value ", " Count");
		for(int k= countArray.length-1; k >=0; k-- ){
			System.out.printf(" %5d %16d \n",k+1,countArray[k]);
//			fileWriter.write(String.format("%5d %20d \n", k+1, countArray[k]));
		}
//		fileWriter.close();
	}
}