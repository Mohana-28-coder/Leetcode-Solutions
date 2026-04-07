class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck=new Stack<>();
        int n1,n2;
        for(String ch:tokens){
            if(ch.equals("+")){
                n2=stck.pop();
                n1=stck.pop();
                stck.push(n1+n2);
            }
            else if(ch.equals("-")){
                 n2=stck.pop();
                n1=stck.pop();
                stck.push(n1-n2);
            }
            else if(ch.equals("*")){
                 n2=stck.pop();
                n1=stck.pop();
                stck.push(n1*n2);
            }
            else if(ch.equals("/")){
                 n2=stck.pop();
                n1=stck.pop();
                stck.push(n1/n2);
            }
            else{
                stck.push(Integer.parseInt(ch));
            }
        }
        return stck.peek();
        
    }
}