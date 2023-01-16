public class day0116_2006 {
    public static void main(String[] args) {
        int[][] arr =new int[5][5];

        int count=1;
        int tmp=0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(" "+" ");
            }
            for(int k=0; k<arr.length-tmp; k++) {
                System.out.print(count+" ");
                count+=1;
            }
            tmp+=2;
            System.out.println();
        }
        int knew=0;
        int k=arr.length - (arr.length-1);
        for (int x = 0; x < 2; x++) {
            for (int y = k; y>0; y--) {
                System.out.print(" "+" ");
            }
            for (int z =0; z < (arr.length-2)+knew; z++) {
                System.out.print(count+" ");
                count+=1;
            }
            k-=1;
            knew+=2;
            System.out.println();
        }

    }
}
