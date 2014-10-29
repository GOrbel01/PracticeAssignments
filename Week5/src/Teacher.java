/**
 * Created by Squall on 29/10/2014.
 */
public class Teacher {
    private String name;

    public Teacher(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void teach(String lessonName)
    {
        System.out.println("Teaching Lesson: " + lessonName);
    }


}
