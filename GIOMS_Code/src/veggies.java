public abstract class veggies implements Packaging {
    @Override
    public Packing pack() {
        return new bag();
    }

    @Override
    public abstract float price();
}