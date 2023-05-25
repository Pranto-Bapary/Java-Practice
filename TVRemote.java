interface TVRemote {
    void tv();
}

interface SmartTVRemote extends TVRemote{
    void tv();
}

class TV implements TVRemote, SmartTVRemote{
    public void tv(){
        System.out.println("Hello I'm TV");
    }
}

class TestTV{
    public static void main(String[] args) {
        TV t = new TV();
        t.tv();
    }
}