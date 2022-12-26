import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------Задача №1 - методы List-----------");

        HeavyBox heavyBox = new HeavyBox("box1", 1);
        HeavyBox heavyBox1 = new HeavyBox("box2", 2);
        HeavyBox heavyBox2 = new HeavyBox("box3", 3);
        HeavyBox heavyBox3 = new HeavyBox("box4", 4);

        ArrayList<HeavyBox> list = new ArrayList<>();
        list.add(0, heavyBox);
        list.add(heavyBox1);
        list.add(heavyBox2);
        list.add(heavyBox3);

        list.set(1, new HeavyBox("newbox1", 15));

        list.remove(3);

        for (HeavyBox h: list) {
            System.out.println(h);
        }

        ListIterator<HeavyBox> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.clear();
        System.out.println(list);


        System.out.println("-----------Задача №2 - 123445-----------");
        System.out.println("Enter numbers: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>(6);
        num.add(scanner.nextInt());
        num.add(scanner.nextInt());
        num.add(scanner.nextInt());
        num.add(scanner.nextInt());
        num.add(scanner.nextInt());
        num.add(scanner.nextInt());
        System.out.println("Not filtered "+num);

        List<Integer> filteredList = new ArrayList<>();
        for(Integer i: num) {
            if (!filteredList.contains(i)) {
                filteredList.add(i);
            }
        }
        System.out.println("Filtered "+filteredList);

    }
}