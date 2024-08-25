public class MaxArrays{
    public static void main(String[] args) {
        // Integer array[] = new Integer[5];
        // Integer[] array = new Integer[5];
        Integer[] array = new Integer[]{4,12,5,7,98};

        int max = Integer.MIN_VALUE;
        for (Integer integer : array) {
            if(max < integer)   max = integer;
            // System.out.println(integer);
        }
        System.out.println(max);
    }
}
