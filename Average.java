import java.util.Scanner;
public class java20170321 {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int SizeNum;
     double scanNum;
     double sum = 0;
     double avg = 0;
     System.out.println("입력할 최대 실수의 갯수를 입력하세요. >>");
     SizeNum = scan.nextInt();
     double[] Arr = new double[SizeNum];
     System.out.println("중간에 0을 입력하면 이전 입력자료로 계산하고 종료합니다.");
     System.out.println("실수 " +SizeNum+"개를 입력하세요.");
     for (int i = 0; i<=SizeNum-1; i++) {
         scanNum = scan.nextDouble();
         Arr[i] = scanNum;
         if(scanNum == 0) break;
         sum += Arr[i];
         avg = sum/(i+1);
     }
     System.out.println("합 : "+sum+ ", 평균  : " +avg);
 }
}
