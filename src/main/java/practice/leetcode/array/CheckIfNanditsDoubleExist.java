package practice.leetcode.array;

public class CheckIfNanditsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for(int i =0; i < arr.length; i++ ){
        	for(int j=0; j < arr.length; j++ ){
        		if(i == j) continue;
        		if(arr[i] == arr[j]/2) return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		CheckIfNanditsDoubleExist checkif= new CheckIfNanditsDoubleExist();
		int arr[] = {0,0};
    	boolean result = checkif.checkIfExist(arr);
    	System.out.println(result);
	}

}


