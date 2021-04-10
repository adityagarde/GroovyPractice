class HelloWorld {
    static void main(String[] args) {
        println "Hello World!"

        Person person1 = new Person()
        person1.setAge(50);
        person1.setFirstName("John")
        person1.setLastName("Doe")

        println(person1.getAge())
        println(person1.getFullName())

        if(person1.getAge() >= 45 && person1.getAge() < 65) {
            println(person1.getFullName() + " is middle aged ")
        } else {
            println("age = " + person1.getAge())
        }

        def persons = [person1, new Person(firstName: "Jane", lastName: "Doe", age: 45)]

        for(Person p : persons) {
            println p.getFullName()
        }
        try {
            assert person1.getFirstName() == "Johnny" : "Name should be Johnny"
        } catch (Exception | AssertionError e) {
            println e.getMessage()
        }

        println person1.toString();
        println person1.hashCode();

        Closure personToString = {Person person -> println person.toString()}
        personToString(person1)

        println "before : " + System.currentTimeSeconds();
        sleep(50000)
        println "after  : " + System.currentTimeSeconds();

    }
}
