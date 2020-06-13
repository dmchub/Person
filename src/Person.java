public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person){
        if(this.man != person.man){
            if(this.spouse != null){
                this.divorce();
            }
            if(person.spouse != null){
                person.divorce();
            }
            if(this.spouse==null | person.spouse==null){
                this.spouse = person;
                person.spouse = this;
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String spouseName = "Not marred";
        if(this.spouse != null){
            spouseName = this.spouse.name;
        }
        return this.name + " " + spouseName;
    }

    public boolean divorce() {
        if(this.spouse != null){
            this.spouse.spouse = null;
            this.spouse = null;
            return true;
        }
        return false;
    }
}
