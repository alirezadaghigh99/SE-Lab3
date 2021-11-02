public class Square implements AreaComputable{
    private int edge;

    public Square(int edge) throws IllegalArgumentException{
        if (edge <= 0){
            throw new IllegalArgumentException("Edge should be positive!");
        }
        this.edge = edge;
    }

    @Override
    public int computeArea() {
        return this.edge * this.edge;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        if (edge <= 0){
            throw new IllegalArgumentException("Edge should be positive!");
        }
        this.edge = edge;
    }
}
