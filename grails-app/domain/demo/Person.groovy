package demo

class Person {
    String username
    String password

    static constraints = {
        password display: false
    }
}
