package T_polymorphism.Method overriding;

class Mom {
    public void cooking() {
        System.out.println("Mom is cooking meal.");
    }
}

class Daughter extends Mom {
    @Override
    public void cooking() {
        System.out.println("Papa ki pari is cooking meal.");
    }
}

public class a_method_overriding {
    public static void main(String[] args) {
        Daughter keti = new Daughter();
        keti.cooking();
    }
}
