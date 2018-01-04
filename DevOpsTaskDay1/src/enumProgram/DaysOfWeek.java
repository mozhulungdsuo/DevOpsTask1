package enumProgram;

public enum DaysOfWeek {
 
MONDAY("working"), 
TUESDAY("working"), 	
WEDNESDAY("working"), 
THURSDAY("working"), 
FRIDAY("working"), 
SATURDAY("off"); 
private String typeOfDay;

DaysOfWeek(String typeOfDay) {
    this.typeOfDay = typeOfDay;
}

public String getTypeOfDay() {
	// TODO Auto-generated method stub
	return this.typeOfDay;
}
}
