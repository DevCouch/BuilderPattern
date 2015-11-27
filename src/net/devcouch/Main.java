package net.devcouch;

public class Main {

    public static void main(String[] args) {
        Bean bean = new Bean.Builder()
                        .firstName("Markus")
                        .lastName("Vieghofer")
                        .build();
        System.out.println(bean.toString());
    }
}
