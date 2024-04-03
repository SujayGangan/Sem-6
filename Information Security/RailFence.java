import java.util.ArrayList;
import java.util.Arrays;

public class RailFence {
    public static void main(String[] args) {
        String plainText = "KITCOLLEGE";        // 10
        int depth = 3;
        
        draw(plainText, depth);

    }

    public static void draw(String pt, int depth){
        int i = 1;

        ArrayList<Character> depth1 = new ArrayList<>();
        ArrayList<Character> depth2 = new ArrayList<>();
        ArrayList<Character> depth3 = new ArrayList<>();

        System.out.println();
        while (i != pt.length()) {
            if (i % (depth+1) == 1) {
                System.out.print(pt.charAt(i-1) + "\t\t\t\t");
                depth1.add(pt.charAt(i-1));
            }
            i++;
        }

        i=1;
        System.out.println();
        while (i != (pt.length() + 1)) {
            if (i % 2 == 0) {
                System.out.print("\t" + pt.charAt(i-1) + "\t " );
                depth2.add(pt.charAt(i-1));
            }
            i++;
        }

        i=1;
        System.out.println();
        while (i != pt.length()) {
            if (i % (depth+1) == 3) {
                System.out.print("\t\t" + pt.charAt(i-1) + "\t \t");
                depth3.add(pt.charAt(i-1));
            }
            i++;

            if (pt.length() % 3 == 1) {
                if (i == (pt.length() -1)) {
                    System.out.print("\t\tx");
                    depth3.add('X');
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Cipher text is : \n\n"+ Arrays.toString(depth1.toArray()).replace("[", "").replace("]", "") +", "
                                                + Arrays.toString(depth2.toArray()).replace("[", "").replace("]", "") +", "
                                                + Arrays.toString(depth3.toArray()).replace("[", "").replace("]", "") + "\n\n");

    }

}
