import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader= new FileReader("Dane.txt");

        Scanner scanner= new Scanner(fileReader);
        String name= scanner.nextLine();
        String lastName= scanner.nextLine();
        String age= scanner.nextLine();
        String pesel= scanner.nextLine();
        try {
            Person person = new Person(name, lastName, age, pesel);
            System.out.printf("Dane osoby to: %s %s %s %s ",person.getFirstName(), person.getLastName(),
                    person.getAge(), person.getPesel());
        }catch (IncorrectAgeException e){
            System.err.println("Nie podano wieku lub podany wiek jest niepoprawny");
        }catch (NameUndefinedException e){
            System.err.println("Nie podano imienia/nazwiska lub podane dane są niepoprawne ");
        }





    }
}

