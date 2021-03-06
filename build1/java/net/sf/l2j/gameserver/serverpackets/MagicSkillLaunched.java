/*
 * $Header: /cvsroot/l2j/L2_Gameserver/java/net/sf/l2j/gameserver/serverpackets/MagicSkillLaunched.java,v 1.4 2004/09/15 23:55:29 l2chef Exp $
 *
 * $Author: l2chef $
 * $Date: 2004/09/15 23:55:29 $
 * $Revision: 1.4 $
 * $Log: MagicSkillLaunched.java,v $
 * Revision 1.4  2004/09/15 23:55:29  l2chef
 * spell target can be independent of player target (Deth)
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

import net.sf.l2j.gameserver.model.L2Character;

/**
 * 
 * sample
 * 
 * 0000: 8e  d8 a8 10 48  10 04 00 00  01 00 00 00  01 00 00    ....H...........
 * 0010: 00  d8 a8 10 48                                     ....H
 *  
 *
 * format   ddddd d
 * 
 * @version $Revision: 1.4 $ $Date: 2004/09/15 23:55:29 $
 */
public class MagicSkillLaunched extends ServerBasePacket
{
	private static final String _S__8E_MAGICSKILLLAUNCHED = "[S] 8E MagicSkillLaunched";
	private L2Character _cha;
	private int _skillId;
	private int _skillLevel;
	private int _dat2;
	private int _targetId;
	
	public MagicSkillLaunched(L2Character cha, int skillId, int skillLevel, L2Character target)
	{
		_cha = cha;
		_skillId = skillId;
		_skillLevel = skillLevel;
		_dat2 = 1;
		_targetId = target.getObjectId();
	}
	
	public MagicSkillLaunched(L2Character cha, int skillId, int skillLevel)
	{
		_cha = cha;
		_skillId = skillId;
		_skillLevel = skillLevel;
		_dat2 = 1;
		_targetId = cha.getTargetId();
	}
	
	public byte[] getContent()
	{
		_bao.write(0x8e);
		writeD(_cha.getObjectId());
		writeD(_skillId);
		writeD(_skillLevel);
		writeD(_dat2);  // failed or not
		writeD(_targetId);
		return _bao.toByteArray();
	}
	
	/* (non-Javadoc)
	 * @see net.sf.l2j.gameserver.serverpackets.ServerBasePacket#getType()
	 */
	public String getType()
	{
		return _S__8E_MAGICSKILLLAUNCHED;
	}

}
