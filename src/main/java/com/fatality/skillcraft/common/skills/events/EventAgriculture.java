/**
 * Created by Fatality
 */

/* You are free to:
 * 
 * Share — copy and redistribute the material in any medium or format
 * Adapt — remix, transform, and build upon the material
 * for any purpose, even commercially.
 * The licensor cannot revoke these freedoms as long as you follow the license terms.
 * Under the following terms:
 * Attribution — You must give appropriate credit, provide a link to the license, and indicate if changes were made. You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
 * ShareAlike — If you remix, transform, or build upon the material, you must distribute your contributions under the same license as the original.
 * No additional restrictions — You may not apply legal terms or technological measures that legally restrict others from doing anything the license permits.
 * Notices:
 * 
 * You do not have to comply with the license for elements of the material in the public domain or where your use is permitted by an applicable exception or limitation.
 * No warranties are given. The license may not give you all of the permissions necessary for your intended use. For example, other rights such as publicity, privacy, or moral rights may limit how you use the material.
 */

package com.fatality.skillcraft.common.skills.events;

import com.fatality.skillcraft.api.skills.api.Level;
import com.fatality.skillcraft.api.skills.api.SkillBase;
import com.fatality.skillcraft.api.skills.api.SkillUpdate;
import com.fatality.skillcraft.api.skills.api.events.IHandleEvents;
import com.fatality.skillcraft.common.skills.SkillAgriculture;
import com.fatality.skillcraft.common.skills.data.PlayerSkill;
import com.fatality.skillcraft.common.skills.data.SkillProvider;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import java.util.Map;

public class EventAgriculture extends IHandleEvents {
	
	public EventAgriculture(SkillBase instance) {
		super(instance);
	}
	
	@SubscribeEvent
	public void firstJoin(PlayerEvent.PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		System.out.println(player);
		for (Map.Entry<Block, Integer> b : ((SkillAgriculture) instance).getBlocksPlaced().entrySet()) {
			System.out.println(String.format("%s when placed gives you %s exp", b.getKey(), b.getValue()));
		}
		
		SkillUpdate.instance().updateExp(player, instance, 100);
		
		
	}
	
}
