package cn.edu.pku.sei.drivers;

import cn.edu.pku.sei.Explore;
import cn.edu.pku.sei.TestLogger;
import cn.edu.pku.sei.mapStructures.ParseErrorException;
import cn.edu.pku.sei.util.DirectoryProbe;
import cn.edu.pku.sei.util.NoiseFilterReader;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TsetExplore {

    //private static Explore app;
    public String fname = "/terrain.txt";

    

    @Test
    public void testMain() throws IOException, InterruptedException {
        String[] args = {fname};
        String expected = "0: (0, 5: 165) (0, 1: 165) \n" + 
        		"1: (1, 0: 165) (1, 2: 165) (1, 7: 165) (1, 6: 165) (1, 5: 165) \n" + 
        		"2: (2, 1: 165) (2, 7: 165) (2, 3: 165) \n" + 
        		"3: (3, 9: 165) (3, 4: 165) (3, 2: 165) (3, 7: 165) (3, 8: 195) \n" + 
        		"4: (4, 9: 165) (4, 3: 165) \n" + 
        		"5: (5, 6: 165) (5, 0: 165) (5, 1: 165) (5, 10: 165) \n" + 
        		"6: (6, 7: 165) (6, 12: 900) (6, 11: 185) (6, 1: 165) (6, 10: 165) (6, 5: 165) \n" + 
        		"7: (7, 1: 165) (7, 12: 165) (7, 6: 165) (7, 2: 165) (7, 3: 165) (7, 8: 195) \n" + 
        		"8: (8, 3: 195) (8, 9: 130) (8, 14: 195) (8, 13: 195) (8, 12: 130) (8, 7: 195) \n" + 
        		"9: (9, 14: 195) (9, 4: 165) (9, 3: 165) (9, 8: 130) \n" + 
        		"10: (10, 15: 165) (10, 11: 190) (10, 5: 165) (10, 6: 165) \n" + 
        		"11: (11, 6: 185) (11, 12: 900) (11, 15: 190) (11, 17: 190) (11, 16: 190) (11, 10: 190) \n" + 
        		"12: (12, 13: 195) (12, 8: 130) (12, 7: 165) (12, 6: 900) (12, 17: 900) (12, 11: 900) \n" + 
        		"13: (13, 8: 195) (13, 19: 195) (13, 14: 195) (13, 17: 900) (13, 12: 195) (13, 18: 900) \n" + 
        		"14: (14, 19: 143) (14, 13: 195) (14, 8: 195) (14, 9: 195) \n" + 
        		"15: (15, 16: 110) (15, 11: 190) (15, 20: 180) (15, 10: 165) \n" + 
        		"16: (16, 15: 110) (16, 21: 110) (16, 17: 190) (16, 22: 165) (16, 20: 180) (16, 11: 190) \n" + 
        		"17: (17, 22: 190) (17, 12: 900) (17, 16: 190) (17, 18: 195) (17, 13: 900) (17, 11: 190) \n" + 
        		"18: (18, 22: 195) (18, 23: 195) (18, 24: 195) (18, 13: 900) (18, 17: 195) (18, 19: 143) \n" + 
        		"19: (19, 13: 195) (19, 24: 195) (19, 14: 143) (19, 18: 143) \n" + 
        		"20: (20, 21: 180) (20, 25: 180) (20, 15: 180) (20, 16: 180) \n" + 
        		"21: (21, 27: 110) (21, 25: 180) (21, 20: 180) (21, 26: 180) (21, 16: 110) (21, 22: 180) \n" + 
        		"22: (22, 27: 180) (22, 21: 180) (22, 17: 190) (22, 18: 195) (22, 23: 165) (22, 16: 165) \n" + 
        		"23: (23, 24: 195) (23, 29: 165) (23, 28: 180) (23, 27: 180) (23, 18: 195) (23, 22: 165) \n" + 
        		"24: (24, 18: 195) (24, 19: 195) (24, 29: 195) (24, 23: 195) \n" + 
        		"25: (25, 20: 180) (25, 21: 180) (25, 26: 180) \n" + 
        		"26: (26, 27: 180) (26, 25: 180) (26, 21: 180) \n" + 
        		"27: (27, 26: 180) (27, 23: 180) (27, 21: 110) (27, 22: 180) (27, 28: 110) \n" + 
        		"28: (28, 29: 180) (28, 27: 110) (28, 23: 180) \n" + 
        		"29: (29, 28: 180) (29, 24: 195) (29, 23: 165) \n" + 
        		"";
        Explore.setLogger(new TestLogger());
        Explore.main(args);
        String result = Explore.getLogger().toString();
        assertEquals(expected,result);
    }


}
