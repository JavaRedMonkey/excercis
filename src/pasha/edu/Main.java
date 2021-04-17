package pasha.edu;

import javax.swing.text.StyledEditorKit;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class Main {
    public static boolean hasDuplicates(int [] array){
        List<Integer> list = Arrays.stream(array)
                .boxed().collect(Collectors.toList());
        List<Integer> list2 = list.stream().distinct()
                .collect(Collectors.toList());
        int size1 = list.size();
        int size2 = list2.size();

        if (size1 == size2)
            return false;
        return true;
    }
    public static void main(String[] args) {
	int [] array = {1 , 8 , 9 ,67487 , 2 , 4};
        System.out.println(hasDuplicates(array));
    }
}
