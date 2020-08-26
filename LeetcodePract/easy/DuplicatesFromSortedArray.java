package easy;

public class DuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2};
		System.out.println(removeDuplicates(arr));
	}
	public static int removeDuplicates(int[] nums) {
		if(nums.length==0)
			return 0;
		int i = 0;
		for(int j = 1;j<nums.length;j++){
			if(nums[j]!= nums[i]){
				i++;
				nums[i] = nums[j];
			}
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		return i+1;
		
/*		int i = nums.length>0 ? 1 : 0 ;
		for(int n : nums) {
			if(i==0 || n>nums[i-1]){
				System.out.println("Here");
				System.out.println(nums[i-1]+",");
				nums[i++]=n;
				System.out.println("nums[i++]: "+nums[i++]+","+n);
			}
		}
		return i;*/
	}
}
