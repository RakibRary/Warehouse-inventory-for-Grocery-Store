public abstract class meats implements Packaging {
    @Override
    public Packing pack() {
        return new box();
    }

    @Override
    public abstract float price();
}
