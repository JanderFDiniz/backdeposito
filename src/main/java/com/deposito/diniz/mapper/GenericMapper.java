package com.deposito.diniz.mapper;

public interface GenericMapper<VFrom, VTo> {
    VTo map(VFrom tfrom);
}
