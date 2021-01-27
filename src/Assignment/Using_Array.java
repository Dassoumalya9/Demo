package Assignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Using_Array {
	public int func(int arr[],int m) throws Exception {
		Logger logger = LogManager.getLogger(Using_Array.class);
		int a=0;
		if(arr.length<=0) 
			throw new IllegalArgumentException("Array length must be greater then 0");
		if(m==0)
			throw new IllegalArgumentException("Enter a specified sum more then 0");
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]+arr[j]==m) {
						logger.info(arr[i]+" "+arr[j]);
						a=1;
						break;
					}
				}
			}
		      for (int i = 0; i < arr.length - 2; i++) { 
		            for (int j = i + 1; j < arr.length - 1; j++) { 
		                for (int k = j + 1; k < arr.length; k++) { 
		                    if (arr[i] + arr[j] + arr[k] == m) { 
		                      logger.info(arr[i]+" "+arr[j]+" "+arr[k]);
		                    	a=1; 
		                    } 
		                } 
		            }
		      }  
		        			
			if(a==0) {
				a=-1;
			}			
		return a;
	}

}
