package programmer.zaman.now.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(10);
        NumberData<Long> longNumberData = new NumberData<>(100L);

//        NumberData<String> stringNumberData = new NumberData<String>("Alvenio"); //ERROR


    }

    public static class NumberData<T extends Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
