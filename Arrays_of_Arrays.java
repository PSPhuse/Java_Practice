public class Arrays_of_Arrays {
    public static void main(String[] args) {
        
        int[][][] beans = new int[5][15][];

        beans[0] = new int[10][];
        beans[0][4] = new int[15];

        for (int i = 0; i < beans.length; i++) {
            for (int j = 0; j < beans[i].length; j++) {
                beans[i][j] = new int[10]; 
                //System.out.print(beans[i][j] + " ");

            }
        }

        for(int i=0;i<beans.length;i++)
        {
            for(int j=0;j<beans[i].length;j++)
            {
                for (int k = 0; k < beans[i][j].length; k++) {
                    beans[i][j][k] = 1 + (int)(Math.random() * 99);
                    System.out.print(beans[i][j][k] + " ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }         
    }
}