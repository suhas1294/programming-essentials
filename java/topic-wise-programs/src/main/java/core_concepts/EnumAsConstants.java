package core_concepts;

public enum EnumAsConstants {

    EXPORT("qwertyuiop"),
    IMPORT("asdfghjkl");
    private final String msg;

    private EnumAsConstants(String msg) {
        this.msg = msg;
    }

    public String returnSOmething(){
        return msg;
    }

}
