class Employee {
    String name;
    int emp_id;
    Employee(String name,int emp_id){
        this.name=name;
        this.emp_id = emp_id;
        System.out.println("Employee Name is "+name+" And emp id is "+emp_id);
    }
    public static void main(String args[]){
        Employee e1 = new Employee("Danny",101);
        Employee e2 = new Employee("Deepak",102);


    }
}
