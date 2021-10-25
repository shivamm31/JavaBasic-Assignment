package Ques21;

public class Main {
    public static void main(String[] args) {
        EmpDetail emp = new EmpDetail();
        Employee[] obj = new Employee[4];
        obj[0] = new Employee(1564,"John","Sr. Software Consultant");
        obj[1] = new Employee(1658,"Roman", "Content Writer");
        obj[2] = new Employee(1895,"Brain","Software Consultant");
        obj[3] = new Employee(1647,"Harry","Java Developer");
        emp.setDetail(obj);
        Employee[] emp1 = emp.getDetail();
        for (Employee employeeDetail: emp1){
            System.out.println("Name --> " + employeeDetail.getEmpName() + "\n"
                    + "Employee ID --> " + employeeDetail.getEmpId() + "\n"
                    + "Designation --> " + employeeDetail.getEmpDesignation());
        }
    }
}
