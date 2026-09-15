public class Developer extends Employee
{
    private String progLanguage;

    public Developer(String progLanguage)
    {
        super("Parshuram", 500000);
        this.progLanguage = progLanguage;
    }

    public void displayEmployee()
    {
        System.out.println("Employee Name:"+eName);
        System.out.println("Salary:"+salary);
        System.out.println("Programming Language:"+progLanguage);
    }
    public void display()
    {
        class Project
        {
            private String projectName;
            private int duration;

            public Project(String p,int d)
            {
                projectName=p;
                duration = d;
            }
            public void displayProject()
            {
                System.out.println("Project Name:"+projectName);
                System.out.println("Duration: "+duration+" months");
            }
        }
        Project p = new Project("E-Commerce Website", 6);
        p.displayProject();
    }
}
