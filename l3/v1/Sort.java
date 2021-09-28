/** Example of selection sorting. */
class Sort {
    /** Prints out WORDS (the command-line
     *  arguments) in alphabetic order. */
    public static void main(String[] words) {
        sort(words, 0, words.length - 1);
        print(words);
    }

    /** Sort items A[L..U], with all others
     *  unchanged. */
    static void sort(String[] A, int L, int U) {
        if (L < U) {
            int k = indexOfLargest(A, L, U);
            String tmp = A[k];
            A[k] = A[U];
            A[U] = tmp;
            sort(A, L, U - 1);
        }
    }

    /** Print A on one line, separated by
     *  blanks. */
    static void print(String[] A) {
        for (String s : A) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    /** Return k, I0<=k<=I1, such that V[k]
     *  is largest element among V[I0], ...,
     *  V[I1]. Requires I0<=I1. */
    static int indexOfLargest(String[] V, int i0, int i1) {
        if (i0 >= i1) {
            return i1;
        } else /* if (i0 < i1) */ {
            int k = indexOfLargest(V, i0 + 1, i1);
            return (V[i0].compareTo(V[k]) > 0) ? i0 : k;
        }
    }
}