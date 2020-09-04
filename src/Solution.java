public class Solution {
    public static void main(String[] args) {
        Sweet_Box sweet_box = new Sweet_Box();
        sweet_box.addSweety(new Waffle("waffle1", 1, 1, "grid"));
        sweet_box.addSweety(new Waffle("waffle2", 2, 5, "grid"));
        sweet_box.addSweety(new Waffle("waffle3", 3, 4, "grid"));
        sweet_box.addSweety(new Waffle("waffle4", 5, 5, "grid"));
        sweet_box.addSweety(new Chocolate("choco1", 1, 3, "dark"));
        sweet_box.addSweety(new Chocolate("choco2", 1, 3, "dark"));
        sweet_box.addSweety(new Chocolate("choco3", 1, 3, "dark"));
        sweet_box.deleteLast();
        sweet_box.deleteWithIndex(3);
        sweet_box.allInfo();
        sweet_box.weightIndex(6);
        System.out.println(sweet_box.weightBoxInt() + " Вес коробки");
        sweet_box.costIndex(8);
        System.out.println(sweet_box.costBoxInt() + " Цена коробки");

    }
}
