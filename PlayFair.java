import java.util.ArrayList;

public class PlayFair {
    static char[][] matrix = new char[5][5];
    static ArrayList<Character> toInsert = new ArrayList<>();
    static ArrayList<Character> alpha = new ArrayList<>();
    static ArrayList<Character> plainText = new ArrayList<>(); 
    static ArrayList<Character> pairs = new ArrayList<>();

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

        System.out.println(toInsert);
        System.out.println(alpha);


        // creating final arraylist before generating matrix
        for (int i = 0; i < alpha.size() ; i++) {
            check = isAlreadyInMatrix(alpha.get(i));
            if (check==0){
                continue;
            } else {
                toInsert.add(alpha.get(i));
            }
        }

        System.out.println(toInsert);


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

        // System.out.println("\n" + plainText);
        
        makePairOfTwo(plainText);



    }

    public static void makePairOfTwo(ArrayList<Character> plainText){
        int plainTextPairsCount = plainText.size()/2;
        System.out.println("\nNumber of pairs of plaintext = " + plainTextPairsCount);
        int ch1, ch2;

        for(int i = 0 ; i < plainTextPairsCount ; i++){
            ch1 = plainText.getFirst();
            plainText.removeFirst();
            ch2 = plainText.getFirst();
            plainText.removeFirst();

        }

    }


    public static void checkPosition(){
        if (inSameRow() == 1) {
            

        } else if (inSameColumn() == 1) {
            

        } else if (inDiagonal() == 1){


        }


    }


    public static int inSameRow(){          // parameters 2 characters
        
        
        return 1;
    }

    public static int inSameColumn(){
        
        
        return 1;
    }

    public static int inDiagonal(){
        
        
        return 1;
    }



    public static int isAlreadyInMatrix(char ch){
        if(toInsert.contains(ch))
            return 0;

        return 1;
    }

}
