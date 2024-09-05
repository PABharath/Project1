package locaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import junit.framework.Assert;

public class javaStream {

	public static void main(String[] args) {
       ArrayList<String> arr=new ArrayList<String>();
       arr.add("Siva");
       arr.add("Ali");
       arr.add("Adam");
       arr.add("Rama");
       arr.add("Mohan");
       
       long c=arr.stream().filter(s->s.startsWith("A")).count();
       System.out.println(c);
       
       long names= Stream.of("Bharath","om","siva","Manoj").filter(s->s.endsWith("j")).count();
       
       System.out.println(names);
       
       
       long d=arr.stream().filter(s->s.startsWith("A")).limit(1).count();
       System.out.println(d);
       
       arr.stream().filter(s->s.length()==4).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
       
       List<String> siva=Arrays.asList("Bharath","om","siva","Manoj","Bebu","Babloo");
    		  siva.stream() .filter(s->s.startsWith("B")).sorted().map(s->s.toLowerCase()).forEach(s->System.out.println(s));
    		  
    		  Stream<String>bhar=Stream.concat(arr.stream(), siva.stream());
    		  
    		  bhar.forEach(s->System.out.println(s ));
    		  
//    		boolean flag=  bhar.anyMatch(s->s.equalsIgnoreCase("siva"));
//    		System.out.println(flag);
//    		Assert.assertTrue(flag);
    		
    	List<String> names2=Stream.of("Siva","Bhar","omsai","giri").map(s->s.toLowerCase()).collect(Collectors.toList());
    	
    System.out.println(	names2.get(2));
    		  
//    
//    List<Integer> is=Arrays.asList(3,2,3,2,3,5,5,7,8);
//    is.stream().distinct().forEach(s->System.out.println(s));
//   List<Integer> p= is.stream().distinct().sorted().collect(Collectors.toList());
//   p.forEach(s->System.out.println(s));
    
 List<Integer> ab=Arrays.asList(8,9,7,2,2,3,3,4,5,6,7,8,4,3,5,6);
 ab.stream().distinct().sorted().forEach(s->System.out.println(s));
    
   List<String> siva1=Arrays.asList("Bharath","Ali","Ahmed","Balu","Bhar");
   
   
  long r=  siva1.stream().filter(s->s.startsWith("A")).map(s->s.toLowerCase()).count();		  
  
  System.out.println(r);
    		  
 List<String> bhar1= siva1.stream().filter(s->s.startsWith("A")).map(s->s.toLowerCase()).collect(Collectors.toList());
 
 bhar1.forEach(s->System.out.println(s));
	}

}
