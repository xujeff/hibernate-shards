/**
 * Copyright (C) 2007 Google Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */
package org.hibernate.shards.model;

import java.math.BigInteger;

/**
 * Test class used for tests that illustrate we can handle objects with
 * ids that are base types.
 *
 * @author maxr@google.com (Max Ross)
 */
public class IdIsBaseType {

    private BigInteger idIsBaseTypeId;
    private String value;

    public BigInteger getIdIsBaseTypeId() {
        return idIsBaseTypeId;
    }

    public void setIdIsBaseTypeId(BigInteger hasLongId) {
        this.idIsBaseTypeId = hasLongId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
