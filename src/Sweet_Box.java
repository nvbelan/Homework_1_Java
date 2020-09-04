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

    private int weightBoxInt() {
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.weight;
        }
        return i;
    }


    @Override
    public void costBox() {
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.cost;
        }
        System.out.println("Цена коробки - " + i);
    }

    private int costBoxInt() {
        int i = 0;
        for (Sweety sweety : box) {
            i += sweety.cost;
        }
        return i;
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


    @Override
    public void weightIndex(int index) {
        int minPosition = 0;
        int minWeight = box.get(0).weight;
        int marker = -1;
        while (index <= weightBoxInt()) {
            for (Sweety sweety : box) {
                marker++;
                if (sweety.weight < minWeight) {
                    minPosition = marker;
                }
            }
            box.remove(minPosition);
        }
    }

    @Override
    public void costIndex(int index) {
        int minPosition = 0;
        int minCost = box.get(0).cost;
        int marker = -1;
        while (index <= costBoxInt()) {

            for (Sweety sweety : box) {
                marker++;
                if (sweety.cost <= minCost) {
                    minPosition = marker;
                }
            }
            box.remove(minPosition);
        }
    }
}

