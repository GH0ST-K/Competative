/* 
---------------------------------------------------------------------------ASKED IN CAPGEMINI-------------------------------------------------------------------------------------
What does this code do ?
for example:-
There are in total two type of operations you can perform
1)  if you type in input as 1 all the sections will be rotated by the value provided
    for example:- if the input for the operation is is 
    1 2
      i) Here 1 indicates that the operation to be performed is 1 ( i.e it is the operation ID )
      ii) each section in the array must be rotated by a value of 2 to the right
    1 -4
      i) Here 1 indicates that the operation to be performed is 1 ( i.e it is the operation ID )
      ii) each section in the array must be rotated by a value of 4 to the left
2) if you type in input as 2 the whole array will be rotated by the value provided
    for example:- if the input for the operation is is 
    2 1
      i) Here 2 indicates that the operation to be performed is 2 ( i.e it is the operation ID )
      ii) The array must be rotated by a value of 1 to the right
    2 -4
      i) Here 2 indicates that the operation to be performed is 2 ( i.e it is the operation ID )
      ii) The array must be rotated by a value of 4 to the left

Sample Input

4 2 2
2 2
1 1
3 2 1 0

I) the first line includes the input of:-
   1)The size of the given_array
   2)The number of sections for this array to be divided into
   3)The number of operations to be performed on the array
   
II) The second line includes the input of the first operation with the value
    1)The operation ID
    2)The value of the operation
    
III) The third line includes the input of the second operation with the value
     1)The operation ID
     2)The value of the operation
     
IV) The fourth line includes the input of the given array on which the operation is to be performed

Working
I) The First opertion says to rotate the array by 2
   3 2 1 0 ---> 1 0 3 2
II) The Second operation says to rotate each section by 1 bit to the right
    1 0 | 3 2 ---> 0 1 | 2 3
    
Output
  0 1 2 3
   
*/
import java.util.*;

public class Array_bit_manipulation {

	
	public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		StringBuffer sb3 = new StringBuffer();
        Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
        String[] input = in.split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int Q = Integer.parseInt(input[2]);
        for(int i=0;i<Q;i++){
            String inp = sc.nextLine();
        	map.put(i,inp);
        }
        String seq = sc.nextLine();
        String[] sequence = seq.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<sequence.length;i++)
        	sb.append(sequence[i]);
        seq = sb.toString();
        for(int i=0;i<map.size();i++){
            String inputs = map.get(i);
            String[] input_arr = inputs.split(" ");
            StringBuffer sb2 = new StringBuffer();
            for(int k=0;k<input_arr.length;k++)
            	sb2.append(input_arr[k]);
            inputs = sb2.toString();
            String sec1 = seq.substring(0,K);
        	String sec2 = seq.substring(K,seq.length());
            if(Integer.parseInt(input_arr[0])==1){
                String sec = rotate(sec1,Integer.parseInt(input_arr[1]));
                sb3.append(sec);
                sec = rotate(sec2,Integer.parseInt(input_arr[1]));
                sb3.append(sec);
                seq = sb3.toString();
            }
            else{
                seq = rotate(seq,Integer.parseInt(input[1]));
            }
        }
        String[] sequ = seq.split("");
        StringBuffer final_result = new StringBuffer();
        for(int i=0;i<sequ.length;i++)
        	final_result.append(sequ[i]+" ");
        System.out.println(final_result.substring(0,final_result.length()-1));
	}
    static String rotate(String string, int flag){
    	if(flag>=0){
            return rightrotate(string,flag);
        }
        else{
            return leftrotate(string,Math.abs(flag));
        }
    }
	static String leftrotate(String str, int d){
		String ans = str.substring(d) + str.substring(0, d);
    	return ans;
    }
    static String rightrotate(String str, int d){
        return leftrotate(str, str.length() - d);
	}
}
