package JavaStudy;

public class IfExam {
	
	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
//		if(x < y) {
//			System.out.println("x�� y���� �۽��ϴ�.");
//			System.out.println("test");
//		}
//		
//		if (x == y) { 
//			System.out.println("x�� y�� �����ϴ�.");
//			System.out.println("test");

		if (x == y) {
			System.out.println("x�� y�� �����ϴ�.");
		}else if(x < y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}	
	}
}