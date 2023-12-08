package demo1;

public abstract class Phone {
    // chứa cac phương thức trừu tượng
    public abstract void call();

    // chứa phuong thuc binh thuong
    public void sendMess(){
        System.out.println("Xin chào");
    }

    public Phone() {
    }
}
