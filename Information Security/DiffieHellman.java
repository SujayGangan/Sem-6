// Implementation of Diffie Hellman Key Exchange Algorithm

public class DiffieHellman {
    public static void main(String[] args) {
        double q = 11;
        double alpha = 2;
        double Pri_A = 8;       // Private key of user A
        double Pri_B = 4;       // Private key of user B

        // Generating public keys of both users
        double Pub_A, Pub_B; 

        System.out.println("\n\nGenerating public keys of both users...\n");

        Pub_A = Math.pow(alpha, Pri_A) % q;         // Public key of user A
        System.out.println("\tPubic key of user A : " + (int)Pub_A);
        
        Pub_B = Math.pow(alpha, Pri_B) % q;         // Public key of user B
        System.out.println("\tPubic key of user B : " + (int)Pub_B);

        // Exchanging keys / generating shared keys

        double sharedKey_A, sharedKey_B;

        System.out.println("\nGenerating shared keys of both users...\n");
        
        sharedKey_A = Math.pow(Pub_B, Pri_A) % q;
        System.out.println("\tShared key calculated by A : " + (int)sharedKey_A);

        sharedKey_B = Math.pow(Pub_A, Pri_B) % q;
        System.out.println("\tShared key calculated by B : " + (int)sharedKey_B);
        System.out.println();

    }
    
}
