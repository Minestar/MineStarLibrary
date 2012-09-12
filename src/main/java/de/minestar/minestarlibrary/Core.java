/*
 * Copyright (C) 2012 MineStar.de 
 * 
 * This file is part of MineStarLibrary.
 * 
 * MineStarLibrary is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 * 
 * MineStarLibrary is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MineStarLibrary.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.minestar.minestarlibrary;

import java.util.logging.Logger;

public class Core extends AbstractCore {

    public Core() {
        this("MineStarLibrary");
    }

    public Core(String name) {
        super(name);
    }

    @Override
    protected boolean commonEnable() {
        Logger log = Logger.getLogger("Minecraft");
        if (log != null) {
            log.setFilter(new CommandFilter());
        }
        return super.commonEnable();
    }
}
