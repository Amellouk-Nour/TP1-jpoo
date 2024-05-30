package dates;

import java.time.LocalDate; 
import java.time.format.DateTimeFormatter; 

public class OperationDates { 
	public static void main(String[] args) { 
		  LocalDate today = LocalDate.now(); 
		  //LocalDate today = LocalDate.of(2024, 5, 30); 
		  
		  LocalDate nexMonth = today.plusMonths(1); 
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		  System.out.println("today (formatted): " + today.format(formatter)); 
		  System.out.println("nexMonth (formatted): " + nexMonth.format(formatter)); 
	 } 
} 