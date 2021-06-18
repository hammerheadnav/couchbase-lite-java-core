package com.couchbase.lite.v1.storage;

import com.couchbase.lite.v1.CouchbaseLiteException;

/**
 * The interface that specifies shape of SQLiteStorageEngineFactory implementations.
 */
public interface SQLiteStorageEngineFactory {

    SQLiteStorageEngine createStorageEngine() throws CouchbaseLiteException;

}
