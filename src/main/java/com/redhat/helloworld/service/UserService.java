package com.redhat.helloworld.service;

import com.redhat.helloworld.contract.RegisterContract;
import com.redhat.helloworld.util.Consts;
import com.redhat.helloworld.util.Util;
import org.web3j.crypto.CipherException;
import org.web3j.crypto.Credentials;
import org.web3j.crypto.WalletUtils;

import java.io.IOException;

public class UserService {

    private RegisterContract contract;

    public UserService() throws IOException, CipherException {
        Credentials credentials = WalletUtils.loadCredentials(Consts.PASSWORD,Consts.PATH);
        contract = Util.getRegisterContract(credentials,Consts.REGISTER_ADDR);
    }

    public boolean login(String username, String password) throws Exception {
        return contract.login(username,password).send().getValue();

    }

}
