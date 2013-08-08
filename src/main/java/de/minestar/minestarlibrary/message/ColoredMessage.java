/*
 * Copyright (C) 2013 MineStar.de 
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

package de.minestar.minestarlibrary.message;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

/**
 * A colored chat message
 */
public class ColoredMessage extends Message {

    /**
     * Shortcut for sending a colored message
     * 
     * @param text
     *            The text to send
     * @param color
     *            The color of the text
     * @param receiver
     *            List of receiver, for console use {@link Message#CONSOLE} as
     *            an argument
     * @return Created message
     */
    public static Message send(String text, ChatColor color, CommandSender... receiver) {
        return new ColoredMessage(color).add(text).send(receiver);
    }

    /**
     * Shortcut for sending a colored message with a plugin prefix
     * 
     * @param text
     *            The text to send
     * @param color
     *            The color of the text
     * @param pluginName
     *            The name of the plugin the message is from
     * @param receiver
     *            List of receiver, for console use {@link Message#CONSOLE} as
     *            an argument
     * @return Created message
     */
    public static Message send(String text, ChatColor color, String pluginName, CommandSender... receiver) {
        return new ColoredMessage(pluginName, color).add(text).send(receiver);
    }

    /**
     * Creates a colored message which text is colored with the given color
     * 
     * @param color
     *            The color
     */
    public ColoredMessage(ChatColor color) {
        super(Type.INFO);
        color(color);
    }

    /**
     * Creates a colored message starting with a plugin name prefix (uncolored)
     * and after this the colored message
     * 
     * @param pluginName
     *            The uncolored plugin prefix
     * @param color
     *            The color
     */
    public ColoredMessage(String pluginName, ChatColor color) {
        super(pluginName, Type.INFO);
        color(color);
    }
}
