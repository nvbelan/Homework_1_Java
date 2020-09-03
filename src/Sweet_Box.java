import java.util.ArrayList;

public class Sweet_Box implements Box_Interface {
    private ArrayList<Sweety> box = new ArrayList<>();

    @Override
    public void addSweety(Sweety sweety) {
        box.add(sweety);
    }

    @Override
    public void deleteLast() {
        box.remove(box.size() - 1);
    }

    @Override
    public void deleteWithIndex(int index) {
        box.remove(index);
    }

    @Override
    public void weightBox() {
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.weight;
        }
        System.out.println("Вес коробки - " + i);
    }

    @Override
    public void costBox() {
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.cost;
        }
        System.out.println("Цена коробки - " + i);
    }

    @Override
    public void allInfo() {
        for (Sweety sweety : box) {

            if (sweety instanceof Waffle) {
                Waffle waffle = (Waffle) sweety;
                System.out.println("Я " + waffle.name + ". Вешу - " + waffle.weight + ". Цена - " + waffle.cost + " Моя фишка -" + waffle.wowParameter);
            }
            if (sweety instanceof Chocolate) {
                Chocolate chocolate = (Chocolate) sweety;
                System.out.println("Я " + chocolate.name + ". Вешу - " + chocolate.weight + ". Цена - " + chocolate.cost + " Моя фишка -" + chocolate.wowParameter);
            }
        }
    }
}
