package GierJava.entities.comp;

import arc.math.WindowedMean;
import arc.util.Time;
import arc.struct.Seq;
import ent.anno.Annotations.*;
import mindustry.entities.units.StatusEntry;
import mindustry.gen.Posc;


/**
 * 
 * @implNote Use to fix crash in MindustryX...
 */
@EntityComponent
abstract class MDTXFixComp {
    @Import float health;
    @Import float shield;

    private transient float lastHealth = 0f, lastShield = 0f;
    private final transient WindowedMean healthBalanceMean = new WindowedMean(120);

    public abstract float healthBalance();
    public abstract Seq<StatusEntry> statuses();
}