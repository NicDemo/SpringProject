package sample.data.jpa.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bank  implements IBank {
     @Autowired
    private Account account;
}
