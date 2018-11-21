package pl.vulcan.uonetmobile.auxilary.enums;

public enum ExamType {
    NONE(-1),
    SPRAWDZIAN(1),
    KARTKOWKA(2),
    PRACA_KLASOWA(3);
    
    private final int e;

    private ExamType(int i) {
        this.e = i;
    }

    public static ExamType a(int i) {
        for (ExamType examType : values()) {
            if (examType.e == i) {
                return examType;
            }
        }
        return NONE;
    }
}
