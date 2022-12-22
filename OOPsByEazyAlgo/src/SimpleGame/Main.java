package SimpleGame;

public class Main {

    public static void main(String[] args) {
        Player1 player = new Player1("Danish","sward",1000);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());
//        player.damagedByGun1();
//        player.damagedByGun1();
//        player.damagedByGun2();
//
        Player2 betterPlayer = new Player2("Jam","ak47",100,false);
        betterPlayer.damagedByGun1();
        betterPlayer.damagedByGun1();
        betterPlayer.damagedByGun2();
        player.heal();
//        betterPlayer.damagedByGun1();
    }
}
