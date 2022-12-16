import java.util.HashMap;

public class TerceiroDesafio {

        static int contaPares ( int arr[], int n)
        {

            HashMap<Integer,
                    Integer> map = new HashMap<Integer,
                    Integer>();
            for (int i = 0; i < n; i++)
                map.put(arr[i] - i, 0);

            for (int i = 0; i < n; i++)
                map.put(arr[i] - i, map.get(arr[i] - i) + 1);

            int res = 0;
            for (int x : map.values()) {
                int cnt = x;

                // Soma pares possiveis
                res += ((cnt * (cnt - 1)) / 2);
            }

            return res;
        }

        // Driver code
        public static void main (String[]args)
        {
            int arr[] = {1, 5, 6, 7, 9};
            int n = 4;//arr.length;

            System.out.println(contaPares(arr, n));
        }
}


