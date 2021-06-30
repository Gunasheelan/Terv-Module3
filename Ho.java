public class Ho {
    public static void main(String[] args) {
        String s = "hello";
        String temp = "";
        for(int i = s.length() - 1; i >= 0; i--){
            temp = s.substring(1, s.length()) + s.charAt(0);
        }
        System.out.println(temp);
        System.out.println("dsfdsfas");
    }
    
}
