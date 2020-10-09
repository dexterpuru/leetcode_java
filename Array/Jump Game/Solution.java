class Solution {
    public boolean canJump(int[] nums) {
 	 if(nums[0]==0){		//checking the first value for zero
            if(nums.length == 1)
                return true;
            else
                return false;
        }
	
	for(int i=0; i< nums.length-1; i++){
            if(nums[i] == 0){		//checking for other zero values
                int x= 2;boolean flag=true;
                
		for(int j=i-1; j>=0; j--){
					//encountered a zero value 
					//now going back and checking if it is bypassable
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

