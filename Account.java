public class Account{
    int number;
    String name;
    String type;

    public Account(int number, String name, String type) {
        this.number = number;
        this.name = name;
        this.type = type;
    }
    public Account() {
    }

    String acc(){
        if (type == "")
            return number+"\t"+name+"\t"+"Saving";
        return number+"\t"+name+"\t"+type;
    }
}
