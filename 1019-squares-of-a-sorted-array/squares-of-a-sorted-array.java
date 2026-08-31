class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int i=0,j=n-1;
        for(int k=n-1;k>=0;k--){
            int isqr =nums[i]*nums[i];
            int jsqr=nums[j]*nums[j];
            if(isqr>jsqr){
                res[k]=isqr;
                i++;
            }
            else{
                res[k]=jsqr;
                j--;
            }
        }
        return res;
        }
        
    }