import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {

//        Test Case
        String input = "1.2.1.2.2.3.4.5.5.5.5";
        String[] inputArray = input.split("\\.");

//        Find Duplicated
        List<Integer> duplicates = findDuplicates(inputArray);

//        Pirnt Result
        System.out.println(duplicates);
    }


    private static List<Integer> findDuplicates(String[] inputArray) {
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

//        Count of each
        for (String s : inputArray ) {
            int num = Integer.parseInt(s);
            resultMap.put(num, resultMap.getOrDefault(num, 0)+1);
        }

//         collect
        for ( int num : resultMap.keySet()) {
            if (resultMap.get(num) > 1) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
