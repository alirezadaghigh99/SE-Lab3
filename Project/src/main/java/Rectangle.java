public class Rectangle implements AreaComputable {
    private int width;
    private int height;

    public Rectangle(int width, int height) throws IllegalArgumentException {
        if (width <= 0){
            throw new IllegalArgumentException("Width should be positive!");
        }
        if (height <= 0){
            throw new IllegalArgumentException("Height should be positive!");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public int computeArea(){
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0)
        	throw new IllegalArgumentException("Width should be positive!");
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0)
        	throw new IllegalArgumentException("Height should be positive!");
        this.height = height;
    }
}
