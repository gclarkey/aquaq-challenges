class CompactHouse {

    static void drawHouse(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 0; j < h * 2; j++) {
                if (j == h - i) {
                    p('/');
                } else if (j == h + i - 1) {
                    p('\\');
                } else {
                    p((i == h) ? '_' : ' ');
                }
            }
            p('\n');
        }
        for (int i = h; i > 0; i--) {
            for (int j = 0; j < h * 2; j++) {
                if (j == 0 || j == (h * 2) - 1) {
                    p('|');
                } else {
                    p((i == 1) ? '_' : ' ');
                }
            }
            p('\n');
        }
    }

    static void p(char c) {
        System.out.print(c);
    }
}


