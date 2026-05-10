public class sudoku {

    public static boolean sudou(int soduko[][],int row ,int column){

        if(row == 9 && column == 9){
            return true;
        } else if(row == 9){
            return false;
        }
        

        int nextrow =row, nextcol = column+1;
        if(column+1 == 9){
            nextrow = row+1;
            nextcol =0;
        }

        if(soduko[row][column] != 0){
            return sudou(soduko, nextrow, nextcol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(soduko,row,column,digit)){
                soduko[row][column] =digit;
                if(sudou(soduko, nextrow, nextcol)){
                    return true;
                }
                soduko[row][column];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int sudoko [][] ={{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}};
    }
}
