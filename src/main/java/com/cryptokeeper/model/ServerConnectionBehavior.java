package com.cryptokeeper.model;

import java.sql.Connection;

public interface ServerConnectionBehavior {
    Connection getConnection();
    String getConnectionURL();
    String getConnectionDetails();
    String getTablesSchemaQuery();
}
