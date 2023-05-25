package com.atamertc.example01.interfaceEnum;

enum Gun implements IHafta{
    PAZARTESI,
    SALI,
    CARSAMBA,
    PERSEMBE,
    CUMA,
    CUMARTESI,
    PAZAR;
    @Override
    public int kacinciGun() {
        return ordinal()+1;
    }
}
