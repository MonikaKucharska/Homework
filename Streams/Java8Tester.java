package pl.itacademy.lesson18homework;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Tester {
    public static void main(String[] args) {

        Address address = new Address("Kraków");
        Address address1 = new Address("Kielce");
        Address address2 = new Address("Warszawa");
        Address address3 = new Address("Kraków");
        Address address4 = new Address("Poznań");
        Address address5 = new Address("Kraków");

        LocalDate date = LocalDate.of(2002,8,12);
        LocalDate date1 = LocalDate.of(1995,1,30);
        LocalDate date2 = LocalDate.of(1997,7,26);
        LocalDate date3 = LocalDate.of(1999,5,14);
        LocalDate date4 = LocalDate.of(1950,9,5);
        LocalDate date5 = LocalDate.of(1950,3,12);

        List<Person> list = List.of(new Person("Jan","Kowalski",date,5000,address, Sex.MAN),
                new Person("Ewa","Nowak",date1,4000, address1, Sex.WOMAN),
                new Person("Adam","Piotrowski",date2,5200, address2, Sex.MAN),
                new Person("Karolina","Mikos",date3,7200, address3, Sex.WOMAN),
                new Person("Anna","Nowa",date4,4900,address4, Sex.WOMAN),
                new Person("Jan", "Michta",date5,6200,address5, Sex.MAN));

        List<Person> list1 = list.stream()
                .filter(person -> person.getSome_enum()==Sex.MAN&&person.getBirthDay().
                        plus(65, ChronoUnit.YEARS).isAfter(LocalDate.now()))
                .sorted(Comparator.comparing(Person::getBirthDay).reversed())
                .collect(Collectors.toList());
        System.out.println("Men under 65 years sorted by age "+list1);

        List<Person> list2 = list.stream()
                .filter(person -> person.getSome_enum()==Sex.WOMAN&&person.getSalary()<5000)
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
        System.out.println("Women with salary less than 5000 sorted by LastName "+ list2);

        List<Person> list3 = list.stream()
                .filter(person -> person.getBirthDay().plus(18,ChronoUnit.YEARS).isAfter(LocalDate.now())
                &&person.getAddress().getCity().equals("Kraków"))
                .sorted(Comparator.comparing(Person::getFirstName))
                .collect(Collectors.toList());
        System.out.println("Persons younger than 18 years from Krakow "+list3);

        List<Person> list4 = list.stream()
                .filter(person -> !(person.getAddress().getCity().equals("Kraków")))
                .sorted(Comparator.comparing(Person::getLastName))
                .collect(Collectors.toList());
        System.out.println("Persons who are not from Krakow "+ list4);

        Double AverageSalary = list.stream()
                .collect(Collectors.averagingDouble(Person::getSalary));
        System.out.println(AverageSalary);

        int countWomen = (int) list.stream()
                .filter(person -> person.getSome_enum()==Sex.WOMAN&&person.getAddress().getCity().equals("Kraków"))
                .count();
        System.out.println("number of women in Krakow "+countWomen);

        int countMen = (int) list.stream()
                .filter(person -> person.getSome_enum()==Sex.MAN&&person.getBirthDay().
                        plus(65,ChronoUnit.YEARS).isBefore(LocalDate.now()))
                .count();
        System.out.println("number of men after 65 years "+ countMen);

        Person oldest = list.stream()
                .min(Comparator.comparing(Person::getBirthDay))
                .get();
        System.out.println("Oldest person "+oldest);

        Person youngest = list.stream()
                .filter(person -> person.getAddress().getCity().equals("Kraków"))
                .max(Comparator.comparing(Person::getBirthDay))
                .get();
        System.out.println("Youngest person from Kraków "+youngest);

        Integer totalSalary = list.stream()
                .mapToInt(Person::getSalary)
                .sum();
        System.out.println("Total salary "+totalSalary);

        boolean firstLetterList1 = list1.stream().anyMatch(person -> person.getFirstName().startsWith("A"));
        System.out.println(firstLetterList1);
        boolean firstLetterList2 = list2.stream().anyMatch(person -> person.getFirstName().startsWith("A"));
        System.out.println(firstLetterList2);
        boolean firstLetterList3 = list3.stream().anyMatch(person -> person.getFirstName().startsWith("A"));
        System.out.println(firstLetterList3);
        boolean firstLetterList4 = list4.stream().anyMatch(person -> person.getFirstName().startsWith("A"));
        System.out.println(firstLetterList4);

        boolean letter1 = list1.stream().allMatch(person -> person.getLastName().contains("a"));
        System.out.println(letter1);
        boolean letter2 = list2.stream().allMatch(person -> person.getLastName().contains("a"));
        System.out.println(letter2);
        boolean letter3 = list3.stream().allMatch(person -> person.getLastName().contains("a"));
        System.out.println(letter3);
        boolean letter4 = list4.stream().allMatch(person -> person.getLastName().contains("a"));
        System.out.println(letter4);


    }
}
