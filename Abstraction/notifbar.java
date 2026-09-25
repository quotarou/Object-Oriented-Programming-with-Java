abstract class Notification {
    String app;

    public Notification(String app) {
        this.app = app;
    }

    public void alert() {
        System.out.println("You have 1 new notification from " + app);
    }

    public abstract void sendNotif();

}

class Zomato extends Notification {
    public Zomato(String app) {
        super(app);
    }

    public void sendNotif() {
        System.out.println("16 missed calls from arsalan :(");
    }

}

class Instagram extends Notification {
    public Instagram(String app) {
        super(app);
    }

    public void sendNotif() {
        System.out.println("You have no new likes and messages :D");
    }

}

public class notifbar {
    public static void main(String[] args) {
        Notification newZomato = new Zomato("Zomato");
        Notification newInstagram = new Instagram("Instagram");
        
        newZomato.alert();
        newZomato.sendNotif();

        newInstagram.alert();
        newInstagram.sendNotif();
    }
    
}
