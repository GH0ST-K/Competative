package ghost;	
import java.util.*;

class ghost {
	public static void main(String[] args)
	{
		boolean result;
		int flag = 0;
		Scanner in = new Scanner(System.in);
		int[][] arr = {{0,1,6,6,6,6},
					   {5,6,8,6,1,9},
					   {6,2,3,1,1,1},
					   {8,6,6,1,1,9},
					   {6,3,3,3,1,9}};
		for(int i =0;i < arr.length;i++) {
			for(int j=0; j < arr[0].length;j++) {
				result = checkHorizontal(arr,i,j);	
				if(result == true) {
					System.out.println(arr[i][j]+" Horizontal at "+i+","+j);
					flag = 1;
				}
				else if(checkVertical(arr,i,j)==true) {
					System.out.println(arr[i][j]+" Vertical at "+i+","+j);
					flag = 1;
				}
				else if(checkDiagonal(arr,i,j)==true) {
					System.out.println(arr[i][j]+" Diagonal at "+i+","+j);
					flag = 1;
				}
				else if(checkReverseDiagonal(arr,i,j)==true) {
					System.out.println(arr[i][j]+" Reverse Diagonal at "+i+","+j);
					flag = 1;
				}
				if(flag == 1)
					break;
			}
			if(flag == 1)
				break;
		}
		if(flag == 0) {
			System.out.println("-1");
		}
	}
	static boolean checkHorizontal(int[][] arr,int i,int j){
		int check = 0;
		for(int k = j ; k < arr[0].length ; k++ ) {
			if(arr[i][k] == arr[i][j])
				check += 1;
			else
				check = 0;
		}
		if(check==4) {
			return true;
		}
		return false;
	}
	static boolean checkVertical(int[][] arr,int i,int j){
		int check = 0;
		for(int k = i ; k < arr.length ; k++ ) {
			if(arr[k][j] == arr[i][j]) {
				check += 1;
			}
			else {
				check = 0;
			}
		}
		if(check==4) {
			return true;
		}
		return false;
	}
	static boolean checkDiagonal(int[][] arr,int i,int j){
		int check = 0;
		for(int k = i ; k < arr.length ; k++ ) {
			for(int l = j ; l < arr[0].length && k < arr.length ; l++){
				if(arr[k][l] == arr[i][j]) {
					check++;
					k++;
				}
				if(check == 4)
					return true;
			}
			check = 0;
		}
		return false;
	}
	static boolean checkReverseDiagonal(int[][] arr,int i,int j){
		int check = 0;
		for(int k = i ; k < arr.length ; k++ ){
			for(int l = j ; l >= 0 && k < arr.length ; l--){
				if(arr[k][l] == arr[i][j]) {
					check += 1;				
					k++;
				}
				if(check == 4)
					return true;
			}
			check = 0;
		}
		return false;
	}
}
