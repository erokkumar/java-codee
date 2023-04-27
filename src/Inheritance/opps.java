package Inheritance;
    class Human{
        int age;
        void sleep(){
            int age =19;
            System.out.println("human needs good sleep");
            System.out.println(age);
        }
    }
    class Student extends  Human{

    }
    class Inheritance{
        public static void main(String[] args) {
            Student st= new Student();
            st.sleep();
        }
    }

