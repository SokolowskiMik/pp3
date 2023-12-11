class Volkswagen {
    private String maker;
    private String model;
    private int year;
    private boolean isEngineOn = false;



    
    public Volkswagen(String maker, String model, int year, boolean isEngineOn) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.isEngineOn = isEngineOn;
    }




    public void startEngine() {
        if (isEngineOn == false) {
            this.isEngineOn = true;
        } else {
            this.isEngineOn = true;
        }
        
    }

    public void stopEngine() {
        if (isEngineOn == true) {
            this.isEngineOn = false;
        }
    }

    public void displayInfo() {
        System.out.println(String.format("Make: %s, model:%s ,year:%d ,Is on?: %b", this.maker,this.model,this.year,this.isEngineOn));

    }
}