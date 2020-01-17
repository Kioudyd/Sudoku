public class cell {
    private int size;
    private int[][] cell;

    public cell(int size){
        this.size = size;
        this.cell = new int[size][size];
    }
    public cell(){
        this.cell = new int[3][3];
    }

    public void remove(int row, int column){
        this.cell[row][column] = -1;
    }
    public void add(int row, int column, int value){
        this.cell[row][column] = value;
    }

    public boolean isOnCell(int value) {
        for (int i = 0; i < this.cell.length; i++) {
            for (int j = 0; j < this.cell[i].length; j++) {
                if (cell[i][j] == value) return false;
            }
        }
        return true;
    }}
