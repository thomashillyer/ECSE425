package core;

import java.util.*;
import java.util.logging.Logger;
import edumips64.core.is.*;
import edumips64.utils.*;

public class BranchPredictTaken
{
    
    public static long getOffset(Instruction theInstruction)
    {
        //check to see if the instruction is a branch
        String instrName = theInstruction.getName();
        int offset;
        if(instrName.equals("BEQ") || instrName.equals("BEQZ") || instrName.equals("BGEZ") || instrName.equals("BNE") || instrName.equals("BNEZ"))
        {
            if( instrName.equals("BEQZ") || instrName.equals("BGEZ") || instrName.equals("BNEZ"))
            {
                offset = theInstruction.getParams().get(1);
            }
            else
            {
                offset = theInstruction.getParams().get(2);
            }

            return offset;
        }
        else
        {
            return 4;
        }
    }
}