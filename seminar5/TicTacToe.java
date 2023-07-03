package seminar5;

public class TicTacToe {

    private Converter converter;
    private FileOperations fileOperations;
    private GameField gameField;

    public TicTacToe() {
        this.converter = new Converter();
        this.fileOperations = new FileOperations();
        this.gameField = new GameField(converter);
    }

    public void savePosition(int number){
        String[] arr = converter.convertArrayToString(number);
        String[] clearArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            clearArr[i] = converter.getClearSign(arr[i]);
        }
        fileOperations.writeFile(converter.getEncodeBytesArray(clearArr));
    }

    public void loadPosition(){
        String[] arr = converter.getDecodeBytesArray(fileOperations.readFile());
        String[] arr2 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = converter.getSign(arr[i]);
        }
        gameField.fieldeDraw(arr2);
    }
}
