/*
 * java-tron is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * java-tron is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.tron.storage;

import java.util.Set;


public interface DbSourceInter<V> extends BatchSourceInter<byte[], V> {


    void setDBName(String name);


    String getDBName();

    void initDB();


    boolean isAlive();


    void closeDB();


    Set<byte[]> allKeys() throws RuntimeException;
}
