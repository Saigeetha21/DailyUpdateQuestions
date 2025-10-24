package mar20.comparableinterface.com;

import java.sql.Date;
import java.util.*;


public class DateSortingExample {
	public static void main(String[] args) {
        Date[] dates = {
            new Date(2024, 2, 15), // Note: Deprecated constructor used for simplicity
            new Date(2024, 0, 31),
            new Date(2024, 3, 8)
        };

        Arrays.sort(dates);

        System.out.println("Sorted Dates:");
        for (Date date : dates) {
            System.out.println(date);
        }
    }
	  

}
