package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupTheEmployeeByDepartment {

	public static void main(String[] args) {

		String str = "programming";
		List<Employee> employees = Arrays.asList(
				
				new Employee("Balu", 600000, "IT"),
				new Employee("Jonh", 700000, "HR"),
				new Employee("Indhu", 650000, "IT"),
				new Employee("Alice", 630000, "Finance"),
				new Employee("Abdul", 660000, "HR")
				
				);
		
		//1. Grouping the Department wise employees
		
		   Map<String, List<Employee>> gropingByEmployees = employees.stream()
		    .collect(Collectors.groupingBy(
		    		Employee::getDepartment,
		    		LinkedHashMap::new,
		    		Collectors.toList()));
		
		System.out.println(gropingByEmployees);
		
		
		//2. Get the second highest salary
           Double salary = employees.stream()
		.map(Employee::getSalary)
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst()
		.orElse(null);
           
           System.out.println(salary);
          
           
         //3. Count the each character occurrence
         Map<Character, Long>  Occurance= str.chars()
           .mapToObj(c->(char) c)
           .collect(Collectors.groupingBy(
        		   Function.identity(),
        		   Collectors.counting()));
  
		System.out.println(Occurance);
		
		//4. Sort the employees by salary
		 LinkedHashMap<String, Double> sortedSlary = employees.stream()
		.sorted(Comparator.comparing(Employee::getSalary))
		.collect(Collectors.toMap(Employee::getName, Employee::getSalary,
				(e1,e2)-> e1,
				LinkedHashMap:: new));
		 
		 System.out.println(sortedSlary);
		
		 
		 //5. Max salary of employee
		 double maxSalary = employees.stream()
		 .mapToDouble(Employee::getSalary)
		 .max()
		 .orElse(0);
		 
		 System.out.println(maxSalary);
		 
		 
		 //6. Find the duplicate numbers
		 List<Integer> nums = Arrays.asList(1,2,3,2,4,5,6,4,5,7,8);
		 Set<Integer> seen = new HashSet<Integer>();
		 
		List<Integer>  duplicateNums = nums.stream()
		 .filter(d->!seen.add(d))
		 .collect(Collectors.toList());
		
		System.out.println(duplicateNums);
		
		
		//7. Find the first non repeated character
		Character result = str.chars()
		.mapToObj(c->(char) c)
		.collect(Collectors.groupingBy(
				Function.identity(), LinkedHashMap::new,
				Collectors.counting()		
				))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.map(Map.Entry::getKey)
		.findFirst()
		.orElse(null);
		
		System.out.println(result);
	}

}
