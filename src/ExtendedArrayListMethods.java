import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtendedArrayListMethods {
    public <T> ArrayList differenceOfArrayList(ArrayList<T> list, T[] array) {
        // Make the array to ArrayList for simpler code
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));

        // Return the difference of the two containers
        return getDiffrance(arrayList, list);
    }

    private <T> ArrayList<T> getDiffrance(ArrayList<T> list1, ArrayList<T> list2){
        if(list1.size() >= list2.size()){
            return new ArrayList<>(list1
                                .stream()
                                .filter(n -> !list2.contains(n))
                                .collect(Collectors.toList()));
        } else {
            return new ArrayList<>(list2
                    .stream()
                    .filter(n -> !list1.contains(n))
                    .collect(Collectors.toList()));
        }
    }
}
