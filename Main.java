import java.util.ArrayList;
import java.util.Collections;

//demonstrates uses of the methods in ArrayList class, useful for storing data without a fixed size.

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(45); // adds nums to arrlist
        nums.add(27);
        nums.add(33);
        nums.add(7);
        nums.add(62);

        System.out.println(nums);
        Collections.sort(nums); // sorts arrlist
        System.out.println(nums);
        System.out.println(nums.get(2)); // prints index of 2
        nums.set(2, 30); // sets index 2 to 30
        System.out.println(nums);
        nums.remove(0); // removes index of 0
        System.out.println(nums);
        nums.clear(); // clears the arrlist
        System.out.println(nums);

        nums.add(45); // adds nums to arrlist
        nums.add(27);
        nums.add(33);
        nums.add(7);
        nums.add(62);

        for(int i = 0; i < nums.size(); i++){ // iterates through nums and prints each index on a new line
            System.out.println(nums.get(i));
        }

    }
}
