class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        int m=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int ans=nums[i];
            for(int j=0;j<nums.length;j++){
                if(ans==nums[j]){
                    count++;
                }
            }
         
            if(count==1){
                arr[m]=nums[i];
                m++;
            }
     
            }
        
        return arr;
    }
}