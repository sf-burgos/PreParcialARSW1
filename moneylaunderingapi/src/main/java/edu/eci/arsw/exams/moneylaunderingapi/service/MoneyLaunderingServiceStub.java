package edu.eci.arsw.exams.moneylaunderingapi.service;

import edu.eci.arsw.exams.moneylaunderingapi.model.SuspectAccount;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
@Service
public class MoneyLaunderingServiceStub implements MoneyLaunderingService {

    private List<SuspectAccount> lista = new CopyOnWriteArrayList<>();

    public MoneyLaunderingServiceStub() {
        lista.add(new SuspectAccount("1", 1));
        lista.add(new SuspectAccount("2", 3));
        lista.add(new SuspectAccount("3", 2));
    }
    @Override
    public void updateAccountStatus(SuspectAccount suspectAccount) {

    }

    @Override
    public SuspectAccount getAccountStatus(String accountId) {
        return null;
    }

    @Override
    public List<SuspectAccount> getSuspectAccounts() {
        //TODO
        return lista;
    }

    @Override
    public void postSuspectAccount(SuspectAccount suspectAccount) {
        lista.add(suspectAccount);
    }
}
