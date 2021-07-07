package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마(,)를 붙여 출력해주세요.
		//1,234,567
		System.out.println("숫자 입력 >");
		String input = ScanUtil.nextLine();
		String rev ="";
		
		int count = 0;
		for (int i = input.length()-1; i >= 0; i--) {
			rev = input.charAt(i) + rev;
			count++;
			if(count % 3 ==0 && count != input.length()){
				rev = "," +rev;
			}
		}
		
//		//rev.charAt(0)은 왜 안되는지? 문자열이 아니라 문자여서 안됨
//		if(",".equals(rev.substring(0,1))){
//			rev = rev.substring(1);
//		}
		
		System.out.println(rev);

	
	
	}

}
