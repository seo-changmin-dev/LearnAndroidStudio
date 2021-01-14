package scmDev.com;

public class SportsCar extends Car{

    private boolean isOpenSunRoof = false;

    public SportsCar(int acceleration, int maxSpeed, int brakeSpeed) {
        super(acceleration, maxSpeed, brakeSpeed);
    }

    public void setOpenSunRoof() {
        isOpenSunRoof = true;
    }

    public void closeSunRoof() {
        isOpenSunRoof = false;
    }

    public String getSunRoofInfo() {
        if(isOpenSunRoof) return "선루프가 열려있습니다.";
        else return "선루프가 닫혀있습니다.";
    }

    public String getCurrentSpeedText() {
        return "스포츠카의 " + super.getCurrentSpeedText();
    }
}
