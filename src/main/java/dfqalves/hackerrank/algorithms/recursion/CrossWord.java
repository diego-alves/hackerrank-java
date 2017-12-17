package dfqalves.hackerrank.algorithms.recursion;

public class CrossWord {

    static class Position {
        final int line, column;
        Position[] next;
        Character letter;

        Position(int line, int column) {
            this.line = line;
            this.column = column;
            this.next = new Position[4];
        }

        boolean isPosition(int line, int column) {
            return this.line == line && this.column == column;
        }
    }

    public static void main(String[] args) {

        char[][] input = {
            "+-++++++++".toCharArray(), //  "+L++++++++"
            "+-++++++++".toCharArray(), //  "+O++++++++"
            "+-++++++++".toCharArray(), //  "+N++++++++"
            "+-----++++".toCharArray(), //  "+DELHI++++"
            "+-+++-++++".toCharArray(), //  "+O+++C++++"
            "+-+++-++++".toCharArray(), //  "+N+++E++++"
            "+++++-++++".toCharArray(), //  "+++++L++++"
            "++------++".toCharArray(), //  "++ANKARA++"
            "+++++-++++".toCharArray(), //  "+++++N++++"
            "+++++-++++".toCharArray()  //  "+++++D++++"
        };

        Position pos = getPosition(input, 0, 1, null);


        write(pos, new String[] {"LONDON", "DELHI", "ICELAND", "ANKARA"}, 0, 0);

        System.out.println(pos);

    }

    private static Position getPosition(char[][] input, int line, int column, Position last) {
        if(line < 0 || column < 0 || line >= 10 || column >= 10 || input[line][column] != '-')
            return null;

        Position pos = new Position(line, column);

        for(int i = 0; i < 4; i++) {
            int l = (i - 1) % 2;
            int c = (2 - i) % 2;
            pos.next[i] = last == null || !last.isPosition(line + l, column + c) ? getPosition(input, line + l, column + c, pos) : last;
        }

        return pos;
    }

    private static void write(Position pos, String[] words, int word, int charAt) {
        if (pos == null || pos.letter != null || word >= words.length || charAt >= words[word].toCharArray().length)
            return;

        pos.letter = words[word].charAt(charAt);
//        write(pos.right, words, word, charAt);
//        write(pos.left, words, word, charAt);
//        write(pos.up, words, word, charAt);
//        write(pos.down, words, word, charAt);


    }

    private static void putWord(char[][] board, String word, String[] leftWords, int x, int y ) {

        if(board[y][x] == '-' || board[y][x] == word.charAt(0)) {
            board[y][x] = word.charAt(0);
            putWord(board, word.substring(1), leftWords, x, y+1);
            if (board[y][x+1] == '-') {
                for (String lword : leftWords) {
                    putWord(board, lword, leftWords, x, y);
                }

            }
        }

    }
}
