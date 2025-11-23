
public class Primes {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] arry = new boolean[n + 1];
        int count = 0;
        for (int i = 2; i < arry.length; i++) {
            arry[i] = true;
        }

        int p = 2;
        while (p <= Math.sqrt(n)) {
            if (arry[p] == true) {
                int q = p * p;
                while (q < arry.length) {
                    arry[q] = false;
                    q = q + p;
                }

                p++;
            }
        }
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == true) {
                count++;
            }
        }
        System.err.println("Prime numbers up to " + n + ":" );
        for (int i = 2; i <= n; i++) { 
            if (arry[i] == true) {
                System.err.println(i);
                count++;
            }
        }System.out.println("There are " + count + " primes between 2 and " + n + 
                   " (" + (100 * count) / n + "% are primes)");
    }
}

// we need to go over all of the numbers from n and on 
// then we'll need to cross out the numbers of 

