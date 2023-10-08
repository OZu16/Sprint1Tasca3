package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Month> monthList = new ArrayList<Month>();
		HashSet<Month> monthHashSet = new HashSet<>();
		
		monthList.add(new Month("gener"));
		monthList.add(new Month("febrer"));
		monthList.add(new Month("març"));
		monthList.add(new Month("abril"));
		monthList.add(new Month("maig"));
		monthList.add(new Month("juny"));
		monthList.add(new Month("juliol"));
		monthList.add(new Month("septembre"));
		monthList.add(new Month("octubre"));
		monthList.add(new Month("novembre"));
		monthList.add(new Month("desembre"));

		monthList.add(6, new Month("agost"));
		
		System.out.println("array list:\n");
		for (Month month : monthList) {
			monthHashSet.add(month);
            System.out.println(month.getName());
        }
		
		//HashSet<Month> monthHashSet = new HashSet<>(monthList);
		
		monthHashSet.add(new Month("desembre"));
		monthHashSet.add(new Month("desembre"));
		
		System.out.println("\nhashset bucle for:\n");
        for (Month month : monthHashSet) {
            System.out.println(month.getName());
        }
        
		System.out.println("\nhashset iterator:\n");
        Iterator<Month> iterator = monthHashSet.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month.getName());
        }
		
	}
}