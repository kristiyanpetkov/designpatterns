package com.clouway.observertask;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class CompositeProductChangeListener implements ProductChangeListener {
    private List<ProductChangeListener> listeners = new ArrayList<>();

    public void addListener(ProductChangeListener listener) {
        listeners.add(listener);
    }

    @Override
    public void onProductSold(Product product) {
        for (ProductChangeListener each : listeners) {
            each.onProductSold(product);
        }
    }

    @Override
    public void onProductRegistered(Product product) {
        for (ProductChangeListener each : listeners) {
            each.onProductRegistered(product);
        }
    }
}
