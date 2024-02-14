import java.util.ArrayList;

class NewHillCipher {
    private static ArrayList<Character> alphabets = new ArrayList<>();
    private static ArrayList<Character> message = new ArrayList<>();
    private static ArrayList<Character> keyVal = new ArrayList<>();
    private static ArrayList<Character> cipherText = new ArrayList<>();

    private static String msg = "welcome";
    private static String alpha = "abcdefghijklmnopqrstuvwxyz";
    private static String key = "hillmagic";
    
    private static ArrayList<Integer> keyMatrixNum = new ArrayList<>();
    private static ArrayList<Integer> msgMatrixNum = new ArrayList<>();

    private static int[][] keyMatrix = new int[3][3];
    private static int[] msgMatrix = new int[3];
    private static int[] modMatrix = new int[3];

    public static void main(String[] args) {

        for (int i = 0; i < alpha.length(); i++) {
            alphabets.add(alpha.charAt(i));
        }

        for (int i = 0; i < msg.length(); i++) {
            message.add(msg.charAt(i));
        }

        for (int i = 0; i < key.length(); i++) {
            keyVal.add(key.charAt(i));
        }

        // Making size of the message in multiple of 3
        if (message.size() % 3 == 1) {
            message.add('x');
            message.add('x');
        } else if (message.size() % 3 ==2) {
            message.add('x');
        }


        // Key Matrix
        int val,count=0;
        for(char ch : keyVal){
            val = alphabets.indexOf(ch);
            keyMatrixNum.add(val);
        }

        for(int i=0 ; i<3 ; i++){
            for (int j = 0; j <3 ; j++) {
                keyMatrix[i][j] = keyMatrixNum.get(count);
                count++;
            }
        }

        System.out.println("\nKey matrix : ");
        for(count = 0 ; count < keyMatrixNum.size() ; count++){
            if (count % 3 == 0) {
                System.out.println();
            }
            System.out.print(keyMatrixNum.get(count) + "\t");
        }

        
        int numberOfPairs = message.size() / 3;
        System.out.println("\n\nNumber of pairs to be formed : " + numberOfPairs);

        makePairOfThree(numberOfPairs);
        
        System.out.println("\n#################################################\n");
        System.out.println("Plain Text is :\n" + msg);

        System.out.println("\nCipher Text is :");
        for(Character ch : cipherText){
            System.out.print(ch);
        }
        System.out.println("\n\n#################################################\n");

    }


    public static void makePairOfThree(int pairsCount){
        int val;

        for(int i = 0 ; i < pairsCount ; i++){

            System.out.println("\n**************************************\n");

            System.out.println("Pair "+(i+1)+" :=>\n ");


            // Message Matrix
            System.out.println("Characters in pair " + (i+1) +" :");
            for (int j = 0; j < 3; j++) {
                Character ch = message.getFirst();
                System.out.println(ch);
                message.removeFirst();
                val = alphabets.indexOf(ch);
                msgMatrixNum.add(val);
            }

            System.out.println("\nMessage matrix : ");
            for (int j = 0; j < msgMatrixNum.size(); j++) {
                msgMatrix[j] = msgMatrixNum.get(j);
                System.out.println(msgMatrix[j]);
            }
            
            msgMatrixNum.clear();

            System.out.println();

            matrixGeneration();
            
        }

    }


    public static void matrixGeneration(){
        int[] matrix = new int[3];

        // Final Matrix generation
        for (int i = 0; i < 3; i++) {
            matrix[i] = (keyMatrix[i][0] * msgMatrix[0])  
                        + (keyMatrix[i][1] * msgMatrix[1])  
                        + (keyMatrix[i][2] * msgMatrix[2]) ; 
        }
        
        System.out.println("Final matrix : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
        }


        System.out.println("\nFinal matrix after mod 26: ");
        for (int i = 0; i < matrix.length; i++) {
            modMatrix[i] = matrix[i] % 26;
            System.out.println(modMatrix[i]);
        }
        

        System.out.println();
        System.out.println("Cipher text is: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(alphabets.get(modMatrix[i]));
            cipherText.add(alphabets.get(modMatrix[i]));
        }


    }
}
