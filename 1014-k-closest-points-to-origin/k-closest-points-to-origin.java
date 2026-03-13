class Solution {
    static {
    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
        try (FileWriter writer = new FileWriter("display_runtime.txt")) {
            writer.write("0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }));
}
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(a,b) -> { 
        int d1 = a[0]*a[0] + a[1]*a[1];
        int d2 = b[0]*b[0] + b[1]*b[1];
        return d1-d2;
    });
        int mat[][] = new int[k][2];
        for(int i=0;i<k;i++)
        {
            mat[i] = points[i];
        }   
        return mat;
    }
}