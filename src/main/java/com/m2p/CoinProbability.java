package com.m2p;

public class CoinProbability {
    private final double probability;
    CoinProbability(double probability){
        this.probability = probability;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }
        CoinProbability that = (CoinProbability) object;
        return probability == that.probability;
    }

    public CoinProbability eventOccurringTogether(CoinProbability anotherProbability) {
        return new CoinProbability(this.probability * anotherProbability.probability);
    }


    public CoinProbability complement() {
        return new CoinProbability(1 - this.probability);
    }
}
