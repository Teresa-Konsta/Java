import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;

public class NoDuplicate {
	
	Scanner scan = new Scanner(System.in);

	public void main(String[] args) {
		String[] firstNamesArr = new String[15];
		
		for (int i = 0; i < firstNamesArr.length; i++) {
			System.out.print("Enter your first name: ");
			firstNamesArr[i] = scan.nextLine();
		}

		List<String> namesList = Arrays.asList(firstNamesArr);
		
		FindDuplicates(namesList);
		SearchFirstName(namesList);
		
		System.out.print("List of first names: " + namesList);
	}
	
	public void FindDuplicates(Collection<String> firstNames)
	{
		Set<String> nameSet = new HashSet<String>(firstNames);
		for (Object nameObject : nameSet) {
			System.out.printf("/n", nameObject);
		}
	}

	public void SearchFirstName(Collection<String> firstNames) {
		Set<String> nameSet = new HashSet<String>(firstNames);

		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the first name: ");
			String firstName = scan.nextLine();
			if (nameSet.contains(firstName)) {
				System.out.printf("/nName " + firstName + " is already in the set");
			} else {
				System.out.printf("/nNo " + firstName + " was found");
			}
		}

	}
}