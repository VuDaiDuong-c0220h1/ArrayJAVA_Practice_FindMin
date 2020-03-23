public class Number {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 5, 6, 7, 7, 1};
        int minValue = minValue(arr);
        System.out.println("Giá trị nhỏ nhất là: " + minValue);
    }
    public static int minValue(int[] array){
        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        return min;
    }
}
