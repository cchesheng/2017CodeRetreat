public class Grid {
    int height, width;
    Cell[][] cells;


    Grid(int h, int w){
        height = h;
        width = w;
        cells = new Cell[h][w];

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++ ){
                cells[i][j] = new DeadCell();
            }
        }

    }

    public void customize(int x, int y, Cell.state nextstate){
        this.cells[x][y].currentState = nextstate;
    }

    public int getAliveNeighbours(int x, int y){
        int aliveNeighbours = 0;
        for(int i=x-1; i<=x +1; i++ ){
            if (i >= 0) {
                for(int j=y-1; j<=y+1; j++){
                    if (j >= 0){
                        if (this.cells[i][j].currentState == Cell.state.ALIVE) {
                            System.out.println(i+", "+j);
                            aliveNeighbours++;
                        }
                    }
                }
            }

        }
        return aliveNeighbours;
    }



    public static void main(String[] args){

        Grid g = new Grid(3,3);
        g.customize(0,0, Cell.state.ALIVE);
        g.customize(0,1, Cell.state.ALIVE);
        System.out.print(g.getAliveNeighbours(1,1));



    }




}
