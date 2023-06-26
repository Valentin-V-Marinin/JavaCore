package seminar4;

public enum Discount {
    DISCOUNT0, DISCOUNT5, DISCOUNT10, DISCOUNT15, DISCOUNT20;

    public static Discount getRandomDiscount(int index){

        return switch (index) {
            case 0 -> DISCOUNT0;
            case 1 -> DISCOUNT5;
            case 2 -> DISCOUNT10;
            case 3 -> DISCOUNT15;
            case 4 -> DISCOUNT20;
            default -> DISCOUNT0;
        };
    }

    public static int getValueDiscount(Discount discount){
        return switch (discount) {
            case DISCOUNT0 -> 0;
            case DISCOUNT5 -> 5;
            case DISCOUNT10 -> 10;
            case DISCOUNT15 -> 15;
            case DISCOUNT20 -> 20;
            default -> 0;
        };
    }
}
