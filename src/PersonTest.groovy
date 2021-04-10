class PersonTest {
    static void main(String[] args) {

        Person person1 = new Person(24,"John", "Doe")
        Person person2 = new Person(26,"Jane", "Doe")
        Person person3 = new Person(25,"Aditya", "Garde")

        def allPersons = [person1, person2, person3]

        for(Person p : allPersons)
            println p.getFullName()

        assert allPersons instanceof List
        assert allPersons.size() == 3

        println allPersons[2]

        allPersons.each {println it}

        allPersons.eachWithIndex{ Person entry, int i ->
            println i + " : " + entry
        }

        println allPersons.find {it.firstName == "Aditya"} == person3

        println allPersons.collect {it.age < 30 }

        allPersons.sort {it.age }
        println allPersons
    }
}
