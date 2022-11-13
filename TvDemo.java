class TV{
    public void on(){
        System.out.println("Channel on in 10s");
    }
    public void of(){
        System.out.println("Channel off in 20s");
    }

    public void ChangeChannel(){
        System.out.println("Channel changed");
    }
}

class STV extends TV{
    @Override
    public void on(){
        System.out.println("Channel on in 1s");
    }
    @Override
    public void of(){
        System.out.println("Channel off in 2s");
    }
    @Override
    public void ChangeChannel(){
        System.out.println("Channel changed quickly");
    }

    public void netflix(){
        System.out.println("Netflix");
    }

    public void youTube(){
        System.out.println("youTube");
    }
}
public class TvDemo {
    public static void main(String[] args) {
        // TV tv = new TV();
        // tv.on();
        // tv.of();
        // tv.ChangeChannel();
        // STV stv = new STV();
        // stv.on();
        // stv.of();
        // stv.ChangeChannel();
        TV mi = new STV(); 
        mi.on();
        mi.of();
        mi.ChangeChannel();
        mi.netflix();// not possible because i have remote of Tv only and i have only 3 button to click(on,of,cha);
    }
}
