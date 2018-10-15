import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader= new FileReader("Dane.txt");

        String name;
        String lastName;
        String age;
        String pesel;
        Scanner scanner = new Scanner(fileReader);
        do {
            name = scanner.nextLine();
            lastName = scanner.nextLine();
            age = scanner.nextLine();
            pesel = scanner.nextLine();
            if(correctData(name, lastName, age,pesel))
                System.out.println("Podane dane są poprawne");
            else {
                System.err.println("Podane dane są niepoprawne, wprowadź ponownie dane");
                uncorrectData();
            }
        }while(scanner.hasNextLine());

        try {
            Person person = new Person(name, lastName, age, pesel);
            System.out.printf("Dane osoby to: %s %s %s %s ",person.getFirstName(), person.getLastName(),
                    person.getAge(), person.getPesel());
        }catch (NameUndefinedException e){
            System.err.println("Nie podano imienia/nazwiska lub podane dane są niepoprawne ");
        }catch (IncorrectAgeException e){
            System.err.println("Nie podano wieku lub podany wiek jest niepoprawny");
        }catch (IncorrectPeselException e){
            System.err.println("Podano błędny pesel");
        }
    }

    private static boolean correctData(String name, String lastName, String age, String pesel) {
        if(name==null||lastName==null||name.length()<2||lastName.length()<2)
            return false;
        if(age.equals("0")||age==null||age.length()>3||age.equals(""))
            return false;
        if(pesel.length()!=11)
            return false;
    return true;}

    private static void uncorrectData(){
       String name=null;
       String lastName=null;
       String age=null;
       String pesel=null;
    }
}

