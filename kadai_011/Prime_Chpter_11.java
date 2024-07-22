package kadai_011;

public class Prime_Chpter_11 {

	public static void main(String[] args) {
		boolean[] prime = new boolean[101];
		
		for (int k = 1; k < prime.length; k++) {
            prime[k] = true;
        }

		for (int i = 2; i < prime.length; i++) {
            for (int r = 2; r * r <= i; r++) {
                if (i % r == 0) {
                    prime[i] = false;
                    break;
                }
            }
        }
		 for (int j = 2; j < prime.length; j++) {
	            if (prime[j]) {
	                System.out.println(j);
	            }
	        }

	}

}
