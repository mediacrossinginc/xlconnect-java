/*
 *
    XLConnect
    Copyright (C) 2010 Mirai Solutions GmbH

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.miraisolutions.xlconnect.data;

import java.util.Vector;

/**
 *
 * @author Martin Studer, Mirai Solutions GmbH
 */
public class DataFrame {
    
    protected Vector<String> columnNames;
    protected Vector<DataType> columnTypes;
    protected Vector<Vector> columns;

    public DataFrame() {
        this.columnNames = new Vector<String>();
        this.columnTypes = new Vector<DataType>();
        this.columns = new Vector<Vector>();
    }

    public int columns() {
        return columns.size();
    }

    public int rows() {
        if(isEmpty())
            return 0;
        else
            return columns.get(0).size();
    }

    public boolean isEmpty() {
        return columns.isEmpty();
    }

    public boolean hasColumnHeader() {
        boolean hasHeader = false;
        for(int i = 0; i < columnNames.size(); i++) {
            if(columnNames.get(i) != null) {
                hasHeader = true;
                break;
            }
        }

        return hasHeader;
    }

    
    public void addColumn(String name, DataType type, Vector column) {
        if(isEmpty() || (column.size() == rows())) {
            columnNames.add(name);
            columnTypes.add(type);
            columns.add(column);
        } else
            throw new IllegalArgumentException("Length of specified column does not match length of " +
                    "existing columns in the DataFrame!");
    }

    public String getColumnName(int index) {
        return columnNames.get(index);
    }

    public DataType getColumnType(int index) {
        return columnTypes.get(index);
    }

    public Vector getColumn(int index) {
        return columns.get(index);
    }

    public Vector<String> getColumnNames() {
        return columnNames;
    }

    public Vector<DataType> getColumnTypes() {
        return columnTypes;
    }

    /*
    public Vector getColumn(String name) {
        int index = columnNames.indexOf(name);
        if(index >= 0)
            return getColumn(index);
        else
            throw new IllegalArgumentException("No column '" + name + "' available!");

    }
     *
     */

}
