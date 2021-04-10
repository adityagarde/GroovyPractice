import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@EqualsAndHashCode
@TupleConstructor
class Person {
    int age
    String firstName
    String lastName

    String getFullName() {
        firstName + " " + lastName;
    }
}
