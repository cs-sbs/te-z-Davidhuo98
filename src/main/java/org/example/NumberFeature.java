import java.util.Scanner;  
  
public class OddEvenFeatureValue {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int number = scanner.nextInt();  
        scanner.close();  
  
        int result = 0;  
        int position = 1; // 从个位开始，数位为1  
  
     
        String numberStr = Integer.toString(number);  
  
    
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = numberStr.charAt(i) - '0';   
            // 检查数位和数字的奇偶性是否一致  
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                
                result += Math.pow(2, numberStr.length() - 1 - i);  
                
            }  
            position++; // 数位加1  
        }  
  
       
        System.out.println(result);  
    }  
}
