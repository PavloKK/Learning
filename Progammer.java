public class Progammer extends Person {

    protected int programmingExpierience = 0;

   // public Progammer() {

 //   }
    //  public Progammer(int programmingExpierience) {
//
//     this.programmingExpierience = programmingExpierience;
//}

     public void setProgrammingExpierience(int exp){
         this.programmingExpierience = exp;
     }
     public int ProgrammingExpierience(){
         return this.programmingExpierience;
     }

     public void descriptionOfPerson(){
         super.DescriptionOfPerson();
         System.out.println("I'm programmer and my experience is" + this.programmingExpierience);

     }
}
