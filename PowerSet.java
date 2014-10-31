
import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    private static ArrayList<List<Integer>> allSubset = new ArrayList<List<Integer>>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        
    	ArrayList<Integer> l1 = new ArrayList<>();
    	l1.add(1);
    	l1.add(2);
    	getSubSet(l1,0);
    }

    public static void getSubSet(ArrayList<Integer> set, int index) {
        if (set.size() == index) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            allSubset.add(temp);
        } else {
            getSubSet(set, index + 1);
            ArrayList<List<Integer>> tempAllSubsets = new ArrayList<List<Integer>>();
            for (List subset : allSubset) {
                ArrayList<Integer> newList = new ArrayList<Integer>();
                newList.addAll(subset);
                newList.add(set.get(index));
                tempAllSubsets.add(newList);
            }

            allSubset.addAll(tempAllSubsets);
        }

    }

}

