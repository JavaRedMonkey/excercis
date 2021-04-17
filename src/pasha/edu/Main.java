package pasha.edu;

import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static boolean hasDuplicates(int [] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length-1  ; i++) {
            if (array[i] == array [i + 1] ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
	int [] array = {1 , 5 ,8 , 9 ,67487 , 2 , 4};
        //System.out.println(hasDuplicates(array));

        String s1 = "Hello World";
        StringBuilder sb = new StringBuilder(s1);
        String reversed = sb.reverse().toString();
        //System.out.println(reversed);

        Student jhony = new Student("John" , LocalDate.of(1999 , 4 , 17 ) , 85);
        Student derrick = new Student("Derrick" , LocalDate.of(2004 , 9, 19 ) , 90);
        Student ethan = new Student("Ethan" , LocalDate.of(1987 , 2 , 3 ) , 2);
        Student william = new Student("William" , LocalDate.of(2000 , 6 , 19 ) , 50);
        Student george = new Student("George" , LocalDate.of(1998 , 12 , 10 ) , 100);

        List<Student> students = new ArrayList<>();
        students.add(jhony);
        students.add(derrick);
        students.add(ethan);
        students.add(william);
        students.add(george);
        //System.out.println(students);
        for (Student student:students){
            //System.out.println(item.getName());

            //if (student.getBirthday().getYear() > 2003) System.out.println(student.getName());

        }
        students.stream().filter(student -> student.getMark() > 80)
                .forEach(System.out::println);

        System.out.println(students.stream().filter(el -> el.getMark() > 80).count());

        System.out.println(students.stream().max(Comparator.comparing(student -> student.getMark())));
        System.out.println(students.stream().mapToInt(student -> student.getMark()).max().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getMark()).min().getAsInt());
        System.out.println(students.stream().mapToInt(student -> student.getMark()).sum());
        System.out.println(students.stream().mapToInt(student -> student.getMark()).average().getAsDouble());
        System.out.println(students.stream().count());


    }
}
