package seminar5;

public class GameField {

    private Converter converter;

    public GameField(Converter converter) {
        this.converter = converter;
    }

    public void fieldeDraw(String[] pos) {
        String[] line = new String[7];
        String shift = "          ";

        line[0] = shift +  "┌───┬───┬───┐";
        line[1] = shift +  "│ " + pos[0] + " │ " + pos[1] +  " │ " + pos[2] + " │";
        line[2] = shift +  "├───┼───┼───┤";
        line[3] = shift +  "│ " + pos[3] + " │ " + pos[4] +  " │ " + pos[5] + " │";
        line[4] = shift +  "├───┼───┼───┤";
        line[5] = shift +  "│ " + pos[6] + " │ " + pos[7] +  " │ " + pos[8] + " │";
        line[6] = shift +  "└───┴───┴───┘";

        for (String s : line) {System.out.println(s); }
    }

    public void getGamePosition(int number){
        String[] position = converter.convertArrayToString(number);
        String[] clearPosition = new String[position.length];
        String[] signs = new String[position.length];
        String snumber = "";
        for (int i = 0; i < position.length; i++) {
            clearPosition[i] = converter.getClearSign(position[i]);
            snumber += converter.getClearSign(position[i]);
            signs[i] = converter.getSign(clearPosition[i]);
        }

        System.out.println(snumber);
        fieldeDraw(signs);
    }

}
