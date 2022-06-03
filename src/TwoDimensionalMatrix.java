public class TwoDimensionalMatrix {
    //Main matrix to display.
    int[][]worldMatrix;
    //This is the matrix size vars.
    int rowAmount, colAmount;

    //This is to create a way to change variables for the matrix size.
    public TwoDimensionalMatrix(int amountOfRows, int amountOfCols) {

        rowAmount=amountOfRows; colAmount=amountOfCols;
        worldMatrix = new int[rowAmount][colAmount];
    }

        //Function to output the main matrix.
        void OutputMatrix(){

            for(int rowIndex=0;rowIndex<rowAmount;rowIndex++){
                for(int colIndex=0;colIndex<colAmount;colIndex++){
                    System.out.println(worldMatrix[rowIndex][colIndex]);

                }
            }
        }
}

