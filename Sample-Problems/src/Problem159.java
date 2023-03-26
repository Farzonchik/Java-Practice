public class Problem159 {
    public static void main(String[] args) {
        int[] list = {1, 4, 17, 7, 25, 3, 100};

        largest(list);
    }

    static void largest(int[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j <= list.length; j++) {
                if (list[i] > list[j]){
                    System.out.println(list[i]);
                }
            }
        }
    }
}