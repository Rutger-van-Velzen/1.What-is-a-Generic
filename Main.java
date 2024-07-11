public class Main {
    public static void main(String... args){
        example_1();
        example_2();
    }




    static void example_1(){
        Box_1 box = new Box_1();
        box.setValue("Some Value");

        String someValue = (String) box.getValue();

        System.out.println(someValue);
    }

    static class Box_1{
        private Object value;

        public void setValue(Object value){
            this.value = value;
        }

        public Object getValue(){
            return value;
        }
    }






    static void example_2(){
        Box_2<String> box = new Box_2<>();
        box.setValue("Some Value");

        String someValue = box.getValue();

        System.out.println(someValue);
    }

    static class Box_2<T>{
        private T t;

        public void setValue(T t){
            this.t = t;
        }

        public T getValue(){
            return t;
        }
    }
}







