class Solution {
    public int[] countBits(int num) 
    {
        int arr[]=new int[num+1];
        arr[0]=0;
		//ct holds count for the bits
        int ct=0;
        for(int i=0;i<=num;i++)
        {  
            int n=i;
            while(n!=0)
            {
                n=n&(n-1);//n&(n-1) is a special formula which directly return the next set bit in the expression
                ct=ct+1;
            }
            arr[i]=ct;//storing the count in array
            ct=0;//initializing it to zero
        }
        return arr;
    }
}