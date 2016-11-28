package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021057 張岳埕
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int z=0;
		for(int b =1;b<=a;b++){
			if(a%b==0){
				System.out.println(b);
				z++;
			}
		}
		if(z==2){
			System.out.println("質數");
		}else{
			System.out.println("不是質數");
		}
			}

		}