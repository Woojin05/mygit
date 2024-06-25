public class prog {
    public static void main(String[] args) {
        Car car01 = new Car();

        car01.setModelName("아반떼");
        car01.setOwners("홍길동");
        System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners() + "\n");

        Car car02 = (Car)car01.clone();
        car02.setOwners("이순신");
        System.out.println("Car01 : " + car01.getModelName() + ", " + car01.getOwners());
        System.out.println("Car02 : " + car02.getModelName() + ", " + car02.getOwners());
    }
}