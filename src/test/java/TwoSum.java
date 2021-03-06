public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        if (list == null || list.length < 2) return null;
        for (int i = 0; i < list.length - 1; i++) { // i=3
            for (int k = 1; k < list.length; k++) { // k=1
                if (list[i] + list[k] == sum) {
                    return new int[]{i, k};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{3, 1, 5, 7, 5, 9}, 10);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}