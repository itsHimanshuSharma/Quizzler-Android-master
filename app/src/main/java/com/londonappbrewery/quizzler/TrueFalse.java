package com.londonappbrewery.quizzler;

public class TrueFalse
{
    private int mQuestionId;
    private boolean mAnswer;

    public TrueFalse(int questionResourceID, boolean trueOrFalse)
    {
        mQuestionId = questionResourceID;
        mAnswer = trueOrFalse;
    }
}
