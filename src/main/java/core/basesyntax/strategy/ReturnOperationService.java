package core.basesyntax.strategy;

import core.basesyntax.dao.StorageDao;
import core.basesyntax.model.FruitTransaction;

public class ReturnOperationService implements OperationService {
    private StorageDao storageDao;

    public ReturnOperationService(StorageDao storageDao) {
        this.storageDao = storageDao;
    }

    @Override
    public void proceed(FruitTransaction fruitTransaction) {
        storageDao.add(fruitTransaction.getFruit(), fruitTransaction.getQuantity());
    }
}
