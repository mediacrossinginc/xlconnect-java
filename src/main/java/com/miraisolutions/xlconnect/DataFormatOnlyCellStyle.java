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

package com.miraisolutions.xlconnect;

import com.miraisolutions.xlconnect.data.DataType;
import java.util.EnumMap;

/**
 * Marker cell style used to specify that a cell style
 * should be determined dynamically with the data format
 * being re-specified according to the data type
 */
public class DataFormatOnlyCellStyle extends Common implements CellStyle {

    // private static DataFormatOnlyCellStyle instance = null;
    private static EnumMap<DataType, DataFormatOnlyCellStyle> instances = new EnumMap<DataType, DataFormatOnlyCellStyle>(DataType.class);
    private DataType dataType;
    
    private DataFormatOnlyCellStyle(DataType type) {
        this.dataType = type;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setBorderBottom(short border) {
        throw new UnsupportedOperationException();
    }

    public void setBorderLeft(short border) {
        throw new UnsupportedOperationException();
    }

    public void setBorderRight(short border) {
        throw new UnsupportedOperationException();
    }

    public void setBorderTop(short border) {
        throw new UnsupportedOperationException();
    }

    public void setBottomBorderColor(short color) {
        throw new UnsupportedOperationException();
    }

    public void setDataFormat(String format) {
        throw new UnsupportedOperationException();
    }

    public void setFillBackgroundColor(short bg) {
        throw new UnsupportedOperationException();
    }

    public void setFillForegroundColor(short fp) {
        throw new UnsupportedOperationException();
    }

    public void setFillPattern(short bg) {
        throw new UnsupportedOperationException();
    }

    public void setLeftBorderColor(short color) {
        throw new UnsupportedOperationException();
    }

    public void setRightBorderColor(short color) {
        throw new UnsupportedOperationException();
    }

    public void setTopBorderColor(short color) {
        throw new UnsupportedOperationException();
    }

    public void setWrapText(boolean wrap) {
        throw new UnsupportedOperationException();
    }
    
    public String getDataFormat() {
        throw new UnsupportedOperationException();
    }

    public static DataFormatOnlyCellStyle get(DataType type) {
        DataFormatOnlyCellStyle cs;
        if(instances.containsKey(type))
            cs = instances.get(type);
        else {
            cs = new DataFormatOnlyCellStyle(type);
            instances.put(type, cs);
        }
        return cs;
    }
}
