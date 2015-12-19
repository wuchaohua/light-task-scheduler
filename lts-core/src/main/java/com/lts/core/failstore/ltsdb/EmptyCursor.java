package com.lts.core.failstore.ltsdb;

/**
 * @author Robert HG (254963746@qq.com) on 12/19/15.
 */
public class EmptyCursor<V> implements Cursor<V> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public V next() {
        return null;
    }
}