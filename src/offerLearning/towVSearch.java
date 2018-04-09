package offerLearning;

/**
 * Created by root on 2018/3/9.
 */
public class towVSearch {
    public static void main(String[] args) {
        int[][] array={{1,2,8,9},{2,4,9,12},{4,7,10,13}};
        System.out.println(search(array,5));
    }
    public static boolean search(int[][] array,int target){
        int rows=array.length;
        int columns=array[0].length;
        int row=0;
        int column=columns-1;
        while (true){
            if(row>rows-1||column<0){
                return false;
            }
            else if(array[row][column]==target){
                return true;
            }else {
                if (array[row][column]>target){
                    column--;
                }else {
                    row++;
                }
            }
        }
    }
}
