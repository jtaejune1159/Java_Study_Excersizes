package Study;
import java.util.Scanner;

public class Variable {
   
   //Q1 : �ڹ� �� 8���� �⺻�� �������� �����ϰ�, �����÷ΰ� ���� �ʴ� ���� �ʱ�ȭ�ϼ���.(� ���� �˴ϴ�.)
   //����, ������-������, ������-������, ������-�Ǽ���, �Ǽ���-�Ǽ������� �ڵ� ����ȯ�� �Ǵ� ��ʸ� �����ּ���.(�Ǳ⸸ �ϸ� �˴ϴ�.)
   public static void Q1() {
      //���⿡ �ڵ带 �ۼ��ϼ���.
	   boolean t;
	   char a;
	   byte b;
	   short c;
	   int d;
	   long e;
	   float f;
	   double g;
	   t= true;
	   a = 'b';
	   b = 1;
	   c = 1;
	   d = 30;
	   e = 100000000000L;
	   f = 1;
	   g = 40.52;
	   int i = a;
	   long h = d;
	   float p = b;
	   System.out.println(i);
	   System.out.println(h);
	   System.out.println(p);
      //������� ��µǸ� ������ ���� �̴ϴ�.
      System.out.println("Not Problem Found.");
   }
   
   //Q2 : 1���� ���ڸ� �Է��ϸ�, �׿� �����ϴ� ASCII ���ڿ��� ����ϴ� �޼ҵ带 �ۼ��ϼ���.(���� ������ ���� ó���� �ʿ� �����ϴ�.)
   //��Ʈ : char ����ȯ�� �̿��ϼ���.
   public static void Q2() {

      //���⿡ �ڵ带 �ۼ��ϼ���.
	  Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      char c= (char)n;
      System.out.println(c);
      
   }

   //main method
   public static void main(String[] args) {
      System.out.println("Q1 started.");
      Q1();
      System.out.println("Q2 started.");
      Q2();

   }

}