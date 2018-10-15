public class Person {
    String firstName;
    String lastName;
    String age;
    String pesel;

    public Person(String firstName, String lastName, String age, String pesel) {
        if(firstName==null||lastName==null||firstName.length()<2||lastName.length()<2)
            throw new NameUndefinedException();
        else{
            this.firstName = firstName;
            this.lastName = lastName;
            }
        if(age.equals("0")||age==null)
            throw new IncorrectAgeException();
        else
            this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
