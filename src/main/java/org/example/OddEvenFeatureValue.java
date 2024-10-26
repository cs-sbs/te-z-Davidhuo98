public class OddEvenFeatureValue {  
    public static void main(String[] args) {  
        int number = 342315; 
        int result = 0;  
        int binaryPositionValue = 1; 
       
        String numberStr = Integer.toString(number);  
  
       
        for (int i = numberStr.length() - 1; i >= 0; i--) {  
            int digit = numberStr.charAt(i) - '0';
            int position = numberStr.length() - i;
  
          
            if ((digit % 2 == 0 && position % 2 == 0) || (digit % 2 != 0 && position % 2 != 0)) {  
                
                result += binaryPositionValue;  
            }  
  
            
            binaryPositionValue *= 2;  
        }  
  
          
        System.out.println(result);  
    }  
}
