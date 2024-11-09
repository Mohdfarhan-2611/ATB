package October.October_14102024_Abstraction.ex5;

public class ATB {
    public static void main(String[] args) {

        ABC abc = new ABC();
        abc.f1();

        XYZ xyz = new XYZ();
        xyz.display();

    }

    static class XYZ extends ABC {
        void display(){
            f1();
        }

    }


    static class ABC implements I2, I1{


        @Override
        public void f1() {
            System.out.println("f1");
        }

        @Override
        public void f2() {

        }

        @Override
        public void f3() {

        }

        @Override
        public void f4() {

        }
    }


    interface I1{
        void f1();
        void f2();
    }

    interface I2{
        void f3();
        void f4();
    }
}
