package edu.eci.arsw.exams.moneylaunderingapi;


import edu.eci.arsw.exams.moneylaunderingapi.model.SuspectAccount;
import edu.eci.arsw.exams.moneylaunderingapi.service.MoneyLaunderingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/fraud-bank-accounts")
public class MoneyLaunderingController
{
    @Autowired
    MoneyLaunderingService moneyLaunderingService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> offendingAccounts() {
        return new ResponseEntity<>(moneyLaunderingService.getSuspectAccounts(), HttpStatus.ACCEPTED);
    }
    @RequestMapping (method = RequestMethod.POST)
    public ResponseEntity<?> offendingAccountsbyID(@RequestBody SuspectAccount suspectAccount) {
        moneyLaunderingService.postSuspectAccount(suspectAccount);
        return new ResponseEntity<>(null, HttpStatus.ACCEPTED);
    }

    //TODO
}
