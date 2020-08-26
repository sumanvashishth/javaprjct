package easy;

public class TwoSum {
	    public static int[] twoSum(int[] arr, int target) {
	        int arr1[] = new int [2];
	        for(int i=0;i<arr.length-1;i++){
	            for(int j=i+1;j < arr.length;j++){
	                if(arr[i]+arr[j]==target){
	                	System.out.println("Values are: "+arr[i]+" and "+arr[j]+" i, j: "+ i +","+j);
	                    arr1[0] = i;
	                    arr1[1] = j;
	                    break;
	                }
	            }    
	        }
/*	        for(int i=0;i<arr1.length;i++){
	        	System.out.print(arr1[i]+",");
	        }*/
			return arr1;
	        
	    }
	    public static void main (String args[]){
	        int[] arr = {2,7,11,15};
	        int target = 17;
	        System.out.println("Sum of index: "+twoSum(arr , target)[0]+twoSum(arr , target)[1]);
	          
	    }
	    
	}
