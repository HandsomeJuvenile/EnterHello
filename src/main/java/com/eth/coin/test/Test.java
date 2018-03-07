package com.eth.coin.test;

import com.eth.coin.service.CoinService;
import org.web3j.crypto.CipherException;

import java.io.IOException;
import java.math.BigInteger;

public class Test {


    public void mint() {
        try {
            CoinService coinService = new CoinService();
            coinService.mint("0x3e739945a4D5c649a082C410d415FFaDBAeBb810",new BigInteger("520"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void send() {
        try {
            CoinService coinService = new CoinService();
            coinService.send("0xEc8dEF0715C776c872B827DFD8cEeC354fc2A5E6",new BigInteger("520"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Test test = new Test();
        test.send();
    }
}
