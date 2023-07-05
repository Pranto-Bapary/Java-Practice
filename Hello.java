interface Hello {
    String h = "hello ";
    String hello();
}

interface World extends Hello{
    String w = "world ";
    String world();
}

class People implements Hello, World{
    public String hello(){
        return w + h;
    }

    public String world(){
        return h + w;
    }
}

class TestInterface{
    public static void main(String[] args) {
        People p = new People();
        System.out.println(p.hello());
        System.out.println(p.world());
    }
}
