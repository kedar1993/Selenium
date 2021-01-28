package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class learn {

	public static void main(String[] args) {
		
		 InputStream is = null;
	        BufferedReader br = null;
	        
	        System.out.println("inpput number");
	        is = System.in;
            br = new BufferedReader(new InputStreamReader(is));
		
		int num=0;
		try {
			num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String StrNum =  String.valueOf(num);
		int product = 1;
		for (int i=0 ; i< StrNum.length() ; i++) {
			product= product * (Integer.parseInt((String.valueOf(StrNum.charAt(i)))));
			
		}
			System.out.println("product = "+product);
		
	}

}
