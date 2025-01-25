public class swapping{
    public static void main(String[] args) {

        String str1="Apple";
        String str2="Banana ";
        if (str1.length() > 0 && str2.length() > 0) {


            String swappedStr1 = str2.charAt(0) + str1.substring(1);
            String swappedStr2 = str1.charAt(0) + str2.substring(1);

            System.out.println("After swapping first characters:");
            System.out.println("String 1: " + swappedStr1);
            System.out.println("String 2: " + swappedStr2);
        } else {
            System.out.println("Strings must not be empty.");
        }
        
    }
}
