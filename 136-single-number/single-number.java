class Solution {
    public int singleNumber(int[] nums) {
       
        int ans1=0;
        for(int i=0;i<nums.length;i++){
            int ans=nums[i];
             int count=0;
            for(int j=0;j<nums.length;j++){
                if(ans==nums[j]){
                    count++;  
                }
            }
            if(count==1){
              ans1=nums[i];
            }
        }

            return ans1;

        
    }
}