package springboot;
//Run the code to view

//@Autowired is used  to instantite another class object in the current class
//it could be done using constructor ,setter ,or class member variable

public class Annotations {
    public class Employee {

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public class EmployeeService {

        private Employee employee;

        // constructor is used for autowire by constructor
        public EmployeeService(Employee emp) {
            System.out.println("Autowiring by constructor used");
            this.employee = emp;
        }

        // default constructor to avoid BeanInstantiationException for autowire
        // byName or byType
        public EmployeeService() {
            System.out.println("Default Constructor used");
        }

        // used for autowire byName and byType
        public void setEmployee(Employee emp) {
            this.employee = emp;
        }

        public Employee getEmployee() {
            return this.employee;
        }
    }

    public static void main(String[] args) {

    }

}
