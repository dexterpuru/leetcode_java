class Solution {
    public boolean canJump(int[] nums) {
 	 if(nums[0]==0){
            if(nums.length == 1)
                return true;
            else
                return false;
        }
	
	for(int i=0; i< nums.length-1; i++){
            if(nums[i] == 0){
                int x= 2;boolean flag=true;
                
		for(int j=i-1; j>=0; j--){

                    if(nums[j] < x)
                    { flag=false;}
                    else
                    { flag=true;break;}

                    x+=1;
                }
                
                if(flag == false)
                    return false;
            }
        }
        return true;
	      
    }
}

