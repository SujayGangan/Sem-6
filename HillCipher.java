import java.util.ArrayList;

class HillCipher {
    private static ArrayList<Character> alphabets = new ArrayList<>();
    private static ArrayList<Character> message = new ArrayList<>();
    private static ArrayList<Character> keyVal = new ArrayList<>();

    private static String msg = "gfa";
    private static String alpha = "abcdefghijklmnopqrstuvwxyz";
    private static String key = "hillmagic";
    
    private static ArrayList<Integer> keyMatrixNum = new ArrayList<>();
    private static ArrayList<Integer> msgMatrixNum = new ArrayList<>();

    private static int[][] keyMatrix = new int[3][3];
    private static int[] msgMatrix = new int[3];
    private static int[] matrix = new int[3];

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

        matrixGeneration();



        
        

    }



    public static void matrixGeneration(){
        int val;
        int count=0;

        for (char ch : message) {
            val = alphabets.indexOf(ch);
            msgMatrixNum.add(val);
        }

        for(char ch : keyVal){
            val = alphabets.indexOf(ch);
            keyMatrixNum.add(val);
        }

        // System.out.println(keyMatrixNum);
        // System.out.println(msgMatrixNum);

        // Message Matrix
        System.out.println("Message matrix : ");
        for (int i = 0; i < msgMatrixNum.size(); i++) {
            msgMatrix[i] = msgMatrixNum.get(i);
            System.out.println(msgMatrix[i]);
        }
        System.out.println();

        // Key matrix
        for(int i=0 ; i<3 ; i++){
            for (int j = 0; j <3 ; j++) {
                keyMatrix[i][j] = keyMatrixNum.get(count);
                count++;
            }
        }

        System.out.println("Key matrix : ");
        for(int i=0 ; i<3 ; i++){
            for (int j=0; j<3 ; j++) {
                System.out.print("  " + keyMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


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

    }
}
