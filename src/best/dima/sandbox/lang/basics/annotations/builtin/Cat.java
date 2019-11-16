package best.dima.sandbox.lang.basics.annotations.builtin;

public class Cat extends Animal {
    @Override
    public void speak() { // This is a good override.
        System.out.println("Meow.");
    }

    @Override
    @Deprecated
    @SuppressWarnings("all")
    public String getType() { // public String gettype() { Compile-time error due to mistyped name.
        return "Cat";
    }
}
