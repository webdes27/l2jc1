/*
 * $Header: /cvsroot/l2j/L2_Gameserver/java/net/sf/l2j/gameserver/serverpackets/PartySmallWindowAdd.java,v 1.3 2004/09/28 02:44:16 nuocnam Exp $
 *
 * $Author: nuocnam $
 * $Date: 2004/09/28 02:44:16 $
 * $Revision: 1.3 $
 * $Log: PartySmallWindowAdd.java,v $
 * Revision 1.3  2004/09/28 02:44:16  nuocnam
 * Added javadoc header.
 *
 * Revision 1.2  2004/08/14 22:47:19  l2chef
 * commet update
 *
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

import net.sf.l2j.gameserver.model.L2PcInstance;

/**
 * This class ...
 * 
 * @version $Revision: 1.3 $ $Date: 2004/09/28 02:44:16 $
 */
public class PartySmallWindowAdd extends ServerBasePacket 
{
	private static final String _S__64_PARTYSMALLWINDOWADD = "[S] 64 PartySmallWindowAdd";
	
	private L2PcInstance _member;
	
	public PartySmallWindowAdd(L2PcInstance member)
	{
		_member = member;
	}
	
	public byte[] getContent()
	{
		writeC(0x64);
		
		writeD(_member.getObjectId());
		writeS(_member.getName());
		writeD((int) _member.getCurrentHp());
		writeD(_member.getMaxHp());
		writeD((int) _member.getCurrentMp());
		writeD(_member.getMaxMp());
		writeD(_member.getClassId());
		writeD(_member.getLevel());
		writeD(0);
		writeD(0);
		
		return getBytes();
	}

	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	public String getType()
	{
		return _S__64_PARTYSMALLWINDOWADD;
	}
}
