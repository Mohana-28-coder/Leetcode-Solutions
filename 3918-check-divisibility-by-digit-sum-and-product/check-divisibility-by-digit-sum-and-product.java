class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int temp1=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        int pro=1;
        while(temp1>0){
            int digit=temp1%10;
            pro=pro*digit;
            temp1=temp1/10;
        }
        int ans=sum+pro;
        if(temp%ans==0){
            return true;
        }
        return false;
    }
}