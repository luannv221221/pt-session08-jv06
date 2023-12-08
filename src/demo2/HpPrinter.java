package demo2;

public class HpPrinter implements IPrinter,IScanner{
    @Override
    public void print() {
        System.out.println("Máy "+" HP đang in");
    }

    @Override
    public void copy() {
        System.out.println("Máy tin HP đang copy");
    }

    @Override
    public void scan() {
        System.out.println("Mays in HP dang scan");
    }
}
