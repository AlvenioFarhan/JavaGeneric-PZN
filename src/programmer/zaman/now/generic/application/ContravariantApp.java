package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Alvenio");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());

    }

    public static void process(MyData<? super String> myData) {

        Object value = myData.getData(); //Rawan untuk get datanya, kebalikan dari Covariant
        System.out.println("Process parameter " + value);

        myData.setData("Alvenio Farhan");
    }
}
