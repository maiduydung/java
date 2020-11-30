package review.quiz;

public class CourseNameCard extends NameCard{
    protected final String course;

    public CourseNameCard (String name, String course){
        super(name);
        this.course = course;
    }

    @Override
    public String getLabel() {
        // TODO Auto-generated method stub
        return super.getLabel() +"(Course: " + course + ")\n";
    }
}
