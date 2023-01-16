public class day0116_2006_1 {
    public static void main(String[] args) {
        int[][] arr =new int[5][5];

        int count=1;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" "+" ");
            }
            for(int j=arr.length-i; j>0; j--) {
                System.out.print(count+" ");
                count+=1;
            }
            System.out.println();
        }

    }
}
