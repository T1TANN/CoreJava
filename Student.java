public class Student {
    int age=20;
    String name="Abuzar";
    String Cname="java";

    void showDetails(){
        System.out.println("Age:"+age);
        System.out.println("Cname:"+Cname);
        System.out.println("name:"+name);

    }
}

class Java{
    public static void main(String args[]){
        Student st=new Student();
        st.showDetails();
    }
}


