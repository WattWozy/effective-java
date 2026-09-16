public class RecordsTutorial{

    public static void main(String[] args){
        EmployeeClass employee = new EmployeeClass("john", 1234);
        System.out.println(employee.toString());

        EmployeeRecord employeeRecord = new EmployeeRecord("kramer", 2345);
        System.out.println(employeeRecord.toString());
    }

}