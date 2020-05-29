	//Power of Two
	// Date :29-05-2020

class Result {
	public static List<Integer> isPower(List<Integer> arr) {
        	ArrayList<Integer> newList = new ArrayList();
        	ArrayList<Integer> nList = new ArrayList(); 
        	for(int i:arr){
            		if(!newList.contains(i))
               			newList.add(i); 
        	}
        	for(int j:arr)
            		if(isPowerOfTwo(j))
                		nList.add(1);
            		else
                		nList.add(0);

    		return(nList);
    	}
    	static boolean isPowerOfTwo(int n) { 
    		if(n==0) 
    			return false; 
  
		return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
       			(int)(Math.floor(((Math.log(n) / Math.log(2))))); 
	} 
}
