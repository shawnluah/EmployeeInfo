package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 17010564 on 17/7/2018.
 */

public class InfoItem {

    private String name;
    private String title;
    private float salary;

    public InfoItem(String name, String title, float salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    
}
