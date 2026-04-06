import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> b = new HashSet<>();
        for (int[] o : obstacles) {
            b.add(o[0] + "," + o[1]);
        }

        int[][] dirn= {{0, 1}, {1, 0}, {0, -1}, {-1, 0} };
        int x = 0, y = 0;
        int dir = 0;
        int md = 0;

        for (int cmd : commands) {
            if (cmd == -1) {
                dir = (dir + 1) % 4; 
            } 
            else if (cmd == -2) {
                dir = (dir + 3) % 4;
            } 
            else {
                while (cmd-- > 0) {
                    int nx = x + dirn[dir][0];
                    int ny = y + dirn[dir][1];
                    if (b.contains(nx + "," + ny))
                    break;

                    x = nx;
                    y = ny;

                    md= Math.max(md, x * x + y * y);
                }
            }
        }
        return md;
    }
}