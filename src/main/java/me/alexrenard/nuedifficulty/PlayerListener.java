package me.alexrenard.nuedifficulty;
import org.bukkit.Bukkit;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.event.entity.EntitySpawnEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event)
    {
        event.setKeepInventory(true);
        event.setKeepLevel(true);
    }


    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event)
    {
        LivingEntity entity = event.getEntity();
        if(entity instanceof Creeper)
        {
            ((Creeper) entity).setExplosionRadius(1);
        }
    }

    @EventHandler
    public void onHit(EntityDamageByEntityEvent event)
    {
        if(event.getDamager() instanceof Player)
        {
            event.setDamage(event.getDamage()*2);
        }
        else
        {
            event.setDamage(event.getDamage()/1.2f);
        }
    }
}
