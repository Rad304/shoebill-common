/**
 * Copyright (C) 2012 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.common.player;

import net.gtaun.shoebill.Shoebill;
import net.gtaun.shoebill.object.Player;

/**
 * 玩家描述类。
 * 
 * @author MK124
 */
public class PlayerDesc
{
	private final String name;
	

	public PlayerDesc(String name)
	{
		this.name = name;
	}
	
	public PlayerDesc(Player player)
	{
		this(player.getName());
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isOnline()
	{
		return getPlayer() != null;
	}
	
	public Player getPlayer()
	{
		return Shoebill.Instance.get().getSampObjectStore().getPlayer(name);
	}
}