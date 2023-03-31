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
}
