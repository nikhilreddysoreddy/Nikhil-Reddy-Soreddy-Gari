import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem_4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the list: ");
		int tElements=sc.nextInt();
		
		System.out.println("Enter "+tElements+" elements of list: ");
		List<Integer> iList=new ArrayList<Integer>();
		for(int i=1;i<=tElements;i++) {
			int element=sc.nextInt();
			iList.add(element);
		}
		Map<Integer, Integer> resultMap=new HashMap<Integer, Integer>();
		for(int i=1;i<=9;i++) {
			int count=0;
			for(int element:iList) {
				if(element%i==0)
					count++;
			}
			resultMap.put(i, count);
		}
		for(int key:resultMap.keySet()) {
		System.out.print(key+" : "+resultMap.get(key)+", "); }
		 
	}

}
