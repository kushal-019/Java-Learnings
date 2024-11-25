import java.util.*;
import java.util.stream.*;

class Stream{
    public static void main(String args[]){

        filter -> to filter out data 
        map -> to return a value with some required changes
        reduce  -> to apply certain operation on complete stream by passing 2 values at a time 1-> default value 2-> (a,b);
        collect ->  to recieve output in predefinded format
        Collectors.groupingBy() -> Grouping on the basis of criteria defined inside this function  
                .collect(Collectors.groupingBy((name)->name.charAt(0) , Collectors.counting())); 
                (name)->name.charAt(0) <- condition of grouping
                Collectors.counting() <-  to do on the basis of grouping criteria

        // List<String>names = Arrays.asList("kushal", "vishal" , null);

        removing null values

        // List<String>fileredNames = names.stream()
        // .filter((name)->name != null)
        // .collect(Collectors.toList());


        uppercasing all values

        // List<String>fileredNames = names.stream()
        // .filter((name)->name != null)
        // .map((name)->name.toUpperCase())
        // // .map(String :: toUpperCase)
        // .collect(Collectors.toList());


        combining all values
        
        // String combinedValue = names.stream()
        //         .filter((name)->name != null)
        //         .reduce("" , (a,b)->a+b);
        
        
        // List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        summing all values

        // Integer sum = numbers.stream()
        //             .filter((num)->num != null)
        //             // .reduce(0 , (a,b)->a+b);
        //             .reduce(0 , Integer::sum);

        Grouping names on basis of first char

        // List <String> names = Arrays.asList("Kushal" , "kush" , "vishal", "Vish");

        // Map<Character , List<String>> mp = names.stream()
        //                 // .map((name)-> name.toUpperCase())
        //                 .collect(Collectors.groupingBy((name)->name.charAt(0)));

        Counting frequency of all starting characters

        // Map<Character , Long> mp = names.stream()
        //                 .map((name)-> name.toUpperCase())
        //                 .collect(Collectors.groupingBy((name)->name.charAt(0) , Collectors.counting())); 
        //                 //  name.charAt(0)  <<<----- key for the map
        //                 //  Collectors.counting()  <<<---  task to preform

        Grouping on the basis of length 

        // Map<Integer , List<String>> mp = names.stream()
        //                 // .map((name)-> name.toUpperCase())
        //                 .collect(Collectors.groupingBy((name)->name.length()));        

        // System.out.println(mp);
    }
}