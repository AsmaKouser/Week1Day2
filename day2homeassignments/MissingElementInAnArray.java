package week1.day2homeassignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		
		    int[] arr1= {1,2,3,4,7,6,8};
		    
		    /*int[]arr2= {1,2,3,4,5,6,7,8};
		    int Length1=arr1.length;
			Arrays.sort(arr1);//1 2 3 4 6 7 8 
			int Length2=arr2.length;
			
			if(arr1==arr2)
				  
					{
				System.out.println(arr1);
				
			else {
				
				System.out.println(arr2);
				
			}
					}
				}
			
					
				}		
				
	*/
	
		    Arrays.sort(arr1);
		    //1,2,3,4,6,7,8;
		    
		    for(int i=0;i<arr1.length;i++) {
		    	if(arr1[i]!=(i+1))  //4
		    	{
		    		System.out.println((i+1));
		    		break;
		    		}
		    	}
	}
}
		
	


