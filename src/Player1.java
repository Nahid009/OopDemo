public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1(String name, String weapon, int health) {
        this.name = name;               // এখানে player1 Constructor এর this keyword দিয়ে নেম ভারিয়েবল কে কল করা হয়েছে ।
        this.health = health;
        if (health < 0 || health > 100) {
            this.health = 100;        // এখানে হেলথ ভেরিয়েবল কে কল দিয়া হয়েছে এবং হেলথ = ১০০ ডিক্লে করা হয়েছে ।
        } else this.health = health; // এখানে এলস দিয়ে ভেরিয়েবল হেলথ = পেরামিটার হেলথ প্রকাশ করা হয়েছে ।
    }

    public void damageByGun1() {      // এখানে ড্যামেজ বাই গান একটা মেথড কল কলা হয়েছে ।
        this.health -= 30;           // তার পর হেলথ ভেরিয়াবল কল দিয়ে -= ৩০ পারছেন্ট লাইফ প্রকাশ করা হয়েছে।
        if (this.health <= 0) {     // ইফ ব্যাবহার করে হেলথ ভেরিয়েবল কল করা হয়েছে এবং হেলথ লেস দেন = ০ হয় তাহলে ভেরিয়েবল হেলথ = ০
            this.health = 0;
        }
        System.out.println("Got hit by gun 1. Health is reduce by 30" + ". New health is " + this.health); // এখানে প্রিন্ট করার জন্য কন্ডিশন লিখা হয়েে,
        if (this.health == 0) {   // এখানে ইফ যদি হেলথ  ভেরিয়াবল == জদি ০ হয় তাহলে প্লেয়ার ডেড প্রিন্ট করা হয়েছে ।
            System.out.println(getName() + " Is dead");
        }

    }


    public void damageByGun2() {  // এখানে ড্যামেজ বাই গান ২ একটা মেথড লেখা হয়েছে ।
        this.health -= 50;       // এখানে ভেরিয়েবল হেলথ -= যদি ৫০ হয় তাহলে ,
        if (this.health <= 0) { // ইফ যদি পরের লাইনে হেলথ ভেরিয়েবল লেস দেন = ০,
            this.health = 0;   // তাহলে ভেরিয়েবল হেলথ = ০ ;
        }
        System.out.println("Got hit by gun 1. Health is reduce by 50" + ". New health is " + this.health); // এখানে প্রিণ্ট করার জন্য কন্ডিশন লেখা হয়েছে ।
        if (this.health == 0) {  // এখানে ভেরিয়েবল হেলথ  == যদি হয় তাহলে প্রিন্ট করবে ইস ডেড ।
            System.out.println(getName() + " Is dead");
        }
    }

    public void heal() {    // এখানে হিল নামে একটা মেথড লেখা হয়েছে,
        if (this.health <= 0) System.out.println("Player is dead. Heal not possible"); // যদি হেলথ ভেরিয়েবল লেস দেন ০ হয় ,তাহলে প্রিন্ট করবে প্লেয়ার ইজ ডেড ।
        else {
            this.health = 100;
            System.out.println("Health is " + this.health);
        }
    }


    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}
