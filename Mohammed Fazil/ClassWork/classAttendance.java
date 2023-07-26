class Attendance{
    void markAttendance(){
        System.out.println("No student");
    }
    void markAttendance(String...s)
    {
        System.out.println(s.length + " " + "student present");
        for(String name: s)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
       Attendance obj=new Attendance();
       obj.markAttendance();
       obj.markAttendance("karthick" , "fazil");
       
    }
}