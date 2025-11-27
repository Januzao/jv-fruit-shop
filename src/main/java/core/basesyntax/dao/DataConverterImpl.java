package core.basesyntax.dao;

import core.basesyntax.model.FruitTransaction;
import java.util.ArrayList;
import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> transactions) {
        List<FruitTransaction> fruitTransactions = new ArrayList<>();
        for (String transaction : transactions) {
            String[] data = transaction.split(" ");
            String type = data[0];
            FruitTransaction.Operation operation = FruitTransaction.Operation.getByCode(type);
            String fruit = data[1];
            int quantity = Integer.parseInt(data[2]);
            fruitTransactions.add(new FruitTransaction(operation, fruit, quantity));
        }
        return fruitTransactions;
    }
}

