interface A {
    void show();
  }
  
  interface B {
    void show();
  }
  
  class MultipleInheritance implements A, B {
    public void show() {
      System.out.println("THIS IS INTERFACE A AND B");
    }
  
    public static void main(String[] args) {
      MultipleInheritance obj = new MultipleInheritance();
      obj.show();
    }
  }
  