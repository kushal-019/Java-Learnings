
import java.util.function.*;
import java.lang.*;
import java.io.*;


class LambdaFuncSqrt{
    public static void main(String args[]){

        Function<Integer , Double> Sqrt= (num) ->{
            return Math.sqrt(num);

        };

        Function<String , String> UpperCase=(s)->{
            return s.toUpperCase();
        };

        System.out.println(Sqrt.apply(12));
        System.out.println(Sqrt.apply(16));
        System.out.println(Sqrt.apply(14));

        System.out.println(UpperCase.apply("kushal"));
        System.out.println(UpperCase.apply("kush"));
        System.out.println(UpperCase.apply("ku"));



         Function<Supplier<String>, Consumer<String>> supplierConsumerFunction = (supplier) -> {
	        final String randomIdFromSupplier = supplier.get();
	        Consumer<String> consumer = (randomIdFromConsumer) -> {
	            for (int i = 0; i < 10; i++) {
	                System.out.println(i + " " + randomIdFromConsumer + " " + randomIdFromSupplier);
	            }
	        };
	        return consumer;
	    };
	    
	    supplierConsumerFunction.apply(() -> {
	        return String.valueOf("randomId -- " + (Math.random() * 1000) + "-- ");
	    }) .accept("Log System");


    }
}