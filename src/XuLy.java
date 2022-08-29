import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Nhập vào số n");
	 int n = Integer.parseInt(scan.nextLine());
	 System.out.println(tinhTong(n));
	}
	
	public static long tinhTong(int n) {
		if(n == 1) {
			return 1;
		}
		return tinhTong(n - 1) + n;
	}
	
	public static long giaiThua(int n) {
		if(n == 1) {
			return 1;
		}
		return giaiThua(n-1)*n;
	}
	
	public static long tongGiaiThua(int n) {
		if(n == 1) {
			return 1;
		}
		return tongGiaiThua(n-1) + giaiThua(n-1)*n;
	}
}
