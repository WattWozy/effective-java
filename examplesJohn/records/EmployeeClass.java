import java.util.Objects;


public class EmployeeClass{

    private final String name;
    private final int employeeNumber;

    public EmployeeClass(String name, int employeeNumber){
        this.name=name;
        this.employeeNumber=employeeNumber;
    }

    public int getEmployeeNumber() {
        return this.employeeNumber;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "EmployeeClass(name=" + this.getName() + " and number:" + this.getEmployeeNumber() + ")";
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, employeeNumber);
    }

    @Override
    public boolean equals(Object obj){
        // Same memory reference?
        if (this == obj) return true;

        // not null, same class?
        if (obj == null || getClass() != obj.getClass()) return false;

        // Downcasting
        EmployeeClass employee = (EmployeeClass) obj;

        return Objects.equals(employeeNumber, employee.getEmployeeNumber())
        && Objects.equals(name, employee.getName());
    }


}