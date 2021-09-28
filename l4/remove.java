class remove {
    /** Treat ARGS (the command-line arguments)
     *  as an array of numerals.
     *  Call ARGS[0] N and let L denote the
     *  remaining elements (1 to the end).
     *  Print L after each of several 
     *  manipulations:
     *  1. First, print L
     *  2. Print L with all N's removed non-
     *     destructively.
     *  3. Print L again (to see that it has
     *     not changed).
     *  4. Print L with all N's removed
     *     destructively.
     *  5. Print L again (to see that is HAS
     *     changed).
     */
    public static void main(String[] args) {
        IntList data = IntList.list(args);
        int N = data.head;
        IntList L = data.tail;

        System.out.println(System.out, L);
        IntList.printList(System.out, removeAll(L, N));
        System.out.println(System.out, L);
        IntList.printList(System.out, dremoveAll(L, N));
        System.out.println(System.out, L);
    }

    
    
}
