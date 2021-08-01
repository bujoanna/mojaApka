public class Houses {

    int house;
    int tenement;

    public int sum(int house, int tenement) {
        this.house = house;
        this.tenement = tenement;
        int sum = house + tenement;
        System.out.println();
        System.out.println("Suma wszystkich budynków: " + sum);
        return sum;
    }


}
