import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private Map<Integer, String> employees;

    public EmployeeManager() {
        employees = new HashMap<>();
    }

    public void addEmployee(int employeeId, String employeeName) {
        employees.put(employeeId, employeeName);
    }

    public String getEmployeeName(int employeeId) {
        return employees.get(employeeId);
    }

    public void displayEmployees() {
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(1, "John Doe");
        manager.addEmployee(2, "Jane Doe");
        manager.addEmployee(3, "Bob Smith");
        manager.displayEmployees();
        System.out.println("Employee Name for ID 2: " + manager.getEmployeeName(2));
    }
}4