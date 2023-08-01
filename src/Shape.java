public abstract class Shape implements IShapeCalc{
    protected double shapeVolume;
    protected double shapeSquare;

    @Override
    public String toString(){
        return "The square surf is " + this.shapeSquare + " and the volume is " + this.shapeVolume;
    }
}
