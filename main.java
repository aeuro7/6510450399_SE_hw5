// 6510450399 Tibet Charoensripaiboon
// 6510450399 ทิเบต เจริญศรีไพบูลย์

public class main {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);


        System.out.println("Test 1");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);

        System.out.println("-----------");

        System.out.println("Test 2");
        gumballMachine.insertQuarter();
        gumballMachine.chooseFlavor("Mango");
        gumballMachine.chooseFlavor("Orange");
        gumballMachine.turnCrank();
        System.out.println(gumballMachine);



    }
}
