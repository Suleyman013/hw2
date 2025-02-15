public class Main {
    public static void main(String[] args) {
        Human carmella = new Human("Carmella", "Corleone", 1888);
        Human vito = new Human("Vito", "Corleone", 1887);
        Human michael = new Human("Michael", "Corleone", 1920);
        pet dog=new pet("Pitbull","Bob",13,99,new String[]{"sleep","eating","swimming","walking"});
        Family family1 = new Family(carmella, vito);
        Human walter = new Human("Walter", "White", 1979);
        Human skyler = new Human("Skyler", "White", 1981);
        Family family2 = new Family(skyler, walter);
        Human holly = new Human("Holly", "White", 2000);
        Human jimmy = new Human("Jimmy", "White", 2001);
        String[][] schedulemichael= {
                {"sunday", "rest"},
                {"saturday", "drink tequila"},
                {"Friday", "walking"}
        };
        String[][] scheduleholly= {
                {"sunday", "work"},
                {"saturday", "going university"},
                {"Friday", "walking"}
        };
        michael.setSchedule(schedulemichael);
        holly.setSchedule(scheduleholly);
        family2.addchild(holly);
        family2.addchild(jimmy);
        family1.addchild(michael);
        System.out.println(family1);
        System.out.println("----------------------------");
        System.out.println(family2);
        System.out.println("----------------------------");
        family2.removeChild(jimmy);
        System.out.println(family2);
         System.out.println("Number of family members: " + family1.Memmebersoffamily());
        System.out.println("Number of family members: " + family2.Memmebersoffamily());
    }
}
