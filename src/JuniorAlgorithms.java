import java.util.Arrays;

public class JuniorAlgorithms {
    public static int getSum(int[] v) {
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    public static void reverse(int[] v) {
        System.out.println(Arrays.toString(v));
        for (int i = 0; i < v.length / 2; i++) {
            int temp = v[i];
            v[i] = v[v.length - (i + 1)];
            v[v.length - (i + 1)] = temp;
        }
        System.out.println(Arrays.toString(v));
    }

    public static int indexof(Integer[] v, Integer value) {
        for (int i = 0; i < v.length; i++) {
            if (v[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static int getGreatest(int[] v) {
        int maxValue = 0;
        for (int i = 0; i < v.length; i++) {
            if (maxValue < v[i]) {
                maxValue = v[i];
            }
        }
        return maxValue;
    }

    public static void moveZeros(int[] v) {
        int zeroValueCount = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0) {
                v[zeroValueCount++] = v[i];
            }
        }
        while (zeroValueCount < v.length) {
            v[zeroValueCount] = 0;
            zeroValueCount++;
        }
        System.out.println(Arrays.toString(v));
    }

    public static void main(String[] args) {
        System.out.println(getSum(new int[]{10, 20, 30}));
        reverse(new int[]{10, 20, 30});
        System.out.println(indexof(new Integer[]{8, 1, 2, 18, 20}, 20));
        System.out.println(getGreatest(new int[]{8, 112, 2, 18, 20}));
        moveZeros(new int[]{0, 1, 0, 18, 20});
    }


}

