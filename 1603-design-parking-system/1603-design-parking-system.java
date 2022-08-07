class ParkingSystem {
    int big = 0;
    int medium = 0;
    int small = 0;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        boolean flag = false;
        switch(carType){
            case 1:
                if(big > 0){
                    big--;
                    flag = true;
                }
                break;
            case 2:
                if(medium > 0){
                    medium--;
                    flag = true;
                }
                break;
            case 3:
                if(small > 0){
                    small--;
                    flag = true;
                }
                break;
            default:
                flag = false;
        }
        return flag;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */