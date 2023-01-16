import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day0116_2008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            String[][] arr = new String[N][N];
            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int k = 0; k < N; k++) {
                    arr[j][k] = st.nextToken();
                }
            }

            boolean isFalse = true;
            int tmp = 0;
            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length; y++) {
                    int count = 0;
                    isFalse = true;
                    if (arr[x][y].equals("B")) {
                        for (int d = 0; d < dx.length; d++) {
                            int nexti = x + dx[d];
                            int nextj = y + dy[d];
                            if (nexti > -1 && nexti < arr.length && nextj > -1 && nextj < arr[i].length && arr[nexti][nextj].equals("G")) {
                                isFalse = false;
                                break;
                            }
                        }

                        if (isFalse) {
                            isFalse = true;
                            for (int a = 0; a < arr.length; a++) {
                                if (arr[a][y].equals("B")) {
                                    count += 1;
                                }
                            }
                            for (int b = 0; b < arr.length; b++) {
                                if (arr[x][b].equals("B")) {
                                    count += 1;
                                }
                            }

                        }

                    }
                    if (tmp < count) {
                        tmp = count;
                    }
                }


            }
            if (isFalse == true) {
                System.out.println("#" + (i + 1) + " " + (tmp - 1));
            } else {
                System.out.println(2);
            }
        }
    }
}
