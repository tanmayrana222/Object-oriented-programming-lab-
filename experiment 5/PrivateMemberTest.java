class Parent {
    private int privateNumber = 42;
    public int getPrivateNumber() {
        return privateNumber;
    }
}

class Child extends Parent {
    void display() {                                                    
        System.out.println("Accessing Private Number via method: " + getPrivateNumber()); 
    }
}

public class PrivateMemberTest {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
