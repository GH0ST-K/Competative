import java.util.*;

class find_multiples_of_consecutive {
	public static void main(String[] args)
	{
        ArrayList<Integer> data = new ArrayList<Integer>();
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	int i = 1;
        while(i<9){    
        	for(int j = 2 ; j < 10 ; j++){
            	data.add(i*j);
                i++;
	        } 
        }       
        String str =  "1242";
        i=0;
        int j = 1;
        while(i<str.length() && j<=str.length()) {
        	if(!numbers.contains(Integer.valueOf(str.substring(i,j))))
        		numbers.add(Integer.valueOf(str.substring(i,j)));
        	i++;
        	j++;
        }
        i=0;j=2;
        while(i<str.length() && j<=str.length()) {
        		numbers.add(Integer.valueOf(str.substring(i,j)));
        	i++;
        	j++;
        }
        for(i = 0;i<numbers.size();i++) {
        	if(data.contains(numbers.get(i))) {
        		System.out.print(numbers.get(i)+" ");
        	}
        }
	}	
}
