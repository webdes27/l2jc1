/*
 * $Header: /cvsroot/l2j/L2_Gameserver/java/net/sf/l2j/gameserver/handler/IItemHandler.java,v 1.1 2004/08/07 14:11:56 l2chef Exp $
 *
 * $Author: l2chef $
 * $Date: 2004/08/07 14:11:56 $
 * $Revision: 1.1 $
 * $Log: IItemHandler.java,v $
 * Revision 1.1  2004/08/07 14:11:56  l2chef
 * new item handlers
 *
 * Revision 1.2  2004/06/27 08:12:59  jeichhorn
 * Added copyright notice
 *
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * http://www.gnu.org/copyleft/gpl.html
 */
package net.sf.l2j.gameserver.handler;

import java.io.IOException;

import net.sf.l2j.gameserver.model.L2ItemInstance;
import net.sf.l2j.gameserver.model.L2PcInstance;

/**
 * an IItemHandler implementation has to be stateless
 * 
 * @version $Revision: 1.1 $ $Date: 2004/08/07 14:11:56 $
 */

public interface IItemHandler
{
	/**
	 * this is the worker method that is called when using an item.
	 * @param activeChar
	 * @param item
	 * @return count reduction after usage 
	 * @throws IOException
	 */
	public int useItem(L2PcInstance activeChar, L2ItemInstance item) throws IOException;
	
	/**
	 * this method is called at initialization to register all the item ids automatically 
	 * @return all known itemIds
	 */
	public int[] getItemIds();
}
