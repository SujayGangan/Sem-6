import java.util.ArrayList;


public class PlayFair {
    static char[][] matrix = new char[5][5];
    static ArrayList<Character> toInsert = new ArrayList<>();
    static ArrayList<Character> alpha = new ArrayList<>();
    static ArrayList<Character> plainText = new ArrayList<>(); 
    static ArrayList<Character> cipherText = new ArrayList<>();

    public static void main(String[] args) {
        String str = "abcdefghiklmnopqrstuvwxyz";
        String key = "monarchy";
        String text = "welcome";
        int check;


        // inserting 'key' in arraylist
        for (int i = 0 ; i < key.length() ; i++){
            toInsert.add(key.charAt(i));
        }


        // inserting plaintext in arraylist
        for (int i = 0 ; i < text.length() ; i++){
            plainText.add(text.charAt(i));
        }
        if(plainText.size() % 2 == 1){
            plainText.add('x');
        }


        // inserting alphabets in arraylist before matrix
        for (int i = 0; i < str.length(); i++) {
            alpha.add(str.charAt(i));
        }

        // System.out.println(toInsert);
        // System.out.println(alpha);


        // creating final arraylist before generating matrix
        for (Character character : alpha) {
            check = isAlreadyInMatrix(character);
            if (check == 0) {

            } else {
                toInsert.add(character);
            }
        }

        // System.out.println(toInsert);

        System.out.print("\n\t Plain Text: " + plainText);


        // Generating matrix
        for(int i=0 ; i<5 ; i++){
            for (int j = 0; j <5 ; j++) {
                matrix[i][j] = toInsert.get(0);
                toInsert.remove(0);
            }
        }

        System.out.println("\n");
        System.out.println("Final matrix is: ");
        for(int i=0 ; i<5 ; i++){
            for (int j = 0; j <5 ; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        makePairOfTwo();

        System.out.println("\n\t Cipher Text: " + cipherText);
        System.out.println("\n\n");

    }


    public static int isAlreadyInMatrix(char ch){
        if(toInsert.contains(ch))
            return 0;

        return 1;
    }


    public static void makePairOfTwo(){
        int plainTextPairsCount = plainText.size()/2;
        System.out.println("\nNumber of pairs formed in plaintext = " + plainTextPairsCount);
        Character ch1, ch2;

        for(int i = 0 ; i < plainTextPairsCount ; i++){
            ch1 = plainText.get(0);
            plainText.remove(0);
            ch2 = plainText.get(0);
            plainText.remove(0);
            System.out.print("Pair "+(i+1)+": "+ch1+" "+ch2);
            System.out.println();

            getCoordinates(ch1, ch2);

        }

    }

    public static void getCoordinates(Character ch1, Character ch2){
        int ch1Row = 0, ch1Col=0, ch2Row=0, ch2Col=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (ch1.equals(matrix[i][j])) {
                    ch1Row = i;
                    ch1Col = j;
                }
                if (ch2.equals(matrix[i][j])) {
                    ch2Row = i;
                    ch2Col = j;
                }
            }
        }


        if (ch1Row == ch2Row){                                  // Condition for same row
            inSameRow(ch1Row, ch1Col, ch2Row, ch2Col);
        } else if (ch1Col == ch2Col) {                                // Condition for same column
            inSameColumn(ch1Row, ch1Col, ch2Row, ch2Col);
        } else {
            inDiagonal(ch1Row, ch1Col, ch2Row, ch2Col);
        }

    }

    public static void inSameRow(int ch1Row, int ch1Col, int ch2Row, int ch2Col){
        int c1Row, c1Col, c2Row, c2Col;
        c1Row = ch1Row;
        c1Col = (ch1Col + 1) % 5;
        c2Row = ch2Row;
        c2Col = (ch2Col + 1) % 5;
        cipherText.add(matrix[c1Row][c1Col]);
        cipherText.add(matrix[c2Row][c2Col]);
    }

    public static void inSameColumn(int ch1Row, int ch1Col, int ch2Row, int ch2Col){
        int c1Row, c1Col, c2Row, c2Col;
        c1Row = (ch1Row + 1) % 5;
        c1Col = ch1Col;
        c2Row = (ch2Row + 1) % 5;
        c2Col = ch2Col;
        cipherText.add(matrix[c1Row][c1Col]);
        cipherText.add(matrix[c2Row][c2Col]);
    }

    public static void inDiagonal(int ch1Row, int ch1Col, int ch2Row, int ch2Col){
        int c1Row, c1Col, c2Row, c2Col;
        c1Row = ch1Row;
        c1Col = ch2Col;
        c2Row = ch2Row;
        c2Col = ch1Col;
        cipherText.add(matrix[c1Row][c1Col]);
        cipherText.add(matrix[c2Row][c2Col]);
    }
    
}
