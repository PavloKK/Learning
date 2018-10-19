public class Driver extends Person {
    protected int drivingExperience = 0;

    public void setDrivingExperience(int dexp){
          this.drivingExperience = dexp;
    }
    public int getDrivingExperience() {
        return this.drivingExperience;
    }
        public void descriptionOfPerson(){
            super.DescriptionOfPerson();
            System.out.println("I'm driver and my experience is" + this.drivingExperience);

        }


}
