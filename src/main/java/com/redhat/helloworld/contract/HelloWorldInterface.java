package com.redhat.helloworld.contract;

import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;

/**
 * @author littleredhat
 */
public interface HelloWorldInterface {

    // get
    public RemoteCall<Uint256> get();

    // set
    public RemoteCall<TransactionReceipt> set(int x);

    // send
    public RemoteCall<TransactionReceipt> send(String reciver,int amount);

    // mint
    public RemoteCall<TransactionReceipt> mint(String reciver,int amount);
}
