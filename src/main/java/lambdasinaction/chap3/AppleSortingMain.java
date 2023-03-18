package lambdasinaction.chap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AppleSortingMain {

	public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.addAll(Arrays.asList(new Apple(80,"green"), new Apple(120, "red"), new Apple(155, "green"), new Apple(30, "green")));
        
        
        inventory.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(inventory);
        
        inventory.sort(Comparator.comparing(Apple::getColor));
        System.out.println(inventory);
        
	}

}
