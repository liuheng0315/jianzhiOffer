package offerLearning;
public class ArrayInversePairs {
    //逆序对数目count
    int count;

    //统计数组中的逆序对
    public static void main(String[] args) {
        int[] array = new int[]{364, 637, 341, 406, 747, 995, 234, 971, 571, 219, 993, 407, 416, 366, 315, 301, 601, 650, 418, 355, 460, 505, 360, 965, 516, 648, 727, 667, 465, 849, 455, 181, 486, 149, 588, 233, 144, 174, 557, 67, 746, 550, 474, 162, 268, 142, 463, 221, 882, 576, 604, 739, 288, 569, 256, 936, 275, 401, 497, 82, 935, 983, 583, 523, 697, 478, 147, 795, 380, 973, 958, 115, 773, 870, 259, 655, 446, 863, 735, 784, 3, 671, 433, 630, 425, 930, 64, 266, 235, 187, 284, 665, 874, 80, 45, 848, 38, 811, 267, 575};
        ArrayInversePairs list = new ArrayInversePairs();
        int count = list.sort(array,0,array.length-1);
        System.out.println(count);
    }


    public int sort(int[] array, int low, int high) {
        int middle = (low + high) / 2;
        if (low < high) {
            sort(array, low, middle);
            sort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
        return count;
    }

    private void merge(int[] array, int low, int middle, int high) {
        int[] tmp = new int[high + 1 - low];
        //左指针
        int i = low;
        //右指针
        int j = middle + 1;
        //tmp数组指针
        int k = 0;
        //将较大的数先移到数组
        while (i <= middle && j <= high) {
            if (array[i] <= array[j]) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
                count += middle - i + 1;
            }
        }
        while (i <= middle) {
            tmp[k++] = array[i++];
        }
        while (j <= high) {
            tmp[k++] = array[j++];
        }
        for (int l = 0; l < tmp.length; l++) {
            array[low + l] = tmp[l];
        }
    }
}
