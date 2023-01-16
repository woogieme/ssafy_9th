import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day0116_2029 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];

        // NxN 입력받기
        for (int i = 0; i < arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int result = 0;
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {

                int count = 0;
                if (arr[x][y] == 1) {
                    for (int tmp = y; tmp < arr.length; tmp++) {
                        if (tmp == y) {
                            continue;
                        }
                        if (arr[x][tmp] != 0) {
                            count = tmp - y;

                            break;
                        }
                    }
                    if (result < count) {
                        result = count;
                    }

                    for (int tmp = x; tmp < arr.length; tmp++) {
                        if (tmp == x) {
                            continue;
                        }
                        if (arr[tmp][y] != 0) {
                            count = tmp- x;
                            break;
                        }
                    }
                    if (result < count) {
                        result = count;
                    }


                }

            }
        }
        System.out.println(result);


    }
}
