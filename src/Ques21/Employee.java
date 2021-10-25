package Ques21;

public class Employee {
    private long EmpId;
    private String EmpName;
    private String EmpDesignation;

    public Employee(long EmpId, String EmpName, String EmpDesignation){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpDesignation = EmpDesignation;
    }

    public long getEmpId(){
        return EmpId;
    }

    public String getEmpName(){

        return EmpName;
    }

    public String getEmpDesignation(){

        return EmpDesignation;
    }
}
