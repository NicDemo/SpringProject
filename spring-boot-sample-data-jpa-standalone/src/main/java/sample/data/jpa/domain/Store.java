package sample.data.jpa.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store implements IFastLine , IStore, ILane,IJustHaveALook{
    @Autowired
    private Bank bank;
    @Autowired
    private IProvider iProvider;
}
