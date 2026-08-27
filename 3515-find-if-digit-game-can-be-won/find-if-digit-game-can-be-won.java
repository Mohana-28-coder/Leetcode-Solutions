class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigit=0;
        int doubledigit=0;
        int total=0;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                singledigit=singledigit+nums[i];
            }
            else if(nums[i]<=99){
                doubledigit=doubledigit+nums[i];
            }
        }
        total=singledigit+doubledigit;
        if(singledigit>total-singledigit || doubledigit>total-doubledigit){
             found=true;
        }
        return found;
    }
}