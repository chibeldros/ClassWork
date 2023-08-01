public interface IShapeCalc {
    void inputData();
    void resultVolume();
    void resultSquare();
    default void resultPrint() {
        System.out.println(this);
    }

}
