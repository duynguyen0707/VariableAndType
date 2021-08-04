public enum Season {
    SPRING("XUAN"),
    SUMMER("HÈ"),
    AUTUMN("THU");

    String value;
    Season(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

}
