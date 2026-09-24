class Solution {
    public int smallestIndex(int[] nums) {
        int min=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum=sum+digit;
                n=n/10;
            }
            if(sum==i){
                found=true;
              if(i<min){
                min=i;
              }
            }
        }
        if(found){
        return min;
        }
        return -1;
    }
}