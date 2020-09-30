class Solution {
    public boolean isPowerOfTwo(int n)
    { int ct=0;
     if(n>0)
     {
        if((n&(n-1))==0)return true;//If by doing n&(n-1) ad storing it in n it gives zero,then only one 
		                            //set bit is present,hence its a power of two
         else
             return false;
     }
     else
         return false;
    }
}