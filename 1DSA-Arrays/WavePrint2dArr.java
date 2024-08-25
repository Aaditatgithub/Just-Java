public class WavePrint2dArr {
    public static void main(String[] args){
        Integer[][] arrIntegers = new Integer[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int size = arrIntegers.length;
        
        int i = 0;
        int j = 0;

        while(i < size && j < size){
            while(i < size && j < size){
                System.out.println(arrIntegers[i][j]);
                i++;
            }
            i--;
            j++;

            while(i > -1 && j < size){
                System.out.println(arrIntegers[i][j]);
                i--;
            }
            i++;
            j++;
        }
    }
}
