package com.eth.coin.contract;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.*;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;

import java.math.BigInteger;
import java.util.Arrays;

public class CoinContract extends Contract{

    /*自带构造方法*/
    public CoinContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super("", contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    /**
     * 给主账号加钱
     * TransactionReceipt 事务  一般作用于增删改这样的操作吧
     * @param receiver
     * @param amount
     * @return
     */
    public RemoteCall<TransactionReceipt> mint(String receiver, BigInteger amount){
        Function function = new Function("mint",  //  function的名字
                Arrays.<Type>asList(new Address(receiver),new Uint(amount)), // 这里主要是传递需要参数
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallTransaction(function);
    }

    /**
     * 账号交易
     *
     * @param receiver
     * @param amount
     * @return
     */
    public RemoteCall<TransactionReceipt> send(String receiver, BigInteger amount){
        Function function = new Function("send", Arrays.<Type>asList(new Address(receiver),new Uint(amount)),
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
                }));
        return executeRemoteCallTransaction(function);
    }

}
