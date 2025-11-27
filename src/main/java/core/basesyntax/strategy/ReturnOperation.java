package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;

public class ReturnOperation implements OperationHandler {
    @Override
    public int handle(FruitTransaction transaction, int currentBalance) {
        return transaction.getQuantity() + currentBalance;
    }
}
