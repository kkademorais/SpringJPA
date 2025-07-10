package AmigosCode.teste;

import jakarta.persistence.*;

// Entity - mapeia classe para a BD
    // Entity => Table dentro do BD
@Entity(name = "Student")
public class Student {

        // Atributos
    @Id /* Primary Key do DB */
    @SequenceGenerator(name = "student",
        sequenceName = "student_sequence",
        allocationSize = 1) /* Gera uma Sequence  */
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "student_sequence")
    @Column(name = "id",
        updatable = false)
    private Long id;

    @Column(name = "first_name",
        nullable = false,
        columnDefinition = "TEXT")
    private String firstName;

    @Column(name = "last_name",
        nullable = false,
        columnDefinition = "TEXT")
    private String lastName;

    @Column(name = "email",
        nullable = false,
        columnDefinition = "TEXT",
        unique = true)
    private String email;

    @Column(name = "age",
        nullable = false)
    private Integer age;

        // Construtor
    public Student(){}
    public Student(Long id, String firstName, String lastName, String email, Integer age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

        // Getters
        public Long getId() {return id;}
        public String getFirstName() {return firstName;}
        public String getLastName() {return lastName;}
        public String getEmail() {return email;}
        public Integer getAge() {return age;}

        // Setters
        public void setId(Long id) {this.id = id;}
        public void setFirstName(String firstName) {this.firstName = firstName;}
        public void setLastName(String lastName) {this.lastName = lastName;}
        public void setEmail(String email) {this.email = email;}
        public void setAge(Integer age) {this.age = age;}

        // ToString
        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }