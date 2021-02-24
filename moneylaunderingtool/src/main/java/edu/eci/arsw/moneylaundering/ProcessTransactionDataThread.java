package edu.eci.arsw.moneylaundering;


import java.awt.*;
import java.io.File;

public class ProcessTransactionDataThread extends Thread {
    private List transctionFiles;
    private int a;
    private int b;
    private TransactionAnalyzer transactionAnalyzer;
    private TransactionReader transactionReader;
    private boolean pause;


    public ProcessTransactionDataThread(List transctionFiles, int a, int b,) {
        this.transctionFiles = transctionFiles;

    }
}
