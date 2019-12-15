package pl.itacademy.lesson17;

public enum DayOfWeek {
    MON("Monday","Poniedziałek",true),
    TUE("Tuesday","Wtorek",true),
    WED("Wednesday","Środa",true),
    THU("Thursday","Czwartek",true),
    FRI("Friday", "Piątek",true),
    SAT("Saturday","Sobota",false),
    SUN("Sunday", "Niedziela",false);

    private String englishName;
    private String polishName;
    private Boolean workingDay;

    DayOfWeek(String englishName,String polishName,Boolean workingDay){
        this.englishName=englishName;
        this.polishName=polishName;
        this.workingDay=workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public Boolean getWorkingDay() {
        return workingDay;
    }

    public static DayOfWeek fromPolishName(String polishName){
        for (DayOfWeek dayOfWeek: values()){
            if(dayOfWeek.polishName.equals(polishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with Polish "+polishName);
    }
    public static DayOfWeek fromEnglishName(String englishName){
        for (DayOfWeek dayOfWeek: values()){
            if(dayOfWeek.englishName.equals(englishName)){
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with English "+englishName);
    }
    public Boolean isWeekend(){
        return !workingDay;
    }
}
