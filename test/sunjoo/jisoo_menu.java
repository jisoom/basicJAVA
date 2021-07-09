package test.sunjoo;

import java.util.Arrays;

public class jisoo_menu {

	public static void main(String[] args) {

		sunjoo_menu menu = new sunjoo_menu();
		
		String[]order = menu.order();
		System.out.println(Arrays.toString(order));
		String[]foods = {"파인애플 피자", "동태찌개"};
		menu.serving(foods);
		String result = menu.result();
		System.out.println(result);
	}

}
