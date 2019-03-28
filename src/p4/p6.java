
package p4;


public class p6 {
    public static void main(String[] args) {
    String sentence = "Я помню чудное мгновенье!";
        System.out.println(sentence.length());
        System.out.println();
/*concat*/
            
        String sentence1 = "Я помню чудное мгновенье:";
        sentence1 = sentence1.concat(" Передо мной явилась ты");
        System.out.println(sentence1);
        System.out.println();
        
String result = sentence1.toUpperCase();
        System.out.println("" + result);
     String result1 = sentence1.toLowerCase();
        System.out.println("В нижнем регистре: " + result1);
        
      String s1 = " пом";
      String s2 = "Передо мной явилась ты      "  ;
        System.out.println(sentence.substring(5)); 
        System.out.println(sentence.substring(2, 10));
        
         
                 
    }
}
