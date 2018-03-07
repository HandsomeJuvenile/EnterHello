package com.redhat.helloworld.contract;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

public class RegisterContract extends Contract {

    /*自带构造方法*/
    public RegisterContract(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super("", contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    /**
     * 登录
     */
    public RemoteCall<Bool> login(String username, String password) throws IOException {
        Function function = new Function("login", Arrays.<Type>asList(new Utf8String(username),new Utf8String(password))
                ,Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {
        }));
        return executeRemoteCallSingleValueReturn(function);
    }
}
