package juint_5;

public class Person {
    private String name;
    private Integer age;
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name == "") {
            System.out.println("name cannot be null or empty");
            this.name = "";
        } else if (name.trim().isEmpty()) {
            System.out.println("name cannot be white spaces");
            this.name = "";
        } else {
            this.name = name;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) throws InvalidAgeException {
        if (age == null || age < 0) {
            throw new InvalidAgeException("age cannot be null or in negative");
        } else if (age < 18) {
            throw new InvalidAgeException("age cannot be less than 18");
        } else {
            this.age = age;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email == "") {
            this.email = "";
            System.out.println("email cannot be empty or null");
        } else if (EmailFormatChecker.isEmailValid(email)) {
            System.out.println("email has a valid format");
            this.email = email;
        } else {
            this.email = "";
            System.out.println("invalid email");
        }

    }
}
