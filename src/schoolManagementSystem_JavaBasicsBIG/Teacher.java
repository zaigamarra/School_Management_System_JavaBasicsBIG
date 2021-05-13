package schoolManagementSystem_JavaBasicsBIG;

/**
 * This class is responsible for keeping the track
 * of teacher´s name, id, salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new teacher objetc.
     * @param id id for the teacher.
     * @param name name of the teacher.
     * @param salary salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }


    /**
     * @return the id for the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     * @return the name for the teacher.
     */
    public String getName(){
        return name;
    }

    /**
     * @return the salary for the teacher.
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Update salary of the teacher.
     * @param salary new salary of the teacher.
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds to the salary earned.
     * Removes from the total money earned by the school.
     * @param salary
     * @return
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher: " + name
                + ", Total salary earned so far: $ " + salaryEarned;
    }
}
