package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		for(int x =0;sum<n;x++){
			sum = sum+x;
			if(sum>n){
				break;
			}
			System.out.print(sum+" ");
		}
		System.out.println();
		for(int x = 1;x<=n;x++){
			for(int y = 0;x>y;y++){
				System.out.print(x);
			}
		}
	}

}
