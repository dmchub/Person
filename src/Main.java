public class Main {
    public static void main(String[] args) {
        Person woman1 = new Person(false, "Marry");
        Person man1 = new Person(true, "Sam");
        Person woman2 = new Person(false, "Donna");
        Person man2 = new Person(true, "Garry");
        Person woman3 = new Person(false, "Susy");

        woman1.marry(man1);
        System.out.println(woman1.toString() + " " + man1.toString());
        woman1.marry(man2);
        System.out.println(woman1.toString()+" "+" "+man2.toString());
        woman1.marry(man2);
        System.out.println(woman1.toString()+" "+" "+man2.toString());
        woman1.marry(woman2);
        System.out.println(woman1.toString()+" "+" "+woman2.toString());
        woman2.marry(woman3);
        System.out.println(woman2.toString()+" "+" "+woman3.toString());
        man2.marry(woman3);
        System.out.println(man2.toString()+" "+" "+woman3.toString());
        System.out.println(man1.toString());
    }
}
