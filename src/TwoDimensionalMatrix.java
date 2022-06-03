public class TwoDimensionalMatrix {
    int[][]worldMatrix = new int[0][0];
    //This is the matrix size vars.
    int rows, cols;

    //This is to create a way to change variables for the matrix size.
    public TwoDimensionalMatrix(int i, int j) {
        rows=i; cols=j;
        worldMatrix = new int[rows][cols];
    }

        //Function to output the main matrix.
        void OutputMatrix(){
            for(int i=0;i<worldMatrix.length;i++){
                for(int j=0;j<worldMatrix[i].length;j++){
                    System.out.println(worldMatrix[rows][cols]);
                }
            }
        }
}

