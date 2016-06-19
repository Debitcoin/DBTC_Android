package com.debitcoin.core.coins;

import com.debitcoin.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class NewCoinMain extends CoinType {
    private NewCoinMain() {
        id = "newcoin.main";

        addressHeader = 31;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 60;

        family = BitFamily.get();
        name = "Debitcoin";
        symbol = "DBTC";
        uriScheme = "Debitcoin";
        bip44Index = 99;
        unitExponent = 8;
        feePerKb = value(10000); // 0.0001 AUM
        minNonDust = value(1);
        softDustLimit = value(1000000); // 0.01 AUM
        softDustPolicy = SoftDustPolicy.AT_LEAST_BASE_FEE_IF_SOFT_DUST_TXO_PRESENT;
        signedMessageHeader = toBytes("Debitcoin Signed Message:\n");
    }

    private static NewCoinMain instance = new NewCoinMain();
    public static synchronized NewCoinMain get() {
        return instance;
    }
}