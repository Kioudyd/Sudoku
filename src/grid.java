public class grid {
    public class row {
        private int size;
        private int[] row;

        public row(int size){
            this.row = new int[size];
        }
        public row(){
            this.row = new int[];
        }
    }
    private int size;
    private cell[][] grid;

    public grid(int size){
        this.size = size;
        this.grid = new cell[size][size];
    }
    public grid(){
        this.grid = new cell[3][3];
    }
}

