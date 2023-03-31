package com.m2p;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class CoinProbabilityTest {


    @Test
    void toCheckIfProbabilityOfHeadsIsSameAsTail(){
        CoinProbability HeadsProbability = new CoinProbability(0.5);
        CoinProbability tailProbability = new CoinProbability(0.5);

        assertThat(HeadsProbability , is(equalTo(tailProbability)));
    }

    @Test
    void toCheckIfProbabilityOfHeadsIsNotSameAsTail(){
        CoinProbability HeadsProbability = new CoinProbability(0.5);
        CoinProbability tailProbability = new CoinProbability(0.16);

        assertThat(HeadsProbability , is(not(equalTo(tailProbability))));
    }

    @Test
    void toCheckIfProbabilityOfHeadsIsNotSameAsNull(){
        CoinProbability HeadsProbability = new CoinProbability(0.5);

        assertThat(HeadsProbability , is(not(equalTo(null))));
    }

    @Test
    void comparingObjectToPrimitiveDataType(){
        CoinProbability HeadsProbability = new CoinProbability(0.5);
        double tailProbability = 0.5;
        assertThat(HeadsProbability , is(not(equalTo(tailProbability))));
    }

    @Test
    void toReturnTheJointProbability(){
        CoinProbability eventOfOneProbability = new CoinProbability(0.5);
        CoinProbability anotherProbability = new CoinProbability(0.3);

        CoinProbability result = new CoinProbability(0.15);

        assertThat(eventOfOneProbability.eventOccurringTogether(anotherProbability), is(equalTo(result)));
    }

    @Test
    void toCheckIfCertainEventTakesPlace(){
        CoinProbability expectedEventOccurring = new CoinProbability(1);
        CoinProbability actualEventOccurring = new CoinProbability(1);

        CoinProbability result = new CoinProbability(1);
        assertThat(expectedEventOccurring.eventOccurringTogether(actualEventOccurring)  , is(equalTo(result)));
    }


    @Test
    void toReturnTheJointProbabilityWhenItIsNotSame(){
        CoinProbability eventOfOneProbability = new CoinProbability(0.5);
        CoinProbability anotherProbability = new CoinProbability(0.3);

        CoinProbability result = new CoinProbability(0.05);

        assertThat(eventOfOneProbability.eventOccurringTogether(anotherProbability), is(not(equalTo(result))));
    }
}
