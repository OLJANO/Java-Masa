
package massivy;


public class stroki11 { public static void main(String[] args) {
    char[] chars = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'P', '1', '8'};
    String sl = "Строки";
            System.out.println("Строка sl до copyValueOf:       " + sl);
          sl = sl.copyValueOf(chars);
            System.out.println("Строка sl после copyValueOf:     " + sl);   
            
            char[] chars1 = {'Г', 'р', 'у', 'п', 'п', 'а', ' ', 'S', 'K', 'T', 'V', 'P', '1', '8'};
            String str1 = "Строки";
            String str2 = str1.copyValueOf(chars1);
            String str3 = str1.copyValueOf(chars1, 7, 7);
            System.out.println("Строка без смещения:   " + str2);
            System.out.println("Строка cо смещением в 2 и длиной 7:   " + str3); 
            
            }
    }
