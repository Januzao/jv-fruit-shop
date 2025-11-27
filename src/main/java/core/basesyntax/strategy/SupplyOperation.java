package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;

public class SupplyOperation implements OperationHandler {
    @Override
    public int handle(FruitTransaction transaction, int currentBalance) {
        return transaction.getQuantity() + currentBalance;
    }
}
