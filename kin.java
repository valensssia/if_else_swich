package if_else_switch;

import java.util.Scanner;

public class kin {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		if (((x1 - 1 == x2) || (x1 + 1 == x2)) && ((y1 - 2 == y2) || (y1 + 2 == y2))) {
			System.out.println("YES");
		}else {
			if (((x1 - 2 == x2) || (x1 + 2 == x2)) && ((y1 - 1 == y2) || y1 + 1 == y2)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			}
		}
		}


