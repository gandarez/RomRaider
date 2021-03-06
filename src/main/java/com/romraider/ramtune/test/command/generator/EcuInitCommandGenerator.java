/*
 * RomRaider Open-Source Tuning, Logging and Reflashing
 * Copyright (C) 2006-2013 RomRaider.com
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.romraider.ramtune.test.command.generator;

import com.romraider.io.protocol.Protocol;
import static java.util.Arrays.asList;
import java.util.List;

public final class EcuInitCommandGenerator extends AbstractCommandGenerator {

    public EcuInitCommandGenerator(Protocol protocol) {
        super(protocol);
    }

    public List<byte[]> createCommands(byte id, byte[] data, byte[] address,
            int length, boolean blockRead) {
        return asList(protocol.constructEcuInitRequest(id));
    }

    public String toString() {
        return "Init";
    }
}
