package GierJava.entities.comp;

import arc.struct.Seq;
import ent.anno.Annotations.EntityComponent;
import mindustry.entities.units.StatusEntry;

/**
 * 
 * @implNote Use to fix crash in MindustryX...
 */
@EntityComponent
abstract class StatusAccessComp {
    public abstract Seq<StatusEntry> statuses();
    public abstract float healthBalance();
}