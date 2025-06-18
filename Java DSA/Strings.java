public class Strings {
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i=0; i<n/2; i++) {
            
            if (str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String str) {
        int x=0, y=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='N') {
                y++;
            } else if (str.charAt(i)=='S') {
                y--;
            } else if (str.charAt(i)=='E') {
                x++;
            } else {
                x--;
            }
        }

        return (float) Math.sqrt(x*x + y*y);

    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";

        // System.out.println(isPalindrome(str));
        System.out.print(getShortestPath(str));
    }
}
