package com.KotlinPlugin

import cn.nukkit.command.Command
import cn.nukkit.command.CommandSender
import cn.nukkit.event.Listener
import cn.nukkit.plugin.PluginBase
import cn.nukkit.utils.TextFormat
import cn.nukkit.Player
import cn.nukkit.event.EventHandler
import cn.nukkit.event.player.PlayerMoveEvent

class Main : PluginBase() , Listener {

	override fun onEnable() {
		logger.info("§aEnabled Kotlin Plugin")
		server.getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	fun onMove(event : PlayerMoveEvent){
		val player = event.getPlayer()
		player.sendPopup("§bWorld:§e"+player.getLevel().getFolderName()+"§bX:§e"+player.x.toInt()+"§bY:§e"+player.y.toInt()+"§bZ:§e"+player.z.toInt())
	}

	override fun onDisable() {
		logger.info("§cDisabled Kotlin Plugin")
	}
}