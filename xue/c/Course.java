package c;

public class Course {
	private String courseName;
    private int courseId;
    private Teacher teacher;
    private float credit;
    private Student[] students;
    public Course(int courseId,String courseName,float credit,Teacher teacher) {
        super();
        this.courseId=courseId;
        this.courseName=courseName;
        this.credit=credit;
        this.setTeacher(teacher);
        students = new Student[30];
    }
    public Course(int courseId,String courseName,float credit) {
        super();
        this.courseId=courseId;
        this.courseName=courseName;
        this.credit=credit;
        students = new Student[30];
    }

    public Course(int courseId,String courseName) {
        super();
        this.courseId=courseId;
        this.courseName=courseName;
        students = new Student[30];
    }

    public Course() {
        super();
        students = new Student[30];
    }

    public void setId(int id){
        this.courseId=id;
    }
    public int getId(){
        return this.courseId;
    }
    public void setName(String name){
        this.courseName=name;
    }
    public String getName(){
        return this.courseName;
    }
    public void setCredit(float credit ){
        this.credit=credit;
    }
    public float getCredit(){
        return this.credit;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean addStudent(Student stu){
        boolean flag = false;
        if(!isSelectedStudent(stu)&&isNullStudent(stu)){
            for(int i=0;i<students.length;i++){
                if(students[i]==null){
                    students[i]=stu;
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    
    public boolean removeStudent(Student stu){
        boolean flag=false;
        if(isSelectedStudent(stu)){
            for(int i=0;i<students.length;i++){
                if(students[i]==stu){
                    students[i]=null;
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
   
    public void displayStudent(){
        System.out.println("选择的课程："+this.courseName+"的学生有:");
        for(Student s:students){
            if(s!=null){
                System.out.print(s.getStuName()+" ");
            }
        }
        System.out.println();
    }
   
    public boolean isSelectedStudent(Student stu){
        boolean flag=false;
        for(Student s:students){
            if(s==stu){
                flag=true;
                break;
            }
        }
        return flag;
    }
   
    public boolean isNullStudent(Student stu){
        boolean flag=false;
        for(Student s:students){
            if(s==null){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
      
    }


}
