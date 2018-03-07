package com.eth.coin.service;

import com.eth.coin.contract.CoinContract;
import com.ly.ssm.utils.Consts;
import com.ly.ssm.utils.util;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;

import java.io.IOException;
import java.math.BigInteger;

public class CoinService {
    private CoinContract coinContract;

    public CoinService() throws IOException, CipherException {
        //  得到钱包凭证
        Credentials credentials = WalletUtils.loadCredentials(Consts.PASSWORD,Consts.PATH);
        // 创建合约
        coinContract = util.coinContract(credentials,Consts.CoinAddress);
    }


    public void mint(String receiver, BigInteger amount) throws Exception {
        if(receiver.length()>0 && amount!=null){
            // 这里需要使用.send（）方法
            coinContract.mint(receiver,amount).send();
        }
    }

    public void send(String receiver, BigInteger amount) throws Exception {
        if(receiver.length()>0 && amount!=null){
            coinContract.send(receiver,amount).send();
        }
    }
}
