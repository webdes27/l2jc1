/*
 * $Header: /cvsroot/l2j/L2_Gameserver/java/net/sf/l2j/gameserver/serverpackets/Revive.java,v 1.1 2004/07/11 23:30:36 l2chef Exp $
 *
 * $Author: l2chef $
 * $Date: 2004/07/11 23:30:36 $
 * $Revision: 1.1 $
 * $Log: Revive.java,v $
 * Revision 1.1  2004/07/11 23:30:36  l2chef
 * added by MetalRabbit
 *
 * Revision 1.3  2004/07/04 11:14:53  l2chef
 * logging is used instead of system.out
 *
 * Revision 1.2  2004/06/27 08:51:42  jeichhorn
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
package net.sf.l2j.gameserver.serverpackets;

import net.sf.l2j.gameserver.model.L2Object;

/**
 * sample
 * 0000: 0c  9b da 12 40                                     ....@
 *  
 * format  d 
 * 
 * @version $Revision: 1.1 $ $Date: 2004/07/11 23:30:36 $
 */
public class Revive extends ServerBasePacket
{
	private static final String _S__0C_REVIVE = "[S] 0c Revive";
	private int _objectId;

	public Revive(L2Object obj)
	{
		_objectId = obj.getObjectId();
	}
	
	public byte[] getContent()
	{
		writeC(0x0c);
		writeD(_objectId);
		
		return _bao.toByteArray();
	}
	
	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	public String getType()
	{
		return _S__0C_REVIVE;
	}

}
